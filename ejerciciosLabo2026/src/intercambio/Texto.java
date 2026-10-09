package intercambio;

abstract public class Texto {
    private String codigo;
    private String titulo;
    private int anioPubli;


    public Texto(String codigo, String titulo, int anioPubli) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPubli = anioPubli;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPubli() {
        return anioPubli;
    }

    public void setAnioPubli(int anioPubli) {
        this.anioPubli = anioPubli;
    }

    @Override
    public String toString() {
        return
                "codigo='" + codigo +
                ", titulo='" + titulo +
                ", anioPubli=" + anioPubli;
    }
}
