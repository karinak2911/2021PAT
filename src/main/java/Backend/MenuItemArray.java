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
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Navi
 */
public class MenuItemArray {

    MenuItem[] menuItemArr = new MenuItem[200];
    private int size;

    //contructor gets all the current menu items from a text file and adds it to the array
    public MenuItemArray() {
        try {
            File f = new File("data\\MenuItems.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                Scanner lc = new Scanner(line).useDelimiter("@").useLocale(Locale.US);
                String name = lc.next();
                double price = lc.nextDouble();
                String type = lc.next();

                menuItemArr[size] = new MenuItem(name, price, type);
                size++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Menu text file not found");
        }

    }

    // gets the fields of the menu item and adds the new item to the array 
    public void addMenuItem(String name, double price, String type) {
        this.shiftRight(size - 1);
        menuItemArr[size - 1] = new MenuItem(name, price, type);
        this.printArrayToFile();

    }

    private void shiftRight(int index) {
        size++;
        for (int i = size - 1; i > index; i--) {
            menuItemArr[i] = menuItemArr[i - 1];
        }
    }

    private void shiftLeft(int index) {
        for (int i = index; i < size; i++) {
            menuItemArr[i] = menuItemArr[i + 1];
        }
        size--;
    }

    // removes the menu item from the array and prints the array to file. It compares the name and type of the selected menu item with items in the array 
    public void deleteMenuItem(String name, String type) {
        for (int i = 0; i < size; i++) {
            if (menuItemArr[i].getName().equalsIgnoreCase(name) && menuItemArr[i].getType().equalsIgnoreCase(type)) {
                this.shiftLeft(i);
            }
            this.printArrayToFile();

        }
    }

// this method prints the current start of the array to the file 
    public void printArrayToFile() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("data\\MenuItems.txt"));
            for (int i = 0; i < size; i++) {
                pw.println(menuItemArr[i].fileFormat());
            }
            pw.close();
        } catch (IOException ex) {
            System.out.println("Could not write to file");
        }
    }

    // gets the number of menu items of a specific type to be displayed in the table 
    public int getOutSize(String type) {
        int outsize = 0;
        for (int i = 0; i < size; i++) {
            if (type.equalsIgnoreCase(menuItemArr[i].getType())) {
                outsize++;
            }
        }
        return outsize;
    }

    // returns an object array of the menu items based of a specific inputed type to be displayed in the table 
    public Object[][] getMenuItemFromType(String type) {
        int outsize = this.getOutSize(type);
        Object[][] out = new Object[outsize][2];
        int outindex = 0;
        for (int row = 0; row < size; row++) {
            if (type.equalsIgnoreCase(menuItemArr[row].getType())) {
                out[outindex][0] = menuItemArr[row].getName();
                out[outindex][1] = new Double(menuItemArr[row].getPrice());
                outindex++;
            }
        }

        return out;
    }

// returns an object array of the menu items to be viewed on the manage menu screen. This alows the whole menu item to be viewed on the manage menu screen
    public Object[][] getMenuItemFormMangeMenu() {

        Object[][] out = new Object[size][3];

        for (int row = 0; row < size; row++) {

            out[row][0] = menuItemArr[row].getName();
            out[row][1] = menuItemArr[row].getType();
            out[row][2] = new Double(menuItemArr[row].getPrice());
        }
        return out;
    }

}
