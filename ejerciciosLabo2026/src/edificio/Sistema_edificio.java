package edificio;

import java.util.ArrayList;

public class Sistema_edificio {
    private ArrayList<Sensor> sensores;

    public Sistema_edificio() {
        this.sensores = new ArrayList<>();
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }

    public void recorrerSensor(){
        for (Sensor sensor : sensores){
            evaluar(sensor);
        }
    }

    public void evaluar(Sensor sensor){
        if(sensor.getValor_umbral() < sensor.valor() && sensor.isEstado() ){
            sensor.dispararAlarma();
        }

    }

    public void agregarSensor(Sensor sensor){
        sensores.add(sensor);
    }

}
