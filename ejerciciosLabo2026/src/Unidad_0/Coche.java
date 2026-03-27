package Unidad_0;

public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;

    public Coche(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor(){
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setColor(String color){
        this.color= color;
    }

    public void acelerar(){
        velocidad += 5;
    }

    public void frenar(){
        velocidad = 0;
    }

    public int mostrarVelocidad(){
        return velocidad;
    }

    public static void main(String[] args) {
        Coche coche = new Coche("lamborghini","Urus", "gris");
        System.out.println("marca, modelo, color: " + coche.getMarca() + " "+ coche.getModelo()+ " " + coche.getColor());

        coche.setMarca("Porsche");
        coche.setModelo("911 gt-rs 3");
        coche.setColor("Negro");

        System.out.println("marca, modelo, color: " + coche.getMarca() + " "+ coche.getModelo() +" "+ coche.getColor());
        coche.acelerar();
        System.out.println(coche.mostrarVelocidad());
        coche.frenar();
        System.out.println(coche.mostrarVelocidad());
    }

}
