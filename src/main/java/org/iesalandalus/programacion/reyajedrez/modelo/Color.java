package org.iesalandalus.programacion.reyajedrez.modelo;

public enum Color {
    BLANCO("Blanco"), NEGRO("Negro");

    private String CadenaMostrar;

    private Color(String CadenaMostrar){

        this.CadenaMostrar=CadenaMostrar;
    }

    @Override
    public String toString() {
        return CadenaMostrar;
    }
}
