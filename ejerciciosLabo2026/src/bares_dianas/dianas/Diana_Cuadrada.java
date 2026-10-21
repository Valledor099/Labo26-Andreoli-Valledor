package bares_dianas.dianas;

public class Diana_Cuadrada extends Diana{
    private double lado;

    public Diana_Cuadrada(String nombre, String nivel_dificultad, double lado) {
        super(nombre, nivel_dificultad);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
