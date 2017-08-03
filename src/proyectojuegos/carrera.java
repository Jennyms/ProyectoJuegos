/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojuegos;

import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author jenni
 */
public class carrera {
   
    
    static nadador[] losNadadores;
    static Random rnd;
    static int[] vel;
    static String n1 = "";
    static String n2 = "";
    static String n3 = "";
    static String n4 = "";
    static String n5 = "";
    
    static public void reiniciar(){
    int[] vel={240,250,255,245};
    int[] ava={13,15,16,14};
     //Vel
        losNadadores[0].setVelocidad(vel[rnd.nextInt(4)]);
        losNadadores[1].setVelocidad(vel[rnd.nextInt(4)]);
        losNadadores[2].setVelocidad(vel[rnd.nextInt(4)]);
        losNadadores[3].setVelocidad(vel[rnd.nextInt(4)]);
        losNadadores[4].setVelocidad(vel[rnd.nextInt(4)]);
        
        //avances
        losNadadores[0].setAvance(ava[rnd.nextInt(4)]);
        losNadadores[1].setAvance(ava[rnd.nextInt(4)]);
        losNadadores[2].setAvance(ava[rnd.nextInt(4)]);
        losNadadores[3].setAvance(ava[rnd.nextInt(4)]);
        losNadadores[4].setAvance(ava[rnd.nextInt(4)]);
    }//
    
    static public void registrarNadador(){
        rnd= new Random();
        
        int[] vel={240,250,255,245};
        int[] ava={13,15,16,14,17};
        losNadadores = new nadador[5];
        
        losNadadores[0] = new nadador(0,0,0,0,0,"-");
        losNadadores[1] = new nadador(0,0,0,0,0,"-");
        losNadadores[2] = new nadador(0,0,0,0,0,"-");
        losNadadores[3] = new nadador(0,0,0,0,0,"-");
        losNadadores[4] = new nadador(0,0,0,0,0,"-");
        //ingreso de datos
        //codigos
        losNadadores[0].setCodigo(101);
        losNadadores[1].setCodigo(102);
        losNadadores[2].setCodigo(103);
        losNadadores[3].setCodigo(104);
        losNadadores[4].setCodigo(105);
        
        //nombres
//        losNadadores[0].setNombre("Jenny");
        
        //CoordX
        losNadadores[0].setCoorX(JuegoPiscina.nadador1.getLocation().x);
        losNadadores[1].setCoorX(JuegoPiscina.nadador2.getLocation().x);
        losNadadores[2].setCoorX(JuegoPiscina.nadador3.getLocation().x);
        losNadadores[3].setCoorX(JuegoPiscina.nadador4.getLocation().x);
        losNadadores[4].setCoorX(JuegoPiscina.nadador5.getLocation().x);
        
        //CoordX
        losNadadores[0].setCoorY(JuegoPiscina.nadador1.getLocation().y);
        losNadadores[1].setCoorY(JuegoPiscina.nadador2.getLocation().y);
        losNadadores[2].setCoorY(JuegoPiscina.nadador3.getLocation().y);
        losNadadores[3].setCoorY(JuegoPiscina.nadador4.getLocation().y);
        losNadadores[4].setCoorY(JuegoPiscina.nadador5.getLocation().y);
        
        //Vel
        losNadadores[0].setVelocidad(vel[rnd.nextInt(4)]);
        losNadadores[1].setVelocidad(vel[rnd.nextInt(4)]);
        losNadadores[2].setVelocidad(vel[rnd.nextInt(4)]);
        losNadadores[3].setVelocidad(vel[rnd.nextInt(4)]);
        losNadadores[4].setVelocidad(vel[rnd.nextInt(4)]);
         
        //avances
        losNadadores[0].setAvance(ava[rnd.nextInt(4)]);
        losNadadores[1].setAvance(ava[rnd.nextInt(4)]);
        losNadadores[2].setAvance(ava[rnd.nextInt(4)]);
        losNadadores[3].setAvance(ava[rnd.nextInt(4)]);
        losNadadores[4].setAvance(ava[rnd.nextInt(4)]);
        //
        losNadadores[0].setTiempo(0);
        losNadadores[1].setTiempo(0);
        losNadadores[2].setTiempo(0);
        losNadadores[3].setTiempo(0);
        losNadadores[4].setTiempo(0);
        
        
        //
    }//
    
    
    static void iniciar(String n11,String n22,String n33,String n44,String n55){
        n1 = n11;
        n2 = n22;
        n3 = n33;
        n4 = n44;
        n5 = n55;
        
        
        hiloUno h1= new hiloUno(n1,0);
        h1.start();
        
        hiloUno h2= new hiloUno(n2,1);
        h2.start();
        
        hiloUno h3= new hiloUno(n3,2);
        h3.start();
        
        hiloUno h4= new hiloUno(n4,3);
        h4.start();
        
        hiloUno h5= new hiloUno(n5,4);
        h5.start();
    }//iniciar           
            

    }//class

