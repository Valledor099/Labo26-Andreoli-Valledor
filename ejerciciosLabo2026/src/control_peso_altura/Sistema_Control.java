package control_peso_altura;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema_Control {
    private HashSet<Persona> personas;

    public Sistema_Control(Persona persona) {
        this.personas = new HashSet<>();
    }

    public void registrarMedicion(int peso, int altura, LocalDate fecha, Persona persona){
        Medicion medicion = new Medicion(peso,altura);

        if (persona.getMediciones().containsKey(fecha)){
            System.out.println("Ya registraste en esa fecha");
        }
        else {
            persona.registrar(medicion, fecha);
        }
    }

    public String conocerPesoAltura(LocalDate fecha, Persona persona){
        Medicion v;

        for (Map.Entry<LocalDate,Medicion> medicion : persona.getMediciones().entrySet()){
            if(medicion.getKey().equals(fecha)){
                v = medicion.getValue();
                return v.toString();
            }
        }

        return "No se encontro esa medicion";

    }

    public String promedioMedicionAnio(int anio, Persona persona){
        int peso = 0;
        int altura = 0;
        int contador = 0;


        for (Map.Entry<LocalDate,Medicion> medicion : persona.getMediciones().entrySet()){
            if (medicion.getKey().getYear() == anio){
                contador++;
                peso += medicion.getValue().getPeso();
                altura += medicion.getValue().getAltura();
            }
        }

        peso = peso/contador;
        altura = altura/contador;

        return  "Peso promedio: " + peso +'\n'
                + "Altura promedio: " + altura + '\n';
    }

    public String porcentajePesoVariacion(Persona persona, LocalDate fecha1, LocalDate fecha2){

        if (corroborarFecha(fecha1,fecha2,persona)){
        int pesoOriginal;
        int pesoNuevo;

        if (fecha1.isAfter(fecha2)){
            pesoOriginal = persona.getMediciones().get(fecha1).getPeso();
            pesoNuevo = persona.getMediciones().get(fecha2).getPeso();
        }
        else {
            pesoOriginal = persona.getMediciones().get(fecha2).getPeso();
            pesoNuevo = persona.getMediciones().get(fecha1).getPeso();
        }

        double porcentaje = ((double) (pesoOriginal - pesoNuevo) /pesoOriginal) * 0.1;
        return "Porcentaje de variacion: " + porcentaje*100 + "%";
        }
        return "no se encotraron las fechas";

    }

    public String porcentajeAlturaCrecimiento(Persona persona, LocalDate fecha1, LocalDate fecha2){
        if (corroborarFecha(fecha1,fecha2, persona)){

        int alturaOriginal;
        int alturaNuevo;

        alturaOriginal = persona.getMediciones().get(fecha1).getAltura();
        alturaNuevo =persona.getMediciones().get(fecha2).getAltura();
        double porcentaje = ((double) (alturaOriginal - alturaNuevo) /alturaOriginal) * 0.1;

        return "Porcentaje de crecimiento: " + porcentaje * 100 + "%";

        }
        return "no se encontraron las fechas";

    }

    public LocalDate fechaMayorPeso(Persona persona){
        int mayorPeso = 0;
        LocalDate max = null;

        for (Map.Entry<LocalDate,Medicion> medicion : persona.getMediciones().entrySet()){
            if (max == null || mayorPeso < medicion.getValue().getPeso()){
                mayorPeso = medicion.getValue().getPeso();
                max = medicion.getKey();
            }
        }

        return max;
    }

    public LocalDate fechaMenorPeso(Persona persona){
        int menorPeso = 0;
        LocalDate min = null;

        for (Map.Entry<LocalDate,Medicion> medicion : persona.getMediciones().entrySet()){
            if (min == null || menorPeso < medicion.getValue().getPeso()){
                menorPeso = medicion.getValue().getPeso();
                min = medicion.getKey();
            }
        }

        return min;
    }


    public Boolean corroborarFecha(LocalDate fecha1, LocalDate fecha2, Persona persona){
        if (fecha2 == null){
            return persona.getMediciones().containsKey(fecha1);
        }
        else {
            return persona.getMediciones().containsKey(fecha1) && persona.getMediciones().containsKey(fecha2);
        }
    }
}
