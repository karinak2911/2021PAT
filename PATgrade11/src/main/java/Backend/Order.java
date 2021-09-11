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
    private OrderedItemArray orderedItems;
    private String time;
    private boolean paid;
    private double totalPrice;

    public Order(Student s, OrderedItemArray orderedItems, String time, boolean paid, double totalPrice) {
        this.s = s;
        this.orderedItems = orderedItems;
        this.time = time;
        this.paid = paid;
        this.totalPrice = totalPrice;
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public OrderedItemArray getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(OrderedItemArray orderedItems) {
        this.orderedItems = orderedItems;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
