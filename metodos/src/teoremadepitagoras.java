import javax.swing.*;

public class teoremadepitagoras {

    public static void main(String[] args){

        int a = tomarValor();
        int b = tomarValor();
        int suma = valorDeTriangulo(a,b);
        mensaje(a, b, suma);

    }
    public static int valorDeTriangulo(int a, int b ){

        return  (int) Math.pow(a,2);
    }

    public static int tomarValor() {
        return Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor de su suma"));
    }

    public static void mensaje(int a, int b, int suma){
        System.out.println("El valor del triangulo es: " + suma);
    }
}
