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
public class OrderedItem extends MenuItem {

    private int quantity;

    public OrderedItem(int quantity, MenuItem item) {
        super(item.name, item.price, item.type);
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPriceOfItem() {
        return this.quantity * this.price;
    }

    // add to string method 
}
