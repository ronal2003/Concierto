package Vehiculo;

public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa = 0.0;
    private boolean disponible = false;

    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }


    public String getAtributos() {
        return "Matricula: " + this.matricula +
                "Modelo: " + this.modelo + "" + this.marca +
                "Color: " + this.color +
                "Tarifa: " + this.tarifa +
                "Disponible: " + this.disponible;
    }
}
