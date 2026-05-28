package tiendaPc;

import java.util.ArrayList;

public class Web {
    private ArrayList<Compra>compras;

    public Web(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public void actualizarStock(){
        //TODO: actualizar el stock de los productos comprados
    }

    public void calcularMasVendido(){
        //TODO: calcular componente mas vendido
    }

    public void mostrarDetalledeCompra(){
        //TODO: dada una compra mostrar el detalle de esta con subtotal, recargo(si tiene) y total
    }
}
