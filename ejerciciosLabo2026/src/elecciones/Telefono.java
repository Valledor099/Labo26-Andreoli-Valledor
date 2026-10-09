package elecciones;

public class Telefono extends Dispositivos implements Mensajero{
    private Compania compania;
    private String nroCelular;
    private Boolean prendido;
    private Boolean creditos;


    public Telefono(String nroSerie, String fabricante, String modelo, Compania compania, String nroCelular, Boolean prendido, Boolean creditos) {
        super(nroSerie, fabricante, modelo);
        this.compania = compania;
        this.nroCelular = nroCelular;
        this.prendido = prendido;
        this.creditos = creditos;
    }

    public Boolean getPrendido() {
        return prendido;
    }

    public void setPrendido(Boolean prendido) {
        this.prendido = prendido;
    }

    public Boolean getCreditos() {
        return creditos;
    }

    public void setCreditos(Boolean creditos) {
        this.creditos = creditos;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public String getNroCelular() {
        return nroCelular;
    }

    public void setNroCelular(String nroCelular) {
        this.nroCelular = nroCelular;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        if (puedeTransmitir()) System.out.println("Conectando con la antena más cercana " + mensaje);
    }

    @Override
    public boolean puedeTransmitir() {
        return creditos && prendido;
    }
}
