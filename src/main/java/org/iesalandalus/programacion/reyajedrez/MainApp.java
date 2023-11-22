package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reyajedrez.modelo.Posicion;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

import javax.naming.OperationNotSupportedException;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MainApp {
    public static void main(String[] args) {
        Rey r=new Rey(Color.BLANCO);

        System.out.println( r.getPosicion());
        try{
            r.mover(Direccion.ENROQUE_LARGO);
            System.out.println(r.getPosicion());
        }catch (OperationNotSupportedException e){
            System.out.println(e.getMessage());
        }

        System.out.println(r.getPosicion());


    }
}
