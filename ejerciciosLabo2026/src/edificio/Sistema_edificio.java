package edificio;

import control_peso_altura.Sistema_Control;
import excepciones_1.StringNull;

import java.time.Year;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema_edificio {
    private ArrayList<Sensor> sensores;

    public Sistema_edificio() {
        this.sensores = new ArrayList<>();
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }

    public void agregar(Sensor sensor){
        sensores.add(sensor);
    }

    public void recorrerSensor(){
        for (Sensor sensor : sensores){
            evaluar(sensor);
        }
    }

    public String obtenerMasInfo(int numero) throws IndexOutOfBoundsException {
        if(numero > sensores.size()){
            throw new IndexOutOfBoundsException(numero);
        }

        return sensores.get(numero).toString();
    }

    public void evaluar(Sensor sensor){
        if(sensor.getValor_umbral() < sensor.valor() && sensor.isEstado() ){
            sensor.dispararAlarma();
        }

    }

    public void agregarSensor(Sensor sensor){
        sensores.add(sensor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Sistema_edificio edificio = new Sistema_edificio();
        Presion sen1 = new Presion(true,10.5f, Year.of(2000));
        Detector_humo sen2 = new Detector_humo(false,40,Year.of(2000),30.f);

        edificio.agregar(sen1);
        edificio.agregar(sen2);

        System.out.println("Ingrese un numero de sensor: ");
        int n;
        boolean error;

        do {
            error = false;
            try {
                n = scanner.nextInt();
                System.out.println(edificio.obtenerMasInfo(n));
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un numero entero");
                scanner.next();
                error = true;
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("Numero no encontrado");
                error = true;
            }

        }while (error);




    }

}
