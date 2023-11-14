package org.iesalandalus.programacion.reyajedrez.modelo;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Posicion;

public class Rey {
    private Color color;
    private Posicion posicion;
    private int totalMovimientos;


    //Constructor por defecto

    public Rey(){
        setColor(Color.BLANCO);
        setPosicion(new Posicion(1,'e'));
    }

    //getters y setters

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if(color==null){
            throw new NullPointerException("ERROR: Color incorrecto");
        }else{
            this.color = color;
        }

    }

    public Posicion getPosicion() {
        return posicion;

    }

    public void setPosicion(Posicion posicion) {

        if(posicion==null){
            throw new NullPointerException("ERROR: Posicion erronea");
        }else {
            this.posicion = posicion;
        }
    }

    public int getTotalMovimientos() {
        return totalMovimientos;
    }

    public void setTotalMovimientos(int totalMovimientos) {
        if(totalMovimientos<=0){
            throw new IllegalArgumentException("ERROR: total movimientos incorrecto");
        }else{
            this.totalMovimientos = totalMovimientos;
        }

    }
}
