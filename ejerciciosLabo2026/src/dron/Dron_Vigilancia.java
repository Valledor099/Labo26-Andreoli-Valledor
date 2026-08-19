package dron;

public class Dron_Vigilancia extends Drones{
    private int cantMemoria;

    public Dron_Vigilancia(int bateria, String nombre, int drones_operativos, Estado estado, int cantMemoria) {
        super(bateria, nombre, drones_operativos, estado);
        this.cantMemoria = cantMemoria;
    }

    public int getCantMemoria() {
        return cantMemoria;
    }

    public void setCantMemoria(int cantMemoria) {
        this.cantMemoria = cantMemoria;
    }

    @Override
    public void ejecutarMision(double latitudDestino, double longitudDestino) {
       if(hayEspacio(calcularDistancia(latitudDestino,longitudDestino))){
           System.out.println("La mision se realizo con exito");
       }
       else {
           System.out.println("El dron no cuenta con suficiente espacio");
       }


    }

    public boolean hayEspacio(double destino){
        double cantidadEspacio = (destino / 2) * 12;

        if (cantidadEspacio <= cantMemoria){
            return true;
        }
        else {
            return false;
        }

    }
}
