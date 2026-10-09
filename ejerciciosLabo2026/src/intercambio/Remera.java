package intercambio;

public class Remera extends PrendasRopa implements Prestable{
    private int medidaEspalda;
    private int medidaContorno;
    private int largoTorso;


    public Remera(String color, Material material, String marca, Boolean estado, int medidaEspalda, int largoTorso, int medidaContorno) {
        super(color, material, marca, estado);
        this.medidaEspalda = medidaEspalda;
        this.largoTorso = largoTorso;
        this.medidaContorno = medidaContorno;
    }

    public int getMedidaEspalda() {
        return medidaEspalda;
    }

    public void setMedidaEspalda(int medidaEspalda) {
        this.medidaEspalda = medidaEspalda;
    }

    public int getMedidaContorno() {
        return medidaContorno;
    }

    public void setMedidaContorno(int medidaContorno) {
        this.medidaContorno = medidaContorno;
    }

    public int getLargoTorso() {
        return largoTorso;
    }

    public void setLargoTorso(int largoTorso) {
        this.largoTorso = largoTorso;
    }

    @Override
    public String toString() {
        return "Remera{" +
                super.toString() +
                "medidaEspalda=" + medidaEspalda +
                ", medidaContorno=" + medidaContorno +
                ", largoTorso=" + largoTorso +
                '}';
    }

    @Override
    public void prestar() {
        try{
        puedePrestarse() ;
        System.out.println("la remera se dara prestada");}
        catch (PrestrarException e){
            System.out.println(e.getMessage() + '\n' + "no se dara prestado");
        }
    }

    @Override
    public void puedePrestarse() {
        if (!getEstado()) throw  new PrestrarException("La remera no esta en buen estado");
    }


}
