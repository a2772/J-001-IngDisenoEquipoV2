package clases;
public class CatHorario {

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public int getIdDiaInicio() {
        return idDiaInicio;
    }

    public void setIdDiaInicio(int idDiaInicio) {
        this.idDiaInicio = idDiaInicio;
    }

    public int getIdDiaFin() {
        return idDiaFin;
    }

    public void setIdDiaFin(int idDiaFin) {
        this.idDiaFin = idDiaFin;
    }
    private int     idHorario;
    private String  horaInicio;
    private String  horaFin;
    private int     idDiaInicio;
    private int     idDiaFin;
}
