package cotrolador_calorias;

import humanos.Persona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class IntegrantesFamilia extends Persona {
    private ArrayList<Plato> platos;

    public IntegrantesFamilia(String nombre, String apellido, LocalDate fecha_de_nacimiento) {
        super(nombre, apellido, fecha_de_nacimiento);
        this.platos = new ArrayList<>();
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public void agregar (Plato plato){
        platos.add(plato);
    }

    public int cantidadCaloriasTotal(){
        int caloriasTotal = 0;
        for(Plato plato : platos){
            caloriasTotal += plato.getCalorias();
        }
        return caloriasTotal;
    }

    public double promedioCalorias(){
        return (double) cantidadCaloriasTotal() / platos.size();
    }

    public Plato platoFavorito(){
        Plato platoFavorito = null;
        int contador1 = 0;
        for (Plato plato : platos){
            int contador2 = 0;
            for (Plato plato1 : platos){
                if(plato.equals(plato1)){
                contador2++;
                }
            }
        if (contador2 > contador1){
            contador1=contador2;
            platoFavorito=plato;
        }
        }

        return platoFavorito;

    }




    @Override
    public String toString() {
        return getNombre() + " " + getApellido() ;
    }
}
