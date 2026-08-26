package animales;

public class Pez extends Mascota{
    private int vidas;


    public Pez(String nombre, Duenio duenio) {
        super(nombre, duenio);
        this.vidas = 10;
    }



    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }



    @Override
    public void morir() {
        this.vidas = 0;
    }

    @Override
    public void alimentar() {
        this.vidas++;
    }

    @Override
    public String saludar(String nombre_usuario) {
        if (esDuenio(nombre_usuario)){
            restarVida();
        }
        else {
            morir();
        }
        return "";
    }

    @Override
    public Boolean estaVivo() {
        if (vidas == 0){
            return false;
        }
        return true;
    }

    @Override
    public void restarVida() {
        this.vidas-=1;
    }

    @Override
    public Tipo_Mascota tipoMascota() {
        return Tipo_Mascota.PEZ;
    }
}
