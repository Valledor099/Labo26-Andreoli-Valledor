package Unidad_0;


import static java.lang.Math.pow;

public class Circulo {
    private double radio;

    public Circulo(){
        radio = 2;
    }

    public Circulo(int radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(int radio){
        this.radio = radio;
    }

    public double calcularArea(){
        double resu;
        resu = Math.PI * pow(radio,2);
        return resu;
    }

    public double calcularPerimetro(){
        double resu;
        resu = 2 * Math.PI * radio;
        return resu;
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Circulo circulo1 = new Circulo(3);

        System.out.println( "radio del circulo: "+ circulo.getRadio());
        System.out.println( "radio del circulo: "+ circulo1.getRadio());

        System.out.println("area: " + circulo.calcularArea() + " perimetro: " + circulo.calcularPerimetro());
        System.out.println("area: " + circulo1.calcularArea() + " perimetro: " + circulo1.calcularPerimetro());

        circulo1.setRadio(5);
        circulo.setRadio(6);

        System.out.println( "radio del circulo: "+ circulo.getRadio());
        System.out.println( "radio del circulo: "+ circulo1.getRadio());

        System.out.println("area: " + circulo.calcularArea() + " perimetro: " + circulo.calcularPerimetro());
        System.out.println("area: " + circulo1.calcularArea() + " perimetro: " + circulo1.calcularPerimetro());

    }

}
