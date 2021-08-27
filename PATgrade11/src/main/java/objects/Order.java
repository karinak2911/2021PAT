/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author Navi
 */
public class Order {
    private Student s; 
    private String food; 
    private int price; 
    private String time; 
    private boolean paid; 

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public Order(Student s, String food, int price, String time, boolean paid) {
        this.s = s;
        this.food = food;
        this.price = price;
        this.time = time;
        this.paid = paid;
    }
    
}
