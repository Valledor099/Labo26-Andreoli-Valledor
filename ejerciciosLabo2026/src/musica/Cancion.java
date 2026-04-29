package musica;

import humanos.Persona;

import java.time.LocalDate;

public class Cancion {
    private String titulo;
    private Persona autor;

    public Cancion(){
        this.titulo = "";
        this.autor = new Persona("",LocalDate.of(2000,10,10),"");
    }

    public Cancion(String titulo,Persona autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public static void main(String[] args) {
        Cancion cancion = new Cancion();
        Cancion cancion1 = new Cancion("Sugar On My Tongue",new Persona("Tyler, The Creator",LocalDate.of(2000,10,10),"Los Angeles 1231"));

        System.out.println("Getters: " + cancion1.getTitulo() + ", " + cancion1.getAutor().getNombre() + ", " +cancion1.getAutor().calcularEdad() + ", " + cancion1.getAutor().getDireccion());

        System.out.println("Modificacion de cancion con setters:");
        cancion.setAutor(new Persona("A$AP Rocky", LocalDate.of(2000,10,10),"Los Angeles 4321"));
        cancion.setTitulo("Sundress");

        System.out.println("Getters dsp de los setters: " + cancion.getTitulo() + ", " + cancion.getAutor().getNombre() + ", " +cancion.getAutor().calcularEdad() + ", " + cancion.getAutor().getDireccion());
    }
}
