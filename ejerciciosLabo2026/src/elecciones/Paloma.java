package elecciones;

public class Paloma extends Ave implements Mensajero{
    private Boolean aprendioMapa;


    public Paloma(String color, String nombre, String especie, Boolean aprendioMapa) {
        super(color, nombre, especie);
        this.aprendioMapa = aprendioMapa;
    }

    public Boolean getAprendioMapa() {
        return aprendioMapa;
    }

    public void setAprendioMapa(Boolean aprendioMapa) {
        this.aprendioMapa = aprendioMapa;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        if (puedeTransmitir()) System.out.println("Lanzando un papelito que dice: " + mensaje);
    }

    @Override
    public boolean puedeTransmitir() {
        return aprendioMapa;
    }
}
