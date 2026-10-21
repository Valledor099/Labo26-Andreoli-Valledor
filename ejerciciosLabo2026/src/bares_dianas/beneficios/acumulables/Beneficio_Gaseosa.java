package bares_dianas.beneficios.acumulables;

import bares_dianas.beneficios.Beneficio;
import humanos.Persona;

import java.util.HashSet;

public class Beneficio_Gaseosa extends Beneficio implements Acumulable{
    private HashSet<String>gaseosas;


    public Beneficio_Gaseosa(String nombre, String persona) {
        super(nombre, persona);
        this.gaseosas = new HashSet<>();
    }

    public HashSet<String> getGaseosas() {
        return gaseosas;
    }

    public void setGaseosas(HashSet<String> gaseosas) {
        this.gaseosas = gaseosas;
    }

    @Override
    public int calcularDescuetoExtra() {
        return 1000;
    }

    @Override
    public String toString() {
        return super.toString() + "gaseosas=" + gaseosas;
    }
}
