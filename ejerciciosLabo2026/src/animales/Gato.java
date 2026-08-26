package animales;

public class Gato extends Mascota {

    public Gato(String nombre, Duenio duenio) {
        super(nombre, duenio);
    }


    @Override
    public String saludar(String nombre_usuario) {
        String saludo;
        if (esDuenio(nombre_usuario)){
            saludo = "miau";
        }
        else {
            saludo = "MIAU!";
        }

        return repetirSaludo_Alegria(saludo);
    }

    @Override
    public Tipo_Mascota tipoMascota() {
        return Tipo_Mascota.GATO;
    }
}
