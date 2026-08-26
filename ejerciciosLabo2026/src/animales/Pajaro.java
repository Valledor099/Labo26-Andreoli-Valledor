package animales;

import java.util.Scanner;

public class Pajaro extends Mascota {
    private boolean cantor;
    private String canto;

    public Pajaro(String nombre, Duenio duenio, boolean cantor, String canto) {
        super(nombre, duenio);
        this.cantor = cantor;
        this.canto = canto;
    }


    @Override
    public String saludar(String nombre_usuario) {
        if (esDuenio(nombre_usuario)){
            if (cantor) {
                return repetirSaludo_Alegria(canto);
            }
            else {
                return repetirSaludo_Alegria("pio");
            }
        }
        else {
            return "";
        }
    }

    @Override
    public Tipo_Mascota tipoMascota() {
        return Tipo_Mascota.PAJARO;
    }

}
