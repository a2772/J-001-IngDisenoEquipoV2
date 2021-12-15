package clases;

import java.time.LocalDate;

public class Personal {
    private int     idPersonal;
    private String  nombre;
    private String  apPat;
    private String  apMat;
    private String  curp;
    private String  tel;
    private LocalDate  fechaNac;
    private String  correo;
    private CatPerfil catPerfil;
    private CatSexo catSexo;
    
    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPat() {
        return apPat;
    }

    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    public String getApMat() {
        return apMat;
    }

    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public CatPerfil getCatPerfil() {
        return catPerfil;
    }
    
    public void setCatPerfil(CatPerfil catPerfil) {
        this.catPerfil = catPerfil;
    }
    
    public CatSexo getCatSexo() {
        return catSexo;
    }
    
    public void setCatSexo(CatSexo catSexo) {
        this.catSexo = catSexo;
    }
    
}
