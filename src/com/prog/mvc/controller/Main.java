/* Tarea Guiada: Administración de un Parking Automático

Objetivo: Desarrollar una aplicación en Java que simule la administración de un parking automático, integrando conceptos clave aprendidos en el curso, como programación orientada a objetos, manejo de arrays, herencia y polimorfismo, gestión de eventos y manejo de archivos.

Instrucciones Generales:

        1. Creación de Clases: Crear clases para representar vehículos (`Coche`, `Camión`) y la clase `Parking`.
        2. Interfaz de Usuario: Implementar un menú que permita gestionar las operaciones del parking (introducir vehículo, sacar vehículo, comprobar estado y salir).
        3. Gestión de Vehículos: Implementar métodos para añadir y retirar vehículos del parking, y para verificar el estado del parking.
4. Uso de Arrays y Objetos: Utilizar arrays para almacenar los vehículos y manipularlos mediante métodos.

Descripción Detallada de la Actividad:

Subtarea 1: Crear Clases de Vehículos

1. Clase `Vehiculo`:
        - Atributos: `espacio` (int), `ID` (String).
        - Métodos: Constructor para inicializar `espacio` e `ID`.

        2. Clase `Coche` (Hereda de `Vehiculo`):
        - Atributo: `espacio` será 1.
        - Método: Constructor que inicializa el `ID`.

        3. Clase `Camion` (Hereda de `Vehiculo`):
        - Atributo: `espacio` será 2.
        - Método: Constructor que inicializa el `ID`.

Subtarea 2: Crear Clase `Parking`

        1. Atributos:
        - `vehiculos` (array de `Vehiculo`).
        - `tamañoParking` (int).
        - `espacioOcupado` (int).

        2. Métodos:
        - `introducirParking(Vehiculo v)`: Añade el vehículo al array si hay espacio suficiente.
   - `sacarParking(String ID)`: Elimina el vehículo del array basándose en el `ID`.
        - `comprobarParking()`: Muestra el estado actual del parking.

Subtarea 3: Probar `Coche` y `Parking`

Subtarea 4: Probar `Camion` y `Parking`

Subtarea 5: Implementar Menú

Resumen de la Actividad:

        1. Crear Clases de Vehículos y `Parking`.
        2. Implementar Métodos CRUD para el Parking.
        3. Probar la Funcionalidad de `Coche` y `Camion`.
        4. Desarrollar e Integrar el Menú Interactivo.
*/
package com.prog.mvc.controller;

import com.prog.mvc.model.Parking;
import com.prog.mvc.model.Vehiculo;
import com.prog.mvc.model.Model;
import java.util.Scanner;

public class Main {
    //static Model miModelo;
    public static void main(String[] args) {
    //Menu inicial
        try {
            Scanner sc = new Scanner(System.in);
            Parking operaciones = new Parking(10);

            boolean salir = false;
            while (!salir) {
                System.out.println("1. Introducir vehiculo");
                System.out.println("2. Sacar vehiculo");
                System.out.println("3. Comprobar estado parking");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = sc.nextInt();
                sc.nextLine(); // scanner para borrar la linea despues del scanner int

                // switch dedicado a Antonio el ajedrecista
                switch (opcion) {
                    case 1:
                        //operaciones.introducirVehiculo(),);
                        break;
                    case 2:
                        //operaciones.sacarVehiculo();
                        break;
                    case 3:
                        operaciones.comprobarParking();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida. Inténtelo de nuevo.");
                }
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }


        /* MODELO DAMIAN
        static Model miModelo;
        // el patron Observer en java nos exige instanciar la clase observable
        miModelo = new Model();

        // instanciamos al observador
        ObserverVelocidad observoVelocidad = new ObserverVelocidad();
        miModelo.addObserver(observoVelocidad);

        // instanciamos un segundo observador
        ObserverOtro otroObservador = new ObserverOtro();
        miModelo.addObserver(otroObservador);

        // Crear tres coches

        miModelo.crearCoche("LaFerrari", "SBC 1234");
        miModelo.crearCoche("Alpine", "HYU 4567");
        miModelo.crearCoche("Aston Martin", "FGH 3333");

        Coche ferrari = Model.getCoche("SBC 1234");
        // modifica la velocidad
        miModelo.cambiarVelocidad("SBC 1234", 30);

        // otro cambio de velocidad
        miModelo.cambiarVelocidad("HYU 4567", 100);

        // (ya no es necesario, lo hace el observador)
        // recoje la velocidad y la muestra (tarea de la com.cod.mvc.view.View)
        // boolean hecho = com.cod.mvc.view.View.muestraVelocidad("SBC 1234", com.cod.mvc.model.Model.getVelocidad("SBC 1234"));
        // System.out.println(hecho);*/
    }
}