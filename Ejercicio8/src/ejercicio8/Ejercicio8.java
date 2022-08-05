/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        for(int i=1;i<=number;i++){
            System.out.println(i);
        }
        
    }
    
}
