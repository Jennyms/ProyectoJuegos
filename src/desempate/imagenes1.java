/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desempate;

import javax.swing.ImageIcon;

/**
 *
 * @author jenni
 */
public class imagenes1 {

    public ImageIcon icoImagen;

    public ImageIcon gifDado1(int Dado1) {
        switch (Dado1) {
            case 1:
                icoImagen = new ImageIcon(getClass().getResource("/icon/dados-01.gif"));
                break;
            case 2:
                icoImagen = new ImageIcon(getClass().getResource("/icon/dados-02.gif"));
                break;
            case 3:
                icoImagen = new ImageIcon(getClass().getResource("/icon/dados-03.gif"));
                break;
            case 4:
                icoImagen = new ImageIcon(getClass().getResource("/icon/dados-04.gif"));
                break;
            case 5:
                icoImagen = new ImageIcon(getClass().getResource("/icon/dados-05.gif"));
                break;
            case 6:
                icoImagen = new ImageIcon(getClass().getResource("/icon/dados-06.gif"));
                break;

        }
        return icoImagen;
    }
}
