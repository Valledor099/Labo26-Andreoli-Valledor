package bebidas;

import java.util.ArrayList;

public class Sistema_Controlador {
    private ArrayList <Persona> personas;

    public Sistema_Controlador(){
        personas = new ArrayList<>();
    }

    public void agregarPersonas(Persona persona){
        personas.add(persona);
    }

    public Persona mejor_coeficiente(){
        Persona mejor_persona = personas.getFirst();

        for (Persona persona : personas){
            if (!(persona.equals(mejor_persona)) && (persona.hidratacionResultante() > mejor_persona.hidratacionResultante())){
                mejor_persona = persona;
            }
        }
        return  mejor_persona;
    }

    public Persona peor_coeficiente(){
        Persona peor_persona = personas.getFirst();

        for (Persona persona : personas){
            if (!(persona.equals(peor_persona)) && (persona.hidratacionResultante() < peor_persona.hidratacionResultante())){
                peor_persona = persona;
            }
        }
        return  peor_persona;
    }

    public String mejor_y_peor_coef(){
        return "Persona con mejor coeficiente: " + mejor_coeficiente() + '\n'
                + "Persona con peor coeficiente: " + peor_coeficiente();
    }


    public static void main(String[] args) {
        Bebida cocaCola = new Bebida_Azucarada("Coca Cola", 10);
        Bebida agua = new Bebida_Neutra("Agua",0,20);
        Bebida nuvo = new Bebida_Alcoholica("Nuvo", 15);

        Persona persona = new Persona("JJJ","KKK","43789817");
        Persona persona1 = new Persona("LLL", "OOO","83924812");

        Consumicion consumicion = new Consumicion(nuvo,20);
        Consumicion consumicion1 = new Consumicion(agua, 100);
        Consumicion consumicion2 = new Consumicion(agua,1);

        persona.consumir(consumicion);
        persona.consumir(consumicion2);

        persona1.consumir(consumicion1);

        System.out.println(persona.hidratacionResultante());
        System.out.println(persona1.hidratacionResultante());

        Sistema_Controlador sist = new Sistema_Controlador();

        sist.agregarPersonas(persona);
        sist.agregarPersonas(persona1);

        System.out.println(sist.mejor_y_peor_coef());

    }
}
