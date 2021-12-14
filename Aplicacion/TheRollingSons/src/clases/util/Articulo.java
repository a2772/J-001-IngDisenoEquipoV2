package clases.util;

import clases.CatProducto;
import clases.Inventario;
import clases.ProductoVenta;

public class Articulo {
    private int cantidad; //Cantidad de compra
    private CatProducto catProducto;
    private Inventario inventario;//Contiene cantidades disponibles
    private ProductoVenta productoVenta;//Contiene un registro de cómo fue vendido

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

    /**
     * @return the inventario
     */
    public Inventario getInventario() {
        return inventario;
    }

    /**
     * @param inventario the inventario to set
     */
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    /**
     * @return the productoVenta
     */
    public ProductoVenta getProductoVenta() {
        return productoVenta;
    }

    /**
     * @param productoVenta the productoVenta to set
     */
    public void setProductoVenta(ProductoVenta productoVenta) {
        this.productoVenta = productoVenta;
    }
    
}
