public class Concesionario {
    public static void main(String[] args) {

        Vehiculo mivehiculito = new Vehiculo();

        llenarVehiculo(mivehiculito, "rojo",1000, 2021, "nissan", false);

        imprimirDatosVehiculos(mivehiculito);

        Vehiculo misegundovehiculo = new Vehiculo();
        llenarVehiculo(misegundovehiculo, "verde", 1500, 2022, "ford", false);
        System.out.println("Mi segundo vehiculito");

        imprimirDatosVehiculos(misegundovehiculo);

    }

    public static void llenarVehiculo(Vehiculo vehiculo, String color, int cilindraje, int modelo ,   String marca,  boolean encendido){
        vehiculo.setColor(color);
        vehiculo.setMarca(marca);
        vehiculo.setModelo(modelo);
        vehiculo.setCilindraje(cilindraje);
        vehiculo.setEncendido(encendido);
    }

    public  static void imprimirDatosVehiculos(Vehiculo vehiculo){
        System.out.println("----------------------------------");
        System.out.println("marca " + vehiculo.getMarca());
        System.out.println("color " + vehiculo.getColor());
        System.out.println("cilindraje " + vehiculo.getCilindraje());
        System.out.println("Modelo" + vehiculo.getModelo());
        System.out.println("encendido " +vehiculo.getEncendido());
    }


}
