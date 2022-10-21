package Vehiculo;

import Composicion.Cliente;
import Composicion.Vehiculo;

public class VehiculoAlquilado {

    private Cliente cliente;
    private Composicion.Vehiculo vehiculo;
    private int diaAlquiler;
    private int añoAlquiler;
    private int totalDiasAlquiler;

    public VehiculoAlquilado(Cliente cliente, Composicion.Vehiculo vehiculo, int diaAlquiler, int añoAlquiler, int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.añoAlquiler = añoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
