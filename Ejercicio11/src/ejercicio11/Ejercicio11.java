/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float acu=0,mayor=0;
        float number= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero de sueldos"));
        
        
        for(int i=0; i<number;i++){
            float saldo= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero de sueldos"));
            acu=saldo;
            if (saldo>mayor){
                mayor=saldo;
            }
            
        }
        System.out.println("El saldo maximo es: "+ mayor);
    }
    
}
