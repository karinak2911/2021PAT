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
public class OrderManager {
    private Order [] arr = new Order[200]; 
    private int size; 
    
    public OrderManager(){ 
        try {
            Scanner sc = new Scanner(new File("data\\Orders.txt"));

            while (sc.hasNextLine()) {
                Scanner lineSc = new Scanner(sc.nextLine());
                lineSc.useDelimiter("@");
                String name = sc.next();
                int grade = sc.nextInt();
                Student s = new Student(name, grade); 
                

               
               
                size++;

            }
            sc.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Students file not found");

        }

    }
    
}
