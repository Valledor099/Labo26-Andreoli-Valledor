import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 01;
        this.mes = 01;
        this.anio = 2000;
    }

    public Fecha(int dia, int mes, int anio) {
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

    public void valida() {

        if (anio > 2026) {
            anio = 1900;
        }


        switch (mes) {
            case 1:
                if (dia > 31 || dia < 1) {
                    dia = 1;
                }
                break;
            case 2:
                if (dia > 28 || dia < 1) {
                    dia = 1;
                }
                break;
            case 3:
                if (dia > 31 || dia < 1) {
                    dia = 1;
                }
                break;
            case 4:
                if (dia > 30 || dia < 1) {
                    dia = 1;
                }
                break;
            case 5:
                if (dia > 31 || dia < 1) {
                    dia = 1;
                }
                break;
            case 6:
                if (dia > 30 || dia < 1) {
                    dia = 1;
                }
                break;
            case 7:
                if (dia > 31 || dia < 1) {
                    dia = 1;
                }
                break;
            case 8:
                if (dia > 31 || dia < 1) {
                    dia = 1;
                }
                break;
            case 9:
                if (dia > 30 || dia < 1) {
                    dia = 1;
                }
                break;
            case 10:
                if (dia > 31 || dia < 1) {
                    dia = 1;
                }
                break;
            case 11:
                if (dia > 30 || dia < 1) {
                    dia = 1;
                }
                break;
            case 12:
                if (dia > 31 || dia < 1) {
                    dia = 1;
                }
                break;
            default:
                mes = 1;
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
    public void igualQue(Fecha fecha){
        
    }



}
