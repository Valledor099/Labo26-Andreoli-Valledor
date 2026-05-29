package tiendaPc;

public class Cred_o_Deb extends Metodo{
    private int numeroTarjeta;
    private String banco;
    private String cred_o_deb;

    public Cred_o_Deb(int numeroTarjeta, String banco, String cred_o_deb) {
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

    public String getCred_o_deb() {
        return cred_o_deb;
    }

    public void setCred_o_deb(String cred_o_deb) {
        this.cred_o_deb = cred_o_deb;
    }

    @Override
    public float recargo() {
        return 0.05F;
    }

    @Override
    public String metodo() {
        return "numero tarjeta: " + numeroTarjeta +'\n'
                + "Banco: " + banco+ '\n'
                + "Tipo: " + cred_o_deb+ '\n';
    }
}
