package com.tarea.trabajo.obligatorio2.entidades;
//Importaciones
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter // Genera los getters para los atributos de la clase.
@AllArgsConstructor // Genera un constructor con todos los atributos de la clase.
public abstract class Vehiculo implements Comparable<Vehiculo> {
    private String marca;
    private String modelo;
    private double precio;
    
    @Override
    /**
     * Utilizamos el método compareTo() de la clase String para comparar ambas representaciones.
     */
    public int compareTo(Vehiculo otroVehiculo) {
        String vehiculoOriginal = this.marca + this.modelo + this.precio;
        String vehiculoNuevo = otroVehiculo.marca + otroVehiculo.modelo + otroVehiculo.precio;
        return vehiculoOriginal.compareTo(vehiculoNuevo);
    }
}
