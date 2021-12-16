package clases;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Venta {
    private int idVenta;
    private float iva;
    private float total;
    private LocalDateTime fecha;
    private Personal personal;
    
    public int getIdVenta() {
        return idVenta;
    }
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
    public float getIva() {
        return iva;
    }
    public void setIva(float iva) {
        this.iva = iva;
    }
    public float getTotal() {
        return total;
    }
    public void setTotal(float total) {
        this.total = total;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public Personal getPersonal() {
        return personal;
    }
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
    
}
