public class Areas {

    public static void main(String[] args) {
        Cuadrado miCuadradito = new Cuadrado(5);

        System.out.println("area de cuadrado " + miCuadradito.calcularArea());

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(3);
        System.out.println("area de cuadrado " + cuadrado.calcularArea());

        //
    }
}
