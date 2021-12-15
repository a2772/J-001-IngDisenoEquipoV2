package clases;

import java.time.LocalTime;

public class CatHorario {
    private int idHorario;
    private LocalTime  horaInicio;
    private LocalTime  horaFin;
    private CatDia catDiaIni;
    private CatDia catDiaFin;
    
    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public CatDia getCatDiaIni() {
        return catDiaIni;
    }

    public void setCatDiaIni(CatDia catDiaIni) {
        this.catDiaIni = catDiaIni;
    }

    public CatDia getCatDiaFin() {
        return catDiaFin;
    }

    public void setCatDiaFin(CatDia catDiaFin) {
        this.catDiaFin = catDiaFin;
    }
}
