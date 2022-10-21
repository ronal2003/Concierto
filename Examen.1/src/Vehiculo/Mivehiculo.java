package Vehiculo;

import Usodearrays.Cliente;
import Usodearrays.EmpresaAlquilerVehiculos;
import Usodearrays.deportivo;

public class Mivehiculo {

    public static void main(String[] args) {

    /*
        Vehiculo vehiculo = new Vehiculo("4050", "Nissan","2004","gris",100.0,true);

        System.out.println("Vehiculo: " + vehiculo.getAtributos());



        Turismo turismo = new Turismo("g5413","mitsubishi","2021","blanco",100.2,true,4,true);

        System.out.println("Turismo: " + turismo.getAtributos());

        Furgoneta furgoneta = new Furgoneta("2090","ford","2023","gris", 122.00,true,12,2);
        System.out.println("Furgoneta: " + furgoneta.getAtributos());
     */
        Usodearrays.EmpresaAlquilerVehiculos easydrive = new EmpresaAlquilerVehiculos("A-28-187189","easy drive","www.easydrive.com");

        easydrive.registrarCliente(new Cliente("x5618","juan","Gonzales Lopez"));

        //easydrive.alquilarVehiculo(new deportivo("2","ferrary","12","rojo",90.0,true,100));

        easydrive.imprimirClientes();
        easydrive.imprimirVehiculos();
    }
}
