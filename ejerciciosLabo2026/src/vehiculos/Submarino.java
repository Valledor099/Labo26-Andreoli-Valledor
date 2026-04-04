package vehiculos;

public class Submarino {
    private String nombre;
    private int profundidadMax;
    private int profundidadAct;

    public Submarino(){
        this.nombre = "Kosatska";
        this.profundidadMax = 1000;
        this.profundidadAct = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getProfundidadMax() {
        return profundidadMax;
    }

    public int getProfundidadAct() {
        return profundidadAct;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfundidadMax(int profundidadMax) {
        this.profundidadMax = profundidadMax;
    }

    public void setProfundidadAct(int profundidadAct) {
        this.profundidadAct = profundidadAct;
    }

    public void sumergir(int metros){

        if ((profundidadAct - metros ) < (-1*profundidadMax)){
            System.out.println("-----ALERTA!!-----");
            System.out.println("Si sumerges el submarino a esos metros este implosionara");
        }
        else{
            System.out.println("Descendiendo " + metros + "m");
            profundidadAct -= metros;
            System.out.println("Profundidad Actual: " + profundidadAct + "m");
        }
    }

    public void emerger(int metros){
        if ((profundidadAct + metros) > 0){
            System.out.println("No puedes emerger mas");
        }
        else {
            System.out.println("Emergiendo...");
            profundidadAct += metros;
            System.out.println("Profundidad Actual: " + profundidadAct + "m");
        }
    }

    public static void main(String[] args) {
        Submarino submarino = new Submarino();
        System.out.println("Getters: " + submarino.getNombre() + " " + submarino.getProfundidadAct() + " " + submarino.getProfundidadMax());
        submarino.sumergir(1001);
        submarino.emerger(10);
        submarino.sumergir(800);
        submarino.emerger(30);
    }
}
