package com.mgks.peru.model;

public class Asistencia {

    private int id;
    private String fecha;
    private String hora;
    private int usuarioDni;

    public Asistencia() {
    }

    public Asistencia(int id, String fecha, String hora, int usuarioDni) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.usuarioDni = usuarioDni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getUsuarioDni() {
        return usuarioDni;
    }

    public void setUsuarioDni(int usuarioDni) {
        this.usuarioDni = usuarioDni;
    }

}
