public class Cafetera {
    private int cantidadMaxima;
    private int cantidadActual;

    // a. Constructor por defecto
    public Cafetera() {
        this.cantidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    // b. Constructor con cantidad máxima
    public Cafetera(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadMaxima;
    }

    // c. Constructor con cantidad máxima y actual
    public Cafetera(int cantidadMaxima, int cantidadActual) {
        this.cantidadMaxima = cantidadMaxima;
        if (cantidadActual > cantidadMaxima) {
            this.cantidadActual = cantidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }

    // d. llenarCafetera
    public void llenarCafetera() {
        this.cantidadActual = this.cantidadMaxima;
    }

    // e. servirTaza
    public int servirTaza(int capacidad) {
        int servido;
        if (this.cantidadActual >= capacidad) {
            servido = capacidad;
        } else {
            servido = this.cantidadActual;
        }
        this.cantidadActual -= servido;
        return servido;
    }

    // f. vaciarCafetera
    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    // g. agregarCafe
    public void agregarCafe(int cantidad) {
        if (this.cantidadActual + cantidad > this.cantidadMaxima) {
            this.cantidadActual = this.cantidadMaxima;
        } else {
            this.cantidadActual += cantidad;
        }
    }

    // Getters
    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public String toString() {
        return "Cafetera [máximo: " + cantidadMaxima + " cc, actual: " + cantidadActual + " cc]";
    }

    // Main para probar
    public static void main(String[] args) {
        System.out.println("=== Prueba de Cafetera ===\n");

        // Constructor por defecto
        Cafetera c1 = new Cafetera();
        System.out.println("c1 (defecto):        " + c1);

        // Constructor con máximo
        Cafetera c2 = new Cafetera(500);
        System.out.println("c2 (máx=500):        " + c2);

        // Constructor con máximo y actual (actual > máximo → se ajusta)
        Cafetera c3 = new Cafetera(300, 450);
        System.out.println("c3 (máx=300,act=450):" + c3);

        System.out.println("\n--- Operaciones sobre c1 ---");
        c1.llenarCafetera();
        System.out.println("Después de llenar:   " + c1);

        int servido = c1.servirTaza(250);
        System.out.println("Sirviendo taza 250cc → servido: " + servido + "cc | " + c1);

        c1.agregarCafe(100);
        System.out.println("Agregando 100cc:     " + c1);

        c1.vaciarCafetera();
        System.out.println("Después de vaciar:   " + c1);

        // Caso borde: servir más de lo que hay
        c1.agregarCafe(80);
        System.out.println("\nAgregando 80cc:      " + c1);
        servido = c1.servirTaza(200);
        System.out.println("Sirviendo taza 200cc → servido: " + servido + "cc | " + c1);
    }
}

