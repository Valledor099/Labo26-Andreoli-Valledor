package animales;

import java.util.Scanner;

public class Pajaro extends Mascota {
    private boolean cantor;
    private String canto;

    public Pajaro(String nombre, Duenio duenio, boolean cantor, String canto) {
        super(nombre, duenio,Tipo_Mascota.PAJARO);
        this.cantor = cantor;
        this.canto = canto;
    }

    @Override
    public String saludar() {
        return "pio";
    }

    @Override
    public Tipo_Mascota tipoMascota() {
        return Tipo_Mascota.PAJARO;
    }

}
