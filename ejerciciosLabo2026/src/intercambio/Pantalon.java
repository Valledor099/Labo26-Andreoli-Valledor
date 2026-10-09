package intercambio;

public class Pantalon extends PrendasRopa implements Prestable{
    private int medidaCintura;
    private int medidaCadera;
    private int largo;

    public Pantalon(String color, Material material, String marca, Boolean estado, int medidaCintura, int medidaCadera, int largo) {
        super(color, material, marca, estado);
        this.medidaCintura = medidaCintura;
        this.medidaCadera = medidaCadera;
        this.largo = largo;
    }

    public int getMedidaCintura() {
        return medidaCintura;
    }

    public void setMedidaCintura(int medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getMedidaCadera() {
        return medidaCadera;
    }

    public void setMedidaCadera(int medidaCadera) {
        this.medidaCadera = medidaCadera;
    }

    @Override
    public String toString() {
        return "Pantalon{" +
                super.toString() +
                "medidaCintura=" + medidaCintura +
                ", medidaCadera=" + medidaCadera +
                ", largo=" + largo +
                '}';
    }

    @Override
    public void prestar() {
        try {
            puedePrestarse();
            System.out.println("el pantalon se dara prestado");
        }catch (PrestrarException e){
            System.out.println(e.getMessage() + '\n' + "no se dara prestado");
        }

    }

    @Override
    public void puedePrestarse() {
        if (!getEstado()) throw new PrestrarException("El pantalon no esta en buen estado");
    }


}
