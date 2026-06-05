package vehiculos;

public enum Colores {
    ROJO("#FF0000"), NEGRO("#000000"),BLANCO("#FFFFFF");

    private String hexa;

    private Colores(String hexa){
        this.hexa = hexa;
    }

    public String getHexa() {
        return hexa;
    }

}
