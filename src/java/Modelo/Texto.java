/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Texto {
    private int idtexto;
    private String Descripcion;
    private String TipoDeTexto;
    private String DiaDeEmision;
    private String Destinatario;
    private String estado;

    public Texto(int idtexto, String Descripcion, String TipoDeTexto, String DiaDeEmision, String Destinatario, String estado) {
        this.idtexto = idtexto;
        this.Descripcion = Descripcion;
        this.TipoDeTexto = TipoDeTexto;
        this.DiaDeEmision = DiaDeEmision;
        this.Destinatario = Destinatario;
        this.estado = estado;
    }

    public int getIdtexto() {
        return idtexto;
    }

    public void setIdtexto(int idtexto) {
        this.idtexto = idtexto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTipoDeTexto() {
        return TipoDeTexto;
    }

    public void setTipoDeTexto(String TipoDeTexto) {
        this.TipoDeTexto = TipoDeTexto;
    }

    public String getDiaDeEmision() {
        return DiaDeEmision;
    }

    public void setDiaDeEmision(String DiaDeEmision) {
        this.DiaDeEmision = DiaDeEmision;
    }

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
