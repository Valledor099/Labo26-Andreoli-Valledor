package telefoniaToDo;

public class Empleado extends Persona {
    private String telefono;
    private Provincia provincia;
    private String codigoPais;
    private String franjaHoraria;

    public Empleado(String nombre, String apellido, String dni, String pais,
                    String telefono, Provincia provincia, String codigoPais, String franjaHoraria) {
        super(nombre, apellido, dni, pais);
        this.telefono = telefono;
        this.provincia = provincia;
        this.codigoPais = codigoPais;
        this.franjaHoraria = franjaHoraria;
    }

    public String getTelefono() {
        return telefono;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public void setFranjaHoraria(String franjaHoraria) {
        this.franjaHoraria = franjaHoraria;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public String getFranjaHoraria() {
        return franjaHoraria;
    }

    public boolean tieneTelefono(String telefono) {
        return this.telefono.equals(telefono);
    }

}
