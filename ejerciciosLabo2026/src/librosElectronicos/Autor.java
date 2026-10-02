package librosElectronicos;

import humanos.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Autor extends Persona {
private HashSet<LibroElectronico>bibliografia;

    public Autor(LocalDate fecha_de_nacimiento, String nombre, String DNI) {
        super(fecha_de_nacimiento, nombre, DNI);
        bibliografia= new HashSet<>();
    }

    public HashSet<LibroElectronico> getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(HashSet<LibroElectronico> bibliografia) {
        this.bibliografia = bibliografia;
    }
}
