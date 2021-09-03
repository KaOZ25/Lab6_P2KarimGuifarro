package lab6p2_karimguifarro;


public class Creativos extends Personas{
    private String ocupacion;
    private int edad;

    public Creativos(String ocupacion, int edad, String usuario, String contraseña, String nombre, String apellido, String correo) {
        super(usuario, contraseña, nombre, apellido, correo);
        this.ocupacion = ocupacion;
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Creativos{" + "ocupacion=" + ocupacion + ", edad=" + edad + '}';
    }
    
}
