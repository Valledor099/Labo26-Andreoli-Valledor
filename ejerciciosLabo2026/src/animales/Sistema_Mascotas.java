package animales;

import java.util.ArrayList;

public class Sistema_Mascotas {
    private ArrayList <Mascotas> mascotasAsociadas;


    /*TODO agregar,modificar y eliminar*/


    public void eliminar(Mascotas mascota){
        mascotasAsociadas.remove(mascota);
    }

    public void modificar(Mascotas mascota_sin_modificar, Mascotas mascota_nueva){
        mascotasAsociadas.set(mascotasAsociadas.indexOf(mascota_sin_modificar),mascota_nueva);
    }

    public String saludar(String nombre_usuario, String nombre_mascota){
        Mascotas mascota = obtenerMascota();

        if (esDueño()){

        }
    }




    private Boolean existe(Mascotas mascota){

        for (Mascotas mascotasAsociada : mascotasAsociadas) {
            if (mascota.getNombre().equals(mascotasAsociada.getNombre())) {
                return true;
            }
        }
        return false;
    }

    public void alta(String nombre_mascota, Duenio duenio, Tipo_Mascota tipo_mascota, String canto){
        Mascotas mascota = null;

        switch (tipo_mascota){
            case PERRO:
                mascota = new Perro(nombre_mascota,duenio);
                break;
            case GATO:
                mascota = new Gato(nombre_mascota, duenio);
            case PAJARO_CANTOR:
                mascota = new Pajaro_Cantor(nombre_mascota, duenio, canto);
            case PAJARO_NO_CANTOR:
                mascota = new Pajaro_No_Cantor(nombre_mascota,duenio);
        }

        mascotasAsociadas.add(mascota);

    }
}
