/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desempate;

import java.util.Random;

/**
 *
 * @author jenni
 */
public class generanumero {

    public int valorTira;
    public int valorTira2;
    public int calculanumero() {
        Random Generar = new Random();
        valorTira = Generar.nextInt(6) + 1;
        return valorTira;
    }
    public int calculanumero2() {
        Random Generar = new Random();
        valorTira2 = Generar.nextInt(6) + 1;
        return valorTira2;
    }
}
