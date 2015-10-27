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
public class Pares extends Thread {

    int suma = 0;

    public Pares(String nom) {
        super(nom);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
                JOptionPane.showMessageDialog(null,"Suma Pares: " + suma);
            }
        }
    }
}
