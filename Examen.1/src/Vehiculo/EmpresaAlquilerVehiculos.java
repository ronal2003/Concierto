package Vehiculo;

import Usodearrays.Cliente;
import Usodearrays.Turismo;
import Usodearrays.Vehiculo;
import Usodearrays.VehiculoAlquilado;

public class EmpresaAlquilerVehiculos {

    private String cif;
    private String nombre;
    private String paginaWeb;
    private int totalClientes;
    private Cliente[] clientes;
    private int totalVehiculos;
    private Usodearrays.Vehiculo[] vehiculos;
    private int totalAlquileres;
    private Usodearrays.VehiculoAlquilado[] alquileres;


    public EmpresaAlquilerVehiculos(String cif, String nombre, String paginaWeb) {

        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
        this.totalClientes = 0;
        this.clientes = new Cliente[50];
        this.totalVehiculos = 0;
        this.vehiculos = new Usodearrays.Vehiculo[50];
        this.totalAlquileres = 0;
        this.alquileres = new Usodearrays.VehiculoAlquilado[100];
    }

    public void registrarCliente(Cliente cliente) {
        this.clientes[this.totalClientes] = cliente;
        this.totalClientes++;
    }

    public void registrarVehiculo(Usodearrays.Vehiculo vehiculo) {
        this.vehiculos[this.totalVehiculos] = vehiculo;
        this.totalVehiculos++;
    }

    public void imprimirClientes() {
        System.out.println("NIf cliente\tNombre\n");

        for (int i = 0; i < this.totalClientes; i++) {
            System.out.println(clientes[i].getAtributos());
        }
    }

    public void imprimirVehiculos() {
        System.out.println("Matricula\tModelo\tImporte Disponible\n");

        for (int i = 0; i < this.totalVehiculos; i++) {
            System.out.println(vehiculos[i].getAtributosInforme());
        }
    }

    public void alquilarVehiculo(String matricula, String nif, int dias) {
        Cliente cliente = getCliente(nif);
        Usodearrays.Vehiculo vehiculo = getVehiculo(matricula);

        if (vehiculo.getDisponible()) {
            vehiculo.setDisponible(false);
            this.alquileres[this.totalAlquileres] = new VehiculoAlquilado(cliente,vehiculo,12,2022,2);
            this.totalAlquileres++;
        }
    }

    public void recibirVehiculo(String matricula) {

        Usodearrays.Vehiculo vehiculo = getVehiculo(matricula);

        if(vehiculo != null){
            vehiculo.setDisponible(true);
        }
    }

    private Cliente getCliente(String nif) {
        for (int i = 0; i < this.totalClientes; i++) {
            if (this.clientes[i].getNif() == nif) {
                return this.clientes[i];

            }
        }
        return null;
    }

    private Vehiculo getVehiculo(String matricula) {
        for (int i = 0; i < this.totalVehiculos; i++) {
            if (this.clientes[i].getNif() == matricula) {
                return this.vehiculos[i];

            }
        }
        return null;
    }

    public void alquilarVehiculo(Turismo turismo) {
    }
}
