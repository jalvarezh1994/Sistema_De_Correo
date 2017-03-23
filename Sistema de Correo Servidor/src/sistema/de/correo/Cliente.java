/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.correo;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ofici
 */
public class Cliente extends Thread {

    private static Socket so;
    private ArregloCuentas arrCuentas;
    private static ArrayList<Cliente> Clientes = new ArrayList();
    private static File arch = new File("./Cuentas.sdc");
    private static AdminCuentas admCuentas = new AdminCuentas(arch);

    @Override
    public void run() {
        try {
            ObjectOutputStream oos1 = new ObjectOutputStream(so.getOutputStream());
            oos1.writeObject(arrCuentas.getCuentas());
            oos1.flush();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        do {
            try {
                ObjectInputStream ois = new ObjectInputStream(so.getInputStream());
                Object o = ois.readObject();

                //Cuentas
                try {
                    Cuenta cu = (Cuenta) o;
                    arrCuentas.getCuentas().add(cu);
                    System.out.println("Se recibió una nueva cuenta");
                } catch (Exception e) {
                }

                //Correos
                try {
                    Correo co = (Correo) o;
                    for (Cuenta c : arrCuentas.getCuentas()) {
                        if (c.getUsuario().equalsIgnoreCase(co.getRemitente())) {
                            c.getBandejaDeEntrada().add(co);
                        }
                        if (c.getUsuario().equalsIgnoreCase(co.getDestinatario())) {
                            c.getSalida().add(co);
                        }
                    }
                    System.out.println("Se recibió un nuevo correo");
                } catch (Exception e) {
                }

                finalizar();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } while (true);
    }

    public void finalizar() {
        for (int i = 0; i < Clientes.size(); i++) {
            ObjectOutputStream oos = null;
            try {
                oos = new ObjectOutputStream(Clientes.get(i).getSo().getOutputStream());
                oos.writeObject(arrCuentas.getCuentas());
                oos.flush();
            } catch (IOException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        admCuentas.setCuentas(arrCuentas.getCuentas());
        try {
            admCuentas.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente() {
    }

    public Cliente(Socket so) {
        this.so = so;
    }

    public Socket getSo() {
        return so;
    }

    public void setSo(Socket so) {
        this.so = so;
    }

    public ArregloCuentas getArrCuentas() {
        return arrCuentas;
    }

    public void setArrCuentas(ArregloCuentas arrCuentas) {
        this.arrCuentas = arrCuentas;
    }

    public static File getArch() {
        return arch;
    }

    public static void setArch(File arch) {
        Cliente.arch = arch;
    }

    public static AdminCuentas getAdmCuentas() {
        return admCuentas;
    }

    public static void setAdmCuentas(AdminCuentas admCuentas) {
        Cliente.admCuentas = admCuentas;
    }

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(ArrayList<Cliente> Clientes) {
        this.Clientes = Clientes;
    }

}
