import javax.swing.*;

public class Menu {

    public void menuOpciones() {

        String mensaje = "Por favor escoja una opcion\n"
                + "1. Cuadrado\n"
                + "2. Circulo\n"
                + "3. Triangulo\n"
                + "4. Paralelogramo\n"
                + "5. Salir";

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(Util.tomarValorNumerico(mensaje)));

        switch (opcion) {
            case 1:
                menuCuadrado();

                break;
            case 2:
                menuCirculo();
                break;
            case 3:
                menuTriangulo();
                break;
            case 4:

                break;
            case 5:
                System.exit(0);
                break;
            default:
        }
        menuOpciones();

    }

    private void menuCuadrado() {


        switch (opcionFigura()) {
            case 1:
                calcularAreaCuadrado();

                break;
            case 2:
                calcularperimetroCuadrado();

                break;
        }
        menuOpciones();
    }

    private void calcularAreaCuadrado() {
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + generarCuadrado().calcularArea());

    }

    private void calcularperimetroCuadrado() {
        JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es: " + generarCuadrado().calcularPerimetro());

    }

    private Cuadrado generarCuadrado() {
        int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado"));
        Cuadrado miCuadradito = new Cuadrado(lado);
        return miCuadradito;

    }

    private void menuCirculo() {
        switch (opcionFigura()) {
            case 1:
                areaCirculo();
                break;
            case 2:
                perimetroCirculo();
                break;
        }
        menuOpciones();
    }

    private Circulo generarCirculo() {
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Porfavor Ingrese el radio"));
        Circulo micirculito = new Circulo(radio);
        return micirculito;
    }

    private void areaCirculo() {
        JOptionPane.showMessageDialog(null, "El radio de su circulo es: " + generarCirculo().calcularArea());
    }

    private void perimetroCirculo() {
        JOptionPane.showMessageDialog(null, "El radio de su circulo es: " + generarCirculo().calcularPerimetro());
    }

    public void menuTriangulo() {
        switch (opcionFigura()) {
            case 1:
                areaTriangulo();
                break;
            case 2:
                perimetroTriangulo();
                break;
        }
        menuOpciones();
    }


    public Triangulo generarTriangulo() {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
        int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado 1"));
        int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado 2"));

        Triangulo mitriangulito = new Triangulo(base, altura, lado1, lado2);
        return mitriangulito;
    }

    private void areaTriangulo() {
        JOptionPane.showMessageDialog(null, "EL area de su triangulo es: " + generarTriangulo().calcularArea());
    }

    private void perimetroTriangulo() {
        JOptionPane.showMessageDialog(null, "EL perimetro de su triangulo es: " + generarTriangulo().calcularPerimetro());
    }

    public void menuParalelogramo() {
        switch (opcionFigura()) {
            case 1:
                areaParalelogramo();
                break;
            case 2:
                perimetroParalelogramo();
                break;
        }
        menuOpciones();
    }

    private void areaParalelogramo() {
        JOptionPane.showMessageDialog(null, "El area de su parametro es: " + generarParalelogramo().calcularArea());
    }

    private void perimetroParalelogramo() {
        JOptionPane.showMessageDialog(null, "El area de su parametro es: " + generarParalelogramo().calcularPerimetro());
    }

    private Paralelogramo generarParalelogramo() {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base "));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura "));
        int lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado"));

        Paralelogramo paralelogramito = new Paralelogramo(base, altura, lado);
        return paralelogramito;
    }

    private int opcionFigura() {
        String mensaje = "Por favor escoja lo que desea calcular\n"
                + "1. Area\n"
                + "2. Perimetro\n";
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }

}
