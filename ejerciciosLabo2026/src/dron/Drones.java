package dron;

public abstract class Drones {
    private String nombre;
    private int bateria;
    private int drones_operativos;
    private Estado estado;

    public Drones(int bateria, String nombre, int drones_operativos, Estado estado) {
        this.bateria = bateria;
        this.nombre = nombre;
        this.drones_operativos = drones_operativos;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getDrones_operativos() {
        return drones_operativos;
    }

    public void setDrones_operativos(int drones_operativos) {
        this.drones_operativos = drones_operativos;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void recargarBateria(){
        if(bateria<20){
            bateria=100;
        }
        else{
            if ((bateria+10)<=100){
                bateria+=10;
            }
            else {
                bateria=100;
            }
        }
    }

    public  abstract void ejecutarMision(double latitudDestino, double longitudDestino);

    public double calcularDistancia(double latitudDestino, double longitudDestino){
        double latitudOrigen = 34.573195;
        double longitudOrigen = -58.504111;

        // Convertir a radianes
        double lat1Rad = Math.toRadians(latitudOrigen);
        double lon1Rad = Math.toRadians(longitudOrigen);
        double lat2Rad = Math.toRadians(latitudDestino);
        double lon2Rad = Math.toRadians(longitudDestino);

        // Fórmula de Haversine
        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double radioTierraKm = 6371;
        return radioTierraKm * c;
    };
    

}
