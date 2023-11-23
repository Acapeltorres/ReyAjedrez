package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reyajedrez.modelo.Posicion;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

import javax.naming.OperationNotSupportedException;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MainApp {

    private static Rey rey;


    public void ejecutarOpcion(){

    }

    private static void crearReyDefecto(){
        rey=new Rey();
    }

   private static void crearReyColor(){
        Color color= Consola.elegirOpcion();
        rey=new Rey(color);
    }
    private static void mover() throws OperationNotSupportedException{


        Direccion direccion= Consola.elegirDireccion();
      try {
          if (direccion.equals(Direccion.NORTE)){
              rey.mover(Direccion.NORTE);
          } else if (direccion.equals(Direccion.SUR)) {
              rey.mover(Direccion.SUR);
          }else if (direccion.equals(Direccion.SURESTE)){
              rey.mover(Direccion.SURESTE);
          }else if (direccion.equals(Direccion.NORESTE)){
              rey.mover(Direccion.NORESTE);
          } else if (direccion.equals(Direccion.NOROESTE)) {
              rey.mover(Direccion.NOROESTE);
          } else if (direccion.equals(Direccion.SUROESTE)) {
              rey.mover(Direccion.SUROESTE);
          } else if (direccion.equals(Direccion.OESTE)) {
              rey.mover(Direccion.OESTE);
          } else if (direccion.equals(Direccion.ESTE)) {
              rey.mover(Direccion.ESTE);
          } else if (direccion.equals(Direccion.ENROQUE_CORTO)) {
              rey.mover(Direccion.ENROQUE_CORTO);
          } else if (direccion.equals(Direccion.ENROQUE_LARGO)) {
              rey.mover(Direccion.ENROQUE_LARGO);
          }
      }catch (OperationNotSupportedException e){
          System.out.println(e.getMessage());
      }

    }

    private static String mostraRey(){
        if (rey==null){
            System.out.println("El rey no se ha creado");
            return null ;
        } else{
           return rey.toString();

        }
    }

    public static void main(String[] args) {

        int opcion;
        boolean salir=true;

        do {
            opcion=Consola.elegirOpcionMenu();

            if (opcion==1){
                crearReyDefecto();
                System.out.println(" Se a creado su rey por defecto: " + rey.toString() + "\n");
            }
            if (opcion==2){
                crearReyColor();
                System.out.println("Tu Rey es de : " + rey.toString()+"\n");
            }
            try {
                if (opcion==3){
                    System.out.println("La posicion actual de tu Rey es:"+rey.getPosicion().getFila()+","+ rey.getPosicion().getColumna()+"\n");
                    mover();
                    System.out.println("La posicion actual de tu Rey es:"+rey.getPosicion().getFila()+","+ rey.getPosicion().getColumna()+"\n");
                }
            }catch (OperationNotSupportedException e){
                e.getMessage();
            }
            if (opcion==4){
                Consola.despedirse();
                salir=false;
            }

        }while (salir);




    }
}
