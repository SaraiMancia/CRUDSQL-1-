package com.fjar.app_crudsqlite;

import java.io.Serializable;

public class Dtocat implements Serializable {

    private int idCategoria;
    private String nombrecategoria;
    private int estadocategoria;
    private String fecharegistro;

    public Dtocat() {
    }

    public Dtocat(int idCategoria, String nombrecategoria, int estadocategoria, String fecharegistro) {
        this.idCategoria = idCategoria;
        this.nombrecategoria = nombrecategoria;
        this.estadocategoria = estadocategoria;
        this.fecharegistro = fecharegistro;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombrecategoria() {
        return nombrecategoria;
    }

    public void setNombrecategoria(String nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }

    public int getEstadocategoria() {
        return estadocategoria;
    }

    public void setEstadocategoria(int estadocategoria) {
        this.estadocategoria = estadocategoria;
    }

    public String getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(String fecharegistro) {

        this.fecharegistro = fecharegistro;
    }



}
