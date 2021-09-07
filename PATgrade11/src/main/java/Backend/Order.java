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
    private double totalPrice; 
    private String time; 
    private boolean paid; 


    public Order(Student s, int totalPrice, String time, boolean paid) {
        this.s = s;
        this.totalPrice = totalPrice;
        this.time = time;
        this.paid = paid;
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
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
    

} 