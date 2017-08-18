/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojuegos;

import javax.swing.JLabel;
/**
 *
 * @author jenni
 */
public class Labels extends JLabel{
    //Labels attributes
    public Labels(int posiX, int PosiY, int ancho, int largo){
        setBounds(posiX, PosiY, ancho, largo);
    }
}
