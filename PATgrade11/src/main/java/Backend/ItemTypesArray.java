/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Karinak
 */
public class ItemTypesArray {

    private String[] arr = new String[200];
    private int size;

    public ItemTypesArray() {
        try {
            Scanner sc = new Scanner(new File("data\\TypesOfItems.txt")).useDelimiter("#");

            while (sc.hasNextLine()) {

                String type = sc.nextLine();

                arr[size] = type;
                size++;

            }
            sc.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Item types file not found");

        }

    }

    public String[] getArr() {
        return arr;
    }

}
