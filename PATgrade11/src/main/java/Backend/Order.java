/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;


/**
 *
 * @author Navi
 */
public class Order {
    private Student s; 
    private MenuItem [] menuItemArr = new MenuItem[200]; 
    private int [] indivualPrice = new int[200]; 
    private int totalPrice; 
    private String time; 
    private boolean paid; 
    private int size; 

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

    public int getTotalPrice() {
        int totalPrice = 0 ; 
        for(int i = 0; i < size; i++){ 
            totalPrice += indivualPrice[i]; 
        }
        return totalPrice;
    }
    

} 