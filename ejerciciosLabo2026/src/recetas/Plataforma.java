package recetas;

import java.util.ArrayList;
import java.util.Arrays;

public class Plataforma {
    private ArrayList<Plato> platos;

    public Plataforma() {
        this.platos = new ArrayList<>();
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public void agregar(Plato plato){
        if (!platos.contains(plato)){
            platos.add(plato);
        }
    }

    public void modificar(Plato plato1, Plato plato2){
    platos.set(platos.indexOf(plato1),plato2);
    }

    public void eliminar (Plato plato){
    platos.remove(plato);
    }

    public String buscarReceta(Nivel nivel){
        String texto = "";

        for (Plato plato : platos){
            if (plato.getNivel().equals(nivel)){
                texto+=plato;

            }
        }

        return texto;
    }

    public String filtrarTipo(Tipo tipo){
        String texto = "";

        for (Plato plato: platos){
            if (plato.getTipo().equals(tipo)){
                texto += plato;
            }
        }

        return texto;
    }

    public int cantidadRecestas(){
        return platos.size();
    }

    public Plato masPasos(){

        Plato recetaMasPasos = getPlatos().getFirst();
        int masPasos = recetaMasPasos.getPasos().size();

        for(Plato plato : platos){
            if (masPasos< plato.getPasos().size()){
                recetaMasPasos = plato;
                masPasos = plato.getPasos().size();
            }
        }
        return recetaMasPasos;
    }

    public static void main(String[] args) {

        ArrayList <String> pasosPostre = new ArrayList<>(Arrays.asList("paso1","paso2","paso3","paso4","paso5","paso6","paso7"));
        Postre postre = new Postre("Tiramisu",pasosPostre,Nivel.AVANZADO,false,0);

        ArrayList <String> pasosPrincipal = new ArrayList<>(Arrays.asList("paso1","paso2","paso3","paso4","paso5","paso6","paso7","paso8","paso9","paso10","paso11"));
        Principal principal = new Principal("Milanesa Napolitana",pasosPrincipal,Nivel.FACIL,30,3);

        ArrayList <String> pasosEntrada = new ArrayList<>(Arrays.asList("paso1","paso2","paso3","paso4","paso5"));
        Entrada entrada = new Entrada("empanada frita", pasosEntrada,Nivel.MEDIO,false);

        Plataforma plataforma = new Plataforma();
        plataforma.agregar(postre);
        plataforma.agregar(principal);
        plataforma.agregar(entrada);

        System.out.println(plataforma.buscarReceta(Nivel.FACIL));
        System.out.println(plataforma.filtrarTipo(Tipo.POSTRE));
        System.out.println("Cantidad de recetas cargadas: " + plataforma.cantidadRecestas());
        System.out.println("El plato con mas pasos: " + plataforma.masPasos());


    }
}
