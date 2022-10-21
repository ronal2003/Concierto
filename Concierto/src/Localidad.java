public enum Localidad {

    ORIENTAL("oriental", 200000),
    OCCIDENTAL("occidental",300000),
    NORTE("norte",70000),
    GRAMILLA("gramilla",400000),
    VIP("vip",1000000);

    private String nombre;
    private  int valor;

    Localidad(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
