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
public class log_in {
     String user, contra;

    public log_in(String user, String contra) {
        this.user = user;
        this.contra = contra;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "log_in{" + "user=" + user + ", contra=" + contra + '}';
    }
     
}
