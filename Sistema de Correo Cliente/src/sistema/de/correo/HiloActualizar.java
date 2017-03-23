/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.correo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ofici
 */
public class HiloActualizar extends Thread {

    private Socket so;
    private ArrayList<Cuenta> Cuentas;

    @Override
    public void run() {
        do {
            try {
                ObjectInputStream oos = new ObjectInputStream(so.getInputStream());
                Object o = oos.readObject();
                Cuentas = (ArrayList<Cuenta>) o;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } while (true);
    }

    public HiloActualizar() {
    }

    public HiloActualizar(Socket so) {
        this.so = so;
    }

    public Socket getSo() {
        return so;
    }

    public void setSo(Socket so) {
        this.so = so;
    }

    public ArrayList<Cuenta> getCuentas() {
        return Cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> Cuentas) {
        this.Cuentas = Cuentas;
    }

}
