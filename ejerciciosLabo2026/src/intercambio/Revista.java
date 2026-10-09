package intercambio;

import java.time.LocalDate;

public class Revista extends Texto implements Prestable{
    private LocalDate fechaPublicacion;


    public Revista(String codigo, String titulo, int anioPubli, LocalDate fechaPublicacion) {
        super(codigo, titulo, anioPubli);
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "Revista{" +
                super.toString() +
                "fechaPublicacion=" + fechaPublicacion +
                '}';
    }

    @Override
    public void prestar() {
        try {
        puedePrestarse();
            System.out.println("el objeto revista se dara prestado");
        }
        catch (PrestrarException e){
            System.out.println(e.getMessage() + '\n' + "no se dara prestado");
        }
    }

    @Override
    public void puedePrestarse() {

        if (!fechaPublicacion.isBefore(LocalDate.now().minusMonths(3))){
            throw new PrestrarException("La revista no se publico antes de este trimestre");
        }
    }


}
