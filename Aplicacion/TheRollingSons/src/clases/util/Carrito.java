package clases.util;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Articulo> lArticulo;
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
        this.lArticulo.add(articulo);
    }
}
