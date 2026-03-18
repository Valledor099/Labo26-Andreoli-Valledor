package Unidad_0;

import java.util.Scanner;

public class IntroducirNumeros {
    public static int positive(int num)
    {
        int positivos = 0, aux = 0;

        if (num < aux) {
            positivos += num;
        }

        return positivos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero, -1 para salir");
        int n = scanner.nextInt() , cont= 0, max = 0, min = 0, total=0;
        int sumPositivos = 0;
        int negativos = 0 , aux = 0;

        while(n != -1)
        {
            cont++;
            total += n;
            System.out.println("Ahora otro");
            n = scanner.nextInt();

            if (max < n)
            {
                max = n;
            }

            if(n < min)
            {
                min = n;
            }

            sumPositivos = positive(n);
            

        }

        System.out.println("Cantidad de numeros introducidos: " + cont);

    }
}
