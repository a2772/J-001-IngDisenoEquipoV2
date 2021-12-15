package clases.util;

import clases.Venta;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Articulo> lArticulo;
    private Venta venta;//Se usa una vez se concreta la venta
    public Carrito(){
        lArticulo = new ArrayList<>();
    }
    
    public List<Articulo> getlArticulo() {
        return lArticulo;
    }
    
    public void setlArticulo(List<Articulo> lArticulo) {
        this.lArticulo = lArticulo;
    }
    
    public void pushArticulo(Articulo articulo){
        this.getlArticulo().add(articulo);
    }
    
    public Venta getVenta() {
        return venta;
    }
    
    public void setVenta(Venta venta) {
        this.venta = venta;
    }
}
