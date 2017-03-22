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
public class AdminMensajes {

    File archivo;
    ArrayList<Mensaje> mensajes = new ArrayList();

    public AdminMensajes() {
    }

    public AdminMensajes(File archivo) {
        this.archivo = archivo;
    }
    private static final Logger LOG = Logger.getLogger(AdminMensajes.class.getName());

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Mensaje> getmensajes() {
        return mensajes;
    }

    public void setmensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public void escribirArchivo() throws IOException {
        archivo.delete();
        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (Mensaje c : mensajes) {
                oos.writeObject(c);
            }
            oos.flush();

            oos.close();
            fos.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminMensajes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leerArchivo() {
        mensajes.clear();
        Mensaje c;
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while ((c=(Mensaje)ois.readObject())!=null) {
                mensajes.add(c);
            }

        } catch (Exception e) {
        }
    }

}