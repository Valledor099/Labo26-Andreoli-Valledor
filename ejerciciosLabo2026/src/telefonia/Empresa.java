package telefonia;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado>empleados;
    private  ArrayList<Llamada> llamadas;

    public Empresa() {
        this.empleados = new ArrayList<>();
        this.llamadas = new ArrayList<>();
    }

    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
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

    public void llamadaEmpleado(){
        for(Empleado empleado : empleados){
            System.out.println("llamadas realizadas por:" + empleado.getNombre()+ " "+ empleado.getApellido());
            for(Llamada llamada : llamadas){
                if(empleado.equals(llamada.getOrigen())){
                    System.out.println("- " + llamada.getDestino().getNombre() + " " + llamada.getDestino().getApellido());
                }
            }
        }

    }

    public void rankingInternacional(){
        ArrayList<Empleado>top = new ArrayList<>();
        ArrayList<Integer>dur = new ArrayList<>();


        for (Empleado empleado : empleados){
            int duracionTotal=0;
            for (Llamada llamada : llamadas){
                if (empleado.equals(llamada.getOrigen()) && !empleado.getPais().equals(llamada.getDestino().getPais())){
                    duracionTotal+=llamada.getDuracion();

                }
            }
            if (duracionTotal>0){
            top.add(empleado);
            dur.add(duracionTotal);}
        }
    }




    public static void main(String[] args) {
        Empleado empleado = new Empleado("Ricky", "Vinagreta", "49234543", "Argentina", "3243-5465", 54,-4,"CABA");
        Empleado empleado1 = new Empleado("Ezequiel", "Rizz", "49435654","Argentina","4354-5465",54,-4,"CABA");
        Empleado empleado2 = new Empleado("aaa", "bbb", "49234543", "Colombia", "1234-5896", 57,-5,"Bogota");

        Empresa empresa = new Empresa();

        empresa.aniadirEmpleado(empleado);
        empresa.aniadirEmpleado(empleado1);
        empresa.aniadirEmpleado(empleado2);

        empresa.registrarLlamada(empleado,empleado1,60);
        empresa.registrarLlamada(empleado,empleado2,120);

        empresa.llamadaEmpleado();

        empresa.rankingInternacional();



    }

}
