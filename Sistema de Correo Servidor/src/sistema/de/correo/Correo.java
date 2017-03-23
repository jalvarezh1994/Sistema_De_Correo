/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.correo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ofici
 */
public class Correo implements Serializable {

    private String Contenido;
    private String Remitente;
    private String Destinatario;
    private String Asunto;
    private Boolean Leido;
    private ArrayList ArchivosAdjuntos = new ArrayList();

    public Correo() {
    }

    public Correo(String Remitente, String Destinatario, Boolean Leido) {
        this.Remitente = Remitente;
        this.Destinatario = Destinatario;
        this.Leido = Leido;
    }

    public String getRemitente() {
        return Remitente;
    }

    public void setRemitente(String Remitente) {
        this.Remitente = Remitente;
    }

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }

    public Boolean getLeido() {
        return Leido;
    }

    public void setLeido(Boolean Leido) {
        this.Leido = Leido;
    }

    public ArrayList getArchivosAdjuntos() {
        return ArchivosAdjuntos;
    }

    public void setArchivosAdjuntos(ArrayList ArchivosAdjuntos) {
        this.ArchivosAdjuntos = ArchivosAdjuntos;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    @Override
    public String toString() {
        return Asunto + " | " + Remitente;
    }

}
