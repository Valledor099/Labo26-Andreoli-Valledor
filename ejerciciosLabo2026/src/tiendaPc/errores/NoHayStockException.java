package tiendaPc.errores;

public class NoHayStockException extends RuntimeException {
    public NoHayStockException(String message) {
        super(message);
    }
}
