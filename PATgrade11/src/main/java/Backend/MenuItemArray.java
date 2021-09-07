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

    MenuItem[] arr = new MenuItem[200];
    private int size;

    public MenuItemArray() {
        try {
            File f = new File("Navi//Downloads//Students.odt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                Scanner lc = new Scanner(line).useDelimiter("%");
                String name = lc.next();
                double price = lc.nextDouble();
                String type = lc.next();

                arr[size] = new MenuItem(name, price, type);
                size++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addMenuItem(String name, double price, String type) {
        this.shiftRight(size - 1);
        arr[size -1] = new MenuItem(name, price, type); 

    }


public void shiftRight(int index) {
        size++;
        for (int i = size - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
    }

  public void shiftLeft(int index) {
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }
                
     
     public void deleteMenuItem(String name, String type) {
		 int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i].name.equalsIgnoreCase(name) && arr[i].type.equalsIgnoreCase(type)) {
                index = i;
            }

            if (index >= 0) {
                this.shiftLeft(index);
            }
        }

}
     
public void printArrayToFile() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Karinak\\Documents\\NetBeansProjects\\2021PAT\\PATgrade11\\data\\Students.txt"));
            for (int i = 0; i < size; i++) {
                pw.println(arr[i].fileFormat());
            }
            pw.close();
        } catch (IOException ex) {
            System.out.println("Could not write to file");
        }
    }


public Object [][] getMenuItemFromType(String type){ 
    Object arr = new Object [size][2]; 
    for(int i = 0; i < size; i++){ 
        for(int j = 0; j < 2; j++){ 
            MenuItem current = arr[i];  
        }
    }
}
} 

