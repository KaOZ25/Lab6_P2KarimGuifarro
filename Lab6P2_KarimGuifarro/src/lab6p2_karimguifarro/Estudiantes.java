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
public class Estudiantes extends Personas{
    private String carrera;
    private int año_cursando,añoscar_cursando;

    public Estudiantes() {
    }

    public Estudiantes(String usuario, String contraseña, String nombre, String apellido, String correo,String carrera, int año_cursando, int añoscar_cursando) {
        super(usuario, contraseña, nombre, apellido, correo);
        this.carrera = carrera;
        this.año_cursando = año_cursando;
        this.añoscar_cursando = añoscar_cursando;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAño_cursando() {
        return año_cursando;
    }

    public void setAño_cursando(int año_cursando) {
        this.año_cursando = año_cursando;
    }

    public int getAñoscar_cursando() {
        return añoscar_cursando;
    }

    public void setAñoscar_cursando(int añoscar_cursando) {
        this.añoscar_cursando = añoscar_cursando;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "carrera=" + carrera + ", a\u00f1o_cursando=" + año_cursando + ", a\u00f1oscar_cursando=" + añoscar_cursando + '}';
    }
    
}
