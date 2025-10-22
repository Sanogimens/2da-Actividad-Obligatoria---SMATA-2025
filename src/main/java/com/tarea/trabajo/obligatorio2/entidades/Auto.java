package com.tarea.trabajo.obligatorio2.entidades;

import java.text.DecimalFormat;
import lombok.Getter;

@Getter // Genera los métodos get automáticamente
public class Auto extends Vehiculo {
    private int puertas;

    public Auto(String marca, String modelo, int puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    /**
     * Sobrescribo el método toString para respetar el formato de la consigna
     */
    @Override
    public String toString() {
        return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Puertas: " + getPuertas() + " // Precio: $" + new DecimalFormat("#,###.00").format(getPrecio());
    }
}
