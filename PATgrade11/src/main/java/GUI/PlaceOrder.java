/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Backend.MenuItemArray;
import Backend.StudentArray;
import Backend.ItemTypesArray;
import Backend.Order;
import Backend.Student;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Navi
 */
public class PlaceOrder extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public PlaceOrder() {
        initComponents();
        DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<String>();
        ItemTypesArray itemNames = new ItemTypesArray();
        String[] types = itemNames.getArr();
        for (int i = 0; i < types.length; i++) {
            comboModel.addElement(types[i]);
        }
        itemTypeComboBox.setModel(comboModel);

        StudentArray students = new StudentArray();
        String[] namesForCombo = students.getStudentsnamesAsarrayForComboBox();
        for (int i = 0; i < namesForCombo.length; i++) {
            comboModel.addElement(namesForCombo[i]);
        }
        studentsComboBox.setModel(comboModel);

        firstBreakRadioButton.setActionCommand("First Break");
        secondBreakRadioButton.setActionCommand("Second Break");
        afterSchoolRadioButton.setActionCommand("After school");
        hasNotPaidRadioButton.setActionCommand("Has not paid");
        hasPaidRadioButton.setActionCommand("Has paid");

        String[] coloumnNamesForMenuTable = new String[2];
        coloumnNamesForMenuTable[0] = "Names";
        coloumnNamesForMenuTable[1] = "Price";

        MenuItemArray menuItems = new MenuItemArray();

        String type = (String) (itemTypeComboBox.getSelectedItem());
        Object[][] data = menuItems.getMenuItemFromType(type);

        DefaultTableModel model = new DefaultTableModel(data, coloumnNamesForMenuTable);
        menuItemsTable.setModel(model);
        
        String [] coloumnNamesForOrderTable = new String[4]; 
        coloumnNamesForOrderTable[0] = "Item Name"; 
        coloumnNamesForOrderTable [1] = "Item Type"; 
        coloumnNamesForOrderTable[2] = "Quanity"; 
        coloumnNamesForOrderTable[3] = "Price"; 

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
        jScrollPane6 = new javax.swing.JScrollPane();
        totalPriceTextArea = new javax.swing.JTextArea();
        addOrderButton = new javax.swing.JButton();
        menuLabel = new javax.swing.JLabel();
        doneButton = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));

        itemTypeLabel.setText("Item type: ");

        quantityLabel.setText("Quanitity:");

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        totalPriceLabel.setText("Total Price:");

        addToOrderButton.setText("ADD TO ORDER");

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

        jLabel1.setText("Current Order:");

        paidButtonGroup.add(hasNotPaidRadioButton);
        hasNotPaidRadioButton.setText("Has not paid");

        timeLabel.setText("Time:");

        timeButtonGroup.add(firstBreakRadioButton);
        firstBreakRadioButton.setText("First Break");
        firstBreakRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBreakRadioButtonActionPerformed(evt);
            }
        });

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

        totalPriceTextArea.setColumns(20);
        totalPriceTextArea.setRows(5);
        jScrollPane6.setViewportView(totalPriceTextArea);

        addOrderButton.setText("ADD ORDER");
        addOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderButtonActionPerformed(evt);
            }
        });

        menuLabel.setText("Menu: ");

        doneButton.setText("DONE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paidLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hasPaidRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hasNotPaidRadioButton))
                    .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(totalPriceLabel)
                        .addContainerGap(631, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(menuLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(studentsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(firstBreakRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(secondBreakRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(afterSchoolRadioButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addToOrderButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(timeLabel))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(itemTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(itemTypeLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(quantityLabel)
                                            .addGap(11, 11, 11))))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(367, 367, 367)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(removeFromOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeFromOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menuLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(itemTypeLabel)
                                    .addComponent(quantityLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(itemTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(addToOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(timeLabel)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(firstBreakRadioButton)
                                        .addComponent(secondBreakRadioButton)
                                        .addComponent(afterSchoolRadioButton))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(paidLabel)
                                    .addComponent(totalPriceLabel))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hasNotPaidRadioButton)
                                    .addComponent(hasPaidRadioButton))
                                .addGap(27, 27, 27)
                                .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        MenuItemArray menuItems = new MenuItemArray();

        String type = (String) (itemTypeComboBox.getSelectedItem());
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
        String name = (String)(studentsComboBox.getSelectedItem()); 
        StudentArray students = new StudentArray(); 
        Student s = students.getStudentForOrder(name); 
        String time = (String)timeButtonGroup.getSelection().getActionCommand(); 
        String paid = (String)paidButtonGroup.getSelection().getActionCommand(); 
        
        Order tuckshopOrder = new Order(s, time, paid); 
        

    }//GEN-LAST:event_addOrderButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrder().setVisible(true);
            }
        });
    }

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
    private javax.swing.JScrollPane jScrollPane6;
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
    private javax.swing.JLabel totalPriceLabel;
    private javax.swing.JTextArea totalPriceTextArea;
    private javax.swing.JRadioButton wrapRadioButton;
    // End of variables declaration//GEN-END:variables
}
