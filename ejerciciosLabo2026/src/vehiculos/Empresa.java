package vehiculos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Vehiculo>Lista;

    public Empresa() {
        Lista = new ArrayList<>();
    }

    public ArrayList<Vehiculo> getLista() {
        return Lista;
    }

    public void setLista(ArrayList<Vehiculo> lista) {
        Lista = lista;
    }

public void agregarVehiculo(Vehiculo vehiculo){
        boolean esIgual= false;

        if (Lista.isEmpty()){
        Lista.add(vehiculo);}

        else if (vehiculo.getClass() == Bicicleta.class){
            Lista.add(vehiculo);
        }

        else {

        for (Vehiculo v1 : Lista) {

                if (v1.getPatente().equals(vehiculo.getPatente())){
                        esIgual = true;
                        break;
                }
        }

        if (!esIgual){
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

public void cargarCamioneta(int carga, String camioneta){

    for (Vehiculo v1 : Lista) {

        if (v1.getClass() == Camioneta.class) {
            if (v1.getPatente().equals(camioneta)){
                if (((Camioneta) v1).getCapacidad() > carga){
                    ((Camioneta) v1).setCapacidad(((Camioneta) v1).getCapacidad()-carga);
                }
            }
        }

    }



}

public int cantDescapotable(){

  int cont = 0;

  for (Vehiculo v1 : Lista) {
        if (v1.getClass()== Coche.class){
            if (((Coche) v1).isDescapotable())
                cont+=1;
            }
  }

  return cont;
  }




public static void main(String[] args) {

    Camioneta camion = new Camioneta("Toyota","Hilux","Rojo",4, LocalDate.of(1999,10,10),"HJK-192",100);
    Coche auto = new Coche("Porsche","Cayenne","Negro",4,LocalDate.of(2020,10,1),"AF-123-KD",false);
    Coche auto1 = new Coche("Porsche","Cayenne","Negro",4,LocalDate.of(2020,10,1),"AF-123-KD",false);
    Coche auto2 = new Coche("Porsche","Cayenne","Gris",4,LocalDate.of(2022,10,4),"FA-432-HA",true);
    Bicicleta bicicleta = new Bicicleta("BMX","freestyle","Azul",2,LocalDate.of(2026,1,1));

    Empresa empresa = new Empresa();

    empresa.agregarVehiculo(camion);
    empresa.agregarVehiculo(auto);
    empresa.agregarVehiculo(auto1);
    empresa.agregarVehiculo(auto2);
    empresa.agregarVehiculo(bicicleta);

    System.out.println("Mas vehiculos en la empresa:" + empresa.masTipo() );
    empresa.cargarCamioneta(150,"HJK-192");
    System.out.println("Cantidad de descapotables:" + empresa.cantDescapotable());

}

}
