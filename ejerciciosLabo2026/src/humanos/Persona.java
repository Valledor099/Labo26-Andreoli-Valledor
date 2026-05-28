package humanos;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fecha_de_nacimiento;
    private String direccion;
    private String numCel;

    public Persona(String nombre, LocalDate fecha_de_nacimiento, String direccion) {
        this.nombre = nombre;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.direccion = direccion;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido , LocalDate fecha_de_nacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public Persona(String nombre, String apellido, String numCel) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCel = numCel;
    }

    public String getNumCel() {
        return numCel;
    }

    public void setNumCel(String numCel) {
        this.numCel = numCel;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(LocalDate fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int calcularEdad(){
        int edad;
        edad = LocalDate.now().getYear() - fecha_de_nacimiento.getYear();
        return edad;
    }

    public void mostrarDatos(){
        System.out.println(nombre + " " + fecha_de_nacimiento + " " + direccion);
    }

    public static void main(String[] args) {
        Persona persona = new Persona("RIKY",LocalDate.of(2000,10,10),"Aizpurua 3399");
        System.out.println("Con sout y getters: " + persona.getNombre() + " " + persona.getFecha_de_nacimiento() + " " + persona.getDireccion());
        System.out.println("Con mostrarDatos: ");
        persona.mostrarDatos();

        persona.setNombre("aaa");
        persona.setFecha_de_nacimiento(LocalDate.of(2000,10,10));
        persona.setDireccion("Ladines 2842");

        System.out.println("Con sout y getters despues del setter: " + persona.getNombre() + " " + persona.calcularEdad() + " " + persona.getDireccion());
        System.out.println("Con mostrarDatos despues del setter: ");
        persona.mostrarDatos();



    }


}
