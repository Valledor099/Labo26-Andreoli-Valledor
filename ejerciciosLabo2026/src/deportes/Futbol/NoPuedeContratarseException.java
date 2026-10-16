package deportes.Futbol;

public class NoPuedeContratarseException extends RuntimeException {
    public NoPuedeContratarseException(String message) {
        super(message);
    }
}
