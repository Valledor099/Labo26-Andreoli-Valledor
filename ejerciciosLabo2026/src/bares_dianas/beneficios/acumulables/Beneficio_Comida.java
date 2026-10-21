package bares_dianas.beneficios.acumulables;

import bares_dianas.beneficios.Beneficio;
import humanos.Persona;

import java.util.HashSet;

public class Beneficio_Comida extends Beneficio implements Acumulable {
    private HashSet<String> comidas;

    public Beneficio_Comida(String nombre, String persona) {
        super(nombre, persona);
        this.comidas = new HashSet<>();
    }

    public HashSet<String> getComidas() {
        return comidas;
    }

    public void setComidas(HashSet<String> comidas) {
        this.comidas = comidas;
    }

    @Override
    public int calcularDescuetoExtra() {
        return 4500;
    }

    @Override
    public String toString() {
        return super.toString() + "comidas=" + comidas;
    }
}
