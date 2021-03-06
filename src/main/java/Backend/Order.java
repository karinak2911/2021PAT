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
// this class is a template for an order 
public class Order {

    private Student s;
    private OrderedItemArray orderedItemArr;
    private int time;
    private boolean paid;
    private double totalPrice;

    public Order(Student s, OrderedItemArray arr, int time, boolean paid, double totalPrice) {
        this.s = s;
        this.orderedItemArr = arr;
        this.time = time;
        this.paid = paid;
        this.totalPrice = totalPrice;
    }

    // this is how an order is printed to the file 
    public String fileFormat() {
        return s.fileFormat() + "\n" + orderedItemArr.fileFormat() + "\n" + time + "\n" + paid + "\n" + totalPrice;
    }

    public Student getStudent() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public OrderedItemArray getOrderedItemArr() {
        return orderedItemArr;
    }

    public void setArr(OrderedItemArray arr) {
        this.orderedItemArr = arr;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
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
