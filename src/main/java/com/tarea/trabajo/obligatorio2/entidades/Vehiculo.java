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
     * Método para comparar dos vehículos basado en su precio y, en caso de igualdad, en su marca y modelo.
     */
    public int compareTo(Vehiculo otroVehiculo) {
        int comparacionPrecio = Double.compare(this.precio, otroVehiculo.getPrecio());
        if (comparacionPrecio != 0) { // Si los precios son diferentes, se devuelve la comparación de precios.
            return comparacionPrecio;
        }
        return (this.marca + this.modelo).compareTo(otroVehiculo.getMarca() + otroVehiculo.getModelo()); // Comparación alfabética por marca y modelo si los precios son iguales.
    }
}
