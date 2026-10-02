package tiendaPc.errores;

public class ComputadorNoValidaException extends RuntimeException {
    public ComputadorNoValidaException(String message) {
        super(message);
    }
}
