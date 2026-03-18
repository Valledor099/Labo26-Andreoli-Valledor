package Unidad_0;

public class DivisibleFor {
    public static void main(String[] args) {
        System.out.println("Los numeros divisibles por 2 y 3 son: ");

        for(int i = 1; i <= 100; i++)
        {
            if(i % 6 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
