import java.time.LocalDate;

public class Museo {
    static class Cuadro {
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

    static class Restaurador {
        private String nombre;
        private String apellido;
        private String dni;
        private LocalDate fechaNacimiento;
        private int aniosExperiencia;

        public Restaurador(String nombre, String apellido, String dni,
                           LocalDate fechaNacimiento, int aniosExperiencia) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
            this.fechaNacimiento = fechaNacimiento;
            this.aniosExperiencia = aniosExperiencia;
        }

        public String restaurar(Cuadro cuadro) {
            int anioActual = LocalDate.now().getYear();
            int estadoAntes = cuadro.getEstadoConservacion();

            int antiguedad = anioActual - cuadro.getAnioCreacion();
            int incremento = (antiguedad > 25) ? 2 : 3;

            int nuevoEstado = Math.min(10, estadoAntes + incremento);
            cuadro.setEstadoConservacion(nuevoEstado);

            return "Restaurador: " + nombre + " " + apellido + "\n" +
                    "Cuadro: \"" + cuadro.getTitulo() + "\"\n" +
                    "Estado antes de la restauración: " + estadoAntes + "/10\n" +
                    "Estado después de la restauración: " + nuevoEstado + "/10";
        }

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }

        public String getApellido() { return apellido; }
        public void setApellido(String apellido) { this.apellido = apellido; }

        public String getDni() { return dni; }
        public void setDni(String dni) { this.dni = dni; }

        public LocalDate getFechaNacimiento() { return fechaNacimiento; }
        public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

        public int getAniosExperiencia() { return aniosExperiencia; }
        public void setAniosExperiencia(int aniosExperiencia) { this.aniosExperiencia = aniosExperiencia; }

        public String toString() {
            return nombre + " " + apellido + " (DNI: " + dni + ") - Experiencia: " + aniosExperiencia + " años";
        }
    }

    public static void main(String[] args) {

        Cuadro c1 = new Cuadro("La Gioconda",          "Leonardo da Vinci", 1503, 4);
        Cuadro c2 = new Cuadro("Noche Estrellada",     "Vincent van Gogh",  1889, 6);
        Cuadro c3 = new Cuadro("Obra Reciente",        "Artista Moderno",   2015, 5);
        Cuadro c4 = new Cuadro("Cuadro casi perfecto", "Pintor X",          1800, 9);

        Restaurador r1 = new Restaurador(
                "Laura", "Gómez", "30123456",
                LocalDate.of(1985, 4, 12), 15
        );
        Restaurador r2 = new Restaurador(
                "Carlos", "Pérez", "25678901",
                LocalDate.of(1978, 9, 3), 22
        );

        System.out.println("========== ESTADO INICIAL ==========");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        System.out.println("\n========== RESTAURACIONES ==========");

        System.out.println("\n--- Caso 1: Cuadro antiguo (> 25 años) → +2 ---");
        System.out.println(r1.restaurar(c1));

        System.out.println("\n--- Caso 2: Otro cuadro antiguo (> 25 años) → +2 ---");
        System.out.println(r2.restaurar(c2));

        System.out.println("\n--- Caso 3: Cuadro reciente (<= 25 años) → +3 ---");
        System.out.println(r1.restaurar(c3));

        System.out.println("\n--- Caso 4: Estado no supera el límite de 10 ---");
        System.out.println(r2.restaurar(c4));

        System.out.println("\n========== ESTADO FINAL ==========");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}

