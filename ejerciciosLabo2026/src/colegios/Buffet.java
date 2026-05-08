package colegios;

import java.time.LocalDate;
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

    public void modificar(int valor, String nombre){
        for (Plato p1 : menu){
            if(p1.getNombre().equals(nombre)){
                p1.setPrecio(valor);
            }
        }

    }

    public void eliminar (Plato plato){
        menu.remove(plato);
    }

    public void extraerListado(LocalDate fecha){

        System.out.println("Pedidos del dia:" + fecha.getDayOfMonth() + "/" + fecha.getMonth());

        for(Pedido p1 : pedidos){
            if (p1.getFechaCreacion().equals(fecha)){
                System.out.println("Plato:" + p1.getPlato().getNombre()+ "Precio:" + p1.precioDescuento());

            }
        }
    }

    // Falta poder marcar a un pedidio como entregado y listar pedidos pendientes de entrega
    // Y realizar un top 3 de los platos mas pedidos.

}

