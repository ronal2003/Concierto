package ArraysRedimencionales;


public class Furgoneta extends Vehiculo {

    private int carga;
    private int volumen;


    public Furgoneta(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible, int carga, int volumen) {
        super(matricula, marca, modelo, color, tarifa, disponible);
        this.carga = carga;
        this.volumen = volumen;
    }

    public String getAtributos() {
        return super.getAtributosInforme() + "\t" + carga + "\t" + volumen;

    }
}
