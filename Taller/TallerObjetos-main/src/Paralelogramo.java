public class Paralelogramo {
    // base * altura
    // perimetro suma de los 4 lados

    private  int base;
    private  int altura;
    private  int lado;


    public Paralelogramo(int base, int altura, int lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public int calcularArea(){
        return base * altura;

    }
    public int calcularPerimetro(){
        return lado + 2 + lado +2;
    }
}
