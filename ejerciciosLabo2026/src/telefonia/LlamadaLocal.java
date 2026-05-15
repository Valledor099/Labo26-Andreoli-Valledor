package telefonia;

public class LlamadaLocal extends Llamada{
    private String provinciaOrigen;
    private String provinciaDestino;

    public LlamadaLocal(Empleado origen, Empleado destino, String provinciaOrigen, String provinciaDestino, int duracion) {
        super(origen, destino, duracion);
        this.provinciaOrigen = provinciaOrigen;
        this.provinciaDestino = provinciaDestino;
    }

    public String getProvinciaOrigen() {
        return provinciaOrigen;
    }

    public void setProvinciaOrigen(String provinciaOrigen) {
        this.provinciaOrigen = provinciaOrigen;
    }

    public String getProvinciaDestino() {
        return provinciaDestino;
    }

    public void setProvinciaDestino(String provinciaDestino) {
        this.provinciaDestino = provinciaDestino;
    }


}
