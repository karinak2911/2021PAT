/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Navi
 */
public class Order {

    private Student s;
    private OrderedItemArray arr; 
    private int time;
    private boolean paid;
    private double totalPrice;

    public Order(Student s, OrderedItemArray arr, int time, boolean paid, double totalPrice) {
        this.s = s;
        this.arr = arr;
        this.time = time;
        this.paid = paid;
        this.totalPrice = totalPrice;
    }

   

    



   

    public void setTotalPrice() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += orderedItemsArr[i].getTotalPriceOfItem();
        }
        this.totalPrice = total;
    }

    public String fileFormat() {
        String out = "";
        for (int i = 0; i < size; i++) {
            out += orderedItemsArr[i].getName() + orderedItemsArr[i].getType() + "*" + orderedItemsArr[i].getQuantity() + "\t";
        }
        return s.getName() + "@" + s.getGrade() + "\n" + out + "\n" + time + "\n" + paid + "\n" + totalPrice;
    }

}
