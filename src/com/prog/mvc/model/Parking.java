package com.prog.mvc.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Parking {
    private Vehiculo[] vehiculos;
    private int tamañoParking;
    private int espacioOcupado;

    /**
     * Constructor para crear un objeto Parking con un tamaño específico.
     *
     * @param tamaño Tamaño máximo del parking.
     */
    public Parking(int tamaño) {
        this.tamañoParking = tamaño;
        this.vehiculos = new Vehiculo[tamaño];
        this.espacioOcupado = 0;
    }

    /**
     * Introduce un vehiculo al parking
     * @param v identificador del vehiculo
     * @return mensaje indicado si se ha introducido correctamente o el garaje esta lleno
     */
    public void introducirVehiculo(Vehiculo v) {
        if (espacioOcupado < tamañoParking) {
            vehiculos[espacioOcupado] = v;
            espacioOcupado++;
            System.out.println("Vehículo añadido al parking.");
        } else {
            System.out.println("El parking está lleno. No se puede añadir más vehículos.");
        }
    }

    /**
     * Saca un vehiculo del parking
     * @param ID identificador unico del vehiculo
     * @return mensaje informativo de si se ha eliminado el vehiculo del parking
     */
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
    /**
     * Comprueba ocupacion del parking
     *
     * @return mensaje informativo sobre las plazas del parking
     */
    public void comprobarParking() {
        System.out.println("Espacio ocupado: " + espacioOcupado + " de " + tamañoParking);
    }

}