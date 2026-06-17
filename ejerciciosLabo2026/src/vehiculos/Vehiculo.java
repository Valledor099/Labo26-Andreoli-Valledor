package vehiculos;

import java.time.LocalDate;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private Colores color;
    private int cantRuedas;
    private LocalDate anioFabricacion;
    private String patente;

    public Vehiculo(String marca, String modelo, Colores color, int cantRuedas, LocalDate anioFabricacion, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantRuedas = cantRuedas;
        this.anioFabricacion = anioFabricacion;
        this.patente = patente;
    }

    public Vehiculo(String marca, String modelo, Colores color, LocalDate anioFabricacion, int cantRuedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anioFabricacion = anioFabricacion;
        this.cantRuedas = cantRuedas;
    }

    public Vehiculo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }
}
