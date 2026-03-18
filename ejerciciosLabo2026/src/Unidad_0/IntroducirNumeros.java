package Unidad_0;

import java.util.Scanner;

public class IntroducirNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero, -1 para salir");
        int n = scanner.nextInt() , cont= 0, max = 0, min = 0, total=0;
        int negativos = 0 , aux = 0, positivos = 0;;

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

            if (n > aux){
                positivos+=n;
            }

            if (n < aux)
            {
                negativos+=n;
            }

        }

        System.out.println("Cantidad de numeros introducidos: " + cont);
        System.out.println("Mayor numero: " + max);
        System.out.println("Menor numero: " + min);
        System.out.println("Suma de todos los numeros: " + total);
        System.out.println("Suma de numeros positivos: " + positivos);
        System.out.println("Suma de numeros negativos: " + negativos);
    }
}
