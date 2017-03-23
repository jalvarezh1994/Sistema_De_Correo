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
public class ArregloClientes {

    ArrayList<Cliente> Clientes = new ArrayList();

    public ArregloClientes() {
    }

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(ArrayList<Cliente> Clientes) {
        this.Clientes = Clientes;
    }

}
