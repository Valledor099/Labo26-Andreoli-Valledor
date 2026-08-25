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

    public void saludar(String nombre_usuario, String nombre_mascota){
        Mascota mascota = obtenerMascota(nombre_mascota);

        if (mascota == null) {
            System.out.println("Esa mascota no se encontro");
            return;
        }

        if (mascota instanceof Pez) {
            vidaPez(nombre_usuario, (Pez) mascota);
            return;
        }

        if (mascota.esDuenio(nombre_usuario)) {
            System.out.println(mascota.saludar());
        } else if (!(mascota instanceof Pajaro)) {
            System.out.println(mascota.saludar().toUpperCase() + "!");
        }
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


    public Mascota alta(String nombreMascota, Duenio duenio, Tipo_Mascota tipoMascota, String canto) {
        if (obtenerMascota(nombreMascota) != null) {
            System.out.println("Ya existe una mascota con ese nombre");
            return null;
        }

        Mascota mascota = crearMascota(nombreMascota, duenio, tipoMascota, canto);
        mascotaAsociadas.add(mascota);
        return mascota;
    }

    private Mascota crearMascota(String nombreMascota, Duenio duenio, Tipo_Mascota tipoMascota, String canto) {
        switch (tipoMascota) {
            case PERRO:
                return new Perro(nombreMascota, duenio);

            case GATO:
                return new Gato(nombreMascota, duenio);

            case PAJARO_CANTOR:
                return new Pajaro_Cantor(nombreMascota, duenio, canto);

            case PAJARO_NO_CANTOR:
                return new Pajaro_No_Cantor(nombreMascota, duenio);
            case PEZ:
                return new Pez(nombreMascota,duenio);

            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Sistema_Mascotas sistemaMascotas = new Sistema_Mascotas();
        Mascota perro = sistemaMascotas.alta("Paco", new Duenio("Agustin", "Valledor"), Tipo_Mascota.PERRO, null);
        Mascota gato = sistemaMascotas.alta("Fenix", new Duenio("aaa", "bbb"),Tipo_Mascota.GATO,null);
        Mascota pajaro1 = sistemaMascotas.alta("cocoLoco", new Duenio("yyy", "ksa"),Tipo_Mascota.PAJARO_NO_CANTOR,null);
        Mascota pajaro2 = sistemaMascotas.alta("piquito", new Duenio("ccc","ddd"),Tipo_Mascota.PAJARO_CANTOR,"lalala");
        Mascota pez = sistemaMascotas.alta("dory", new Duenio("hhh","jjj"),Tipo_Mascota.PEZ,null);

        System.out.println(perro.saludar());
        System.out.println(gato.saludar());
        System.out.println(pajaro1.saludar());
        System.out.println(pajaro2.saludar());




        sistemaMascotas.modificar(gato, new Gato("blabla",new Duenio("lala","lala")));

        sistemaMascotas.saludar("Agustin","Paco");
        sistemaMascotas.saludar("lala","Paco");

        sistemaMascotas.saludar("hhh","dory");
        Pez pez1 = (Pez) pez;
        System.out.println(pez1.getVidas());
        pez1.alimentar();
        System.out.println(pez1.getVidas());

        sistemaMascotas.saludar("lala","dory");
        pez1 = (Pez) pez;
        System.out.println(pez1.getVidas());

    }
}
