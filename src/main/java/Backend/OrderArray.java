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

/**
 *
 * @author Navi
 */
public class OrderArray {

    private Order[] ordersArr = new Order[200];
    private int size;

    // the constructor reads in the orders from a text file and populates the array 
    public OrderArray() {
        try {
            Scanner sc = new Scanner(new File("data\\Orders.txt"));

            while (sc.hasNext()) {
                OrderedItem[] itemArr = new OrderedItem[150];
                int sizeArr = 0;
                OrderedItemArray orderedItemArr = new OrderedItemArray();
                String studentLine = sc.nextLine();
                Scanner lineScStudent = new Scanner(studentLine).useLocale(Locale.US);
                lineScStudent.useDelimiter("@");
                String name = lineScStudent.next();
                int grade = lineScStudent.nextInt();
                Student s = new Student(name, grade);

                Scanner lineScItems = new Scanner(sc.nextLine()).useLocale(Locale.US);
                lineScItems.useDelimiter("#");
                while (lineScItems.hasNext()) {
                    String singleItem = lineScItems.next();
                    Scanner singleItemSc = new Scanner(singleItem);
                    singleItemSc.useDelimiter("@").useLocale(Locale.US);
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

                ordersArr[size] = new Order(s, orderedItemArr, timeInt, paid, totalPrice);
                size++;

            }
            sc.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Orders file not found");

        }

    }

    public Order[] getArr() {
        return ordersArr;
    }

    public int getSize() {
        return size;
    }

    // adds an order to an array and prints the array to a file 
    public void addOrder(Order order) {
        ordersArr[size] = order;
        size++;
        this.printToFile();
    }

    // prints array to file 
    public void printToFile() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("data\\Orders.txt"));
            for (int i = 0; i < size; i++) {
                pw.println(ordersArr[i].fileFormat());
            }
            pw.close();
        } catch (IOException ex) {
            System.out.println("Could not write to file");
        }
    }

    // gets thhe number of orders that are requested (either paid or unpaid) 
    public int getOutSize(boolean paid) {
        int outsize = 0;
        for (int i = 0; i < size; i++) {
            if (ordersArr[i].isPaid() == paid) {
                outsize++;
            }
        }
        return outsize;
    }
    // this mentod returns a 2d object array of that data of an order ot be displayed in a table 

    public Object[][] getOrdersForTable(boolean paid) {
        int outsize = this.getOutSize(paid);
        Object[][] out = new Object[outsize][6];
        int outIndex = 0;
        for (int row = 0; row < size; row++) {
            if (ordersArr[row].isPaid() == paid) {

                out[outIndex][0] = ordersArr[row].getStudent().getName();
                out[outIndex][1] = ordersArr[row].getStudent().getGrade();
                out[outIndex][2] = ordersArr[row].getOrderedItemArr().toString();
                out[outIndex][3] = ordersArr[row].getTime();
                out[outIndex][4] = ordersArr[row].isPaid();
                out[outIndex][5] = ordersArr[row].getTotalPrice();
                outIndex++;
            }
        }
        return out;
    }

    // compares the ordered items and quantities to those in the array. This method changed the boolean paid to true 
    public void changeToPaid(String order) {
        for (int i = 0; i < size; i++) {
            if (ordersArr[i].getOrderedItemArr().toString().equalsIgnoreCase(order)) {
                ordersArr[i].setPaid(true);
            }
        }
        this.printToFile();

    }

}
