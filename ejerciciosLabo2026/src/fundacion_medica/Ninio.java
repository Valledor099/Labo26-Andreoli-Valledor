package fundacion_medica;

import java.time.LocalDate;

public class Ninio extends Paciente{
    private NivelTolerancia nivelTolerancia;
    public static TipoSangre tipoSangreObjetivo = TipoSangre.AB;
    public static Tipo tipoObjetivo = Tipo.POSITIVO;

    public Ninio(String nombre, String apellido, LocalDate fecha_de_nacimiento, String genero, TipoSangre tipo_sangre, Tipo tipo, NivelTolerancia nivelTolerancia) {
        super(nombre, apellido, fecha_de_nacimiento, genero, tipo_sangre, tipo);
        this.nivelTolerancia = nivelTolerancia;
    }

    public NivelTolerancia getNivelTolerancia() {
        return nivelTolerancia;
    }

    public void setNivelTolerancia(NivelTolerancia nivelTolerancia) {
        this.nivelTolerancia = nivelTolerancia;
    }
}
