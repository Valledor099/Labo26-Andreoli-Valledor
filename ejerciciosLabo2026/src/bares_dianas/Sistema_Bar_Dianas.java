package bares_dianas;

import bares_dianas.beneficios.Beneficio;
import bares_dianas.beneficios.Beneficio_Trago;
import bares_dianas.beneficios.acumulables.Beneficio_Comida;
import bares_dianas.beneficios.acumulables.Beneficio_Gaseosa;
import bares_dianas.dianas.*;
import humanos.Persona;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema_Bar_Dianas {
    private HashSet<Bar>bares;
    private HashSet<Diana>dianas;
    private HashSet<Beneficio>beneficios;

    public Sistema_Bar_Dianas() {
        this.bares = new HashSet<>();
        this.dianas = new HashSet<>();
        this.beneficios = new HashSet<>();
    }

    public HashSet<Bar> getBares() {
        return bares;
    }

    public void setBares(HashSet<Bar> bares) {
        this.bares = bares;
    }

    public HashSet<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(HashSet<Diana> dianas) {
        this.dianas = dianas;
    }

    public HashSet<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(HashSet<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    public void agregarBar(Bar bar){
        bares.add(bar);
    }

    public void agregarDiana(Diana diana){
        dianas.add(diana);
    }

    public void agregarBeneficio(Beneficio beneficio){
        beneficios.add(beneficio);
    }

    public Diana masPuntajes(){
        int masPuntaje = 0;
        Diana puntajeMax = null;

        for (Diana diana : dianas){

            int cantPuntajeDiana = diana.getPuntajes_color().size();

            if (puntajeMax == null || masPuntaje < cantPuntajeDiana){
                masPuntaje = cantPuntajeDiana;
                puntajeMax = diana;
            }
        }

        return puntajeMax;
    }

    public HashMap<Bar,Integer> cantBeneficiosTragoBar(){
        HashMap<Bar,Integer> bares = new HashMap<>();

        for (Bar bar : this.bares){
            bares.put(bar,bar.cantBeneficiosTrago());
        }

        return bares;
    }

    public static void main(String[] args) {

        Sistema_Bar_Dianas sistema = new Sistema_Bar_Dianas();

        Bar bar1 = new Bar(10,10000,"Taberna de Moe");
        Bar bar2 = new Bar(100,100000,"dasd");


        Diana_Circular dianaC1= new Diana_Circular("diana circular 1", "facil");
        dianaC1.agregarPuntajeColor(100,Color.ROJO);
        dianaC1.agregarPuntajeColor(200,Color.AMARILLO);
        dianaC1.agregarPuntajeColor(300,Color.NEGRO);

        Diana_Circular dianaC2= new Diana_Circular("diana circular 2", "dificil");
        dianaC2.agregarPuntajeColor(100,Color.ROJO);

        Diana_Rectangular dianaR1 = new Diana_Rectangular("diana rectangular 1", "intermedio", 10,5);
        Diana_Rectangular dianaR2 = new Diana_Rectangular("diana rectangular 2","dificil",1,2);

        Diana_Cuadrada dianaCu1 = new Diana_Cuadrada("diana cuadrada 1 ", "facil",20);
        Diana_Cuadrada dianaCu2 = new Diana_Cuadrada("diana cuadrada 2 ", "dificil",10);

        Beneficio_Trago beneficio_trago1 = new Beneficio_Trago("jdnasj","dasda");
        Beneficio_Trago beneficio_trago2 = new Beneficio_Trago("adsa","dasda");

        Beneficio_Comida beneficio_comida1 = new Beneficio_Comida("dasd","djaksd");
        Beneficio_Comida beneficio_comida2 = new Beneficio_Comida("dasd","djaksd");

        Beneficio_Gaseosa beneficio_gaseosa1 = new Beneficio_Gaseosa("dasdas","kodasp");
        Beneficio_Gaseosa beneficio_gaseosa2 = new Beneficio_Gaseosa("dsdasd","pasdaw");


        bar1.agregarBeneficio(beneficio_trago1);
        bar1.agregarBeneficio(beneficio_comida1);
        bar1.agregarBeneficio(beneficio_gaseosa1);
        bar1.agregarDiana(dianaC1);
        bar1.agregarDiana(dianaCu1);
        bar1.agregarDiana(dianaR1);

        bar2.agregarBeneficio(beneficio_trago2);
        bar2.agregarBeneficio(beneficio_comida2);
        bar2.agregarBeneficio(beneficio_gaseosa2);
        bar2.agregarDiana(dianaC2);
        bar2.agregarDiana(dianaCu2);
        bar2.agregarDiana(dianaR2);

        sistema.agregarBar(bar1);
        sistema.agregarBar(bar2);

        sistema.agregarBeneficio(beneficio_comida1);
        sistema.agregarBeneficio(beneficio_comida2);
        sistema.agregarBeneficio(beneficio_trago1);
        sistema.agregarBeneficio(beneficio_trago2);
        sistema.agregarBeneficio(beneficio_gaseosa1);
        sistema.agregarBeneficio(beneficio_gaseosa2);

        sistema.agregarDiana(dianaC1);
        sistema.agregarDiana(dianaC2);
        sistema.agregarDiana(dianaCu1);
        sistema.agregarDiana(dianaCu2);
        sistema.agregarDiana(dianaR1);
        sistema.agregarDiana(dianaR2);

        System.out.println("Diana con mas cantidad de puntajes distintos:" +sistema.masPuntajes());
        System.out.println("\n-------Cantidad de beneficios de tipo trago por bar ---------- \n" + sistema.cantBeneficiosTragoBar());
        System.out.println("Area diana Circular: " +dianaC1.calcularArea());
        System.out.println("Area diana cuadrada: " +dianaCu1.calcularArea());
        System.out.println("Area diana rectangular: " +dianaR1.calcularArea());
    }
}
