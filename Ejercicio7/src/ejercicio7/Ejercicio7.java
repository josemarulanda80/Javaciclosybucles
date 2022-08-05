/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        float acu = 0,number;
      int cont=0;  
      
        
    number= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero a sumar"));  
    while(number!=0) {
        acu+=number;
        cont++;
        number= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero a sumar"));
       
    }
    if(acu==0){
    JOptionPane.showInputDialog("No es valida la divición por cero");
    }
    else{ 
        JOptionPane.showMessageDialog(null,"la media es: "+(acu/cont));
        
    }
    }
    
}
