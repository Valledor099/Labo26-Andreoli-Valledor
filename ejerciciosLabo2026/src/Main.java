import excepciones_1.StringNull;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int obtenerLongitud(String nombre)throws StringNull {
    if (nombre == null) throw new StringNull("el string es nulo");
    return nombre.length();
    }

    public static void main(String[] args) {
        Main m = new Main();
        String nombre = null;

        try {
            System.out.println(m.obtenerLongitud(nombre));
        } catch(StringNull e){
            System.out.println(e.getMessage());
        }

    }







}