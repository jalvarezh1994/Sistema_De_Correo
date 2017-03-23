/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.correo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistema.de.correo.Cuenta;

/**
 *
 * @author ofici
 */
public class AdminCuentas {

    File archivo;
    ArrayList<Cuenta> cuentas = new ArrayList();

    public AdminCuentas() {
    }

    public AdminCuentas(File archivo) {
        this.archivo = archivo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public void escribirArchivo() throws IOException {
        archivo.delete();
        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (Cuenta c : cuentas) {
                oos.writeObject(c);
            }
            oos.flush();

            oos.close();
            fos.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminCuentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leerArchivo() {
        cuentas.clear();
        Cuenta c;
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while ((c = (Cuenta) ois.readObject()) != null) {
                cuentas.add(c);
            }

        } catch (Exception e) {
        }
    }

}
