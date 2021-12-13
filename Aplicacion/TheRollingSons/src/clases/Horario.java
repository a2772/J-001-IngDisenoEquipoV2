package clases;
public class Horario {
    private int idHorario;
    private Personal personal;
    private CatHorario catHorario;

    public int getIdHorario() {
        return idHorario;
    }
    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }
    public Personal getPersonal() {
        return personal;
    }
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
    public CatHorario getCatHorario() {
        return catHorario;
    }
    public void setCatHorario(CatHorario catHorario) {
        this.catHorario = catHorario;
    }
}
