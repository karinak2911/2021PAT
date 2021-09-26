/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Backend.MenuItemArray;
import Backend.StudentArray;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Navi
 */
public class ManageMenu extends javax.swing.JFrame {

    /**
     * Creates new form manageMenuFrame
     */
    public ManageMenu() {
        initComponents();

        // the menutitem arrray reads in the menu items from a text file and populates an array 
        MenuItemArray menuItems = new MenuItemArray();
        // this array is teh coloumn names for the menu item table 
        String[] coloumNames = new String[3];
        coloumNames[0] = "Names";
        coloumNames[1] = "Type";
        coloumNames[2] = "Price";

        // gets menu items data for table from menu item array object and populates table 
        Object[][] dataForMenuItemTb = menuItems.getMenuItemFormMangeMenu();
        // creates model 
        DefaultTableModel menuItemTableModel = new DefaultTableModel(dataForMenuItemTb, coloumNames);
        // sets table to model 
        menuTable.setModel(menuItemTableModel);

        // sets the action commands of the radio buttons 
        sandwichRadioButton.setActionCommand("Sandwich");
        wrapRadioButton.setActionCommand("Wrap");
        drinkRadioButton.setActionCommand("Drink");
        burgerRadioButton.setActionCommand("Burger");
        saladRadioButton.setActionCommand("Salad");
        snackRadioButton.setActionCommand("Snack");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        editItemButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        typeButtonGroup = new javax.swing.ButtonGroup();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        itemNameTextField = new javax.swing.JTextField();
        itemTypeLabel = new javax.swing.JLabel();
        sandwichRadioButton = new javax.swing.JRadioButton();
        burgerRadioButton = new javax.swing.JRadioButton();
        drinkRadioButton = new javax.swing.JRadioButton();
        saladRadioButton = new javax.swing.JRadioButton();
        wrapRadioButton = new javax.swing.JRadioButton();
        snackRadioButton = new javax.swing.JRadioButton();
        priceLabel = new javax.swing.JLabel();
        itemNameLabel = new javax.swing.JLabel();
        itempriceTextField = new javax.swing.JTextField();
        removeItemButton = new javax.swing.JButton();
        addItemButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        homeButton = new javax.swing.JButton();

        editItemButton.setText("EDIT ITEM");

        jLabel1.setText("Item name: ");

        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        itemNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNameTextFieldActionPerformed(evt);
            }
        });

        itemTypeLabel.setText("Item type: ");

        typeButtonGroup.add(sandwichRadioButton);
        sandwichRadioButton.setSelected(true);
        sandwichRadioButton.setText("Sandwich");

        typeButtonGroup.add(burgerRadioButton);
        burgerRadioButton.setText("Burger");
        burgerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burgerRadioButtonActionPerformed(evt);
            }
        });

        typeButtonGroup.add(drinkRadioButton);
        drinkRadioButton.setText("Drink");

        typeButtonGroup.add(saladRadioButton);
        saladRadioButton.setText("Salad");

        typeButtonGroup.add(wrapRadioButton);
        wrapRadioButton.setText("Wrap");
        wrapRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrapRadioButtonActionPerformed(evt);
            }
        });

        typeButtonGroup.add(snackRadioButton);
        snackRadioButton.setText("Snack");

        priceLabel.setText("Price: ");

        itemNameLabel.setText("Item name: ");

        removeItemButton.setText("REMOVE ITEM");
        removeItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemButtonActionPerformed(evt);
            }
        });

        addItemButton.setText("ADD ITEM");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name ", "Type", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        menuTable.setToolTipText("");
        jScrollPane1.setViewportView(menuTable);
        menuTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        homeButton.setText("HOME");
        homeButton.setActionCommand("");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(saladRadioButton)
                                .addGap(23, 23, 23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sandwichRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wrapRadioButton)
                            .addComponent(burgerRadioButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(itemNameLabel))
                    .addComponent(itemTypeLabel)
                    .addComponent(itemNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(snackRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(drinkRadioButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(removeItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addItemButton))
                    .addComponent(itempriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(itemNameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(itemNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(itemTypeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sandwichRadioButton)
                            .addComponent(wrapRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saladRadioButton)
                            .addComponent(burgerRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(snackRadioButton)
                            .addComponent(drinkRadioButton))
                        .addGap(18, 18, 18)
                        .addComponent(priceLabel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(itempriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addItemButton)
                            .addComponent(removeItemButton)))
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemButtonActionPerformed
        // TODO add your handling code here:

        // the menutitem arrray reads in the menu items from a text file and populates an array 
        MenuItemArray menuItemArray = new MenuItemArray();
        // gets the menu item name and type at seleceted row in table to be removed 
        int row = menuTable.getSelectedRow();
        String name = (String) menuTable.getValueAt(row, 0);
        String type = (String) menuTable.getValueAt(row, 1);
// deleted the menu item from the array 
        menuItemArray.deleteMenuItem(name, type);
        // repopulates the table data 
        String[] coloumNames = new String[3];
        coloumNames[0] = "Names";
        coloumNames[1] = "Type";
        coloumNames[2] = "Price";

        Object[][] data = menuItemArray.getMenuItemFormMangeMenu();

        DefaultTableModel model = new DefaultTableModel(data, coloumNames);
        menuTable.setModel(model);

    }//GEN-LAST:event_removeItemButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        //This is how you "open" a new screen based on a button press
        new Home().setVisible(true);
        //and close this screen.
        dispose();

    }//GEN-LAST:event_homeButtonActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void wrapRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrapRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wrapRadioButtonActionPerformed

    private void itemNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemNameTextFieldActionPerformed

    private void burgerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burgerRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_burgerRadioButtonActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        // TODO add your handling code here:

        MenuItemArray menuItemArray = new MenuItemArray();
        // gets the name, type and price of new mneu item 
        String name = itemNameTextField.getText();
        String type = (String) typeButtonGroup.getSelection().getActionCommand();
        double price = Double.parseDouble(itempriceTextField.getText());

        //adds the item to the array 
        menuItemArray.addMenuItem(name, price, type);

        String[] coloumNames = new String[3];
        coloumNames[0] = "Names";
        coloumNames[1] = "Type";
        coloumNames[2] = "Price";

        Object[][] data = menuItemArray.getMenuItemFormMangeMenu();

        DefaultTableModel model = new DefaultTableModel(data, coloumNames);
        menuTable.setModel(model);
    }//GEN-LAST:event_addItemButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton;
    private javax.swing.JRadioButton burgerRadioButton;
    private javax.swing.JRadioButton drinkRadioButton;
    private javax.swing.JButton editItemButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel itemNameLabel;
    private javax.swing.JTextField itemNameTextField;
    private javax.swing.JLabel itemTypeLabel;
    private javax.swing.JTextField itempriceTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable menuTable;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton removeItemButton;
    private javax.swing.JRadioButton saladRadioButton;
    private javax.swing.JRadioButton sandwichRadioButton;
    private javax.swing.JRadioButton snackRadioButton;
    private javax.swing.ButtonGroup typeButtonGroup;
    private javax.swing.JRadioButton wrapRadioButton;
    // End of variables declaration//GEN-END:variables
}
