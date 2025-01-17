package org.iesalandalus.programacion.reyajedrez.modelo;

import java.util.Objects;

public class Posicion {
    //Atributos
    private int fila;
    private char columna;

    //Constructor con parametros (llamada a los setters)

    public Posicion(int fila, char columna){

        setFila(fila);
        setColumna(columna);

    }

    //Construtor copia se le pasa objeto de su clase
    public Posicion(Posicion p) throws NullPointerException{
        if (p==null){
            throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
        }
        setFila(p.getFila());
        setColumna(p.getColumna());
    }

    // getters y setters

    public int getFila() {

        return fila;
    }

    private void setFila(int fila) {
        if (fila<1 || fila>8){
            throw new IllegalArgumentException("ERROR: Fila no válida.");
        }else{
            this.fila = fila;
        }

    }

    public char getColumna() {

        return columna;
    }

    private void setColumna(char columna) {
        if(columna< 'a' || columna> 'h'){
            throw new IllegalArgumentException("ERROR: Columna no válida.");
        }else{
            this.columna = columna;
        }

    }

    // Metodos equals y hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posicion posicion = (Posicion) o;
        return fila == posicion.fila && columna == posicion.columna;
    }

    @Override
   public int hashCode() {
        return Objects.hash(fila, columna);
    }

    // Metodo toString


    @Override
    public String toString() {
        return "fila=" + fila +"," +
                " columna=" + columna;
    }
}
