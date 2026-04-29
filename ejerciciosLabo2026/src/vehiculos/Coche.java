package vehiculos;

public class Coche extends Vehiculo{
    private int velocidad;

    public Coche(String marca, String modelo, String color){
        super(marca, modelo, color);
        this.velocidad = 0;
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
