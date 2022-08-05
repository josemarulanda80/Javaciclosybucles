/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int number =  (int) Math.round(Math.random()*100), cont=0;
        int number2 = -10;
        do {
            number2= Integer.parseInt(JOptionPane.showInputDialog("Adivina le numero genio"));
            
            if (number2>number){
                JOptionPane.showMessageDialog(null, "El numero a encontrar es menor que "+number2);
            }
            else{
                
                JOptionPane.showMessageDialog(null, "El numero a encontrar es mayor que "+number2);
            }
            cont++;
        } while (number2!=number);
       JOptionPane.showMessageDialog(null, "El numero de intentos fue de"+(cont-1));
    }
    
}
