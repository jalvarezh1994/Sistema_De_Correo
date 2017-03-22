/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.correo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ofici
 */
public class Mensaje {

    int Id;
    String Texto, Emisor;
    Date Fecha = new Date();
    ArrayList<String> Participantes=new ArrayList();
    
    public Mensaje() {
    }

    public Mensaje(int Id, String Texto) {
        this.Id = Id;
        this.Texto = Texto;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    @Override
    public String toString() {
        return "" + Emisor + " " + Fecha + ": "+Texto;
    }

}
