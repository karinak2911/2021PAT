/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Backend.OrderArray;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Navi
 */
public class ViewOrders extends javax.swing.JFrame {

    /**
     * Creates new form ViewOrders
     */
    public ViewOrders() {
       paidOrdersOnlyRadioButton.setActionCommand("true");
       notPaidOrdersRadioButton.setActionCommand("false");
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        viewOrdersButtonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ordersTable = new javax.swing.JTable();
        paidOrdersOnlyRadioButton = new javax.swing.JRadioButton();
        notPaidOrdersRadioButton = new javax.swing.JRadioButton();
        changeToPaidButton = new javax.swing.JButton();
        viewOrdersButton = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));

        homeButton.setText("HOME");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        ordersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Grade", "Order", "Time", "Paid", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ordersTable);

        viewOrdersButtonGroup.add(paidOrdersOnlyRadioButton);
        paidOrdersOnlyRadioButton.setText("PAID ORDERS ONLY");
        paidOrdersOnlyRadioButton.setActionCommand("PAID ORDERS");
        paidOrdersOnlyRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidOrdersOnlyRadioButtonActionPerformed(evt);
            }
        });

        viewOrdersButtonGroup.add(notPaidOrdersRadioButton);
        notPaidOrdersRadioButton.setText("UNPAID ORDERS ONLY");
        notPaidOrdersRadioButton.setActionCommand("UNPAID ORDERS");
        notPaidOrdersRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notPaidOrdersRadioButtonActionPerformed(evt);
            }
        });

        changeToPaidButton.setText("CHANGE TO PAID");
        changeToPaidButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeToPaidButtonActionPerformed(evt);
            }
        });

        viewOrdersButton.setText("VIEW ORDERS");
        viewOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrdersButtonActionPerformed(evt);
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
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(paidOrdersOnlyRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(viewOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(notPaidOrdersRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(changeToPaidButton))
                                .addGap(0, 124, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(paidOrdersOnlyRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notPaidOrdersRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(changeToPaidButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notPaidOrdersRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notPaidOrdersRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notPaidOrdersRadioButtonActionPerformed

    private void paidOrdersOnlyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidOrdersOnlyRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paidOrdersOnlyRadioButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        //This is how you "open" a new screen based on a button press
        new Home().setVisible(true);
        //and close this screen.
        dispose();

    }//GEN-LAST:event_homeButtonActionPerformed

    private void viewOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrdersButtonActionPerformed
        // TODO add your handling code here:
        
        String paidStr = (String)viewOrdersButtonGroup.getSelection().getActionCommand(); 
        
        boolean paid = Boolean.parseBoolean(paidStr); 
        
        
        OrderArray allOrders = new OrderArray(); 
        initComponents();
        String [] coloumNames = new String[6]; 
        coloumNames[0] = "Student Name"; 
        coloumNames[1] = "Grade"; 
        coloumNames[2] = "Order"; 
        coloumNames[3] = "Time"; 
        coloumNames[4] = "Paid"; 
        coloumNames[5] = "Total"; 
        
       Object [][] data = allOrders.getOrdersForTable(paid); 
        DefaultTableModel model = new DefaultTableModel(data, coloumNames); 
        ordersTable.setModel(model);
    }//GEN-LAST:event_viewOrdersButtonActionPerformed

    private void changeToPaidButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeToPaidButtonActionPerformed
        // TODO add your handling code here:
        OrderArray orders = new OrderArray(); 
        int row = ordersTable.getSelectedRow(); 
        String order = (String) ordersTable.getValueAt(row, 2); 
      orders.changeToPaid(order);
      
       String paidStr = (String)viewOrdersButtonGroup.getSelection().getActionCommand(); 
        
        boolean paid = Boolean.parseBoolean(paidStr); 
        
        
        OrderArray allOrders = new OrderArray(); 
        initComponents();
        String [] coloumNames = new String[6]; 
        coloumNames[0] = "Student Name"; 
        coloumNames[1] = "Grade"; 
        coloumNames[2] = "Order"; 
        coloumNames[3] = "Time"; 
        coloumNames[4] = "Paid"; 
        coloumNames[5] = "Total"; 
        
       Object [][] data = allOrders.getOrdersForTable(paid); 
        DefaultTableModel model = new DefaultTableModel(data, coloumNames); 
        ordersTable.setModel(model);
        
        
        
    }//GEN-LAST:event_changeToPaidButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOrders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeToPaidButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton notPaidOrdersRadioButton;
    private javax.swing.JTable ordersTable;
    private javax.swing.JRadioButton paidOrdersOnlyRadioButton;
    private javax.swing.JButton viewOrdersButton;
    private javax.swing.ButtonGroup viewOrdersButtonGroup;
    // End of variables declaration//GEN-END:variables
}
