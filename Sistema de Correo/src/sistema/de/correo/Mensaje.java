/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.correo;

import java.util.Date;

/**
 *
 * @author ofici
 */
public class Mensaje {

    private Date Fecha = new Date();
    private Date Texto;

    public Mensaje() {
    }

    public Mensaje(Date Texto) {
        this.Texto = Texto;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Date getTexto() {
        return Texto;
    }

    public void setTexto(Date Texto) {
        this.Texto = Texto;
    }

    @Override
    public String toString() {
        return "Fecha=" + Fecha + "| Texto=" + Texto;
    }

}
