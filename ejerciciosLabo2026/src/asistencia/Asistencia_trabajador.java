package asistencia;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Asistencia_trabajador {
    private HashMap<Integer, Empleado> empleados;

    public Asistencia_trabajador() {
        this.empleados = new HashMap<>();
    }

    public HashMap<Integer, Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashMap<Integer, Empleado> empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleado(Empleado empleado, int nLegajo){
        empleados.put(nLegajo,empleado);
    }

    public String  buscarEmpleado(int nroLegajo){

        if (empleados.containsKey(nroLegajo)){
            return empleados.get(nroLegajo).toString();
        }

        return "No se encontro el empleado";

    }

    public void registrarIngreso(Empleado empleado, LocalDate dia, LocalTime hora){
        Asistencia asistencia = new Asistencia(dia, hora);
        empleado.registrarAsistencia(asistencia);
    }

    public double porcentajeAsistenciaMensual(Empleado empleado, Month mes, int anio){
        int cantidadAsistidos = 0;

        for (Asistencia asistencia : empleado.getAsistencias()){
            if (asistencia.getFecha().getYear() == anio && asistencia.getFecha().getMonth().equals(mes)){
                cantidadAsistidos++;
            }
        }

        return (double) cantidadAsistidos / (empleado.getDias_trabajo().size()*4);
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

        HashSet<DIas_Semana> dIasSemanas = new HashSet<>();
        dIasSemanas.add(DIas_Semana.LUNES);
        dIasSemanas.add(DIas_Semana.MARTES);
        dIasSemanas.add(DIas_Semana.MIERCOLES);

        Empleado empleado = new Empleado("aaa", "bbb",LocalDate.of(2000,4,10),"+546546234", dIasSemanas);
        Asistencia_trabajador asistenciaTrabajador = new Asistencia_trabajador();


        asistenciaTrabajador.agregarEmpleado(empleado,1);

        asistenciaTrabajador.registrarIngreso(empleado,LocalDate.of(2000,9,10),LocalTime.of(12,45));

        asistenciaTrabajador.registrarIngreso(empleado,LocalDate.of(2000,1,11),LocalTime.of(4,5));

        System.out.println(asistenciaTrabajador.porcentajeAsistenciaMensual(empleado,Month.JANUARY,2000) + '\n');
        System.out.println(asistenciaTrabajador.buscarEmpleado(1)+ '\n');
        System.out.println(asistenciaTrabajador.empleadosMasOchenta(Month.JANUARY,2000));
    }
}
