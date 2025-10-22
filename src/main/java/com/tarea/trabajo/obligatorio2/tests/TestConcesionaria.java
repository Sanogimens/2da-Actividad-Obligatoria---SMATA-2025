package com.tarea.trabajo.obligatorio2.tests;

//Importaciones necesarias
import java.util.ArrayList;
import java.util.List;
import com.tarea.trabajo.obligatorio2.entidades.Auto;
import com.tarea.trabajo.obligatorio2.entidades.Moto;
import com.tarea.trabajo.obligatorio2.entidades.Vehiculo;
import com.tarea.trabajo.obligatorio2.metodos.MetodosVehiculoClase;

public class TestConcesionaria {
    public static void main(String[] args) {
        /**
         * Creo una lista de vehículos, con las características correspondientes
         */
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(new Auto("Peugeot", "206", 4, 200000.00));
        listaVehiculos.add(new Moto("Honda", "Titan", "125c", 60000.00));
        listaVehiculos.add(new Auto("Peugeot", "208", 5, 250000.00));
        listaVehiculos.add(new Moto("Yamaha", "YBR", "160c", 80500.50));

        /**
         * Creo un objeto de la clase MetodosVehiculoClase para poder usar sus métodos
         */
        MetodosVehiculoClase MetodosVehiculo = new MetodosVehiculoClase();

        /**
         * Hago un salto de linea
         */
        System.out.println("\n");

        /**
         * Imprimo la lista de vehículos creada previamente
         */
        listaVehiculos.forEach(System.out::println);

        /**
         * Hago otro salto de linea
         */
        System.out.println("\n=============================\n");
                        
        /**
         * Llamo al método que regresaba el valor de cuál era el vehículo más caro de la lista
         */
        MetodosVehiculo.vehiculoMasCaro(listaVehiculos);
    
        /**
         * Llamo al método que regresaba el valor de cuál era el vehículo más barato de la lista
         */
        MetodosVehiculo.vehiculoMasBarato(listaVehiculos);

        /**
         * Llamo al método que regresaba el valor de cuál era el vehículo que contenía la letra "Y"
         */
        MetodosVehiculo.vehiculoConLetraY(listaVehiculos);

        System.out.println("\n=============================\n");

        System.out.println("Vehículos ordenados por precio de mayor a menor:");

        /**
         * Llamo al método que ordenaba de mayor a menor los vehículos
         */
        MetodosVehiculo.vehiculoOrdenadoMayorMenor(listaVehiculos);

        System.out.println("\n=============================\n");

        System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio):");
        
        /**
         * Llamo al método que ordenaba naturalmente los vehículos y, luego, hago un forEach para imprimir en consola la lista
         */
        MetodosVehiculo.vehiculoOrdenadoNatural(listaVehiculos);
        listaVehiculos.forEach(System.out::println);

        System.out.println("\n");

    }
}
