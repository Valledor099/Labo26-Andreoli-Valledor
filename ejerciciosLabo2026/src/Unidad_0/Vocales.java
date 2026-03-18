package Unidad_0;

import java.util.Locale;

public class Vocales {
    public static void main(String[] args) {
        String txt = "Ayer me compré muñecos de la marca ‘ToyCo’ por \n" +
                "internet.";
        txt = txt.toLowerCase();

        int cont = 0;

        for(int i = 0 ; i < txt.length() ; i++)
        {
            if(txt.charAt(i) == 'a' || txt.charAt(i) == 'e' || txt.charAt(i) == 'i' || txt.charAt(i) == 'o' || txt.charAt(i) == 'u' )
            {
                cont++;
            }
        }

        System.out.println("vocales en el texto: " + cont);
    }

}
