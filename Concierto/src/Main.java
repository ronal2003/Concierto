import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Boleta miboleta = new Boleta();
        miboleta.setFechaCompra("15/10/2022");
        miboleta.setPersona(crearPersona());
        miboleta.setLocalidad(Localidad.OCCIDENTAL);

        resumenDeCompra(miboleta);
    }

    private static Persona crearPersona() {
        Persona mipersonita = new Persona();

        mipersonita.setNombre(JOptionPane.showInputDialog("Porfavor Ingrese el nombre"));
        mipersonita.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Porfavor Ingrese la edad")));
        mipersonita.setTelefono(JOptionPane.showInputDialog("Porfavor Ingrese su numero de telefono"));

        return mipersonita;
    }

    private static void resumenDeCompra(Boleta boleta) {
        JOptionPane.showMessageDialog(null, "RESUMEN COMPRA: \n\n " +
                "Nombre: " + boleta.getPersona().getNombre() + "\n" +
                "Fecha: " + boleta.getFechaCompra() + "\n" +
                "Localidad: " + boleta.getLocalidad().getNombre() + "\n" +
                "valor: " + boleta.getLocalidad().getValor());
    }
}