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
    private String hobbie,interes1,interes2,interes3,interes4;

    public Normales() {
    }

    public Normales(String hobbie, String interes1, String interes2, String interes3, String interes4, String usuario, String contraseña, String nombre, String apellido, String correo) {
        super(usuario, contraseña, nombre, apellido, correo);
        this.hobbie = hobbie;
        this.interes1 = interes1;
        this.interes2 = interes2;
        this.interes3 = interes3;
        this.interes4 = interes4;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getInteres1() {
        return interes1;
    }

    public void setInteres1(String interes1) {
        this.interes1 = interes1;
    }

    public String getInteres2() {
        return interes2;
    }

    public void setInteres2(String interes2) {
        this.interes2 = interes2;
    }

    public String getInteres3() {
        return interes3;
    }

    public void setInteres3(String interes3) {
        this.interes3 = interes3;
    }

    public String getInteres4() {
        return interes4;
    }

    public void setInteres4(String interes4) {
        this.interes4 = interes4;
    }

    @Override
    public String toString() {
        return "Normales{"+ super.toString() + "hobbie=" + hobbie + ", interes1=" + interes1 + ", interes2=" + interes2 + ", interes3=" + interes3 + ", interes4=" + interes4 + '}';
    }

    
    
}
