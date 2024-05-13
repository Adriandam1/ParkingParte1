package com.prog.mvc.controller;

import com.prog.mvc.model.Vehiculo;
import com.prog.mvc.view.View;

public class ObserverPlaza implements Observer{
    /**
     * Metodo para actualizar estado de un vehiculo
     * @param arg del vehiculo
     * @return mensaje informativo de la plaza que ocupa la ide del vehiculo
     */
    public void update(Vehiculo arg) {
        System.out.println("Se ha cambiado la plaza: " + String.valueOf(arg.espacio));
        // le comunicamos a la vista que muestre la plaza
        View.muestraPlaza(arg.ID, arg.espacio);


    }



}
