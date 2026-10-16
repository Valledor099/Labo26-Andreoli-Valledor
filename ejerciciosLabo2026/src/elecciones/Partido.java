package elecciones;

import java.time.LocalDate;
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

    public void hacerCampania(){
        for (Mensajero mensajero : mensajeros){
            mensajero.enviarMensaje("Vote por " + nombre + " para un mejor futuro");
        }

    }


    public static void main(String[] args) {
        Partido partido = new Partido("AAA", "dasdas", 2);
        Telefono telefono = new Telefono("1231232","samsung","dasdas",Compania.CLARO,"+541187821",true,true);
        Trabajadores trabajadores = new Trabajadores("assadsa","dasdas","dsadasd", LocalDate.now(),"189302",90000,true);
        Paloma paloma = new Paloma("asdsaad","dasdas","dsad",true);

        partido.agregarMensajero(telefono);
        partido.agregarMensajero(trabajadores);
        partido.agregarMensajero(paloma);

        partido.hacerCampania();
    }


}
