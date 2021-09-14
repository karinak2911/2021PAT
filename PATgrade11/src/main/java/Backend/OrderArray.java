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
public class OrderArray {

    private Order[] arr = new Order[200];
    private int size;

    public OrderArray() {
        try {
            Scanner sc = new Scanner(new File("data\\Orders.txt"));
            OrderedItem [] itemArr = new OrderedItem[150]; 
            int sizeArr = 0; 

            while (sc.hasNextLine()) {
                Scanner lineScStudent = new Scanner(sc.nextLine());
                lineScStudent.useDelimiter("@");
                String name = sc.next();
                int grade = sc.nextInt();
                Student s = new Student(name, grade);
                
                Scanner lineScItems = new Scanner(sc.nextLine()); 
                lineScItems.useDelimiter("#"); 
                while(lineScItems.hasNext()){ 
                    String singleItem = lineScItems.next(); 
                    Scanner singleItemSc = new Scanner(singleItem);
                    singleItemSc.useDelimiter("@"); 
                    String itemName = singleItemSc.next(); 
                    String itemType = singleItemSc.next(); 
                    double itemPrice = singleItemSc.nextDouble(); 
                    int itemQuantity = singleItemSc.nextInt(); 
                    MenuItem currentMenuItem = new MenuItem(itemName, itemPrice, itemType); 
                    OrderedItem currentItemArr = new OrderedItem(itemQuantity, currentMenuItem);  
                    itemArr[sizeArr] = currentItemArr; 
                    sizeArr++; 
                }
                
                int timeInt = sc.nextInt(); 
                boolean paid = sc.nextBoolean(); 
                double totalprice = sc.nextDouble(); 
                
                arr[size] = new Order(s, )

                size++;
                
                

            }
            sc.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Students file not found");

        }

    }

    public Order[] getArr() {
        return arr;
    }

    public int getSize() {
        return size;
    }
    
    //add order
    

    //write to file
}
