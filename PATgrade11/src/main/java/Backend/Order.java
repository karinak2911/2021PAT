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
    private OrderedItem[] orderedItemsArr = new OrderedItem[150];
    private int size;
    private String time;
    private boolean paid;
    private double totalPrice;

    public Order() {
        
        
        size = 0;
    }


    public void setPaid(String paid) {
        if(paid.equalsIgnoreCase("Has not paid"))
            this.paid = false; 
        else 
            this.paid = true; 
    }

    public void addToOrder(MenuItem menuItem, int quantity) {
        OrderedItem newItem = new OrderedItem(quantity, menuItem);
        orderedItemsArr[size] = newItem; 
        size++;
    }

    public void deleteFromOrder(MenuItem menuItem) {
        for (int i = 0; i < size; i++) {
            if (orderedItemsArr[i].getName().equalsIgnoreCase(menuItem.getName()) && orderedItemsArr[i].getType().equalsIgnoreCase(menuItem.getType())) {
                this.shiftLeft(i);
            }

        }

    }

    private void shiftLeft(int index) {
        for (int i = index; i < size; i++) {
            orderedItemsArr[i] = orderedItemsArr[i + 1];
        }
        size--;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public void setOrderedItemsArr(OrderedItem[] orderedItemsArr) {
        this.orderedItemsArr = orderedItemsArr;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTotalPrice(double totalPrice) {
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
            out += orderedItemsArr[i].getName() + "@" + orderedItemsArr[i].getType() + "*" + orderedItemsArr[i].getQuantity();
        }
        return s.getName() + "@" + s.getGrade() + "\n" + out + "\n" + time + "\n" + paid + "\n" + totalPrice;
    }

}
