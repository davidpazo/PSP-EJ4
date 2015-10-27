package Hilos;

import javax.swing.JOptionPane;

/**
 *
 * @author dpazolopez
 */
public class Ejercicio4 extends Thread{
   
    public static void main(String[] args) {
       int opc;
        do {
            opc = JOptionPane.showOptionDialog(
            null, "MENU", "Que hilo desea iniciar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "Pares",
                    "Impares",
                    "Suma de numeros 2 y 3",
                    "Salir"},
                    "Exit") + 1;

            switch (opc) {
                case 1:
                    new Pares("Hilo pares").start();
                    break;
                case 2:
                    new Impares("Hilo impares").start();
                    break;
                case 3:
                    new Suma23("Hilo suma 2 y 3").start();
                    break;
               
                case 4:
                    System.exit(0);
            }
        } while (opc != 0 && opc != 6);
    }
}
    
    
    

