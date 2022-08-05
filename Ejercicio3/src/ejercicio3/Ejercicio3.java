/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont =0;
        int number=1;
        
        
        do {
            number=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
            ++cont;
   
            
        }while(number!=0);
        JOptionPane.showMessageDialog(null, "el numero de numeros ingresados es "+(cont-1));
    }
    
}
