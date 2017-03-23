/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.correo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ofici
 */
public class Cuenta implements Serializable {

    
    
    private String Usuario;
    private String Contrasena;
    private String Nombre;
    private String Pais;
    private int Edad;
    private String Sexo;
    private Date FechaDeCreacion;
    private Date UltimoAcceso;
    private ArrayList<String> Contactos = new ArrayList();
    private ArrayList<Date> Reuniones = new ArrayList();
    private ArrayList<Correo> BandejaDeEntrada = new ArrayList();
    private ArrayList<Correo> Salida = new ArrayList();
    private ArrayList<Correo> Spam = new ArrayList();
    private ArrayList<Correo> Papelera = new ArrayList();

    public Cuenta() {
        this.UltimoAcceso=new Date();
    }

    public Cuenta(String Usuario, String Contrasena, String Nombre, String Pais, int Edad, String Sexo, Date FechaDeCreacion, Date UltimoAcceso) {
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
        this.Nombre = Nombre;
        this.Pais = Pais;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.FechaDeCreacion = FechaDeCreacion;
        this.UltimoAcceso = new Date();
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public Date getFechaDeCreacion() {
        return FechaDeCreacion;
    }

    public void setFechaDeCreacion(Date FechaDeCreacion) {
        this.FechaDeCreacion = FechaDeCreacion;
    }

    public Date getUltimoAcceso() {
        return UltimoAcceso;
    }

    public void setUltimoAcceso(Date UltimoAcceso) {
        this.UltimoAcceso = UltimoAcceso;
    }

    public ArrayList<Correo> getBandejaDeEntrada() {
        return BandejaDeEntrada;
    }

    public void setBandejaDeEntrada(ArrayList<Correo> BandejaDeEntrada) {
        this.BandejaDeEntrada = BandejaDeEntrada;
    }

    public ArrayList<Correo> getSalida() {
        return Salida;
    }

    public void setSalida(ArrayList<Correo> Salida) {
        this.Salida = Salida;
    }

    public ArrayList<Correo> getSpam() {
        return Spam;
    }

    public void setSpam(ArrayList<Correo> Spam) {
        this.Spam = Spam;
    }

    public ArrayList<Correo> getPapelera() {
        return Papelera;
    }

    public void setPapelera(ArrayList<Correo> Papelera) {
        this.Papelera = Papelera;
    }

    public ArrayList<Date> getReuniones() {
        return Reuniones;
    }

    public void setReuniones(ArrayList<Date> Reuniones) {
        this.Reuniones = Reuniones;
    }

    public ArrayList<String> getContactos() {
        return Contactos;
    }

    public void setContactos(ArrayList<String> Contactos) {
        this.Contactos = Contactos;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "Usuario=" + Usuario + ", Contrasena=" + Contrasena + ", Nombre=" + Nombre + ", Pais=" + Pais + ", Edad=" + Edad + ", Sexo=" + Sexo + ", FechaDeCreacion=" + FechaDeCreacion + ", UltimoAcceso=" + UltimoAcceso + ", BandejaDeEntrada=" + BandejaDeEntrada + ", Salida=" + Salida + ", Spam=" + Spam + ", Papelera=" + Papelera + '}';
    }

}
