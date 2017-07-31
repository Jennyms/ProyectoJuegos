/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojuegos;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jenni
 */
public class hiloUno extends Thread {

    public hiloUno(String name) {
        this.setName(name);
    }//constr

    public void run() {

        if (getName().equals("Jenny")) {

            long ti = System.currentTimeMillis();

            for (int j = 0; j < 99; j++) {
                try {
                    JuegoPiscina.nadador1.setLocation(JuegoPiscina.nadador1.getLocation().x + carrera.losNadadores[0].getAvance(), JuegoPiscina.nadador1.getLocation().y);
                    System.out.println(this.getName()+":"+JuegoPiscina.nadador1.getLocation().x+" -- "+JuegoPiscina.lblLinea.getLocation().x);

                    sleep(carrera.losNadadores[0].getVelocidad());

                    if (JuegoPiscina.nadador1.getLocation().x >= JuegoPiscina.lblLinea.getLocation().x) {
                        long tf = System.currentTimeMillis();
                        long tt = tf - ti;
                        carrera.losNadadores[0].setTiempo(tt);
                        JuegoPiscina.txtR.append("\n" + this.getName() + ":" + carrera.losNadadores[0].getTiempo() + " ms");
                        j = 99;
                    } else {
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }

            }//for

            JuegoPiscina.nadador1.setLocation(JuegoPiscina.nadador1.getLocation().x, JuegoPiscina.nadador1.getLocation().y);

            this.stop();
        }//if

    }}