/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojuegos;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;



/**
 *
 * @author jenni
 */
public class hiloDos extends Thread {
    String n1 = "";
    int x = 0;
    public hiloDos(String name, int x1) {
        n1 = name;
        x = x1;
    }//constr
   static int contador = 0;
   
    int velocidad = 1; //segundos
    int velmil = velocidad * 400;
    
    public static Timer timer;
    public static TimerTask tarea;

    {

        tarea = new TimerTask() {
            @Override
            public void run() {
                Icon icono;

                switch (contador) {
                    case 0:
                        contador = 1;
                        icono = new ImageIcon(getClass().getResource("/imagenes/2.png"));
                        JuegoPiscina.nadador1.setIcon(icono);
                        break;
                    case 1:
                        contador = 2;
                        icono = new ImageIcon(getClass().getResource("/imagenes/3.png"));
                        JuegoPiscina.nadador1.setIcon(icono);
                        break;
                    case 2:
                        contador = 0;
                        icono = new ImageIcon(getClass().getResource("/imagenes/1.png"));
                        JuegoPiscina.nadador1.setIcon(icono);
                        break;
                }
            }
        };
        timer = new Timer();

        timer.scheduleAtFixedRate(tarea, velmil, velmil);
    }
    
    
    
}
