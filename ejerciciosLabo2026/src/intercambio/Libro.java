package intercambio;

import java.util.ArrayList;

public class Libro extends Texto implements Prestable {
    private ArrayList<Integer> cantPaginas;


    public Libro(String codigo, String titulo, int anioPubli, ArrayList<Integer> cantPaginas) {
        super(codigo, titulo, anioPubli);
        this.cantPaginas = cantPaginas;
    }

    public ArrayList<Integer> getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(ArrayList<Integer> cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                super.toString() +
                "cantPaginas=" + cantPaginas +
                '}';
    }


    @Override
    public void prestar() {
        try {
            puedePrestarse();
        System.out.println("el libro se dara prestado");
        }
        catch (PrestrarException e){
            System.out.println(e.getMessage() + '\n' + "no se dara prestado");
        }
    }

    @Override
    public void puedePrestarse() {
        if ((cantPaginas.size()%2)== 0) throw new PrestrarException("La cantidad de capitulos no es impar");
    }

}
