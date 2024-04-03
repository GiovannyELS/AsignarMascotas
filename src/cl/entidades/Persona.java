package cl.entidades;

public class Persona {
    private String nombre;
    private String apellido;
    private String rut;
    private int edad;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String rut, int edad, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.edad = edad;
        this.perro = perro;
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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public String getPersona(String nombre, String apellido, String rut, int edad, Perro perro) {
        return nombre + " " + apellido + " " + rut + " " + edad + " "
                + perro.getNombre() + " " + perro.getRaza() + " " + perro.getTamanio() + " " + perro.getEdad();
    }

}



