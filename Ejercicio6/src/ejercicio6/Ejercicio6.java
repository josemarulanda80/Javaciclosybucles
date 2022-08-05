/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dete =10;
        float acu = 0,number;
      
        
        
    do {
        number= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero a sumar"));
        dete=(int) number;
        acu+=number;
        
    }while(dete!=0);
    JOptionPane.showMessageDialog(null, "La suma es de "+acu);
    
}
}