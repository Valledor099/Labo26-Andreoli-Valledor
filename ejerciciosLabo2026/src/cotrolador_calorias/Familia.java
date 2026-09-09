package cotrolador_calorias;

import java.time.LocalDate;
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

         IntegrantesFamilia integrante1 = new IntegrantesFamilia("aaa","bbb", LocalDate.of(2000,2,7));
         IntegrantesFamilia integrante2 = new IntegrantesFamilia("bbb","aaa", LocalDate.of(2000,4,1));

         Plato plato1 = new Plato("queque",200);
         Plato plato2 = new Plato("mila_con_papas", 400);
         Plato plato3 = new Plato("Hamburguesa", 1000);

         integrante1.agregar(plato1);
         integrante2.agregar(plato2);
         integrante2.agregar(plato1);
         integrante2.agregar(plato3);

         Familia familia = new Familia();

         familia.agregarIntegrante(integrante1);
         familia.agregarIntegrante(integrante2);

        System.out.println("Consumio mas calorias: " +familia.masCalorias());
        System.out.println("Consumio menos calorias: " + familia.menosCalorias());
        System.out.println("Promedio de calorias en la familia: " +familia.promedioCaloriasFamilia());
        System.out.println("Persona que consumio el plato: " + familia.platoConsumido(plato1));
        System.out.println("Plato favorito del integrante: " + familia.platoFavorito(integrante1));
        System.out.println("Platos distintos de la familia: " + familia.platosDistintos());

        System.out.println("Promedio de calorias del integrante: " + integrante1.promedioCalorias());
    }

}
