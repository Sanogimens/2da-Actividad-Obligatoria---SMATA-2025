package com.tarea.trabajo.obligatorio2.entidades;

import lombok.Getter;
import java.text.DecimalFormat;

@Getter // Genera los métodos get automáticamente
public class Moto extends Vehiculo {
    private String cilindrada;

    public Moto(String marca, String modelo, String cilindrada, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    /**
     * Sobrescribo el método toString para respetar el formato de la consigna
     */
    @Override
    public String toString() {
        return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Cilindrada: " + getCilindrada() + " // Precio: $" + new DecimalFormat("#,###.00").format(getPrecio());
    }
}
