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
 * @author Navi
 */
public class OrderedItemArray {
    private OrderedItem[] arr = new OrderedItem[200]; 
    private int size; 
    
    public OrderedItemArray(){ 
         try {
            Scanner sc = new Scanner(new File("C:\\Users\\Karinak\\Documents\\NetBeansProjects\\2021PAT\\PATgrade11\\data\\Orders.txt"));

            while (sc.hasNextLine()) {
                Scanner lineSc = new Scanner(sc.nextLine());
                lineSc.useDelimiter("@");
                String name = sc.next();
                double Price = sc.nextDouble(); 
                String type = sc.next(); 
                  
                size++;

            }
            sc.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Students file not found");

        }

    }
    }
    

