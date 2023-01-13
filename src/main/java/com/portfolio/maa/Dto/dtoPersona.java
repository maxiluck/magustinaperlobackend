/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.maa.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author magus
 */
public class dtoPersona {
         
    @NotBlank
    private String nombre;
      @NotBlank
    private String apellido;
        @NotBlank
    private String Descripcion;
          @NotBlank
    private String img;

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String Descripcion, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Descripcion = Descripcion;
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
          
}
