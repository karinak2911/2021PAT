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
    private OrderedItem[] orderedItemsArr;
    private int size;
    private String time;
    private boolean paid;
    private double totalPrice;

    public Order(Student s, String time, String paid) {
        this.s = s;
        this.time = time;
        if(paid.equalsIgnoreCase("Has not paid"))
            this.paid = false; 
        else 
            this.paid = true; 
        size = 0;
    }

    public void setOrderedItemsArr(OrderedItem[] orderedItemsArr) {
        this.orderedItemsArr = orderedItemsArr;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public void addToOrder(MenuItem menuItem, int quantity) {
        size++;
        orderedItemsArr[size - 1].setName(menuItem.getName());
        orderedItemsArr[size - 1].setType(menuItem.getType());
        orderedItemsArr[size - 1].setPrice(menuItem.getPrice());
        orderedItemsArr[size - 1].setQuantity(quantity);

    }

    public void deleteFromOrder(MenuItem menuItem) {
        for (int i = 0; i < size; i++) {
            if (orderedItemsArr[i].getName().equalsIgnoreCase(menuItem.getName()) && orderedItemsArr[i].getType().equalsIgnoreCase(menuItem.getType())) {
                this.shiftLeft(i);
            }

        }

    }

    public void shiftLeft(int index) {
        for (int i = index; i < size; i++) {
            orderedItemsArr[i] = orderedItemsArr[i + 1];
        }
        size--;
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
            out += orderedItemsArr[i].getName() + "@" + orderedItemsArr[i].getType();
        }
        return s.getName() + "@" + s.getGrade() + "\n" + out + "\n" + time + paid + totalPrice;
    }

}
