package Unidad_0;


import java.util.Scanner;

public class ReemplazoLetra{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String txt = "Ayer me compré muñecos de la marca ‘ToyCo’ por \n" +
                "internet.";

        System.out.println("ingrese una letra: ");

        char letra = scanner.next().charAt(0);
        txt = txt.toLowerCase();
        txt = txt.replace('e', letra);
        System.out.println(txt);
    }
}
