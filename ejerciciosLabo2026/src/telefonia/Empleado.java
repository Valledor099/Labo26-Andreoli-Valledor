package telefonia;

import humanos.Persona;

public class Empleado extends Persona {
    private String dni;
    private String pais;
    private String numTele;
    private String provincia;
    private int codPais;
    private int franjaHoraria;

    public Empleado(String nombre, String apellido, String dni, String pais, String numTele, int codPais, int franjaHoraria, String provincia) {
        super(nombre, apellido);
        this.dni = dni;
        this.pais = pais;
        this.numTele = numTele;
        this.provincia =provincia;
        this.codPais = codPais;
        this.franjaHoraria = franjaHoraria;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getCodPais() {
        return codPais;
    }

    public void setCodPais(int codPais) {
        this.codPais = codPais;
    }

    public int getFranjaHoraria() {
        return franjaHoraria;
    }

    public void setFranjaHoraria(int franjaHoraria) {
        this.franjaHoraria = franjaHoraria;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNumTele() {
        return numTele;
    }

    public void setNumTele(String numTele) {
        this.numTele = numTele;
    }






}
