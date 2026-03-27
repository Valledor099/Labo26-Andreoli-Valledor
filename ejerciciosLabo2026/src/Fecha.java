public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(){
        this.dia = 01;
        this.mes = 01;
        this.anio = 2000;
    }

    public Fecha(int dia, int mes, int anio)
    {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void valida(int dia, int mes, int anio)
    {

        if(anio > 2026){
            anio = 1900;
        }

        if(mes > 12 || mes < 1)
        {
            mes = 1;
        }

        

    }
}
