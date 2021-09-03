/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_karimguifarro;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class adminejec {
     private ArrayList<Ejecutivos> lista = new ArrayList();
    private File archivo = null;

     public adminejec(String path) {
        archivo = new File(path);
    }
    public ArrayList<Ejecutivos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Ejecutivos> lista) {
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
        return "adminejec{" + "lista=" + lista +"}";
    }
    public void setEjecutivos(Ejecutivos p){
        this.lista.add(p);
    }
    public void escribirArchivo1() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Ejecutivos t : lista) {
                bw.write(t.getUsuario() + ";");
                bw.write(t.getContraseña() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getCargo() + ";");
                bw.write(t.getTitulo_U() + ";");
                bw.write(t.getTitulo_M() + ";");
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
                    lista.add(new Ejecutivos(
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
