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
    public double getTotalPrice() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += arr[i].getTotalPriceOfItem(); 
        }
        return total; 
    }
    public String fileFormat(){ 
        String out = ""; 
        for(int i = 0; i < size; i++){ 
            out += arr[i].getName() + "@" + arr[i].getType() + "@"+ arr[i].getPrice() + "@" + arr[i].getQuantity() + "#"; 
        }
        String output = out.substring(0, out.length()- 1); 
        return output; 
    }

    public OrderedItem[] getArr() {
        return arr;
    }

    public void setArr(OrderedItem[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public String toString(){ 
        String out = ""; 
        for(int i = 0; i < size; i++){ 
            out += arr[i].getName() + " " + arr[i].getType() + "@"  + arr[i].getPrice() + "*" + arr[i].getQuantity(); 
        }
        return out; 
    } 
    
     public Object[][] getOrdredItemsData() {
        Object[][] out = new Object[size][5];
        for (int row = 0; row < size; row++) {

            out[row][0] = arr[row].getName();
            out[row][1] = arr[row].getType(); 
            out[row][2] = arr[row].getPrice(); 
            out[row][3] = arr[row].getQuantity(); 
            out [row][4] = arr[row].getTotalPriceOfItem(); 

        }
        return out;

    }
    

}
