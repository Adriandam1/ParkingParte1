package com.prog.mvc.model;

import com.prog.mvc.controller.Observer;

import java.util.ArrayList;

public class Model implements Observable {
        static ArrayList<Coche> parking = new ArrayList<>();

        // para los observadores
        private static final ArrayList<Observer> observers = new ArrayList<Observer>();

        @Override
        public void addObserver(Observer observer) {
            observers.add(observer);
        }
        @Override
        public void removeObserver(Observer observer) {
            observers.remove(observer);
        }

        @Override
        public void notifyObservers(Coche coche) {
            // para notificar a los observadores recorro el array con el metodo update
            // todos los observadores tienen metodo update
            for (Observer observer : observers) {
                observer.update(coche);
            }
        }









}
