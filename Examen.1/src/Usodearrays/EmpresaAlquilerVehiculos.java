package Usodearrays;

import java.util.ListResourceBundle;
import java.util.Locale;

public class EmpresaAlquilerVehiculos {

    private String cif;
    private String nombre;
    private String paginaWeb;
    private int totalClientes;
    private Cliente[] clientes;
    private int totalVehiculos;
    private Vehiculo[] vehiculos;
    private int totalAlquileres;
    private VehiculoAlquilado[] alquileres;
    private String matricula;
    private String nif;
    private int dias;


    public EmpresaAlquilerVehiculos(String cif, String nombre, String paginaWeb) {

        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
        this.totalClientes = 0;
        this.clientes = new Cliente[50];
        this.totalVehiculos = 0;
        this.vehiculos = new Vehiculo[50];
        this.totalAlquileres = 0;
        this.alquileres = new VehiculoAlquilado[100];
    }

    public void registrarCliente(Cliente cliente) {
        this.clientes[this.totalClientes] = cliente;
        this.totalClientes++;
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
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
        System.out.println("Matricula\tModelo\tcolor\tImporte\tDisponible\n");

        for (int i = 0; i < this.totalVehiculos; i++) {
            System.out.println(vehiculos[i].getAtributosInforme());
        }
    }

    public void alquilarVehiculo(String matricula, String nif, int dias) {
        Cliente cliente = getCliente(nif);
        Vehiculo vehiculo = getVehiculo(matricula);

        if (vehiculo.getDisponible()) {
            vehiculo.setDisponible(false);
            this.alquileres[this.totalAlquileres] = new VehiculoAlquilado(cliente,vehiculo,12,2022,2);
            this.totalAlquileres++;
        }
    }

    public void recibirVehiculo(String matricula) {

        Vehiculo vehiculo = getVehiculo(matricula);

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
            if (this.vehiculos[i].getMatricula() == matricula) {
                return this.vehiculos[i];

            }
        }
        return null;
    }

    public void alquilarVehiculo(String matricula, String nif) {

        Cliente cliente = getCliente(nif);
        Vehiculo vehiculo = getVehiculo(matricula);

        if(vehiculo.getDisponible()){
            vehiculo.setDisponible(false);
            this.alquileres[this.totalAlquileres] = new VehiculoAlquilado(cliente, vehiculo, 12,2022,2);
            this.totalAlquileres++;
        }
    }
}

