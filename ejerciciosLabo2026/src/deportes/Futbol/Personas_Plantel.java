package deportes.Futbol;

public interface Personas_Plantel {

    public void puedeContratarse() throws NoPuedeContratarseException;

    public void puedeRenovarse() throws NoPuedeRenovarseException;

    public String decirNombre();

    public String mostrarInfo();
}
