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

/**
 *
 * @author ofici
 */
public class AdminCorreos {

    File archivo;
    ArrayList<Correo> correos = new ArrayList();

    public AdminCorreos() {
    }

    public AdminCorreos(File archivo) {
        this.archivo = archivo;
    }
    private static final Logger LOG = Logger.getLogger(AdminCorreos.class.getName());

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Correo> getCorreos() {
        return correos;
    }

    public void setCorreos(ArrayList<Correo> correos) {
        this.correos = correos;
    }

    public void escribirArchivo() throws IOException {
        archivo.delete();
        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (Correo c : correos) {
                oos.writeObject(c);
            }
            oos.flush();

            oos.close();
            fos.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminCorreos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leerArchivo() {
        correos.clear();
        Correo c;
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while ((c=(Correo)ois.readObject())!=null) {
                correos.add(c);
            }

        } catch (Exception e) {
        }
    }

}