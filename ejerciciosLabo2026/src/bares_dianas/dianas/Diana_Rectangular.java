package bares_dianas.dianas;

public class Diana_Rectangular extends Diana {
    private double altura, base;

    public Diana_Rectangular(String nombre, String nivel_dificultad, double altura, double base) {
        super(nombre, nivel_dificultad);
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
