package fundacion_medica;

import humanos.Persona;

import java.time.LocalDate;

public class Paciente extends Persona {
    private String genero;
    private TipoSangre tipo_sangre;
    private Tipo tipo;

    public Paciente(String nombre, String apellido, LocalDate fecha_de_nacimiento, String genero, TipoSangre tipo_sangre, Tipo tipo) {
        super(nombre, apellido, fecha_de_nacimiento);
        this.genero = genero;
        this.tipo_sangre = tipo_sangre;
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public TipoSangre getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(TipoSangre tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
