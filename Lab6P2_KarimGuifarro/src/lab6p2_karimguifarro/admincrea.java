/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_karimguifarro;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class admincrea {
     private ArrayList<Creativos> lista = new ArrayList();
    private File archivo = null;

     public admincrea(String path) {
        archivo = new File(path);
    }
    public ArrayList<Creativos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Creativos> lista) {
        this.lista = lista;
    }

   
    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "admin{" + "lista=" + lista + '}';
    }
    public void setCreativos(Creativos p){
        this.lista.add(p);
    }
    public void escribirArchivo1() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Creativos t : lista) {
                bw.write(t.getUsuario() + ";");
                bw.write(t.getContraseña() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getCorreo() + ";");
                bw.write(t.getOcupacion() + ";");
                bw.write(t.getEdad() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        lista = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    lista.add(new Creativos(
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.nextInt())
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
