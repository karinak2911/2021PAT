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
    private OrderedItem [] arr = new OrderedItem[150]; 
    private int size; 
    
    
    
    
     public void add(MenuItem menuItem, int quantity) {
        OrderedItem newItem = new OrderedItem(quantity, menuItem);
        arr[size] = newItem; 
        size++;
    }

    public void delete(MenuItem menuItem) {
        for (int i = 0; i < size; i++) {
            if (arr[i].getName().equalsIgnoreCase(menuItem.getName()) && arr[i].getType().equalsIgnoreCase(menuItem.getType())) {
                this.shiftLeft(i);
            }

        }

    }

    private void shiftLeft(int index) {
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }
    
    

}
