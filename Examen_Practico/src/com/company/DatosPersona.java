package com.company;

public class DatosPersona {
    String nacionalidad;
    int edad;

    public DatosPersona (String nacionalidad, int edad){
        this.nacionalidad=nacionalidad;
        this.edad=edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}
