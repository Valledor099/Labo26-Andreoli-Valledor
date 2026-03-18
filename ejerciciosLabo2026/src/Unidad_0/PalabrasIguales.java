package Unidad_0;

import java.util.Scanner;

public class PalabrasIguales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra1  , palabra2;

        System.out.println("Ingrese una palabra: ");
        palabra1 = scanner.next();

        System.out.println("Ingrese otra palabra: ");
        palabra2 = scanner.next();

        if(palabra1.equals(palabra2))
        {
            System.out.println("Son dos palabras iguales");
        }

        else {
            System.out.println("Son dos palabras distintas");
        }

    }
}
