package tiendaPc;

public class Cred_o_Deb extends Metodo{
    private int numeroTarjeta;
    private String banco;
    private Tarjeta cred_o_deb;

    public Cred_o_Deb(int numeroTarjeta, String banco, Tarjeta cred_o_deb) {
        this.numeroTarjeta = numeroTarjeta;
        this.banco = banco;
        this.cred_o_deb = cred_o_deb;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Tarjeta getCred_o_deb() {
        return cred_o_deb;
    }

    public void setCred_o_deb(Tarjeta cred_o_deb) {
        this.cred_o_deb = cred_o_deb;
    }


    public float recargo() {
        return 0.05F;
    }


    public String metodo() {
        return "Tipo: " + cred_o_deb+ '\n' +
                "numero tarjeta: " + numeroTarjeta +'\n'
                + "Banco: " + banco+ '\n';
    }
}
