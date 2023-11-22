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

public void crearReyDefecto(){
    rey=new Rey();
}

public void crearReyColor(){
    Color color= Consola.elegirOpcion();
    rey=new Rey(color);
}
public void mover() throws OperationNotSupportedException{

    Consola.mostrarMenuDirecciones();
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
      e.getMessage();
  }

}
}
