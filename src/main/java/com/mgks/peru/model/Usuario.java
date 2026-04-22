package com.mgks.peru.model;

public class Usuario {

    private String dni;
    private String nombre;
    private String email;
    private String rol;

    public Usuario() {
    }

    public Usuario(String dni, String nombre, String email, String rol) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.rol=rol;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
