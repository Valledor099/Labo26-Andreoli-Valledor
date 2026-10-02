package librosElectronicos;

import excepciones_1.StringNull;
import humanos.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Usuario extends Persona {
    private String mail;
    private Membresia membresia;
    private HashSet<LibroElectronico>librosDescargados;

    public Usuario(LocalDate fecha_de_nacimiento, String nombre, String DNI, String mail, Membresia membresia) {
        super(fecha_de_nacimiento, nombre, DNI);
        this.mail =  mail;
        this.membresia = membresia;
        librosDescargados = new HashSet<>();
    }

    public HashSet<LibroElectronico> getLibrosDescargados() {
        return librosDescargados;
    }

    public void setLibrosDescargados(HashSet<LibroElectronico> librosDescargados) {
        this.librosDescargados = librosDescargados;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public void limiteCupo()throws MembresiaException{
        if (librosDescargados.size() == membresia.getLimiteLibros()){
            throw new MembresiaException("Limite de cupos alcanzado");
        }
    }

    public void descargarLibro(LibroElectronico libro){
        librosDescargados.add(libro);
    }

    public void quitarLibro(LibroElectronico libro){librosDescargados.remove(libro);}
}
