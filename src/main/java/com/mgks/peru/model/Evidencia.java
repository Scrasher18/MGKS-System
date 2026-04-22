
package com.mgks.peru.model;


public class Evidencia {
    private int id;
    private String descripcion;
    private String fecha;
    private int usuarioDni;

    public Evidencia() {
    }

    public Evidencia(int id, String descripcion, String fecha, int usuarioDni) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.usuarioDni = usuarioDni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getUsuarioDni() {
        return usuarioDni;
    }

    public void setUsuarioDni(int usuarioDni) {
        this.usuarioDni = usuarioDni;
    }

    

    
    
}
