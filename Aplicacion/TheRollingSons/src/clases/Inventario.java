package clases;
public class Inventario {

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

    public int getIdCProducto() {
        return idCProducto;
    }

    public void setIdCProducto(int idCProducto) {
        this.idCProducto = idCProducto;
    }

    public int getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(int idSeccion) {
        this.idSeccion = idSeccion;
    }
    private int     idInventario;
    private int     cantidad;
    private String  descripcion;
    private int     idCProducto;
    private int     idSeccion;
    
}
