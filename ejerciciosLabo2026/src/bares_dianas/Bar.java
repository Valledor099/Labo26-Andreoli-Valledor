package bares_dianas;

import bares_dianas.beneficios.Beneficio;
import bares_dianas.beneficios.Beneficio_Trago;
import bares_dianas.beneficios.acumulables.Acumulable;
import bares_dianas.dianas.Diana;

import java.util.HashSet;

public class Bar {
    private String nombre;
    private HashSet<Diana>dianas_utilizadas;
    private int cant_clientes, dinero_recaudado;
    private HashSet<Beneficio>beneficios;
    private HashSet<Beneficio>beneficios_acumulables;

    public Bar(int cant_clientes, int dinero_recaudado, String nombre) {
        this.nombre = nombre;
        this.cant_clientes = cant_clientes;
        this.dinero_recaudado = dinero_recaudado;
        this.beneficios = new HashSet<>();
        this.beneficios_acumulables = new HashSet<>();
        this.dianas_utilizadas = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Diana> getDianas_utilizadas() {
        return dianas_utilizadas;
    }

    public void setDianas_utilizadas(HashSet<Diana> dianas_utilizadas) {
        this.dianas_utilizadas = dianas_utilizadas;
    }

    public int getCant_clientes() {
        return cant_clientes;
    }

    public void setCant_clientes(int cant_clientes) {
        this.cant_clientes = cant_clientes;
    }

    public int getDinero_recaudado() {
        return dinero_recaudado;
    }

    public void setDinero_recaudado(int dinero_recaudado) {
        this.dinero_recaudado = dinero_recaudado;
    }

    public HashSet<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(HashSet<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    public HashSet<Beneficio> getBeneficios_acumulables() {
        return beneficios_acumulables;
    }

    public void setBeneficios_acumulables(HashSet<Beneficio> beneficios_acumulables) {
        this.beneficios_acumulables = beneficios_acumulables;
    }

    public int cantBeneficiosTrago(){
        int cantBeneficiosTragos = 0;

        for (Beneficio beneficio : beneficios){
            if (!(beneficios_acumulables.contains(beneficio))){
                cantBeneficiosTragos++;
            }
        }

        return cantBeneficiosTragos;
    }

    public void agregarDiana(Diana diana){
        dianas_utilizadas.add(diana);
    }

    public void agregarBeneficio(Beneficio beneficio){
        if (beneficio instanceof Acumulable){
            beneficios_acumulables.add(beneficio);
        }
        beneficios.add(beneficio);
    }

    @Override
    public String toString() {
        return "Bar{"+
                "nombre=" + nombre + '\n' +
                "dianas_utilizadas=" + dianas_utilizadas +'\n' +
                "cant_clientes=" + cant_clientes +'\n' +
                "dinero_recaudado=" + dinero_recaudado +'\n' +
                "beneficios=" + beneficios +'\n' +
                "beneficios_acumulables=" + beneficios_acumulables +'\n' +
                '}'+ '\n';
    }
}
