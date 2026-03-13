package Unidad_0;

import java.util.Scanner;

public class IngresoDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese valor de N");
        int N = scanner.nextInt();
        System.out.print("ingrese valor de A");
        double A = scanner.nextDouble();
        System.out.print("ingrese valor de C");
        char C =  scanner.next();
        System.out.println("Variable N = " + N);
        System.out.println("Variable A = " + A);
        System.out.println("Variable C = " + C);
        System.out.println(N + " + " + A + " = " + (N+A));
        System.out.println(A + " - " + N + " = " + (A-N));
        System.out.println("Valor numerico del caracter C = " + ((int) C));
    }
}
