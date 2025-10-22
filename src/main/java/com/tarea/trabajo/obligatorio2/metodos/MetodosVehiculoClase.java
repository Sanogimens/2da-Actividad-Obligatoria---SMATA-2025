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
        Vehiculo masCaro = listaVehiculos.stream()//Proceso los elementos de la lista con .stream, luego uso .max, Comparator y obtengo los precios de los vehículos con getPrecio para que se pueda buscar el precio máximo de entre todos los vehículos que se comparan... Uso .orElse en caso de que, si la condición no se llegase a cumplir, vuelva un valor nulo.
            .max(Comparator.comparingDouble(Vehiculo::getPrecio))
            .orElse(null);
        /**
         * Declaro que el parámetro "masCaro" sea desigual/distinto a un valor vacío/nulo y, también, 
         * hago que imprima en consola los datos que pide la consigna 
         */
        if (masCaro != null) {
            System.out.println("Vehículo más caro: " + masCaro.getMarca() + " " + masCaro.getModelo());
        }
    }

    @Override
    public void vehiculoMasBarato(List<Vehiculo> listaVehiculos) {
        Vehiculo masBarato = listaVehiculos.stream() //Proceso los elementos de la lista con .stream, luego uso .min, Comparator y obtengo los precios de los vehículos con getPrecio para que se pueda buscar el precio mínimo de entre todos los vehículos que se comparan... Uso .orElse en caso de que, si la condición no se llegase a cumplir, vuelva un valor nulo.
            .min(Comparator.comparingDouble(Vehiculo::getPrecio))
            .orElse(null);
        /**
         * Declaro que el parámetro "masBarato" sea desigual/distinto a un valor vacío/nulo y, también, 
         * hago que imprima en consola los datos que pide la consigna 
         */
        if (masBarato != null) {
            System.out.println("Vehículo más barato: " + masBarato.getMarca() + " " + masBarato.getModelo());
        }
    }

    @Override   
    public void vehiculoConLetraY(List<Vehiculo> listaVehiculos) {
        Vehiculo conLetraY = listaVehiculos.stream() //Proceso los elementos de la lista con .stream, luego uso .filter para obtener un dato del parámetro modelo que contenga en su cadena de texto una caracter Y, después uso .findFirst para encontrar al primer modelo que cumpla con esta condición y, finalmente, uso .orElse para asegurarme de que, si no hay ningún vehículo que cumpla con dicha condición, se asigne un valor nulo.
            .filter(v -> v.getModelo().contains("Y"))
            .findFirst()
            .orElse(null);
        /**
         * Declaro que el parámetro "conLetraY" sea desigual/distinto a un valor vacío/nulo y, también, 
         * hago que imprima en consola los datos que pide la consigna... Y vuelvo a formatear el precio
         * con el formato correspondiente
         */
        if (conLetraY != null) {
            DecimalFormat formato = new DecimalFormat("#,###.00");
            String precioFormateado = formato.format(conLetraY.getPrecio());
            System.out.println("Vehículo que contiene en el modelo la letra 'Y': " +
                conLetraY.getMarca() + " " + conLetraY.getModelo() + " $" + precioFormateado);
        }
    }

    @Override
    public void vehiculoOrdenadoMayorMenor(List<Vehiculo> listaVehiculos) {
        /**
         * Hago una lista con los vehículos para que puedan ser ordenados de mayor a
         * menor, mostrando solo su marca y modelo correspondientes
         */
        listaVehiculos.stream() //Uso .stream para procesar los elementos, sorted para ordenar, y en sorted uso reversed para invertir el orden y llamo a forEach, para que solo muestre la marca y modelo respectivamente
            .sorted(Comparator.comparingDouble(Vehiculo::getPrecio).reversed())
            .forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo()));
    }

    @Override
    public void vehiculoOrdenadoNatural(List<Vehiculo> listaVehiculos) {
        /**
         * Hago una lista de vehículos y la ordeno naturalmente según su marca, modelo y precio
         */
        listaVehiculos.sort( //Uso .sort para ordenar naturalmente los parámetros, que serían la marca, el modelo y el precio de los vehículos
            Comparator.comparing(Vehiculo::getMarca)
                .thenComparing(Vehiculo::getModelo)
                .thenComparingDouble(Vehiculo::getPrecio)
        );
    }

}
