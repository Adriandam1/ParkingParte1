package com.prog.mvc.model;

public class Vehiculo {
    public int espacio;
    public String ID;

    public Vehiculo(int espacio, String ID) {
        this.espacio = espacio;
        this.ID = ID;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
