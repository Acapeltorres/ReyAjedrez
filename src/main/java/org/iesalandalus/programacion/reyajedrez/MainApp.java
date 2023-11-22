package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reyajedrez.modelo.Posicion;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

import javax.naming.OperationNotSupportedException;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MainApp {

private Rey rey;

public void ejecutarOpcion(){

}

public void crearReyDefecto(){
    this.rey=new Rey();
}

public void crearReyColor(Color color){
    this.rey=new Rey(color);
}
}
