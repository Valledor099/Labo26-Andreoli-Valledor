package humanos;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona (String nombre, int edad, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarDatos(Persona persona){
        System.out.println(persona.nombre + " " + persona.edad + " " + persona.direccion);
    }

    public static void main(String[] args) {
        Persona persona = new Persona("RIKY",100,"Aizpurua 3399");
        System.out.println("Con sout y getters: " + persona.getNombre() + " " + persona.getEdad() + " " + persona.getDireccion());
        System.out.println("Con mostrarDatos: ");
        persona.mostrarDatos(persona);

        persona.setNombre("aaa");
        persona.setEdad(23);
        persona.setDireccion("Ladines 2842");

        System.out.println("Con sout y getters despues del setter: " + persona.getNombre() + " " + persona.getEdad() + " " + persona.getDireccion());
        System.out.println("Con mostrarDatos despues del setter: ");
        persona.mostrarDatos(persona);



    }


}
