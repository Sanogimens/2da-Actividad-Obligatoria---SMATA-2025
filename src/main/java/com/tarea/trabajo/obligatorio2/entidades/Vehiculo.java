package com.tarea.trabajo.obligatorio2.entidades;
//Importaciones
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter // Genera los getters para los atributos de la clase
@AllArgsConstructor // Genera un constructor con todos los atributos de la clase
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;
}
