package clases;
public class CatProducto {
    private int idCProducto;
    private String producto;
    private String descripcionAlmacenar;
    private String descripcion;
    private float precio;
    private String color;
    private CatMarca catMarca;
    private CatCategoria catCategoria;

    public int getIdCProducto() {
        return idCProducto;
    }
    public void setIdCProducto(int idCProducto) {
        this.idCProducto = idCProducto;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public String getDescripcionAlmacenar() {
        return descripcionAlmacenar;
    }
    public void setDescripcionAlmacenar(String descripcionAlmacenar) {
        this.descripcionAlmacenar = descripcionAlmacenar;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public CatMarca getCatMarca() {
        return catMarca;
    }
    public void setCatMarca(CatMarca catMarca) {
        this.catMarca = catMarca;
    }
    public CatCategoria getCatCategoria() {
        return catCategoria;
    }
    public void setCatCategoria(CatCategoria catCategoria) {
        this.catCategoria = catCategoria;
    }    
}
