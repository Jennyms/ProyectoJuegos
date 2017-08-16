/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojuegos;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static proyectojuegos.JuegoPiscina.listacomp;

/**
 *
 * @author jenni
 */
public class hiloUno extends Thread {

    static int contador1 = 0;
    static int contador2 = 0;
    static int contador3 = 0;
    static int contador4 = 0;
    static int contador5 = 0;

    public static int nad1;
    public static int nad2;
    public static int nad3;
    public static int nad4;
    public static int nad5;
    static int tiempo2=0;

    String n1 = "";

    int x = 0;

    public hiloUno(String name, int x1) {
        n1 = name;
        x = x1;

    }//constr

    public void run() {

        if (n1 == "1") {

            long ti = System.currentTimeMillis();

            for (int j = 0; j < 120; j++) {
                try {
                    JuegoPiscina.nadador1.setLocation(JuegoPiscina.nadador1.getLocation().x + carrera.losNadadores[0].getAvance(), JuegoPiscina.nadador1.getLocation().y);
                    Icon icono;
                    switch (contador1) {
                        case 0:
                            contador1 = 1;
                            icono = new ImageIcon(getClass().getResource("/imagenes/2.png"));
                            JuegoPiscina.nadador1.setIcon(icono);
                            break;
                        case 1:
                            contador1 = 2;
                            icono = new ImageIcon(getClass().getResource("/imagenes/3.png"));
                            JuegoPiscina.nadador1.setIcon(icono);
                            break;
                        case 2:
                            contador1 = 0;
                            icono = new ImageIcon(getClass().getResource("/imagenes/1.png"));
                            JuegoPiscina.nadador1.setIcon(icono);
                            break;
                    }

                    sleep(carrera.losNadadores[0].getVelocidad());

                    if (JuegoPiscina.nadador1.getLocation().x >= JuegoPiscina.lblLinea.getLocation().x) {
                        tiempo2++;
                        long tf = System.currentTimeMillis();
                        long tt = tf - ti;
                        carrera.losNadadores[0].setTiempo(tt);
                        JuegoPiscina.txtR.append("\n" + "Nadador #1: " + carrera.losNadadores[0].getTiempo() + " segundos");
                        nad1 = (int) tt; 
                        if(nad1!=0){
                            listacomp.add("Nadador 1");
                        }
                        j = 120;
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
            
        }
        if (n1 == "2") {

            long ti = System.currentTimeMillis();
            for (int j = 0; j < 120; j++) {
                try {
                    JuegoPiscina.nadador2.setLocation(JuegoPiscina.nadador2.getLocation().x + carrera.losNadadores[1].getAvance(), JuegoPiscina.nadador2.getLocation().y);

                    Icon icono;
                    switch (contador2) {
                        case 0:
                            contador2 = 1;
                            icono = new ImageIcon(getClass().getResource("/imagenes/2.png"));
                            JuegoPiscina.nadador2.setIcon(icono);
                            break;
                        case 1:
                            contador2 = 2;
                            icono = new ImageIcon(getClass().getResource("/imagenes/3.png"));
                            JuegoPiscina.nadador2.setIcon(icono);
                            break;
                        case 2:
                            contador2 = 0;
                            icono = new ImageIcon(getClass().getResource("/imagenes/1.png"));
                            JuegoPiscina.nadador2.setIcon(icono);
                            break;
                    }
                    sleep(carrera.losNadadores[1].getVelocidad());
                    if (JuegoPiscina.nadador2.getLocation().x >= JuegoPiscina.lblLinea.getLocation().x) {
                        long tf = System.currentTimeMillis();
                        long tt = tf - ti;
                        carrera.losNadadores[1].setTiempo(tt);
                        JuegoPiscina.txtR.append("\n" + "Nadador #2: " + carrera.losNadadores[1].getTiempo() + " segundos");
                        nad2 = (int) tt;
                        if(nad2!=0){
                            listacomp.add("Nadador 2");
                        }
                        tiempo2++;
                        j = 120;
                    } else {
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }

            }//for

            JuegoPiscina.nadador2.setLocation(JuegoPiscina.nadador2.getLocation().x, JuegoPiscina.nadador2.getLocation().y);
 
            this.stop();
        }
        if (n1 == "3") {

            long ti = System.currentTimeMillis();

            for (int j = 0; j < 120; j++) {
                try {
                    JuegoPiscina.nadador3.setLocation(JuegoPiscina.nadador3.getLocation().x + carrera.losNadadores[2].getAvance(), JuegoPiscina.nadador3.getLocation().y);
                    Icon icono;
                    switch (contador3) {
                        case 0:
                            contador3 = 1;
                            icono = new ImageIcon(getClass().getResource("/imagenes/2.png"));
                            JuegoPiscina.nadador3.setIcon(icono);
                            break;
                        case 1:
                            contador3 = 2;
                            icono = new ImageIcon(getClass().getResource("/imagenes/3.png"));
                            JuegoPiscina.nadador3.setIcon(icono);
                            break;
                        case 2:
                            contador3 = 0;
                            icono = new ImageIcon(getClass().getResource("/imagenes/1.png"));
                            JuegoPiscina.nadador3.setIcon(icono);
                            break;
                    }
                    sleep(carrera.losNadadores[2].getVelocidad());

                    if (JuegoPiscina.nadador3.getLocation().x >= JuegoPiscina.lblLinea.getLocation().x) {
                        long tf = System.currentTimeMillis();
                        long tt = tf - ti;
                        carrera.losNadadores[2].setTiempo(tt);
                        JuegoPiscina.txtR.append("\n" + "Nadador #3: " + carrera.losNadadores[2].getTiempo() + " segundos");
                        nad3 = (int) tt;
                        if(nad3!=0){
                            listacomp.add("Nadador 3");
                        }
                        tiempo2++;
                        j = 120;
                    } else {
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }

            }//for

            JuegoPiscina.nadador3.setLocation(JuegoPiscina.nadador3.getLocation().x, JuegoPiscina.nadador3.getLocation().y);

            this.stop();
        }
        if (n1 == "4") {

            long ti = System.currentTimeMillis();

            for (int j = 0; j < 120; j++) {
                try {
                    JuegoPiscina.nadador4.setLocation(JuegoPiscina.nadador4.getLocation().x + carrera.losNadadores[3].getAvance(), JuegoPiscina.nadador4.getLocation().y);
                    Icon icono;
                    switch (contador4) {
                        case 0:
                            contador4 = 1;
                            icono = new ImageIcon(getClass().getResource("/imagenes/2.png"));
                            JuegoPiscina.nadador4.setIcon(icono);
                            break;
                        case 1:
                            contador4 = 2;
                            icono = new ImageIcon(getClass().getResource("/imagenes/3.png"));
                            JuegoPiscina.nadador4.setIcon(icono);
                            break;
                        case 2:
                            contador4 = 0;
                            icono = new ImageIcon(getClass().getResource("/imagenes/1.png"));
                            JuegoPiscina.nadador4.setIcon(icono);
                            break;
                    }
                    sleep(carrera.losNadadores[3].getVelocidad());

                    if (JuegoPiscina.nadador4.getLocation().x >= JuegoPiscina.lblLinea.getLocation().x) {
                        long tf = System.currentTimeMillis();
                        long tt = tf - ti;
                        carrera.losNadadores[3].setTiempo(tt);
                        JuegoPiscina.txtR.append("\n" + "Nadador #4: " + carrera.losNadadores[3].getTiempo() + " segundos");
                        nad4 = (int) tt;
                        if(nad4!=0){
                            listacomp.add("Nadador 4");
                        }
                        tiempo2++;
                        j = 120;
                    } else {
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }

            }//for

            JuegoPiscina.nadador4.setLocation(JuegoPiscina.nadador4.getLocation().x, JuegoPiscina.nadador4.getLocation().y);
            this.stop();
        }
        if (n1 == "5") {

            long ti = System.currentTimeMillis();

            for (int j = 0; j < 120; j++) {
                try {
                    JuegoPiscina.nadador5.setLocation(JuegoPiscina.nadador5.getLocation().x + carrera.losNadadores[4].getAvance(), JuegoPiscina.nadador5.getLocation().y);
                    Icon icono;
                    switch (contador5) {
                        case 0:
                            contador5 = 1;
                            icono = new ImageIcon(getClass().getResource("/imagenes/2.png"));
                            JuegoPiscina.nadador5.setIcon(icono);
                            break;
                        case 1:
                            contador5 = 2;
                            icono = new ImageIcon(getClass().getResource("/imagenes/3.png"));
                            JuegoPiscina.nadador5.setIcon(icono);
                            break;
                        case 2:
                            contador5 = 0;
                            icono = new ImageIcon(getClass().getResource("/imagenes/1.png"));
                            JuegoPiscina.nadador5.setIcon(icono);
                            break;
                    }
                    sleep(carrera.losNadadores[4].getVelocidad());

                    if (JuegoPiscina.nadador5.getLocation().x >= JuegoPiscina.lblLinea.getLocation().x) {
                        long tf = System.currentTimeMillis();
                        long tt = tf - ti;
                        carrera.losNadadores[4].setTiempo(tt);
                        JuegoPiscina.txtR.append("\n" + "Nadador #5: " + carrera.losNadadores[4].getTiempo() + " segundos");
                        nad5 = (int) tt;
                        if(nad5!=0){
                            listacomp.add("Nadador 5");
                        }
                        tiempo2++;
                        j = 120;
                    } else {
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }

            }//for

            JuegoPiscina.nadador5.setLocation(JuegoPiscina.nadador5.getLocation().x, JuegoPiscina.nadador5.getLocation().y);
            
            this.stop();
        }

    } 
}
