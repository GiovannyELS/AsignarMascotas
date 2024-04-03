package cl.Main;

import cl.entidades.Perro;
import cl.entidades.Persona;

public class Main {
    public static void main(String[] args) {


        Persona persona1 = new Persona();
        Perro perro1 = new Perro();
        Persona persona2 = new Persona();
        Perro perro2 = new Perro();

        System.out.println("-----------------------------------------------------");

        persona1.setNombre("Barbara");
        persona1.setApellido("Santa Maria");
        persona1.setRut("26357649-7");
        persona1.setEdad(32);
        persona1.setPerro(perro1);

        perro1.setNombre("Rudolph");
        perro1.setRaza("Doberman");
        perro1.setTamanio("Grande");
        perro1.setEdad(4);

        System.out.println(persona1.getPersona(persona1.getNombre(), persona1.getApellido(),
                persona1.getRut(), persona1.getEdad(), persona1.getPerro()));

        System.out.println("-----------------------------------------------------");


        persona2.setNombre("Katy");
        persona2.setApellido("Chaustre");
        persona2.setRut("26555549-8");
        persona2.setEdad(30);
        persona2.setPerro(perro2);

        perro2.setNombre("Maya");
        perro2.setRaza("Pincher");
        perro2.setTamanio("Mini");
        perro2.setEdad(2);


        System.out.println(persona2.getPersona(persona2.getNombre(), persona2.getApellido(),
                persona2.getRut(), persona2.getEdad(), persona2.getPerro()));

        System.out.println("-----------------------------------------------------");

    }
}