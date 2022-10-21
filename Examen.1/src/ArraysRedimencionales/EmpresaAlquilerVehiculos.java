package ArraysRedimencionales;


import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Locale;

public class EmpresaAlquilerVehiculos {

    private String cif;
    private String nombre;
    private String paginaWeb;
    private int totalClientes;
    private List<Cliente> clientes;
    private int totalVehiculos;
    private List<Vehiculo> vehiculos;
    private int totalAlquileres;
    private List<VehiculoAlquilado> alquileres;
    private String matricula;
    private String nif;
    private int dias;


    public EmpresaAlquilerVehiculos(String cif, String nombre, String paginaWeb) {

        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
        this.totalClientes = 0;
        this.clientes = new ArrayList<Cliente>();
        this.totalVehiculos = 0;
        this.vehiculos = new ArrayList<Vehiculo>();
        this.totalAlquileres = 0;
        this.alquileres = new ArrayList<VehiculoAlquilado>();
    }

    public void registrarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    public void imprimirClientes() {
        System.out.println("NIf cliente\tNombre\n");

        for (Cliente c : this.clientes) {
            System.out.println(c.getAtributos());
        }
    }

    public void imprimirVehiculos() {
        System.out.println("Matricula\tModelo\tcolor\tImporte\tDisponible\n");

        for (Vehiculo c : this.vehiculos) {
            System.out.println(c.getAtributosInforme());
        }
    }

    public void alquilarVehiculo(String matricula, String nif, int dias) {
        Cliente cliente = getCliente(nif);
        Vehiculo vehiculo = getVehiculo(matricula);

        if (vehiculo.getDisponible()) {
            vehiculo.setDisponible(false);
            this.alquileres.add(new VehiculoAlquilado(cliente, vehiculo, 12, 2022, 2));
        }
    }

    public void recibirVehiculo(String matricula) {

        Vehiculo vehiculo = getVehiculo(matricula);

        if (vehiculo != null) {
            vehiculo.setDisponible(true);
        }
    }

    private Cliente getCliente(String nif) {
        for (Cliente c : this.clientes) {
            if (c.getNif() == nif) {
                return c;

            }
        }
        return null;
    }

    private Vehiculo getVehiculo(String matricula) {

        for (Vehiculo v : this.vehiculos) {
            if (v.getMatricula() == matricula) {
                return v;

            }
        }
        return null;
    }

    public void alquilarVehiculo(String matricula, String nif) {

        Cliente cliente = getCliente(nif);
        Vehiculo vehiculo = getVehiculo(matricula);

        if (vehiculo.getDisponible()) {
            vehiculo.setDisponible(false);
            this.alquileres.add(new VehiculoAlquilado(cliente, vehiculo, 12, 2022, 2));
        }
    }
}

