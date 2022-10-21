public class Cuadrado {
    //area: lado * lado
    //perimetro: 4 * lado

    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int calcularArea() {
        return lado * lado;
    }

    public int calcularperimetro() {
        return 4 * lado;
    }

}
