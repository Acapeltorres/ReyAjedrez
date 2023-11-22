package org.iesalandalus.programacion.reyajedrez;

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
}
