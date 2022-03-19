package com.company;

public class Persona extends DatosPersona{
    public String nombre;
    public String apellido;

    public Persona (String nombre,String apellido, String nacionalidad, int edad){
        super(nacionalidad,edad);
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
