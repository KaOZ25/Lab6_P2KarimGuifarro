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
public class Normales extends Personas{
    private String hobbie,intereses;

    public Normales() {
    }

    public Normales(String hobbie, String intereses, String usuario, String contraseña, String nombre, String apellido, String correo) {
        super(usuario, contraseña, nombre, apellido, correo);
        this.hobbie = hobbie;
        this.intereses = intereses;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }

    @Override
    public String toString() {
        return "Normales{" + "hobbie=" + hobbie + ", intereses=" + intereses + '}';
    }
    
}
