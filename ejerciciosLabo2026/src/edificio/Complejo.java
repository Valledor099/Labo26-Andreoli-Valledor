package edificio;

import java.time.Year;
import java.util.ArrayList;

public class Complejo extends Sensor{
    private ArrayList<Simple> grupo;

    public Complejo(boolean estado, int valor_umbral, ArrayList<Simple> grupo) {
        super(estado, valor_umbral);
        this.grupo = grupo;
    }

    public ArrayList<Simple> getGrupo() {
        return grupo;
    }

    public void setGrupo(ArrayList<Simple> grupo) {
        this.grupo = grupo;
    }


    @Override
    public float valor() {
        int totalUmbral = 0;
        float promedio = 0;

        for (Simple sensor : grupo){
            totalUmbral += sensor.getValoReal();
        }
        promedio = (float) totalUmbral / grupo.size();
        return promedio;
    }

    @Override
    public void dispararAlarma() {
        System.out.println("Se disparo el sensor complejo");
    }
}
