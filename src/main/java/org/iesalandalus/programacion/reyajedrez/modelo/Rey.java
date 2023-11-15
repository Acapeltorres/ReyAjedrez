package org.iesalandalus.programacion.reyajedrez.modelo;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Posicion;

import javax.naming.OperationNotSupportedException;

public class Rey {
    private Color color;
    private Posicion posicion;
    private int totalMovimientos;


    //Constructor por defecto

    public Rey(){
        setColor(Color.BLANCO);
        setPosicion(new Posicion(1,'e'));
    }

    //Constructor
    public Rey(Color color){
        if(color==Color.BLANCO){
            setPosicion(new Posicion(1,'e'));
        }else{
            setPosicion(new Posicion(8,'e'));
        }

    }

    //getters y setters

    public Color getColor() {
        return color;
    }

    private void setColor(Color color) {
        if(color==null){
            throw new NullPointerException("ERROR: Color incorrecto");
        }else{
            this.color = color;
        }

    }

    public Posicion getPosicion() {
        return posicion;

    }

    private void setPosicion(Posicion posicion) {

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

    public void mover(Direccion d) throws OperationNotSupportedException,IllegalArgumentException{
        int totalMovimientos=0;
        if(d==null){
            throw new NullPointerException("ERROR: direcion incorrecta");
        }
        if(d.equals(Direccion.SUR)){
            try{
                setPosicion(new Posicion(posicion.getFila()-1,posicion.getColumna()));
                totalMovimientos++;
            }catch (IllegalArgumentException e) {
                throw new OperationNotSupportedException("ERROR");
            }
        } else if (d.equals(Direccion.NORTE)) {
            try {
                setPosicion(new Posicion(posicion.getFila()+1,posicion.getColumna()));
                totalMovimientos++;
            }catch (IllegalArgumentException e) {
                throw new OperationNotSupportedException("ERROR");
            }
        } else if (d.equals(Direccion.ESTE)) {
            try {
                int numerocolumna= posicion.getColumna()+1;
                setPosicion(new Posicion(posicion.getFila(),(char)numerocolumna));
                totalMovimientos++;
            }catch (IllegalArgumentException e) {
                throw new OperationNotSupportedException("ERROR");
            }
        } else if (d.equals(Direccion.OESTE)) {
            try {
                int numerocolumna= posicion.getColumna()-1;
                setPosicion(new Posicion(posicion.getFila(),(char)numerocolumna));
                totalMovimientos++;
            }catch (IllegalArgumentException e) {
                throw new OperationNotSupportedException("ERROR");
            }
        } else if (d.equals(Direccion.NORESTE)) {
            try {
                int numerocolumna= posicion.getColumna()+1;
                setPosicion(new Posicion(posicion.getFila()+1,(char)numerocolumna));
                totalMovimientos++;
            }catch (IllegalArgumentException e) {
                throw new OperationNotSupportedException("ERROR");
            }
        } else if (d.equals(Direccion.NOROESTE)) {
            try {
                int numerocolumna= posicion.getColumna()-1;
                setPosicion(new Posicion(posicion.getFila()+1,(char)numerocolumna));
                totalMovimientos++;
            }catch (IllegalArgumentException e) {
                throw new OperationNotSupportedException("ERROR");
            }
        } else if (d.equals(Direccion.SURESTE)) {
            try {
                int numerocolumna= posicion.getColumna()+1;
                setPosicion(new Posicion(posicion.getFila()-1,(char)numerocolumna));
                totalMovimientos++;
            }catch (IllegalArgumentException e) {
                throw new OperationNotSupportedException("ERROR");
            }
        } else if (d.equals(Direccion.SUROESTE)) {
            try {
                int numerocolumna= posicion.getColumna()-1;
                setPosicion(new Posicion(posicion.getFila()-1,(char)numerocolumna));
                totalMovimientos++;
            }catch (IllegalArgumentException e) {
                throw new OperationNotSupportedException("ERROR");
            }
        } else if (d.equals(Direccion.ENROQUE_CORTO)) {
            if(totalMovimientos>0){
                throw new IllegalArgumentException("ERROR no es posible hacer enroque Rey tiene movimientos");
            }else{
                int numerocolumna= posicion.getColumna()+2;
                setPosicion(new Posicion(posicion.getFila(), (char)numerocolumna));
            }
        } else if (d.equals(Direccion.ENROQUE_LARGO)) {
            if(totalMovimientos>0){
                throw new IllegalArgumentException("ERROR no es posible hacer enroque Rey tiene movimientos");
            }else {
                int numerocolumna= posicion.getColumna()-2;
                setPosicion(new Posicion(posicion.getFila(), (char)numerocolumna));
            }
        }
    }

    @Override
    public String toString() {
        return "Rey{" +
                "color=" + color +
                ", posicion=" + posicion +
                '}';
    }
}
