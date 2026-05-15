package colegios;

import humanos.Persona;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Buffet {
    private ArrayList<Plato> menu;
    private ArrayList<Pedido> pedidos;

    public Buffet() {
        this.menu = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public ArrayList<Plato> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Plato> menu) {
        this.menu = menu;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void aniadir(Plato plato){
        if(menu.isEmpty()){
            menu.add(plato);
        }
        else if (!menu.contains(plato)) {
            menu.add(plato);
        }
    }

    public void modificar(int valor, Plato plato){
        if (menu.contains(plato)) {
            plato.setPrecio(valor);
        }
    }

    public void eliminar (Plato plato){
        menu.remove(plato);
    }

    public void extraerListado(LocalDate fecha){

        System.out.println("Pedidos del dia: " + fecha.getDayOfMonth() + "/" + fecha.getMonth());

        for(Pedido p1 : pedidos){
            if (p1.getFechaCreacion().equals(fecha)){
                System.out.println("Plato:" + p1.getPlato().getNombre()+ " Precio:" + p1.precioDescuento());

            }
        }
    }

    public Pedido crearPedido(LocalDate fechaCreacion, Plato plato, PersonaEducativa persona, LocalTime horaEntrega, boolean entregado) {
        Pedido pedido = new Pedido(fechaCreacion, plato, persona, horaEntrega, entregado);
        this.pedidos.add(pedido);
        return pedido;
    }

    public void entregaPedido(Pedido pedido){
        pedido.setEntregado(true);
    }

    public void pedidosPendientes(){
        for (Pedido pedido: pedidos){
            if (!pedido.isEntregado()){
                System.out.println(pedido.getPlato().getNombre() + " a " + pedido.getPersona().getNombre());
            }
        }
    }
    
    public void topPlatos(){

        int cont1=0,cont2=0,cont3=0;
        Plato top1=null,top2=null,top3=null;

        for(Plato plato: this.menu){
            int cont = 0;
            for (Pedido pedido: this.pedidos){
                if (pedido.getPlato().equals(plato)){
                    cont+=1;
                }
            }

            if (cont>cont1){
                cont3=cont2;
                top3=top2;

                cont2=cont1;
                top2=top1;

                cont1=cont;
                top1=plato;
            }
            else if(cont>cont2){
                cont3=cont2;
                top3=top2;

                cont2=cont;
                top2=plato;
            }
            else if(cont>cont3){
                cont3=cont;
                top3=plato;
            }
        }

      mostrarTop(top1,top2,top3,cont1,cont2,cont3);

    }

    public void mostrarTop(Plato top1, Plato top2, Plato top3, int cont1, int cont2, int cont3){
        System.out.println("Los platos mas pedidos son: ");
        if (top1!=null){
            System.out.println("1- " + top1.getNombre() + " : " + cont1 + " veces");
        }
        if (top2!=null){
            System.out.println("2- " + top2.getNombre() + " : " + cont2 + " veces");
        }
        if (top3!=null){
            System.out.println("3- " + top3.getNombre() + " : " + cont3 + " veces");
        }
    }

    public static void main(String[] args) {
        Buffet buffet = new Buffet();

        Plato plato1 = new Plato("Hamburguesa", 13000);
        Plato plato2 = new Plato("Milanesa Napolitana", 16000);
        Plato plato3 = new Plato("Cappelletti",5000);
        Plato plato4 = new Plato("Pancho", 8500);

        buffet.aniadir(plato1);
        buffet.aniadir(plato2);
        buffet.aniadir(plato3);
        buffet.aniadir(plato4);

        Alumno alumno1= new Alumno("alumno", "BBB", "A");
        Profesor profesor1 = new Profesor("profesor", "CCC", 30);

        Pedido pedido = buffet.crearPedido(LocalDate.now(),plato1,alumno1,LocalTime.now(),false);
        Pedido pedido1 = buffet.crearPedido(LocalDate.now(),plato1,profesor1,LocalTime.now(),false);

        buffet.extraerListado(LocalDate.now());

        buffet.modificar(100,plato2);
        buffet.eliminar(plato3);

        buffet.entregaPedido(pedido1);
        System.out.println("Pedidos pendientes:");
        buffet.pedidosPendientes();

        buffet.topPlatos();


}


}
