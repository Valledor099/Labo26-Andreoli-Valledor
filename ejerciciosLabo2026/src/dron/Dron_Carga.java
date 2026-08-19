package dron;

public class Dron_Carga extends Drones{
    private float pesoCarga;

    public Dron_Carga(int bateria, String nombre, int drones_operativos, Estado estado, float pesoCarga) {
        super(bateria, nombre, drones_operativos, estado);
        this.pesoCarga = pesoCarga;
    }

    public float getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(float pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    @Override
    public void ejecutarMision(double latitudDestino, double longitudDestino) {
        double destino = calcularDistancia(latitudDestino,longitudDestino);

        if (destino>30){
            System.out.println("La mision no puede realizarse");
        }
        else {
            if (getBateria()>=48){
                System.out.println("La mision se realizo con exito");
                setBateria(getBateria()-48);
            }
            else {
                System.out.println("El dron no cuenta con suficiente bateria");
            }
        }
    }

}
