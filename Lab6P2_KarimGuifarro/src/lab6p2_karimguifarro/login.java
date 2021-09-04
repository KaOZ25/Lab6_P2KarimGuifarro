/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_karimguifarro;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class login {

    private File archivo = null;
    ArrayList<log_in> list= new ArrayList();

    public login(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<log_in> getList() {
        return list;
    }

    public void setList(ArrayList<log_in> list) {
        this.list = list;
    }
    
    
    public void setLog_in(log_in p){
        this.list.add(p);
    }
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (log_in t : list) {
                bw.write(t.getUser() + ";");
                bw.write(t.getContra() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        list = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    list.add(new log_in(
                            sc.next(),
                            sc.next())
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
