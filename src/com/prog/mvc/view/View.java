package com.prog.mvc.view;

public class View {
    /**
     * Metodo
     * @param espacio identificador unico del vehiculo
     * @return mensaje informativo de si se ha eliminado el vehiculo del parking
     */
    public static boolean muestraPlaza(String espacio, int id){
        System.out.println(espacio + ": " + id + "id");
        return true;
    }
}
