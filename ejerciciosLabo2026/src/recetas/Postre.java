package recetas;

import java.util.ArrayList;

public class Postre extends Plato{
private boolean apto_diabetico;
private int temp_horno;

    public Postre(String nombre, ArrayList<String> pasos, Nivel nivel, boolean apto_diabetico, int temp_horno) {
        super(nombre, pasos, nivel,Tipo.POSTRE);
        this.apto_diabetico = apto_diabetico;
        this.temp_horno = temp_horno;
    }

    public boolean isApto_diabetico() {
        return apto_diabetico;
    }

    public void setApto_diabetico(boolean apto_diabetico) {
        this.apto_diabetico = apto_diabetico;
    }

    public int getTemp_horno() {
        return temp_horno;
    }

    public void setTemp_horno(int temp_horno) {
        this.temp_horno = temp_horno;
    }

    @Override
    public String mostrarPasos() {
        String texto= "";
        for (String paso : getPasos()){
            texto += "-" + paso +'\n'+ "recordar mantener la cocina limpia y el horno al mínimo" + '\n';
        }
        return texto;
    }

    @Override
    public String toString() {
        return super.toString() + "Apto diabetico :" + apto_diabetico + '\n' + "Temperatura del horno: " + temp_horno + '\n';
    }
}
