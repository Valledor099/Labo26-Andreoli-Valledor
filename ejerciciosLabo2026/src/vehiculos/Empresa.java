package vehiculos;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Vehiculo>Lista;

    public Empresa(ArrayList<Vehiculo> lista) {
        Lista = lista;
    }

    public ArrayList<Vehiculo> getLista() {
        return Lista;
    }

    public void setLista(ArrayList<Vehiculo> lista) {
        Lista = lista;
    }

public void agregarVehiculo(Vehiculo vehiculo){

        for (Vehiculo v1 : Lista) {

            if (v1.getClass() == Coche.class){
                if (!vehiculo.getPatente().equals(v1.getPatente())){
                    Lista.add(vehiculo);
                }
            }

            else if (v1.getClass() == Camioneta.class) {
                if (!vehiculo.getPatente().equals(v1.getPatente())){
                    Lista.add(vehiculo);
                }
            }

            else{
                Lista.add(vehiculo);
            }
        }


}

public String masTipo(){
        String tipo = "";
        int cam=0, aut=0, bici=0;

        for (Vehiculo vehiculo : Lista){
            if (vehiculo.getClass() == Coche.class){
                aut+=1;
            }

            else if (vehiculo.getClass() == Camioneta.class) {
                cam+=1;
            }

            else{
                bici+=1;
            }
        }

        if (aut>cam && aut>bici){
            tipo= "auto";
        }

        else if (cam>aut && cam>bici){
            tipo= "camioneta";
        }

        else if (bici>aut && bici>cam) {
            tipo="bicicleta";
        }

    return tipo;
}

public void cargarCamioneta(int carga, int camioneta){

}
}
