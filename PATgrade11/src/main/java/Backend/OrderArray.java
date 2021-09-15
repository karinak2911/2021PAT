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
             OrderedItemArray orderedItemArr = new OrderedItemArray(); 

            while (sc.hasNext()) {
                Scanner lineScStudent = new Scanner(sc.nextLine());
                lineScStudent.useDelimiter("@");
                String name = lineScStudent.next();
                int grade = lineScStudent.nextInt();
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
                    orderedItemArr.setArr(itemArr);
                    orderedItemArr.setSize(sizeArr);
                   
                }
                
                int timeInt = sc.nextInt(); 
                boolean paid = sc.nextBoolean(); 
                double totalPrice = sc.nextDouble(); 
                
                arr[size] = new Order(s, orderedItemArr, timeInt, paid, totalPrice); 
                size++;
                
                

            }
            sc.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Orders file not found");

        }

    }

    public Order[] getArr() {
        return arr;
    }

    public int getSize() {
        return size;
    }
    
   
    
     
     public void addOrder(Order order){ 
         arr[size] = order; 
         size++; 
         this.printToFile();
     }
     
     public void printToFile(){ 
         try {
            PrintWriter pw = new PrintWriter(new FileWriter("data\\Orders.txt"));
            for (int i = 0; i < size; i++) {
                pw.println(arr[i].fileFormat());
            }
            pw.close();
        } catch (IOException ex) {
            System.out.println("Could not write to file");
        }
     }
     
     
      public int getOutSize(boolean paid) {
        int outsize = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i].isPaid()) {
                outsize++;
            }
        }
        return outsize;
    }
      
       public Object[][] getOrdersForTable(boolean paid){ 
        int outsize = this.getOutSize(paid); 
        Object [][] out = new Object[outsize][6]; 
        for (int row = 0; row < size; row++) {
            out[row][0] = arr[row].getS().getName(); 
            out[row][1] = arr[row].getS().getGrade();
            out[row][2] = arr[row].getArr().toString(); 
            out[row][3] = arr[row].getTime(); 
            out[row][4] = arr[row].isPaid(); 
            out[row][5] = arr[row].getTotalPrice(); 
        } 
        return out; 
    }
       
       public void changeToPaid(String order){ 
           for(int i = 0; i < size; i++){ 
               if(arr[i].getArr().toString().equalsIgnoreCase(order))
                   arr[i].setPaid(true);
           }
           this.printToFile();
           
       }
       
     
     
     

   
}
