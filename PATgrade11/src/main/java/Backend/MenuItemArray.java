/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Navi
 */
public class MenuItemArray {
    
    MenuItem [] arr = new MenuItem[200];
    private int size;
    
    public MenuItemArray(){ 
        try {
            File f = new File("Navi//Downloads//Students.odt"); 
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){ 
                String line = sc.nextLine(); 
                Scanner lc = new Scanner(line).useDelimiter("%"); 
                String name = lc.next();
                 double price = lc.nextDouble();
                String type = lc.next(); 
                
                
                arr[size] = new MenuItem(name, price, type); 
                size++; 
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentArray.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
    }
    
     public static void addMenuItem(String name, double price, String type) {
		try {
			/**
			 * A scanner "reads" a file, a printwriter "writes" to
			 * files A scanner needs a file object to read from, a
			 * printwriter needs a filewriter object to write with
			 * (the boolean value is to "append" - true or
			 * "overwrite" - false.
			 */
			FileWriter fw = new FileWriter("", true);
			PrintWriter pw = new PrintWriter(fw);
			//add to the text file in the pre-constructed format.
			pw.println(name + "#" + price + "#" + type);
			//ALWAYS close a printwriter!!!!
			pw.close();
		} catch (IOException ex) {
			System.out.println("Could not write to file");
		}
     } 
                
     
     public static void deleteMenuItem(String name, String type) {
		try {
			Scanner sc = new Scanner(new File(""));
			MenuItem [] arr = new MenuItem[200]; 
                        int size = 0; 

			while (sc.hasNextLine()) {
				String line = sc.nextLine();

				Scanner linesc = new Scanner(line).useDelimiter("c");
				String currentMenuItemName = linesc.next();
                                double currentMenuItemPrice = linesc.nextDouble(); 
                                String currentMenuItemType = linesc.next(); 
				linesc.close();

				if (!currentMenuItemName.equalsIgnoreCase(name)&& !(currentMenuItemType.equalsIgnoreCase(type))) {
					/**
					 * only add to the output string if it
					 * is NOT the assessment to delete
					 */
					arr[size] = new MenuItem(currentMenuItemName, currentMenuItemPrice, currentMenuItemType); 
                                        size++; 
				}
			}
			sc.close();

			/**
			 * use a printwriter with the "overwrite" option to
			 * re-write all the assessments without the deleted one
			 */
			PrintWriter pw = new PrintWriter(new FileWriter("", false));
			pw.print(arr[size].toString());
			pw.close();

		} catch (FileNotFoundException ex) {
			System.out.println("Students file not found");
		} catch (IOException ex) {
			System.out.println("Could not delete student");
		}
	}

}
