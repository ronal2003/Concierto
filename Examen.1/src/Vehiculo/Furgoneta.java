package Vehiculo;

public class Furgoneta extends Vehiculo {

    private int carga;
    private int volumen;

    public Furgoneta(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible, int carga, int volumen) {
        super(matricula, marca, modelo, color, tarifa, disponible);
        this.carga = carga;
        this.volumen = volumen;
    }

    @Override
    public String getAtributos() {
        return super.getAtributos() +
                "Carga " + carga +
                "Volumen " + volumen;
    }
}
