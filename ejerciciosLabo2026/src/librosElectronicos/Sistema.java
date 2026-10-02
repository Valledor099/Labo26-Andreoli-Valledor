package librosElectronicos;

import tiendaPc.Cliente;

import java.time.LocalDate;
import java.util.HashSet;

public class Sistema {
    private HashSet<LibroElectronico> libros;
    private HashSet<Usuario> usuarios;

    public Sistema() {
        libros= new HashSet<>();
        usuarios = new HashSet<>();
    }

    public HashSet<LibroElectronico> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<LibroElectronico> libros) {
        this.libros = libros;
    }

    public HashSet<Usuario> getUsuario() {
        return usuarios;
    }

    public void setUsuario(HashSet<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Usuario registrarUsuario(String nombre, LocalDate fecha_nacimiento, String DNI, String mail, Membresia membresia){
        Usuario usuario = new Usuario(fecha_nacimiento,nombre,DNI,mail,membresia);
        usuarios.add(usuario);
        return usuario;
    }

    public void agregarLibro(LibroElectronico libro){
        libros.add(libro);
    }

    public void eliminarLibro(LibroElectronico libro){
        libros.remove(libro);
    }

    public void modificarLibro(LibroElectronico libroV, LibroElectronico libroN){
        libros.remove(libroV);
        libros.add(libroN);
    }

    public void gestionarPrestamo(Usuario usuario, LibroElectronico libroElectronico){
        try {
            libroElectronico.limiteDescargas();
            usuario.limiteCupo();
            usuario.descargarLibro(libroElectronico);
            libroElectronico.sumarDescarga();
        } catch (LimiteDePrestamosException | MembresiaException e) {
            System.out.println(e.getMessage());
        }
    }

    public void devolucionLibro(Usuario usuario, LibroElectronico libro){
        usuario.quitarLibro(libro);
        libro.restarDescarga();
    }


    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Autor autor = new Autor(LocalDate.now(),"aaa","3842978941");
        LibroElectronico libro = new LibroElectronico("La divina comedia",autor,Genero.AVENTURA,"ajksad");
        LibroElectronico libro1 = new LibroElectronico("fasdas",autor,Genero.AVENTURA,"ajksad");
        LibroElectronico libro2 = new LibroElectronico("gafasds",autor,Genero.AVENTURA,"ajksad");
        LibroElectronico libro3 = new LibroElectronico("zdxasdasdw",autor,Genero.AVENTURA,"ajksad");
        LibroElectronico libro4 = new LibroElectronico("dksamdzxd",autor,Genero.AVENTURA,"ajksad");
        LibroElectronico libro5 = new LibroElectronico("dasdasg",autor,Genero.AVENTURA,"ajksad");


        Usuario usuario = sistema.registrarUsuario("bbb",LocalDate.now(),"5238940","asdas@gmail.com",Membresia.BRONCE);
        sistema.agregarLibro(libro);
        sistema.agregarLibro(libro2);
        sistema.agregarLibro(libro1);
        sistema.agregarLibro(libro3);
        sistema.agregarLibro(libro4);
        sistema.agregarLibro(libro5);

        libro.setDescargasActuales(145);

        sistema.gestionarPrestamo(usuario,libro);

        libro.setDescargasActuales(0);

        sistema.gestionarPrestamo(usuario,libro1);
        sistema.gestionarPrestamo(usuario,libro2);
        sistema.gestionarPrestamo(usuario,libro3);
        sistema.gestionarPrestamo(usuario,libro4);
        sistema.gestionarPrestamo(usuario,libro);
        sistema.gestionarPrestamo(usuario,libro5);

        System.out.println(usuario.getLibrosDescargados());
    }



}
