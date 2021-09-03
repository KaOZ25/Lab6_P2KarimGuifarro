/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_karimguifarro;

/**
 *
 * @author Karim Ozael
 */
public class Ejecutivos extends Personas{
    private String cargo,titulo_U,titulo_M;

    public Ejecutivos() {
    }

    public Ejecutivos(String cargo, String titulo_U, String titulo_M, String usuario, String contraseña, String nombre, String apellido, String correo) {
        super(usuario, contraseña, nombre, apellido, correo);
        this.cargo = cargo;
        this.titulo_U = titulo_U;
        this.titulo_M = titulo_M;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTitulo_U() {
        return titulo_U;
    }

    public void setTitulo_U(String titulo_U) {
        this.titulo_U = titulo_U;
    }

    public String getTitulo_M() {
        return titulo_M;
    }

    public void setTitulo_M(String titulo_M) {
        this.titulo_M = titulo_M;
    }

    @Override
    public String toString() {
        return "Ejecutivos{" + "cargo=" + cargo + ", titulo_U=" + titulo_U + ", titulo_M=" + titulo_M + '}';
    }
    
}
