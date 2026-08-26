package animales;

public abstract class Mascota {
    private String nombre;
    private Duenio duenio;
    private int felicidad;

    public Mascota(String nombre, Duenio duenio) {
        this.nombre = nombre;
        this.duenio = duenio;
        this.felicidad = 0;
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

    public boolean esDuenio(String nombreUsuario) {
        return duenio.getNombre().equals(nombreUsuario);
    }

    public abstract String saludar(String nombre_usuario);

    public void bajarFelicidad(){
        if (this.felicidad > 0){
            this.felicidad--;
        }
    }

    public String repetirSaludo_Alegria(String saludo){
        String saludo_inicial = saludo;

        if (felicidad > 0){
            for (int i = 0; i < felicidad ; i++){
                saludo = saludo + " " + saludo_inicial;
            }
        }

        bajarFelicidad();

        return saludo;
    }

    public Boolean estaVivo(){
        return true;
    }

    public void restarVida() {}

    public void morir() {}

    public void alimentar(){
        this.felicidad++;
    }

    public abstract Tipo_Mascota tipoMascota();

}

