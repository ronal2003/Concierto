package ArraysRedimencionales;

public class Main {
    public static void main(String[] args) {

        EmpresaAlquilerVehiculos easydrive = new EmpresaAlquilerVehiculos("A-28-187189","easy drive","www.easydrive.com");

        //cliente
        easydrive.registrarCliente(new Cliente("x5618","juan","Gonzales Lopez"));
        easydrive.registrarCliente(new Cliente("y5432","Jose","Perez Gonzales"));
        // catalogo de vehiculos
        easydrive.registrarVehiculo(new Furgoneta("F012 FUR","toyota","2022","rojo",20.09,false,12,1));
        easydrive.registrarVehiculo(new deportivo("D113 DEP","ferrari","20222","rojo",19.90,false,500));
        easydrive.registrarVehiculo(new Turismo("T112 TUR","mustang","2005","negro",23.9,false,4,true));

        easydrive.recibirVehiculo("D113 DEP");
        easydrive.recibirVehiculo("F012 FUR");
        easydrive.alquilarVehiculo("T112 TUR","X5618");

        easydrive.imprimirClientes();
        easydrive.imprimirVehiculos();

    }
}

