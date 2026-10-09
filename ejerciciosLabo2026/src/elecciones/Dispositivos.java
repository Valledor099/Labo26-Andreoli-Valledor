package elecciones;

public abstract class Dispositivos {
    private String nroSerie;
    private String fabricante;
    private String modelo;

    public Dispositivos(String nroSerie, String fabricante, String modelo) {
        this.nroSerie = nroSerie;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public String getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(String nroSerie) {
        this.nroSerie = nroSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
