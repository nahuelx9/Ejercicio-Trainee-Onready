
package consecionaria;

public class Vehiculo {

    private int idVehiculo;
    private String marca;
    private String modelo;
    private float precio;

    public Vehiculo() {
    }

    
    
    public Vehiculo(int idVehiculo,String marca, String modelo, float precio) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    String precioFormateado(){
        return "$"+ String.format(java.util.Locale.ITALY,"%,.2f", this.getPrecio() ); 
    }
    
    public String toString() { 
        return "Marca: " + this.getMarca() + " // " + "Modelo: " + this.getModelo() + " // " + "Precio: "+ this.precioFormateado(); 
    }
    
}
