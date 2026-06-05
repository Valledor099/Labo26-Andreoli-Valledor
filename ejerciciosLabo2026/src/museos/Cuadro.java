package museos;

public class Cuadro {

        private String titulo;
        private String pintor;
        private int anioCreacion;
        private Estado estadoConservacion;

        public Cuadro(String titulo, String pintor, int anioCreacion, Estado estadoConservacion) {
            this.titulo = titulo;
            this.pintor = pintor;
            this.anioCreacion = anioCreacion;
            this.estadoConservacion = estadoConservacion;
        }

        public String getTitulo() { return titulo; }
        public void setTitulo(String titulo) { this.titulo = titulo; }

        public String getPintor() { return pintor; }
        public void setPintor(String pintor) { this.pintor = pintor; }

        public int getAnioCreacion() { return anioCreacion; }
        public void setAnioCreacion(int anioCreacion) { this.anioCreacion = anioCreacion; }

        public Estado getEstadoConservacion() { return estadoConservacion; }
        public void setEstadoConservacion(Estado estadoConservacion) {
            this.estadoConservacion = estadoConservacion;
        }

        public String toString() {
            return "\"" + titulo + "\" de " + pintor + " (" + anioCreacion + ") - Estado: " + estadoConservacion.getEstado() + "/10";
        }
    }

