/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Backend.MenuItemArray;
import Backend.StudentArray;
import Backend.ItemTypesArray;
import Backend.MenuItem;
import Backend.Order;
import Backend.OrderArray;
import Backend.OrderedItemArray;
import Backend.Student;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Navi
 */
public class PlaceOrder extends javax.swing.JFrame {

    private OrderedItemArray orderedItemArray;

    /**
     * Creates new form Menu
     */
    public PlaceOrder() {
        initComponents();
        // creates an ordered item array object as this object is used throught teh jframe 
        orderedItemArray = new OrderedItemArray();

        // creates and sets the model of the combo box for menu item types 
        DefaultComboBoxModel<String> comboModelTypes = new DefaultComboBoxModel<String>();
        ItemTypesArray itemTypesArray = new ItemTypesArray();
        String[] types = itemTypesArray.getArr();
        for (int i = 0; i < types.length; i++) {
            comboModelTypes.addElement(types[i]);
        }
        itemTypeComboBox.setModel(comboModelTypes);

        // creates and sets the model of the combo box for the students by displaying their rnames  
        DefaultComboBoxModel<String> comboModelStudents = new DefaultComboBoxModel<String>();
        StudentArray students = new StudentArray();
        String[] namesForCombo = students.getStudentsnamesAsarrayForComboBox();
        for (int i = 0; i < namesForCombo.length; i++) {
            comboModelStudents.addElement(namesForCombo[i]);
        }
        studentsComboBox.setModel(comboModelStudents);

        // sets the action commands of teh radio buttons 
        firstBreakRadioButton.setActionCommand("0");
        secondBreakRadioButton.setActionCommand("1");
        afterSchoolRadioButton.setActionCommand("2");
        hasNotPaidRadioButton.setActionCommand("false");
        hasPaidRadioButton.setActionCommand("true");

        String[] coloumnNamesForMenuTable = new String[2];
        coloumnNamesForMenuTable[0] = "Names";
        coloumnNamesForMenuTable[1] = "Price";

        MenuItemArray menuItems = new MenuItemArray();

        // gets he data for the table based of the selected type of menu item 
        String type = (String) (itemTypeComboBox.getSelectedItem());
        // creates and sets model of table of menu ietms 
        Object[][] dataForMenuItemsTb = menuItems.getMenuItemFromType(type);
        DefaultTableModel menuItemsTbModel = new DefaultTableModel(dataForMenuItemsTb, coloumnNamesForMenuTable);
        menuItemsTable.setModel(menuItemsTbModel);

        // sets the total price field as the current total price of all the ordered items (this when the screen opens is 0) 
        totalPriceField.setText(Double.toString(orderedItemArray.getTotalPrice()));

        // creates model and populates current order table 
        String[] coloumnNamesForCurrentOrderTable = new String[5];
        coloumnNamesForCurrentOrderTable[0] = "Item Name";
        coloumnNamesForCurrentOrderTable[1] = "Item Type";
        coloumnNamesForCurrentOrderTable[2] = "Item Price";
        coloumnNamesForCurrentOrderTable[3] = "Quantity";
        coloumnNamesForCurrentOrderTable[4] = "Total";

        // the data for the current order table is based of the selected menu item and quantitiy of item 
        Object[][] dataForCurrentOrderTb = orderedItemArray.getOrdredItemsData();
        DefaultTableModel currentOrderTbModel = new DefaultTableModel(dataForCurrentOrderTb, coloumnNamesForCurrentOrderTable);
        currentOrderTable.setModel(currentOrderTbModel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        drinkRadioButton = new javax.swing.JRadioButton();
        saladRadioButton = new javax.swing.JRadioButton();
        wrapRadioButton = new javax.swing.JRadioButton();
        snackRadioButton = new javax.swing.JRadioButton();
        sandwichRadioButton = new javax.swing.JRadioButton();
        burgerRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        addDetailsButton = new javax.swing.JButton();
        timeButtonGroup = new javax.swing.ButtonGroup();
        paidButtonGroup = new javax.swing.ButtonGroup();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        studentLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        priceTextArea = new javax.swing.JTextArea();
        doneButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        itemTypeLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        totalPriceLabel = new javax.swing.JLabel();
        addToOrderButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuItemsTable = new javax.swing.JTable();
        homeButton = new javax.swing.JButton();
        itemTypeComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        hasNotPaidRadioButton = new javax.swing.JRadioButton();
        timeLabel = new javax.swing.JLabel();
        firstBreakRadioButton = new javax.swing.JRadioButton();
        secondBreakRadioButton = new javax.swing.JRadioButton();
        afterSchoolRadioButton = new javax.swing.JRadioButton();
        paidLabel = new javax.swing.JLabel();
        hasPaidRadioButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        studentsComboBox = new javax.swing.JComboBox<>();
        removeFromOrderButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        currentOrderTable = new javax.swing.JTable();
        addOrderButton = new javax.swing.JButton();
        menuLabel = new javax.swing.JLabel();
        totalPriceField = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        drinkRadioButton.setText("Drink");

        saladRadioButton.setText("Salad");

        wrapRadioButton.setText("Wrap");
        wrapRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrapRadioButtonActionPerformed(evt);
            }
        });

        snackRadioButton.setText("Snack");

        sandwichRadioButton.setText("Sandwich");

        burgerRadioButton2.setText("Burger");

        jButton1.setText("jButton1");

        addDetailsButton.setText("ADD DETAILS");
        addDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDetailsButtonActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList1);

        studentLabel.setText("Student: ");

        priceTextArea.setColumns(20);
        priceTextArea.setRows(5);
        jScrollPane3.setViewportView(priceTextArea);

        doneButton.setText("DONE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));

        quantityLabel.setText("Quanitity:");

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        totalPriceLabel.setText("Total Price:");

        addToOrderButton.setText("ADD TO ORDER");
        addToOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToOrderButtonActionPerformed(evt);
            }
        });

        menuItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(menuItemsTable);

        homeButton.setText("HOME");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        itemTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sandwich", "Wrap", "Burger", "Salad", "Snack", "Drink" }));
        itemTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTypeComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel1.setText("Current Order:");

        paidButtonGroup.add(hasNotPaidRadioButton);
        hasNotPaidRadioButton.setSelected(true);
        hasNotPaidRadioButton.setText("Has not paid");

        timeLabel.setText("Time:");

        timeButtonGroup.add(firstBreakRadioButton);
        firstBreakRadioButton.setSelected(true);
        firstBreakRadioButton.setText("First Break");
        firstBreakRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBreakRadioButtonActionPerformed(evt);
            }
        });

        timeButtonGroup.add(secondBreakRadioButton);
        secondBreakRadioButton.setText("Second Break ");

        timeButtonGroup.add(afterSchoolRadioButton);
        afterSchoolRadioButton.setText("After school");

        paidLabel.setText("Has the student paid");

        paidButtonGroup.add(hasPaidRadioButton);
        hasPaidRadioButton.setText("Has paid");
        hasPaidRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasPaidRadioButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Student:");

        studentsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        studentsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsComboBoxActionPerformed(evt);
            }
        });

        removeFromOrderButton.setText("REMOVE FROM ORDER");
        removeFromOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromOrderButtonActionPerformed(evt);
            }
        });

        currentOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(currentOrderTable);

        addOrderButton.setText("SUMBIT");
        addOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderButtonActionPerformed(evt);
            }
        });

        menuLabel.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        menuLabel.setText("Menu: ");
        menuLabel.setToolTipText("");

        totalPriceField.setEditable(false);
        totalPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(paidLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(secondBreakRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(afterSchoolRadioButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(hasNotPaidRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(hasPaidRadioButton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(timeLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(firstBreakRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(itemTypeLabel)
                                                        .addGap(59, 59, 59)
                                                        .addComponent(itemTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(95, 95, 95)
                                                        .addComponent(menuLabel))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(studentsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(quantityLabel)
                                                .addGap(26, 26, 26)
                                                .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(addToOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(189, 189, 189))
                                    .addComponent(removeFromOrderButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(totalPriceLabel)
                                .addGap(50, 50, 50)
                                .addComponent(totalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(94, 94, 94))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(itemTypeLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(menuLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLabel)
                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addToOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeFromOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel)
                    .addComponent(firstBreakRadioButton)
                    .addComponent(secondBreakRadioButton)
                    .addComponent(afterSchoolRadioButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paidLabel)
                    .addComponent(hasNotPaidRadioButton)
                    .addComponent(hasPaidRadioButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPriceLabel)
                    .addComponent(totalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wrapRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrapRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wrapRadioButtonActionPerformed

    private void addDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDetailsButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_addDetailsButtonActionPerformed

    private void itemTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTypeComboBoxActionPerformed
        // TODO add your handling code here:
        String[] coloumnNamesForMenuTable = new String[2];
        coloumnNamesForMenuTable[0] = "Names";
        coloumnNamesForMenuTable[1] = "Price";

        // creates new menu item array 
        MenuItemArray menuItems = new MenuItemArray();

        String type = (String) (itemTypeComboBox.getSelectedItem());
        
        // sets data in table to menu items of selected type 
        Object[][] data = menuItems.getMenuItemFromType(type);
        DefaultTableModel model = new DefaultTableModel(data, coloumnNamesForMenuTable);
        menuItemsTable.setModel(model);

    }//GEN-LAST:event_itemTypeComboBoxActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        //and close this screen.
        dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void studentsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_studentsComboBoxActionPerformed

    private void firstBreakRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBreakRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstBreakRadioButtonActionPerformed

    private void hasPaidRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasPaidRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasPaidRadioButtonActionPerformed

    private void addOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderButtonActionPerformed
        // TODO add your handling code here:

        // a student object is created based of the student name selected from the combo box 
        String name = (String) (studentsComboBox.getSelectedItem());
        StudentArray students = new StudentArray();
        Student s = students.getStudentForOrder(name);

        // the total price of the order is gotten from teh total price text area 
        double totalPrice = Double.parseDouble(totalPriceField.getText());

        // the time of the order is based of the radio button selection 
        String timeString = (String) timeButtonGroup.getSelection().getActionCommand();
        int time = Integer.parseInt(timeString);

        // whether the student has paid is based of the radio button selection 
        boolean paid = Boolean.parseBoolean((String) paidButtonGroup.getSelection().getActionCommand());

        // a new order object is created  
        Order newOrder = new Order(s, orderedItemArray, time, paid, totalPrice);
        OrderArray orderArr = new OrderArray();
        // this new order is addded to the order array 
        orderArr.addOrder(newOrder);

        // Sets the home screen 
        new Home().setVisible(true);
        //and close this screen.
        dispose();


    }//GEN-LAST:event_addOrderButtonActionPerformed

    private void addToOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToOrderButtonActionPerformed
        // TODO add your handling code here:

        // gets the fields of the selected menu item 
        int row = menuItemsTable.getSelectedRow();
        String name = (String) menuItemsTable.getValueAt(row, 0);
        double price = (double) menuItemsTable.getValueAt(row, 1);
        String type = (String) itemTypeComboBox.getSelectedItem();
        int quantity = (Integer) quantitySpinner.getValue();
        // creates new menu item 
        MenuItem currentMenuItem = new MenuItem(name, price, type);
        // adds item to ordered item arrr 
        orderedItemArray.add(currentMenuItem, quantity);

        // restes the total price 
       totalPriceField.setText(Double.toString(orderedItemArray.getTotalPrice()));

        String[] coloumnNamesForCurrentOrderTable = new String[5];
        coloumnNamesForCurrentOrderTable[0] = "Item Name";
        coloumnNamesForCurrentOrderTable[1] = "Item Type";
        coloumnNamesForCurrentOrderTable[2] = "Item Price";
        coloumnNamesForCurrentOrderTable[3] = "Quantity";
        coloumnNamesForCurrentOrderTable[4] = "Total";

        // the data for the current order table is based of the selected menu item and quantitiy of item 
        Object[][] data = orderedItemArray.getOrdredItemsData();
        DefaultTableModel model = new DefaultTableModel(data, coloumnNamesForCurrentOrderTable);
        currentOrderTable.setModel(model);

    }//GEN-LAST:event_addToOrderButtonActionPerformed

    private void removeFromOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromOrderButtonActionPerformed
        // TODO add your handling code here:

        // gets fields of selected ordered item 
        int row = currentOrderTable.getSelectedRow();
        String name = (String) currentOrderTable.getValueAt(row, 0);
        String type = (String) currentOrderTable.getValueAt(row, 1);
        double price = (double) currentOrderTable.getValueAt(row, 2);
        // creates new menu item 
        MenuItem currentMenuItem = new MenuItem(name, price, type);
        // deletes menu item from current order 
        orderedItemArray.delete(currentMenuItem);

        // resets total price 
        totalPriceField.setText(Double.toString(orderedItemArray.getTotalPrice()));

        String[] coloumnNamesForCurrentOrderTable = new String[5];
        coloumnNamesForCurrentOrderTable[0] = "Item Name";
        coloumnNamesForCurrentOrderTable[1] = "Item Type";
        coloumnNamesForCurrentOrderTable[2] = "Item Price";
        coloumnNamesForCurrentOrderTable[3] = "Quantity";
        coloumnNamesForCurrentOrderTable[4] = "Total";

        // resets data in current order table 
        Object[][] data = orderedItemArray.getOrdredItemsData();
        DefaultTableModel model = new DefaultTableModel(data, coloumnNamesForCurrentOrderTable);
        currentOrderTable.setModel(model);


    }//GEN-LAST:event_removeFromOrderButtonActionPerformed

    private void totalPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPriceFieldActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDetailsButton;
    private javax.swing.JButton addOrderButton;
    private javax.swing.JButton addToOrderButton;
    private javax.swing.JRadioButton afterSchoolRadioButton;
    private javax.swing.JRadioButton burgerRadioButton2;
    private javax.swing.JTable currentOrderTable;
    private javax.swing.JButton doneButton;
    private javax.swing.JRadioButton drinkRadioButton;
    private javax.swing.JRadioButton firstBreakRadioButton;
    private javax.swing.JRadioButton hasNotPaidRadioButton;
    private javax.swing.JRadioButton hasPaidRadioButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JComboBox<String> itemTypeComboBox;
    private javax.swing.JLabel itemTypeLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable menuItemsTable;
    private javax.swing.JLabel menuLabel;
    private javax.swing.ButtonGroup paidButtonGroup;
    private javax.swing.JLabel paidLabel;
    private javax.swing.JTextArea priceTextArea;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JButton removeFromOrderButton;
    private javax.swing.JRadioButton saladRadioButton;
    private javax.swing.JRadioButton sandwichRadioButton;
    private javax.swing.JRadioButton secondBreakRadioButton;
    private javax.swing.JRadioButton snackRadioButton;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JComboBox<String> studentsComboBox;
    private javax.swing.ButtonGroup timeButtonGroup;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JTextField totalPriceField;
    private javax.swing.JLabel totalPriceLabel;
    private javax.swing.JRadioButton wrapRadioButton;
    // End of variables declaration//GEN-END:variables
}
