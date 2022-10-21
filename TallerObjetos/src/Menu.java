import javax.swing.*;

public class Menu {
    public void menuOpciones() {
        int opcion = 0;

        String mensaje = "Por favor escoja una opcion\n" +
                "1.cuadrado \n" +
                "2.circulo\n" +
                "3.triangulo\n" +
                "4.paralelelipido\n" +
                "5. salir \n";

        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error con los datos ",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            menuCuadrado();
        }
        switch (opcion) {
            case 1:
                menuCuadrado();
                break;
            case 2:

                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;

            default:

        }
    }

    private void menuCuadrado() {

        String mensaje = "Por favor escoja una opcion\n" +
                "1.calcular area \n" +
                "2.calcular perimetro \n";

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));

        switch (opcion) {
            case 1:
                calcularAreaCuadrado();
                menuOpciones();
                break;
            case 2:
                calcularPerimetroCuadrado();
                menuOpciones();
                break;

            default: JOptionPane.showMessageDialog(null,"Opcion no valida por favor ingrese la opcion correcta");

        }
    }

    private void calcularAreaCuadrado() {

        JOptionPane.showMessageDialog(null, "EL area del cuadrado es: " + generarCuadrado().calcularArea());

    }

    private void calcularPerimetroCuadrado() {
        JOptionPane.showMessageDialog(null, "EL area del cuadrado es: " + generarCuadrado().calcularperimetro());
    }

    private void calcularAreaCirculo() {
        JOptionPane.showMessageDialog(null, "EL radio del circulo es: " + generadorCirculo().calcularRadio());
    }

    private void calcularPerimetroCirculo() {
        JOptionPane.showMessageDialog(null, "El perimetro del circulo es de: " + generadorCirculo().calcularPerimetro());
    }

    private Circulo generadorCirculo() {
        int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
        Circulo micurculo = new Circulo(radio);
        return micurculo;
    }

    private Cuadrado generarCuadrado() {
        int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado"));
        Cuadrado micuadradito = new Cuadrado(lado);
        return micuadradito;
    }

    public void menu(){

    }
}