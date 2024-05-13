package com.prog.mvc.controller;

import com.prog.mvc.model.Vehiculo;

public interface Observer {
    // metodo que se ejecutará cuando el objeto observado cambie
    void update(Vehiculo arg);
}