package ArraysRedimencionales;

public class Cliente  {

    private String nif;
    private String nombre;
    private String apellido;

    public Cliente(String nif, String nombre, String apellido) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAtributos(){
        return  nif + "\t" + nombre + "\t" + apellido;
    }

    }
