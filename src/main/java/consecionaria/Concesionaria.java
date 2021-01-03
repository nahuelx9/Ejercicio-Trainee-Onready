package consecionaria;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Concesionaria {

    private static List<Vehiculo> vehiculos = new ArrayList<>();

    public static void main(String[] args) {
        agregarVehiculos();
        listarVehiculos();
        System.out.println("=============================");
        imprimirVehiculoMasCaro(obtenerVehiculoMasCaro());
        ImprimirVehiculoMasBarato(obtenerVehiculoMasBarato());
        CharSequence letra = "Y";
        imprimirPorLetra(modeloConLetraEspecifica(letra), letra);
        System.out.println("=============================");
        ordenarListaPorPrecio(vehiculos);
        imprimirPorPrecioDescendente(vehiculos);
    }

    /*Metodo para Agregar los vehiculos a la lista*/
    public static void agregarVehiculos() {
        vehiculos.add(new Automovil(1,"Peugeot", "206", 200000, 4));
        vehiculos.add(new Motocicleta(2,"Honda", "Titan", 60000, 125));
        vehiculos.add(new Automovil(3,"Peugeot", "208", 250000, 5));
        vehiculos.add(new Motocicleta(4,"Yamaha", "YBR", 80500.50f, 160));
    }

    /*Metodo para obtener el vehiculo de mayor precio*/
    public static Vehiculo obtenerVehiculoMasCaro() {
        Vehiculo vehiculoMasCaro = vehiculos.get(0);
        for (Vehiculo v : vehiculos) {
            if (v.getPrecio() > vehiculoMasCaro.getPrecio()) {
                vehiculoMasCaro = v;
            }
        }
        return vehiculoMasCaro;
    }

    /*Metodo para obtener el vehiculo de menor precio*/
    public static Vehiculo obtenerVehiculoMasBarato() {
        Vehiculo vehiculoMasBarato = vehiculos.get(0);
        for (Vehiculo v : vehiculos) {
            if (v.getPrecio() < vehiculoMasBarato.getPrecio()) {
                vehiculoMasBarato = v;
            }
        }
        return vehiculoMasBarato;
    }

    /*Metodo para encontrar una letra especifica en el modelo*/
    public static List<Vehiculo> modeloConLetraEspecifica(CharSequence letra) {
        /*En caso de que existiera mas de un Vehiculo que contenga la letra "y" creo una lista para almacenarlos*/
        List<Vehiculo> modelosEncontrados = new ArrayList<>();
        for (Vehiculo v : vehiculos) {
            if (v.getModelo().contains(letra)) {
                modelosEncontrados.add(v);
            }
        }
        return modelosEncontrados;
    }

    /*Ordena los vehiculos en orden por precio descendente*/
    public static void ordenarListaPorPrecio(List<Vehiculo> vehiculos) {
        vehiculos.sort(Comparator.comparing(Vehiculo::getPrecio).reversed());
    }

    public static void listarVehiculos() {
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }
    }

    public static void imprimirVehiculoMasCaro(Vehiculo vehiculo) {
        System.out.println("Vehículo más caro: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
    }

    public static void ImprimirVehiculoMasBarato(Vehiculo vehiculo) {
        System.out.println("Vehículo más barato: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
    }

    public static void imprimirPorLetra(List<Vehiculo> vehiculosEncontrados, CharSequence letra) {
        for (Vehiculo v : vehiculosEncontrados) {
            System.out.println("Vehículo que contiene en el modelo la letra " +"‘"+ letra +"’"+ "" + ": " + v.getMarca() + " " + v.getModelo() + " " + v.precioFormateado());
        }
    }

    public static void imprimirPorPrecioDescendente(List<Vehiculo> vehiculosOrdenados) {
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for (Vehiculo v : vehiculosOrdenados) {
            System.out.println(v.getMarca() + " " + v.getModelo());
        }
    }

}
