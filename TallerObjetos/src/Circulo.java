public class Circulo {

    //pi * r*r
    //2 * pi *r
    private double radio;
    private final double PI = 3.1416;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularRadio() {
        return PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
}
