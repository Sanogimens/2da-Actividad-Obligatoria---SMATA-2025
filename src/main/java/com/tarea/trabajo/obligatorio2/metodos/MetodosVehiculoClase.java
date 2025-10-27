package com.tarea.trabajo.obligatorio2.metodos;

//Importaciones necesarias
import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.List;

import com.tarea.trabajo.obligatorio2.entidades.Vehiculo;
import com.tarea.trabajo.obligatorio2.interfaz.MetodosVehiculosInterfaz;

public class MetodosVehiculoClase implements MetodosVehiculosInterfaz {

    @Override
    public void vehiculoMasCaro(List<Vehiculo> listaVehiculos) {
        /**
         * Hago una lista con los vehículos para que puedan ser comparados y 
         * mostrar el más caro.
         */
        listaVehiculos.stream()
        .max(Comparator.comparingDouble(Vehiculo::getPrecio))
        .stream()
        .forEach(v -> System.out.println("Vehículo más caro: " + v.getMarca() + " " + v.getModelo()));
    }

    @Override
    public void vehiculoMasBarato(List<Vehiculo> listaVehiculos) {
        /**
         * Hago una lista con los vehículos para que puedan ser comparados y 
         * mostrar el más barato.
         */
        listaVehiculos.stream()
        .min(Comparator.comparingDouble(Vehiculo::getPrecio))
        .stream()
        .forEach(v -> System.out.println("Vehículo más barato: " + v.getMarca() + " " + v.getModelo()));
    }

    @Override
    public void vehiculoConLetraY(List<Vehiculo> listaVehiculos) { 
        /**
         * Hago una lista con los vehículos para que puedan ser filtrados 
         * y mostrar aquellos que contengan en el modelo la letra "Y".
         */
        listaVehiculos.stream()
        .filter(v -> v.getModelo().contains("Y"))
        .forEach(v -> {
            DecimalFormat formato = new DecimalFormat("#,###.00");
            String precioFormateado = formato.format(v.getPrecio());
            System.out.println("Vehículo que contiene en el modelo la letra 'Y': " + v.getMarca() + " " + v.getModelo() + " $" + precioFormateado);
        });
    }

    @Override
    public void vehiculoOrdenadoMayorMenor(List<Vehiculo> listaVehiculos) {
        /**
         * Hago una lista con los vehículos para que puedan ser ordenados de mayor a
         * menor, mostrando solo su marca y modelo correspondientes.
         */
        listaVehiculos.stream() 
        /**
         * Uso .stream para procesar los elementos, sorted para ordenar, 
         * y en sorted uso reversed para invertir el orden, y llamo a forEach, 
         * para que solo muestre la marca y modelo respectivamente.
         */
        .sorted(Comparator.comparingDouble(Vehiculo::getPrecio).reversed())
        .forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo()));
    }

    @Override
    public void vehiculoOrdenadoNatural(List<Vehiculo> listaVehiculos) {
        /**
         * Hago una lista de vehículos y la ordeno naturalmente según su marca, modelo y precio.
         */
        listaVehiculos.sort( 
        /**
         * Uso .sort para ordenar naturalmente los parámetros, que serían la marca, 
         * el modelo y el precio de los vehículos.
         */
        Comparator.comparing(Vehiculo::getMarca)
            .thenComparing(Vehiculo::getModelo)
            .thenComparingDouble(Vehiculo::getPrecio)
        );
    }

}
