package consecionaria;

public class Motocicleta extends Vehiculo {

    private int cilindrada;

    public Motocicleta(int idVehiculo,String marca, String modelo, float precio, int cilindrada) {
        super(idVehiculo,marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String toString() {
        return "Marca: " + this.getMarca() + " // " + "Modelo: " + this.getModelo() + " // " + "Cilindrada: " + this.cilindrada + "cc" + " // " + "Precio: " + this.precioFormateado();
    }

}
