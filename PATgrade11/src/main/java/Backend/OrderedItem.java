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
// an ordered item is a menu item with a quantity it therefore exteds the class 
public class OrderedItem extends MenuItem {

    private int quantity;

    public OrderedItem(int quantity, MenuItem item) {
        super(item.name, item.price, item.type);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // returns the total price of that item. Multiplies quantity by price of indiviual item 
    public double getTotalPriceOfItem() {
        return this.quantity * this.price;
    }

}
