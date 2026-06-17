package introduccionArrayList;

import humanos.Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class IntroduccionArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer>numeros = new ArrayList<>();
        ArrayList<String>palabras = new ArrayList<>();
        ArrayList<Persona>personas = new ArrayList<>();

        /*Ej 1.a*/
        int suma = 0;
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        for (int num : numeros){
            suma += num;
        }

        System.out.println("Suma de todos los numeros: " + suma );

        /*1.b*/
        palabras.add("Choribondi");
        palabras.add("Rempalago");
        palabras.add("TortaFrita");
        palabras.add("PerezElRaton");
        palabras.add("Pepitos");

        for (String palabra : palabras) {
            if (palabra.charAt(0) == 'P') {
                System.out.println(palabra);
            }
        }

        System.out.println("Personas con mas de 30 años:");
        for (Persona persona : personas){
            if (persona.calcularEdad() > 30){

                persona.mostrarDatos();
            }
        }

    }
}
