package deportes;

import java.util.ArrayList;


public class Torneo {
    private ArrayList<Equipo> equipos;
    private ArrayList<Equipo[]> partidos;
    private String turno;


    public Torneo(ArrayList<Equipo> equipos, ArrayList<Equipo[]> partidos, String turno) {
        this.equipos = equipos;
        this.partidos = partidos;
        this.turno = turno;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Equipo[]> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Equipo[]> partidos) {
        this.partidos = partidos;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void generarFixture(){
        Equipo[] partido = new Equipo[2];

        for (Equipo equip1 : equipos){
            for (Equipo equip2 : equipos){
                
            }
        }


    }
}
