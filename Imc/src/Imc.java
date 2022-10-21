public class Imc {

    private double peso;
    private double altura;


    public Imc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public Imc() {

    }

    public double calcular() {


        double x = altura * altura;
        double result = peso / x;
        System.out.println("Su masa corporal es " + result);
        if (result <= 18) {
            System.out.println("su peso corporal es bajo, Cosulta un nutriologo");
        } else if (result >= 18 && result <= 24.9) {
            System.out.println("Felicidades: tu peso es normal");

        } else if (result >= 25 && result <= 26.9) {
            System.err.println("padeces sobre peso");

        } else if (result >= 27 && result <= 29.9) {
            System.err.println("obvesidad nivel 1");

        } else if (result >= 30 && result < 39.9) {
            System.err.println("obvesidad nivel 2");

        } else if (result >= 40) {
            System.err.println("obvesidad nivel 3");

        }
        return  result;

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
