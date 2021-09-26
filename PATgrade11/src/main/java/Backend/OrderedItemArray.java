/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author Karinak
 */
public class OrderedItemArray {

    private OrderedItem[] orderedItemArr = new OrderedItem[150];
    private int size;

    // this method adds an ordered item the array 
    public void add(MenuItem menuItem, int quantity) {
        OrderedItem newItem = new OrderedItem(quantity, menuItem);
        orderedItemArr[size] = newItem;
        size++;
    }

    // this method adds an ordered item the array by comparing the name and type 
    public void delete(MenuItem menuItem) {
        for (int i = 0; i < size; i++) {
            if (orderedItemArr[i].getName().equalsIgnoreCase(menuItem.getName()) && orderedItemArr[i].getType().equalsIgnoreCase(menuItem.getType())) {
                this.shiftLeft(i);
            }

        }

    }

    private void shiftLeft(int index) {
        for (int i = index; i < size; i++) {
            orderedItemArr[i] = orderedItemArr[i + 1];
        }
        size--;

    }

    // the total price of an ordered array is returned with this message. The total price of an order is the sum of teh total price of each ordered item
    public double getTotalPrice() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += orderedItemArr[i].getTotalPriceOfItem();
        }
        return total;
    }

    public String fileFormat() {
        String itemsStr = "";
        for (int i = 0; i < size; i++) {
            itemsStr += orderedItemArr[i].getName() + "@" + orderedItemArr[i].getType() + "@" + orderedItemArr[i].getPrice() + "@" + orderedItemArr[i].getQuantity() + "#";
        }
        // the last char is removed as the last car is a hashtag
        String output = itemsStr.substring(0, itemsStr.length() - 1);
        return output;
    }

    public OrderedItem[] getArr() {
        return orderedItemArr;
    }

    public void setArr(OrderedItem[] arr) {
        this.orderedItemArr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // the toString is used for the table 
    public String toString() {
        String out = "";
        for (int i = 0; i < size; i++) {
            out += orderedItemArr[i].getName() + " " + orderedItemArr[i].getType() + "@" + orderedItemArr[i].getPrice() + "*" + orderedItemArr[i].getQuantity();
        }
        return out;
    }

    // this method returns a 2D object array of the ordered items selected to populate the current order table on the place order screen
    public Object[][] getOrdredItemsData() {
        Object[][] out = new Object[size][5];
        for (int row = 0; row < size; row++) {

            out[row][0] = orderedItemArr[row].getName();
            out[row][1] = orderedItemArr[row].getType();
            out[row][2] = orderedItemArr[row].getPrice();
            out[row][3] = orderedItemArr[row].getQuantity();
            out[row][4] = orderedItemArr[row].getTotalPriceOfItem();

        }
        return out;

    }

}
