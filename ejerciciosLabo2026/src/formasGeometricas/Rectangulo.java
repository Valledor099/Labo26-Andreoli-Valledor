package formasGeometricas;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int getBase(){
        return base;
    }

    public void setBase(int base){
        this.base = base;
    }

    public int getAltura(){
        return altura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }


    public int calcularArea(){
        int area;
        area = base * altura;
        return area;
    }

    public int calcularPerimetro(){
        int perimetro;
        perimetro = 2 * (base + altura);
        return perimetro;
    }

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(4,3);

        System.out.println("Base y Altura :" + rectangulo.getAltura() + " " +rectangulo.getBase());
        System.out.println("Perimetro y area: " + rectangulo.calcularPerimetro() + " "+ rectangulo.calcularArea());

        rectangulo.setAltura(5);
        rectangulo.setBase(10);

        System.out.println("Base y Altura :" + rectangulo.getAltura() + " " +rectangulo.getBase());
        System.out.println("Perimetro y area: " + rectangulo.calcularPerimetro() + " " +rectangulo.calcularArea());

    }
}
