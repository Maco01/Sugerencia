/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Persona {
    private int idpersona;
    private String nombre;
    private String Area;
    private String Rol;
    private String AnosEnLaEmpresa;
    private String f_estado;

    public Persona(int idpersona, String nombre, String Area, String Rol, String AnosEnLaEmpresa, String f_estado) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.Area = Area;
        this.Rol = Rol;
        this.AnosEnLaEmpresa = AnosEnLaEmpresa;
        this.f_estado = f_estado;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getAnosEnLaEmpresa() {
        return AnosEnLaEmpresa;
    }

    public void setAnosEnLaEmpresa(String AnosEnLaEmpresa) {
        this.AnosEnLaEmpresa = AnosEnLaEmpresa;
    }

    public String getF_estado() {
        return f_estado;
    }

    public void setF_estado(String f_estado) {
        this.f_estado = f_estado;
    }

    

    

}
