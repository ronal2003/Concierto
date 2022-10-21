package Vehiculo;

public class deportivo extends Vehiculo {

    private int cilindrada;

    public deportivo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible, int cilindrada) {
        super(matricula, marca, modelo, color, tarifa, disponible);
        this.cilindrada = cilindrada;
    }


    @Override
    public java.lang.String getAtributos() {
        return super.getAtributos() +
                "Cilindrada " + cilindrada;
    }
}
