package org.example.ejercicioclasejavafx;

public class Equipo {
    private int id;
    private String nombre;
    private String fecha;
    private String estado;

    public Equipo() {
    }

    public Equipo(int id, String nombre, String fecha, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}