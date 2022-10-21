package Composicion;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo("304656", "chevrolet", "4050abj", "gris", 23.212, true);

        Vehiculo vehiculo2 = new Vehiculo("12321", "ram", "6512jbg", "blanco", 40.212, true);

        Cliente cliente1 = new Cliente("12344677", "adrian", "lopez");

        VehiculoAlquilado alquiler1 = new VehiculoAlquilado(cliente1, vehiculo1, 11, 2022, 2);

        System.out.println(alquiler1.getCliente());
    }
}
