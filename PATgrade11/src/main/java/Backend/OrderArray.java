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

    private Order[] arrOrders = new Order[200];
    private int size;

    public OrderArray() {
        try {
            Scanner sc = new Scanner(new File("data\\Orders.txt"));
             

            while (sc.hasNext()) {
            OrderedItem [] itemArr = new OrderedItem[150]; 
            int sizeArr = 0; 
                OrderedItemArray orderedItemArr = new OrderedItemArray(); 
                String studentLine = sc.nextLine(); 
                Scanner lineScStudent = new Scanner(studentLine);
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
                lineScItems.close();
                lineScStudent.close();
                int timeInt = Integer.parseInt(sc.nextLine());
                 boolean paid = Boolean.parseBoolean(sc.nextLine()); 
                double totalPrice = Double.parseDouble(sc.nextLine()); 
                
                arrOrders[size] = new Order(s, orderedItemArr, timeInt, paid, totalPrice); 
                size++;
                
                
                 

            }
            sc.close();
           

        } catch (FileNotFoundException ex) {
            System.out.println("Orders file not found");

        }

    }

    public Order[] getArr() {
        return arrOrders;
    }

    public int getSize() {
        return size;
    }
    
   
    
     
     public void addOrder(Order order){ 
         arrOrders[size] = order; 
         size++; 
         this.printToFile();
     }
     
     public void printToFile(){ 
         try {
            PrintWriter pw = new PrintWriter(new FileWriter("data\\Orders.txt"));
            for (int i = 0; i < size; i++) {
                pw.println(arrOrders[i].fileFormat());
            }
            pw.close();
        } catch (IOException ex) {
            System.out.println("Could not write to file");
        }
     }
     
     
      public int getOutSize(boolean paid) {
        int outsize = 0;
        for (int i = 0; i < size; i++) {
            if (arrOrders[i].isPaid()==paid) {
                outsize++;
            }
        }
        return outsize;
    }
      
       public Object[][] getOrdersForTable(boolean paid){ 
        int outsize = this.getOutSize(paid); 
        Object [][] out = new Object[outsize][6]; 
        int outIndex = 0;
        for (int row = 0; row < size; row++) {
            if(arrOrders[row].isPaid() == paid){
               
                        
                out[outIndex][0] = arrOrders[row].getStudent().getName(); 
                out[outIndex][1] = arrOrders[row].getStudent().getGrade();
                out[outIndex][2] = arrOrders[row].getOrderedItemArr().toString(); 
                out[outIndex][3] = arrOrders[row].getTime(); 
                out[outIndex][4] = arrOrders[row].isPaid(); 
                out[outIndex][5] = arrOrders[row].getTotalPrice(); 
                outIndex++;
            }
        } 
        return out; 
    }
       
       public void changeToPaid(String order){ 
           for(int i = 0; i < size; i++){ 
               if(arrOrders[i].getOrderedItemArr().toString().equalsIgnoreCase(order))
                   arrOrders[i].setPaid(true);
           }
           this.printToFile();
           
       }
       
     
     
     

   
}
