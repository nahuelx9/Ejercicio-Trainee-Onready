
package consecionaria;

public class Automovil extends Vehiculo {

    private int puertas;

    public Automovil(int idVehiculo,String marca,String modelo, float precio,int puertas) {
        super(idVehiculo,marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    public String toString() { 
        return "Marca: " + this.getMarca() + " // " + "Modelo: " + this.getModelo() + " // " + "Puertas: "+this.puertas + " // " + "Precio: "+ this.precioFormateado(); 
    } 
    
}
