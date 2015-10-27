package Hilos;

import javax.swing.JOptionPane;

/**** @author dpazolopez ****/
public class Suma23 extends Thread {

    int suma = 0;

    public Suma23(String nom) {
        super(nom);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 2 || i % 10 == 3) {
                suma = suma + i;
                JOptionPane.showMessageDialog(null,"Suma 2 y 3: " + suma);
            }
        }
    }
}

