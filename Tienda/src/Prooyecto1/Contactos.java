package Prooyecto1;

import javax.swing.*;
import java.util.ArrayList;

public class Contactos {
    String nombre, telefono, email, buscar, eliminar;

    String persona[] = new String[3];

    public Contactos() {
        menu();
    }

    public void menu() {
        String menu = "Contactos\n\n";
        menu += "1. guardar\n";
        menu += "2. buscar\n";
        menu += "3. eliminar\n";
        menu += "4. mostrar\n";
        menu += "5. salir\n";


        String opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {
            case "1":
                guardar(nombre, telefono, email);
                break;
            case "2":
                buscar(buscar);
                break;
            case "3":
                eliminar(eliminar);
                break;
            case "4":
                mostrar();
                break;

            case "5":
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opcion fuera del menu");
        }
        menu();
    }

    private void mostrar() {

        for (int i = 0; i < persona.length; i++) {
            System.out.println(persona[i]);
        }
        menu();
    }

    public void guardar(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;

        String value = "";
        value = nombre = JOptionPane.showInputDialog("Nombre:");
        value = telefono = JOptionPane.showInputDialog("Telefono:");
        value = email = JOptionPane.showInputDialog("Email:");

        persona[0] = nombre;
        persona[1] = telefono;
        persona[2] = email;
        menu();
    }

    public void buscar(String buscar) {
        this.buscar = buscar;

        buscar = JOptionPane.showInputDialog("Que desea buscar");
        if (persona[0].equals(buscar)) {

            if(persona[0] == null){
                persona[0] = null;
                persona[1] = null;
                persona[2] = null;
                System.out.println("El dato fue eliminado");
            } else {
                System.out.println(persona[0]);
                System.out.println(persona[1]);
                System.out.println(persona[2]);
            }

        } else {
            System.out.println("No se encontro persona");
        }
        menu();

    }

    public void eliminar(String eliminar) {
        this.eliminar = eliminar;

        eliminar = JOptionPane.showInputDialog("Que desea elimianar");
        if (persona[0].equals(eliminar)) {
            if (persona[0] != null) {

                persona[0] = null;
                persona[1] = null;
                persona[2] = null;
                System.out.println("dato eliminado");



            } else {
                System.out.println(persona[0]);
                System.out.println(persona[1]);
                System.out.println(persona[2]);

            }

        } else {
            System.out.println("No se pudo eliminar el dato");
        }
        menu();
    }


}


