package telefonia;

public class LlamadaMundial extends Llamada{
    private int codPais;
    private int franjaHoraria;

    public LlamadaMundial(Empleado origen, Empleado destino, int codPais, int franjaHoraria, int duracion) {
        super(origen, destino, duracion);
        this.codPais = codPais;
        this.franjaHoraria = franjaHoraria;
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


    public int calcularCosto() {
        return getDuracion()*4;
    }
}
