package animales;

public abstract class Mascota {
    private String nombre;
    private Duenio duenio;
    private Tipo_Mascota tipoMascota;
    private int felicidad;

    public Mascota(String nombre, Duenio duenio,Tipo_Mascota tipoMascota) {
        this.nombre = nombre;
        this.duenio = duenio;
        this.felicidad = 0;
        this.tipoMascota = tipoMascota;
    }

    public int getFelicidad() {
        return felicidad;
    }

    public void setFelicidad(int felicidad) {
        this.felicidad = felicidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public Tipo_Mascota getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(Tipo_Mascota tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public boolean esDuenio(String nombreUsuario) {
        return duenio.getNombre().equals(nombreUsuario);
    }

    public abstract String saludar();

    public void bajarFelicidad(){
        if (this.felicidad > 0){
            this.felicidad--;
        }
    }

    public void restarVida() {}

    public void morir() {}

    public void alimentar(){
        this.felicidad++;
    }

    public abstract Tipo_Mascota tipoMascota();

}

