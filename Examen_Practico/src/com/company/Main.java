package com.company;

public class Main {

    public static void main(String[] args){

        Persona persona = new Persona("Abdiel","Francisco","Perea",29);

        System.out.println("Los datos de la persona son:\n" + "Nombre: " + persona.getNombre() + "\nApellido: "
                +persona.getApellido()+"\nNacionaliodad: "+ persona.getNacionalidad()+
                "\nEdad: "+ persona.getEdad());
    }
}
