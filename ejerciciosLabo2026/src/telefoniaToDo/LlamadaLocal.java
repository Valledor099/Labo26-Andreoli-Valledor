package telefoniaToDo;

public class LlamadaLocal extends Llamada {
    private Provincia provinciaOrigen;
    private Provincia provinciaDestino;
    private double costoPorMinuto;

    public LlamadaLocal(Empleado origen, Empleado destino, int duracionMinutos) {
        super(origen, destino, duracionMinutos);
        this.provinciaOrigen = origen.getProvincia();
        this.provinciaDestino = destino.getProvincia();
        this.costoPorMinuto = 10;
    }

    public Provincia getProvinciaOrigen() {
        return provinciaOrigen;
    }

    public Provincia getProvinciaDestino() {
        return provinciaDestino;
    }

    public double calcularCosto() {
        return getDuracionMinutos() * costoPorMinuto;
    }

    public String obtenerDetalle() {
        return super.obtenerDetalle()
                + " | Provincia origen: " + provinciaOrigen.name()
                + " | Provincia destino: " + provinciaDestino.name()
                + " | Llamada local ";
    }
}
