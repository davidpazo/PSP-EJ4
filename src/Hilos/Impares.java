/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hilos;

import javax.swing.JOptionPane;

/**
 *
 * @author dpazolopez
 */
public class Impares extends Thread{
    int suma = 0;

    public Impares(String nom) {
        super(nom);
    }
    
    
    @Override
    public void run(){
   
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                suma = suma + i;
                JOptionPane.showMessageDialog(null,"Suma impares: " + suma);
            }
    }
}
}
