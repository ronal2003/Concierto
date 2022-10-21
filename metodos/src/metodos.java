import javax.swing.*;

public class metodos {

    public static void main(String[] args){
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
    saludar(nombre);
    }
    public static void saludar(String nombre){
        JOptionPane.showMessageDialog(null,"Hola "+ nombre +", Te saludo desde un metodo");

    }
}
