package clases;
public class ProductoVenta {
    private int idProductoVenta;
    private int cantidad;
    private float precio;
    private Venta venta;
    private CatProducto catProducto;

    public int getIdProductoVenta() {
        return idProductoVenta;
    }
    public void setIdProductoVenta(int idProductoVenta) {
        this.idProductoVenta = idProductoVenta;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public Venta getVenta() {
        return venta;
    }
    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    public CatProducto getCatProducto() {
        return catProducto;
    }
    public void setCatProducto(CatProducto catProducto) {
        this.catProducto = catProducto;
    } 
}
