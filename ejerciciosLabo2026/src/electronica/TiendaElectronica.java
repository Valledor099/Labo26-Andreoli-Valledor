package electronica;

import java.util.ArrayList;
import electronica.cargadores.cargaPortatil;
import electronica.multimedia.Sonido;
import electronica.multimedia.Tecnologia;
import electronica.multimedia.Televisor;

public class TiendaElectronica {
    private ArrayList<Producto>productos;

    public TiendaElectronica(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto){
       if (!productos.contains(producto)){
        productos.add(producto);
       }
       else {
           System.out.println("Ese producto ya esta");
       }
    }

    public void modificarProducto(Producto producto, Float precio){
        if (productos.contains(producto)){
            producto.setPrecio(precio);
        }

    }

    public void eliminarProducto(Producto producto){
        productos.remove(producto);
    }

    public Producto mayorStock(){
        Producto mayor = productos.getFirst();
        int mas = productos.getFirst().getStock();

        for (int i = 1 ; i<productos.size(); i++){
            if (productos.get(i).getStock() > mas){
                mayor = productos.get(i);
                mas = productos.get(i).getStock();
            }
        }

        return mayor;
    }

    public Producto menorStock(){
        Producto menor = productos.getFirst();
        int menos = productos.getFirst().getStock();

        for (int i = 1 ; i<productos.size(); i++){
            if (productos.get(i).getStock() < menos){
                menor = productos.get(i);
                menos = productos.get(i).getStock();
            }
        }

        return menor;
    }

    public void productosSeccion(Seccion seccion){
        System.out.println("Productos de: " + seccion.name());

        for (Producto producto : productos){
            if (producto.getSeccion().equals(seccion)){
                System.out.println(producto.detalle());
            }
        }
    }

    public static void main(String[] args) {
        TiendaElectronica tienda = new TiendaElectronica(new ArrayList<>());

        Producto p1 = new cargaPortatil("Cable USB", 15.5f, Seccion.CARGADORES, 50,3);
        Producto p2 = new cargaPortatil("Power Bank 10k", 99.99f, Seccion.CARGADORES, 20, 3);
        Producto p3 = new Sonido("Parlante BT", 45.0f, Seccion.MULTIMEDIA, 10, true);
        Producto p4 = new Televisor("Smart TV 55", 550.0f, Seccion.MULTIMEDIA, 5, Tecnologia.CUATROK, 3840);

        tienda.agregarProducto(p1);
        tienda.agregarProducto(p2);
        tienda.agregarProducto(p3);
        tienda.agregarProducto(p4);
        tienda.agregarProducto(p1);


        System.out.println("Precio anterior de " + p1.getNombre() + ": " + p1.getPrecio());
        tienda.modificarProducto(p1, 12.0f);
        System.out.println("Precio nuevo: " + p1.getPrecio());

        System.out.println("\n=== MAYOR Y MENOR STOCK ===");
        System.out.println("Mayor stock: " + tienda.mayorStock().detalle());
        System.out.println("Menor stock: " + tienda.menorStock().detalle());

        System.out.println("\n=== PRODUCTOS POR SECCION ===");
        System.out.println("--- MULTIMEDIA ---");
        tienda.productosSeccion(Seccion.MULTIMEDIA);
        System.out.println("--- CARGADORES ---");
        tienda.productosSeccion(Seccion.CARGADORES);

        System.out.println("\n=== ELIMINAR PRODUCTO ===");
        tienda.eliminarProducto(p3);
        System.out.println("Productos despues de eliminar: " + tienda.getProductos().size());
    }
}
