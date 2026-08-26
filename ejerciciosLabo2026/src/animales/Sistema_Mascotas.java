package animales;

import java.util.ArrayList;

public class Sistema_Mascotas {
    private ArrayList <Mascota> mascotaAsociadas;

    public Sistema_Mascotas() {
        mascotaAsociadas = new ArrayList<>();
    }

    public void eliminar(Mascota mascota){
        mascotaAsociadas.remove(mascota);
    }

    public void modificar(Mascota mascota_sin_modificar, Mascota mascota_nueva){
        mascotaAsociadas.set(mascotaAsociadas.indexOf(mascota_sin_modificar),mascota_nueva);
    }

    public String saludar(String nombre_usuario, String nombre_mascota){
        String saludo = null;
        Mascota mascota = obtenerMascota(nombre_mascota);

        if (mascota == null) {
            saludo = "Esa mascota no se encontro";
        }

        else {
            if (mascota instanceof Pez) {
                vidaPez(nombre_usuario, (Pez) mascota);

            }


            if (mascota.esDuenio(nombre_usuario)) {
            saludo = mascota.saludar();
            }

            else if (!(mascota instanceof Pajaro)) {
                saludo = mascota.saludar().toUpperCase() + "!";
            }
            saludo = repetirSaludo_Alegria(saludo, mascota);
        }
        return saludo;
    }

    public String repetirSaludo_Alegria(String saludo, Mascota mascota){
        String saludo_inicial = saludo;

        if (mascota.getFelicidad() > 0){
        for (int i = 0; i < mascota.getFelicidad() ; i++){
            saludo = saludo + " " + saludo_inicial;
        }
        }

        mascota.bajarFelicidad();

        return saludo;
    }

    public void vidaPez(String nombreUsuario, Pez pez){
        if (pez.esDuenio(nombreUsuario)){
            pez.restarVida();
        }
        else {
            pez.morir();
        }

        comprobarVidas(pez);
    }

    public void comprobarVidas(Pez pez){
            if (pez.getVidas() <= 0){
                eliminar(pez);
            }

        }

    public Mascota obtenerMascota(String nombre_mascota){
        for (Mascota mascota : mascotaAsociadas)
        {
            if (mascota.getNombre().equals(nombre_mascota))
            {
                return mascota;
            }
        }
        return null;
    }

    public Mascota alta(String nombreMascota, Duenio duenio, Tipo_Mascota tipoMascota,Boolean cantor ,String canto) {
        if (obtenerMascota(nombreMascota) != null) {
            System.out.println("Ya existe una mascota con ese nombre");
            return null;
        }

        Mascota mascota = crearMascota(nombreMascota, duenio, tipoMascota, cantor,canto);
        mascotaAsociadas.add(mascota);
        return mascota;
    }

    private Mascota crearMascota(String nombreMascota, Duenio duenio, Tipo_Mascota tipoMascota, Boolean cantor,String canto) {
        return switch (tipoMascota) {
            case PERRO -> new Perro(nombreMascota, duenio);
            case GATO -> new Gato(nombreMascota, duenio);
            case PAJARO -> new Pajaro(nombreMascota, duenio,cantor,canto);
            case PEZ -> new Pez(nombreMascota, duenio);
        };
    }

    public static void main(String[] args) {
        Sistema_Mascotas sistemaMascotas = new Sistema_Mascotas();
        Mascota perro = sistemaMascotas.alta("Paco", new Duenio("Agustin", "Valledor"), Tipo_Mascota.PERRO, null,null);
        Mascota gato = sistemaMascotas.alta("Fenix", new Duenio("aaa", "bbb"),Tipo_Mascota.GATO,null,null);
        Mascota pajaro1 = sistemaMascotas.alta("cocoLoco", new Duenio("yyy", "ksa"),Tipo_Mascota.PAJARO,false,null);
        Mascota pajaro2 = sistemaMascotas.alta("piquito", new Duenio("ccc","ddd"),Tipo_Mascota.PAJARO,true,"lalala");
        Mascota pez = sistemaMascotas.alta("dory", new Duenio("hhh","jjj"),Tipo_Mascota.PEZ,null,null);

        System.out.println(perro.saludar());
        System.out.println(gato.saludar());
        System.out.println(pajaro1.saludar());
        System.out.println(pajaro2.saludar());




        sistemaMascotas.modificar(gato, new Gato("blabla",new Duenio("lala","lala")));

        System.out.println(sistemaMascotas.saludar("Agustin","Paco"));
        System.out.println(sistemaMascotas.saludar("lala","Paco"));

        System.out.println(sistemaMascotas.saludar("hhh","dory"));
        Pez pez1 = (Pez) pez;
        System.out.println(pez1.getVidas());
        pez1.alimentar();
        System.out.println(pez1.getVidas());

        System.out.println(sistemaMascotas.saludar("lala","dory"));
        System.out.println(pez1.getVidas());

        perro.alimentar();
        System.out.println(sistemaMascotas.saludar("Agustin","Paco"));
        System.out.println(sistemaMascotas.saludar("Agustin","Paco"));
    }
}
