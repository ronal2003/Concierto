import javax.swing.*;

public class metodosconretorno {

    public static void main(String[] args) {
        int a = tomarValor();
        int b = tomarValor();
        int suma = sumarVariables(a, b);
        imprimirResultado(a, b, suma);


    }

    public static int tomarValor() {
        return Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor de su suma"));
    }

    public static int sumarVariables(int a, int b) {
        return (a + b);
    }

    public static void imprimirResultado(int a, int b, int suma) {
        System.out.println("El resultado se sumar: " + a + " y " + b + " es: " + suma);
    }
}
