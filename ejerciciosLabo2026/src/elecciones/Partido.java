package elecciones;

import java.util.HashSet;

public class Partido {
    private String nombre;
    private String direccion;
    private int cantAfiliados;
    private HashSet<Mensajero> mensajeros;

    public Partido(String nombre, String direccion, int cantAfiliados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantAfiliados = cantAfiliados;
        this.mensajeros = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantAfiliados() {
        return cantAfiliados;
    }

    public void setCantAfiliados(int cantAfiliados) {
        this.cantAfiliados = cantAfiliados;
    }

    public HashSet<Mensajero> getMensajeros() {
        return mensajeros;
    }

    public void setMensajeros(HashSet<Mensajero> mensajeros) {
        this.mensajeros = mensajeros;
    }

    public void agregarMensajero(Mensajero mensajero){
        mensajeros.add(mensajero);
    }

    public void hacerCampaña(){
        for (Mensajero mensajero : mensajeros){
            mensajero.enviarMensaje("Vote por " + nombre + " para un mejor futuro");
        }

    }

    
}
