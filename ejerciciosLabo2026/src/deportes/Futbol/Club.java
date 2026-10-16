package deportes.Futbol;

import jdk.jshell.JShell;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Map;

public class Club {
    private String nombre;
    private HashSet<Personas_Plantel> plantel;

    public Club(String nombre) {
        this.nombre = nombre;
        this.plantel = new HashSet<>();
    }

    public HashSet<Personas_Plantel> getPlantel() {
        return plantel;
    }

    public void setPlantel(HashSet<Personas_Plantel> plantel) {
        this.plantel = plantel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void contratar(Personas_Plantel personaPlantel){
        try {
            personaPlantel.puedeContratarse();
            plantel.add(personaPlantel);
            System.out.println(personaPlantel.decirNombre() + " fue contratado por " + this.getNombre());
        } catch (NoPuedeContratarseException e){
            System.out.println(e.getMessage());
        }
    }

    public void renovar(Personas_Plantel personaPlantel){
        if (plantel.contains(personaPlantel)) {
            try {
                personaPlantel.puedeRenovarse();
                System.out.println(personaPlantel.decirNombre() + " renovo su contrato con " + this.getNombre());
            } catch (NoPuedeRenovarseException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void infoPlantel(){
        for (Personas_Plantel personaPlantel: plantel){
            System.out.println(personaPlantel.mostrarInfo());
        }
    }

    public static void main(String[] args) {
        Club club = new Club("River");
        Arquero arquero = new Arquero("Facundo","Feistel", LocalDate.now(),1,"caba",Posicion.ARQUERO,100,0);
        Jugador_Campo jugador = new Jugador_Campo("adss","dasd",LocalDate.now(),10,"CABA",Posicion.DELANTERO,0,0);

        Preparados_Fisico prep1= new Preparados_Fisico("ads",LocalDate.now(),"dasd",90,"adsad",true);
        Entrenador entrenador = new Entrenador("aads",LocalDate.now(),"asddas",90,90,false);

        club.contratar(arquero);
        club.contratar(jugador);

        HashSet<Personas_Plantel> plantel = new HashSet<>();
        plantel.add(prep1);
        plantel.add(entrenador);

        club.setPlantel(plantel);

        club.renovar(prep1);
        club.renovar(entrenador);

        club.infoPlantel();

    }
}
