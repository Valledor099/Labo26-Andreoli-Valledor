package telefonia;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado>empleados;
    private  ArrayList<Llamada> llamadas;

    public Empresa() {
        this.empleados = new ArrayList<>();
        this.llamadas = new ArrayList<>();
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void aniadirEmpleado(Empleado empleado){
        if (empleados.isEmpty()){
            empleados.add(empleado);
        } else if (!empleados.contains(empleado)) {
            empleados.add(empleado);
        }
    }

    public void registrarLlamada(Empleado origen, Empleado destino, int duracion){

        if (empleados.contains(origen) && empleados.contains(destino)){

        if (origen.getPais().equals(destino.getPais())){
            LlamadaLocal llamada = new LlamadaLocal(origen,destino, origen.getProvincia(), destino.getProvincia(), duracion);
            llamadas.add(llamada);
        }

        else{
            LlamadaMundial llamada = new LlamadaMundial(origen, destino, destino.getCodPais(), destino.getFranjaHoraria(), duracion);
            llamadas.add(llamada);
        }
        }
    }


    public static void main(String[] args) {
        Empleado empleado = new Empleado("Ricky", "Vinagreta", "49234543", "Argentina", "3243-5465", 54,-4,"CABA");
        Empleado empleado1 = new Empleado("Ezequiel", "Rizz", "49435654","Argentina","4354-5465",54,-4,"CABA");

    }

}
