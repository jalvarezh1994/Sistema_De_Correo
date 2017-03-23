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
public class ArregloCuentas {

    public ArrayList<Cuenta> Cuentas = new ArrayList();

    public ArregloCuentas() {
    }

    public ArrayList<Cuenta> getCuentas() {
        return Cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> Cuentas) {
        this.Cuentas = Cuentas;
    }

}
