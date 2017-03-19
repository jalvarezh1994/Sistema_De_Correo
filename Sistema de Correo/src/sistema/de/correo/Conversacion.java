/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.correo;

import java.util.ArrayList;

/**
 *
 * @author ofici
 */
public class Conversacion {

    private ArrayList<Mensaje> Mensajes = new ArrayList();
    private Cuenta A, B;

    public Conversacion() {
    }

    public Conversacion(Cuenta A, Cuenta B) {
        this.A = A;
        this.B = B;
    }

    public ArrayList<Mensaje> getMensajes() {
        return Mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> Mensajes) {
        this.Mensajes = Mensajes;
    }

    public Cuenta getA() {
        return A;
    }

    public void setA(Cuenta A) {
        this.A = A;
    }

    public Cuenta getB() {
        return B;
    }

    public void setB(Cuenta B) {
        this.B = B;
    }

    @Override
    public String toString() {
        return "" + A + " | " + B;
    }

}
