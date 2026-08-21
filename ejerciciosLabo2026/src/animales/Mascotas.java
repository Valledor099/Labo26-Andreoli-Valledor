package animales;

public abstract class Mascotas {
    private String nombre;
    private Duenio duenio;
    private Tipo_Mascota tipoMascota;

    public Mascotas(String nombre, Duenio duenio, Tipo_Mascota tipoMascota) {
        this.nombre = nombre;
        this.duenio = duenio;
        this.tipoMascota = tipoMascota;
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

    public abstract String saludar();

    public Tipo_Mascota getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(Tipo_Mascota tipoMascota) {
        this.tipoMascota = tipoMascota;
    }
}

