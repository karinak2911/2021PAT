/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsChars;
import javax.swing.JOptionPane;

/**
 *
 * @author Navi
 */
public class ConvertDate {
    public static void main (String[] args){ 
        
        String dateInput = JOptionPane.showInputDialog("Enter the the date in the format DDMMYY:");
        System.out.println(dateInput.substring(4) + "/" + dateInput.substring(2,4) + "/" + dateInput.substring(0,2)); 
        
    }
}
