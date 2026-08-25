package animales;

public class Pajaro_Cantor extends Pajaro{
    private String canto;

    public Pajaro_Cantor(String nombre, Duenio duenio, String canto) {
        super(nombre, duenio, Tipo_Mascota.PAJARO_CANTOR);
        this.canto = canto;
    }

    public String getCanto() {
        return canto;
    }

    public void setCanto(String canto) {
        this.canto = canto;
    }
}
