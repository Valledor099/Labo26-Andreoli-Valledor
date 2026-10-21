package bares_dianas.dianas;

public class Diana_Circular extends Diana {
    public static int radio = 13;

    public Diana_Circular(String nombre, String nivel_dificultad) {
        super(nombre, nivel_dificultad);
    }

    public static int getRadio() {
        return radio;
    }

    public static void setRadio(int radio) {
        Diana_Circular.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
