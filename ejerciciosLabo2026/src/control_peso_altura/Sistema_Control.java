package control_peso_altura;

import java.time.LocalDate;
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
        for (Map.Entry<LocalDate,Medicion> medicion : persona.getMediciones().entrySet()){

        }
    }




}
