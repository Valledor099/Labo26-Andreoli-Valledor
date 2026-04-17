import java.time.LocalDate;

public class Jugador {
    private String nombre;
    private String apellido;
    private LocalDate fecha_de_nacimiento;
    private int numero_de_camiseta;

    public Jugador(String nombre, String apellido, LocalDate fecha_de_nacimiento, int numero_de_camiseta){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.numero_de_camiseta = numero_de_camiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(LocalDate fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public int getNumero_de_camiseta() {
        return numero_de_camiseta;
    }

    public void setNumero_de_camiseta(int numero_de_camiseta) {
        this.numero_de_camiseta = numero_de_camiseta;
    }


}
