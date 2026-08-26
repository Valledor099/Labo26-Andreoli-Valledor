package animales;

public class Pez extends Mascota{
    private int vidas;


    public Pez(String nombre, Duenio duenio) {
        super(nombre, duenio,Tipo_Mascota.PEZ);
        this.vidas = 10;
    }



    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public String saludar() {
        return "";
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
    public void restarVida() {
        this.vidas-=1;
    }

    @Override
    public Tipo_Mascota tipoMascota() {
        return Tipo_Mascota.PEZ;
    }
}
