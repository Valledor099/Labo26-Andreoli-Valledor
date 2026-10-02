package librosElectronicos;

public class LibroElectronico {
    private String titulo;
    private Autor autor;
    private Genero genero;
    private String nombreArchivo;
    private static int cantDescargas = 145;
    private int descargasActuales;

    public LibroElectronico(String titulo, Autor autor, Genero genero, String nombreArchivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.nombreArchivo = nombreArchivo;
        this.descargasActuales = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public static int getCantDescargas() {
        return cantDescargas;
    }

    public static void setCantDescargas(int cantDescargas) {
        LibroElectronico.cantDescargas = cantDescargas;
    }

    public int getDescargasActuales() {
        return descargasActuales;
    }

    public void setDescargasActuales(int descargasActuales) {
        this.descargasActuales = descargasActuales;
    }

    public void sumarDescarga(){
        descargasActuales++;
    }

    public void limiteDescargas() throws LimiteDePrestamosException{
        if (descargasActuales == cantDescargas){
            throw new LimiteDePrestamosException("Se a alcanzado el limite de descargas");
        }
    }

    public void restarDescarga(){
        descargasActuales--;
    }

    @Override
    public String toString() {
        return titulo + ", " + autor + ", " +genero + ", " + nombreArchivo + ", " +descargasActuales + '\n';
    }
}
