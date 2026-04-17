import java.util.ArrayList;

public class Equipo {
    private String disponibilidad;
    private ArrayList <Jugador> lista;

public Equipo (String disponibilidad, ArrayList<Jugador> lista){
    this.disponibilidad = disponibilidad;
    this.lista = lista;
}

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public ArrayList<Jugador> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Jugador> lista) {
        this.lista = lista;
    }

public void agregarJugador(){


}
}


