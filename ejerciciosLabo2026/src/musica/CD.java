package musica;

import humanos.Autor;
import humanos.Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class CD {
    private ArrayList<Cancion> canciones;

    public CD(){
        this.canciones = new ArrayList<>();
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int numerosCanciones(){
        int cant = 0;

        for(Cancion cancion : this.canciones){
            cant+=1;
        }

        return cant;
    }

    public Cancion verCancion(int posicion){
        return this.canciones.get(posicion);
    }

    public void grabarCancion(int posicion, Cancion nuevaCancion){
        this.canciones.set(posicion,nuevaCancion);
    }

    public void agrega(Cancion cancion){
        this.canciones.add(cancion);
    }

    public void elimina(int posicion){
        this.canciones.remove(posicion);
    }

    public void listarCanciones(){
        for (Cancion cancion : this.canciones){
            System.out.println(cancion.getTitulo() + ", " +cancion.getAutor().getNombre());
        }
    }

    public static void main(String[] args) {
        CD cd = new CD();
        Cancion cancion = new Cancion();
        Cancion cancion1 = new Cancion("aaa",new Autor("sdas", LocalDate.of(2000,10,10),"ASDdsds"));
        Cancion cancion2 = new Cancion("bbb",new Autor("El negro tecla",LocalDate.of(2000,10,10),"asdsdLA"));

        cd.agrega(cancion);
        cd.agrega(cancion1);

        cd.grabarCancion(1,cancion2);
        cd.verCancion(1);
        System.out.println("Cantidad de canciones en el cd: " +cd.numerosCanciones());
        cd.elimina(0);
        System.out.println("Cantidad de canciones en el cd: " +cd.numerosCanciones());
        cd.listarCanciones();
    }
}
