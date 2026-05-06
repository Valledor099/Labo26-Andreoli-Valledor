package museos;

public class Cuadro {

        private String titulo;
        private String pintor;
        private int anioCreacion;
        private int estadoConservacion;

        public Cuadro(String titulo, String pintor, int anioCreacion, int estadoConservacion) {
            this.titulo = titulo;
            this.pintor = pintor;
            this.anioCreacion = anioCreacion;
            this.estadoConservacion = Math.max(1, Math.min(10, estadoConservacion));
        }

        public String getTitulo() { return titulo; }
        public void setTitulo(String titulo) { this.titulo = titulo; }

        public String getPintor() { return pintor; }
        public void setPintor(String pintor) { this.pintor = pintor; }

        public int getAnioCreacion() { return anioCreacion; }
        public void setAnioCreacion(int anioCreacion) { this.anioCreacion = anioCreacion; }

        public int getEstadoConservacion() { return estadoConservacion; }
        public void setEstadoConservacion(int estadoConservacion) {
            this.estadoConservacion = Math.max(1, Math.min(10, estadoConservacion));
        }

        public String toString() {
            return "\"" + titulo + "\" de " + pintor + " (" + anioCreacion + ") - Estado: " + estadoConservacion + "/10";
        }
    }

