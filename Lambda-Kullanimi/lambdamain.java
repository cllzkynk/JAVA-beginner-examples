/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author hanife
 */
public class FonksiyonHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fonksiyon fonk=(x,y) -> Math.pow(x, y);
        double snc=fonk.sayi(2, 5);
        System.out.println(snc);
    }
    
}