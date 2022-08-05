/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int number= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero al para clcularle el factorial"));
       int acu=1;
               
       for(int i=1; i<=number;i++){
           System.out.println(i);
           acu*=i;
          
       }
        System.out.println("El factorial es "+acu);
    }
    
}
