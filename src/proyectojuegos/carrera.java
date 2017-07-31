/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojuegos;

import java.util.Random;

/**
 *
 * @author jenni
 */
public class carrera {
   
    
    static nadador[] losNadadores;
    static Random rnd;
    static int[] vel;
    
    static public void reiniciar(){
    int[] vel={240,250,255,245};
    int[] ava={13,15,16,14};
     //Vel
        losNadadores[0].setVelocidad(vel[rnd.nextInt(4)]);
        
        //avances
        losNadadores[0].setAvance(ava[rnd.nextInt(4)]);
        
    }//
    
    static public void registrarNadador(){
        rnd= new Random();
        
        int[] vel={240,250,255,245};
        int[] ava={13,15,16,14,17};
        losNadadores = new nadador[5];
        
        losNadadores[0] = new nadador(0,0,0,0,0,"-");
        
        //ingreso de datos
        //codigos
        losNadadores[0].setCodigo(101);
        
        //nombres
        losNadadores[0].setNombre("Jenny");
        
        //CoordX
        losNadadores[0].setCoorX(JuegoPiscina.nadador1.getLocation().x);
        
        //CoordX
        losNadadores[0].setCoorY(JuegoPiscina.nadador1.getLocation().y);
        
        //Vel
        losNadadores[0].setVelocidad(vel[rnd.nextInt(4)]);
         
        //avances
        losNadadores[0].setAvance(ava[rnd.nextInt(4)]);
        //
        losNadadores[0].setTiempo(0);
        
        
        //
    }//
    
    
    static void iniciar(){
        hiloUno h1= new hiloUno(losNadadores[0].getNombre());
        h1.start();
        
    }//iniciar           
            
//    static void detener(){
//        hiloDos h2= new hiloDos(losNadadores[0].getNombre());
//        h2.suspend();
//    }
//    static void mover(){
//        hiloDos h2= new hiloDos(losNadadores[0].getNombre());
//        h2.start();
//    }
    }//class

