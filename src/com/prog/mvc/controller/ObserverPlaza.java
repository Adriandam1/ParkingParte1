package com.prog.mvc.controller;

import com.prog.mvc.model.Vehiculo;
import com.prog.mvc.view.View;

public class ObserverPlaza implements Observer{

    public void update(Vehiculo arg) {
        System.out.println("Se ha cambiado la plaza: " + String.valueOf(arg.espacio));
        // le comunicamos a la vista que muestre la plaza
        View.muestraPlaza(arg.ID, arg.espacio);


    }



}
