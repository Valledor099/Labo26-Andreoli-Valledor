package Unidad_0;

public class DivisibleFor {
    public static void main(String[] args) {
        System.out.println("Los numeros divisibles por 2 y 3 son: ");
        int j = 0;

        for(int i = 1; i <= 100; i++)
        {
            if(i % 6 == 0)
            {
                System.out.println(i);
            }
        }

        System.out.println("Ahora con while: ");

        while(j <= 100)
        {
            if(j % 6 == 0)
            {
                System.out.println(j);
            }
        j++;
        }
    }
}
