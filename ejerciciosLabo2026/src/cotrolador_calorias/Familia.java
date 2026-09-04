package cotrolador_calorias;

import java.util.HashSet;

public class Familia {
    private HashSet<IntegrantesFamilia> integrantes;

    public Familia() {
        this.integrantes = new HashSet<>();
    }

    public HashSet<IntegrantesFamilia> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(HashSet<IntegrantesFamilia> integrantes) {
        this.integrantes = integrantes;
    }

    public void agregarIntegrante(IntegrantesFamilia integrante){
        integrantes.add(integrante);
    }

    public void eliminarIntegrante(IntegrantesFamilia integrante){
        integrantes.remove(integrante);
    }

    public void registroConsumo(IntegrantesFamilia integrante, Plato plato){
        integrante.agregar(plato);
    }

    public IntegrantesFamilia menosCalorias(){
        IntegrantesFamilia integranteMenos = null;
        int calorias = 0;
        for (IntegrantesFamilia integrante : integrantes){
            if (integranteMenos == null || calorias > integrante.cantidadCaloriasTotal()){
                integranteMenos = integrante;
                calorias = integrante.cantidadCaloriasTotal();
            }
        }
        return integranteMenos;
    }

    public IntegrantesFamilia masCalorias(){
        IntegrantesFamilia integranteMas = null;
        int calorias = 0;
        for (IntegrantesFamilia integrante : integrantes){
            if (integranteMas == null || calorias < integrante.cantidadCaloriasTotal()){
                integranteMas = integrante;
                calorias = integrante.cantidadCaloriasTotal();
            }
        }
        return integranteMas;
    }

    public double promedioCaloriasFamilia(){
        double caloriasTotal = 0;
        for (IntegrantesFamilia integrantes : integrantes){
            caloriasTotal += integrantes.cantidadCaloriasTotal();
        }
        return caloriasTotal/ integrantes.size();
    }

    public HashSet<IntegrantesFamilia> platoConsumido(Plato plato){
        HashSet<IntegrantesFamilia> consumidores = new HashSet<>();
        for (IntegrantesFamilia integrante : integrantes){
            if (integrante.getPlatos().contains(plato)){
             consumidores.add(integrante);
            }
        }
        return consumidores;
    }

    public HashSet<Plato> platosDistintos(){
        HashSet<Plato> platos = new HashSet<>();
        for (IntegrantesFamilia integrante : integrantes){
            for( Plato plato : integrante.getPlatos()){
                platos.add(plato);
            }
        }
        return platos;
    }

    public Plato platoFavorito(IntegrantesFamilia integrante){
        return integrante.platoFavorito();
    }

    public static void main(String[] args) {

    }

}
