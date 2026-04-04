import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2000;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.valida(anio,mes,dia);
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

    public void valida(int anio,int mes, int dia) {

        try {
            LocalDate.of(anio, mes, dia);
        }catch (java.time.DateTimeException e){
            this.dia = 1;
            this.mes = 1;
            this.anio = 1900;
        }

    }

    public int diasMes(int mes) {
        int dias = 1;
        switch (mes) {
            case 1:
                dias = 31;
                break;
            case 2:
                dias = 28;
                break;
            case 3:
                dias = 31;
                break;
            case 4:
                dias = 30;
                break;
            case 5:
                dias = 31;
                break;
            case 6:
                dias = 30;
                break;
            case 7:
                dias = 31;
                break;
            case 8:
                dias = 31;
                break;
            case 9:
                dias = 30;
                break;
            case 10:
                dias = 31;
                break;
            case 11:
                dias = 30;
                break;
            case 12:
                dias = 31;
                break;
            default:
                System.out.println("El mes no existe");
        }
        return dias;
    }

    public void corta() {
        System.out.println(dia + "-" + mes + "-" + anio);
    }

    public void larga() {
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        DayOfWeek diaSemana = fecha.getDayOfWeek();
        YearMonth ym = YearMonth.of(anio, mes);
        System.out.println(diaSemana + " " + dia + " " + ym);
    }

    public void siguiente() {
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        LocalDate maniana = fecha.plusDays(1);
        anio = maniana.getYear();
        mes = maniana.getMonthValue();
        dia = maniana.getDayOfMonth();
    }

    public void anterior() {
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        LocalDate ayer = fecha.minusDays(1);
        anio = ayer.getYear();
        mes = ayer.getMonthValue();
        dia = ayer.getDayOfMonth();
    }

    public boolean igualQue(Fecha fecha){
        boolean esIgual;
        if (dia == fecha.getDia() && mes == fecha.getMes() && anio == fecha.getAnio()){
            esIgual = true;
        }
        else {
            esIgual = false;
        }


        return esIgual;
    }

    public boolean menorQue(Fecha fecha){
    boolean esMenor;

        if (anio < fecha.getAnio())
        {
            esMenor = true;
        }
        else if(mes < fecha.getMes() && anio == fecha.getAnio()){
            esMenor = true;
        }
        else if (dia < fecha.getDia() && mes == fecha.getMes() && anio == fecha.getAnio())
        {
            esMenor = true;
        }
        else {
            esMenor = false;
        }

        return esMenor;
    }

    public boolean mayorQue(Fecha fecha){
        boolean esMayor;

        if (anio > fecha.getAnio())
        {
            esMayor = true;
        }
        else if(mes > fecha.getMes() && anio == fecha.getAnio()){
            esMayor = true;
        }
        else if (dia > fecha.getDia() && mes == fecha.getMes() && anio == fecha.getAnio())
        {
            esMayor = true;
        }
        else {
            esMayor = true;
        }

        return esMayor;

    }

    public static void main(String[] args) {
        Fecha fecha = new Fecha();
        Fecha fecha1 = new Fecha(99,10000,4123);

        System.out.println("Fechas con getters");
        System.out.println("Fecha: " + fecha.getDia() + fecha.getMes() + fecha.getAnio());
        System.out.println("Fecha 1: " + fecha1.getDia() + fecha1.getMes() + fecha1.getAnio());

        System.out.println("Numero de dias de agosto: " + fecha.diasMes(5));
        System.out.println("fechas con metodos");
        fecha.corta();
        fecha1.larga();
        fecha.siguiente();
        fecha.corta();
        fecha1.anterior();
        fecha1.corta();
        System.out.println(fecha.igualQue(fecha1));
        System.out.println(fecha.menorQue(fecha1));
        System.out.println(fecha.mayorQue(fecha1));


    }

}
