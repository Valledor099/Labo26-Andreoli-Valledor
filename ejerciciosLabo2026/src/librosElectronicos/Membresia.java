package librosElectronicos;

public enum Membresia {
    BRONCE(5), PLATA(15), ORO(50);

    private int limiteLibros;

    Membresia(int  limiteLibros) {
        this.limiteLibros = limiteLibros;
    }

    public int getLimiteLibros() {
        return limiteLibros;
    }
}
