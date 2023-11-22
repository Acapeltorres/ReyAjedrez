package org.iesalandalus.programacion.reyajedrez;

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
            if (opcionMenu<1 || opcionMenu>4){
                opcionMenu= Entrada.entero();
            }else{
                System.out.println("Escoge una opcion entre 1 y 4");
            }
        }while (opcionMenu<1 || opcionMenu>4);

        return opcionMenu;
    }
}
