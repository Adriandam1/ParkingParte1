package com.prog.mvc.model;

import com.prog.mvc.controller.Observer;// añade un observador

public interface Observable {

void addObserver(Observer observer);
// elimina un observador
void removeObserver(Observer observer);
// notifica a los observadores
void notifyObservers(Coche coche);
}