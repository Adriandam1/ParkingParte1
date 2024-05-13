package com.prog.mvc.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Parking {
    private Vehiculo[] vehiculos;
    private int tamañoParking;
    private int espacioOcupado;

    // Constructor
    public Parking(int tamaño) {
        this.tamañoParking = tamaño;
        this.vehiculos = new Vehiculo[tamaño];
        this.espacioOcupado = 0;
    }

    // Método para añadir un vehículo al parking
    public void introducirVehiculo(Vehiculo v) {
        if (espacioOcupado < tamañoParking) {
            vehiculos[espacioOcupado] = v;
            espacioOcupado++;
            System.out.println("Vehículo añadido al parking.");
        } else {
            System.out.println("El parking está lleno. No se puede añadir más vehículos.");
        }
    }

    // Método para eliminar un vehículo del parking por ID
    public void sacarVehiculo(String ID) {
        for (int i = 0; i < espacioOcupado; i++) {
            if (vehiculos[i].getID().equals(ID)) {
                // Eliminar el vehículo y reorganizar el array
                for (int j = i; j < espacioOcupado - 1; j++) {
                    vehiculos[j] = vehiculos[j + 1];
                }
                espacioOcupado--;
                System.out.println("Vehículo con ID " + ID + " eliminado del parking.");
                return;
            }
        }
        System.out.println("No se encontró ningún vehículo con el ID especificado.");
    }

    // Método para mostrar el estado actual del parking
    public void comprobarParking() {
        System.out.println("Estado actual del parking:");
        for (int i = 0; i < espacioOcupado; i++) {
            System.out.println(vehiculos[i].toString());
        }
    }
}