package asistencia;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Asistencia_trabajador {
    private HashMap<Integer, Empleado> empleados;

    public Asistencia_trabajador(HashMap<Integer, Empleado> empleados) {
        this.empleados = empleados;
    }

    public HashMap<Integer, Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashMap<Integer, Empleado> empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleado(Empleado empleado){
        int nLegajo = Empleado.getNumLegajo();
        empleados.put(nLegajo,empleado);
    }


    public String  buscarEmpleado(int nroLegajo){

        if (empleados.containsKey(nroLegajo)){
            return empleados.get(nroLegajo).toString();
        }

        return "No se encontro el empleado";

    }

    public void registrarIngreso(Empleado empleado){
        Asistencia asistencia = new Asistencia(LocalDate.now(), LocalTime.now());
        empleado.registrarAsistencia(asistencia);
    }

    public double porcentajeAsistenciaMensual(Empleado empleado, Month mes, int anio){
        double porcentaje = 0;
        int cantidadAsistidos = 0;

        for (Asistencia asistencia : empleado.getAsistencias()){
            if (asistencia.getFecha().getYear() == anio && asistencia.getFecha().getMonth().equals(mes)){
                cantidadAsistidos++;
            }
        }

        return (double) cantidadAsistidos / empleado.getDias_trabajo().size()*4;
    }

    public ArrayList<Empleado> empleadosMasOchenta(Month mes, int anio){
        ArrayList<Empleado> empleadosAsistidores = new ArrayList<>();

        for (Empleado empleado : empleados.values()){
            if (porcentajeAsistenciaMensual(empleado,mes,anio)* 100 > 80){
                empleadosAsistidores.add(empleado);
            }
        }

        return empleadosAsistidores;
    }

    public static void main(String[] args) {

    }
}
