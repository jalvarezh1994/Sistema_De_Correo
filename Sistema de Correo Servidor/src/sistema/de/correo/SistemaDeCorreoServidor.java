/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.correo;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ofici
 */
public class SistemaDeCorreoServidor {

    public static ArregloCuentas arrCuentas = new ArregloCuentas();
    public static ArregloClientes arrClientes = new ArregloClientes();
    public static File archivo = new File("./Cuentas.sdc");
    public static AdminCuentas admCuentas = new AdminCuentas(archivo);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        admCuentas.leerArchivo();
        arrCuentas.setCuentas(admCuentas.getCuentas());
        ServerSocket soServer = new ServerSocket(1234);
        do {
            System.out.println("Esperando cliente");
            Socket soCliente = soServer.accept();
            System.out.println("Se conectó un cliente");
            Cliente c = new Cliente(soCliente);
            c.setArrCuentas(arrCuentas);
            c.setArrClientes(arrClientes);
            arrClientes.getClientes().add(c);
            arrClientes.getClientes().get(arrClientes.getClientes().size() - 1).start();
        } while (true);
    }

}
