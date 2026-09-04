package asistencia;

import humanos.Persona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class Empleado extends Persona {
    private HashSet<DIas_Semana> dias_trabajo;
    private HashSet<Asistencia> asistencias;


    public Empleado(String nombre, String apellido, LocalDate fecha_de_nacimiento, String numCel, HashSet<DIas_Semana> dias_trabajo) {
        super(nombre, apellido, fecha_de_nacimiento, numCel);
        this.dias_trabajo = dias_trabajo;
        this.asistencias= new HashSet<>();

    }


    public HashSet<DIas_Semana> getDias_trabajo() {
        return dias_trabajo;
    }

    public void setDias_trabajo(HashSet<DIas_Semana> dias_trabajo) {
        this.dias_trabajo = dias_trabajo;
    }

    public HashSet<Asistencia> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(HashSet<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }

    public void registrarAsistencia(Asistencia asistencia){
       asistencias.add(asistencia);
    }


    @Override
    public String toString() {
        return "Nombre y Apellido:" + getNombre() + " " + getApellido() + '\n'
                + "Fecha nacimiento: " + getFecha_de_nacimiento() + '\n' +
                "Celular: " + getNumCel()+ '\n';
    }
}
