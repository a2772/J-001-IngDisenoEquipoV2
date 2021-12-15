package clases;
public class Inventario {

    private int     idInventario;
    private int     cantidad;
    private String  descripcion;
    private CatProducto catProducto;
    private CatSeccion catSeccion;
    
    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
     * @return the catSeccion
     */
    public CatSeccion getCatSeccion() {
        return catSeccion;
    }

    /**
     * @param catSeccion the catSeccion to set
     */
    public void setCatSeccion(CatSeccion catSeccion) {
        this.catSeccion = catSeccion;
    }
    
}
