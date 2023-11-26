package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

import java.sql.SQLOutput;

public class Consola {

    private Consola(){

    }


   public static void mostrarMenu(){

       System.out.println("Elige la opcion que desees realizar" +
               "\n 1.Crear Rey por defecto." +
               "\n 2.Crear Rey eligiendo color." +
               "\n 3. Mover." +
               "\n 4. Salir");
    }

    public static int elegirOpcionMenu(){
        int opcionMenu=0;



            do{
                mostrarMenu();
                opcionMenu= Entrada.entero();
              if (opcionMenu<1 || opcionMenu>4){
                  System.out.println("Opcion no valida (Elije una opcion disponible)\n");
              }
            }while (opcionMenu<1 || opcionMenu>4);




        return opcionMenu;
    }

    public static Color elegirOpcion(){
        int opcionColor=0;

        do {
            System.out.println("Elige el color del Rey: " +
                    "\n 1.Blanco" +
                    "\n 2.Negro");
            opcionColor=Entrada.entero();
            if (opcionColor<1 || opcionColor>2){
                System.out.println("Opcion no valida (Elije una opcion disponible)\n");
            }
        }while (opcionColor<1 || opcionColor>2);

        if (opcionColor==1){
            return Color.BLANCO;
        }else {
            return Color.NEGRO;
        }

    }

    public static void mostrarMenuDirecciones(){

        System.out.println("Introduzca por teclado la opcion que quieres mover tu Rey:" +
                "\n 1. Norte" +
                "\n 2. Noreste" +
                "\n 3. Este" +
                "\n 4. Sur" +
                "\n 5. Suroeste" +
                "\n 6. Oeste" +
                "\n 7. Noroeste" +
                "\n 8. Enroque Corto" +
                "\n 9. Enroque Largo");
    }

    public static Direccion elegirDireccion(){
        int opcionDireccion=0;

        do {
            mostrarMenuDirecciones();
            opcionDireccion=Entrada.entero();
            if (opcionDireccion<1 || opcionDireccion>9){
                System.out.println("Opcion no valida (Elije una opcion disponible)\n");
            }
        }while (opcionDireccion<1 || opcionDireccion>9);

        if (opcionDireccion==1){
            return Direccion.NORTE;
        } else if (opcionDireccion==2) {
            return Direccion.NORESTE;
        } else if (opcionDireccion==3) {
            return Direccion.ESTE;
        } else if (opcionDireccion==4) {
            return Direccion.SUR;
        } else if (opcionDireccion==5) {
            return Direccion.SUROESTE;
        } else if (opcionDireccion==6) {
            return Direccion.OESTE;
        } else if (opcionDireccion==7) {
            return Direccion.NOROESTE;
        } else if (opcionDireccion==8) {
            return Direccion.ENROQUE_CORTO;
        }else {
            return Direccion.ENROQUE_LARGO;
        }
    }

    public static void despedirse(){

        System.out.println("Gracias por utilizar nuestra aplicación hasta pronto.");
    }
}
