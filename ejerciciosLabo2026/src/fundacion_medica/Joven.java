package fundacion_medica;

import java.time.LocalDate;
import java.util.HashSet;

public class Joven extends Paciente implements Calificados{
    public static int edadMin = 20;
    public static int edadMax = 30;
    public static TipoSangre tipoSangreObjetivo = TipoSangre.A;
    public static Tipo tipoObjetivo = Tipo.POSITIVO;
    private HashSet<String> actividades;

    public Joven(String nombre, String apellido, LocalDate fecha_de_nacimiento, String genero, TipoSangre tipo_sangre, Tipo tipo) {
        super(nombre, apellido, fecha_de_nacimiento, genero, tipo_sangre, tipo);
        this.actividades = new HashSet<>();
    }

    public static int getEdadMax() {
        return edadMax;
    }

    public static void setEdadMax(int edadMax) {
        Joven.edadMax = edadMax;
    }

    public static int getEdadMin() {
        return edadMin;
    }

    public static void setEdadMin(int edadMin) {
        Joven.edadMin = edadMin;
    }

    public HashSet<String> getActividades() {
        return actividades;
    }

    public void setActividades(HashSet<String> actividades) {
        this.actividades = actividades;
    }

    @Override
    public boolean solicitarTratamiento() {
        if(actividades.size() % 2 == 1 && calcularEdad() >= 28){
            System.out.println("Lamentamos comunicarte que tu sangre aún no va a poder ser modificada");
            return false;
        }
        System.out.println("Será un tratamiento costoso, pero lo vamos a lograr");
        return true;
    }

    @Override
    public int costoTratamiento() {
        return 0;
    }

    @Override
    public void iniciarTratamiento() {

    }
}
