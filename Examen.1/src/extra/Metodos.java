import javax.swing.*;

public class Metodos {





    public void sumar(){
        int x = 5;
        int y = 10;
        int resultado = x + y;

        System.out.println("El resultado de la suma es " +resultado);
    }


    public void multiplicar( int x, int y){
     int multi = x * y;
        System.out.println("El resultado de la suma es "+ multi);
    }

    public int resta(){
        int x = 10;
        int y = 10;
        int resta = x - y;
        return resta;
    }

    public int divicion(int x, int y){
        return x / y;
    }
}
