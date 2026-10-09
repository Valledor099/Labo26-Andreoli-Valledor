package intercambio;

import java.util.ArrayList;

public class Main {




    public static void main(String[] args) {

        ArrayList <Integer> capitulos = new ArrayList<>();
        capitulos.add(20);
        capitulos.add(20);

        Prestable libro = new Libro("dasd", "dsadasd", 2000,capitulos);
        libro.prestar();
    }
}
