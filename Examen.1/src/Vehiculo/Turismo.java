package Vehiculo;

public class Turismo extends Vehiculo {

    private int puertas;
    private boolean MarchaAutomatica;

    public Turismo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible, int puertas, boolean marchaAutomatica) {
        super(matricula, marca, modelo, color, tarifa, disponible);
        this.puertas = puertas;
        this.MarchaAutomatica = marchaAutomatica;
    }

    public String getAtributos() {
        return super.getAtributos() +
                "puertas " + this.puertas +
                "marcha " + this.MarchaAutomatica;
    }
}
