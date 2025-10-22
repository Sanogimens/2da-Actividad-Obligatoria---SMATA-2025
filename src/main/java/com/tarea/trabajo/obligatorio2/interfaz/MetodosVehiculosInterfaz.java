package com.tarea.trabajo.obligatorio2.interfaz;

//Importaciones
import java.util.List;
import com.tarea.trabajo.obligatorio2.entidades.Vehiculo;

public interface MetodosVehiculosInterfaz {
    /**
     * Muestra el vehiculo mas caro de la lista
     * @param listaVehiculos
     */
    void vehiculoMasCaro(List<Vehiculo> listaVehiculos);
    /**
     * Muestra el vehiculo mas barato de la lista
     * @param listaVehiculos
     */
    void vehiculoMasBarato(List<Vehiculo> listaVehiculos);
    /**
     * Muestra el/los vehiculo/s que contiene/n la letra Y en el modelo
     * @param listaVehiculos
     */
    void vehiculoConLetraY(List<Vehiculo> listaVehiculos);
    /**
     * Muestra los vehiculos ordenados de mayor a menor por precio
     * @param listaVehiculos
     */
    void vehiculoOrdenadoMayorMenor(List<Vehiculo> listaVehiculos);
    /**
     * Muestra los vehiculos ordenados de menor a mayor por precio
     * @param listaVehiculos
     */
    void vehiculoOrdenadoNatural(List<Vehiculo> listaVehiculos);

}
