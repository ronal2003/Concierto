public class Principal {

    public static void main(String[] args) {
        imprimirArea(2,2);

    }

    public static void imprimirArea(int lado1,int lado2) {
        System.out.println(Rectangulo.area(lado1, lado2));
    }
}