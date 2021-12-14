package clases.util;

import clases.CatProducto;

public class Articulo {
    private int cantidad;
    private CatProducto catProducto;

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the catProducto
     */
    public CatProducto getCatProducto() {
        return catProducto;
    }

    /**
     * @param catProducto the catProducto to set
     */
    public void setCatProducto(CatProducto catProducto) {
        this.catProducto = catProducto;
    }
    
}
