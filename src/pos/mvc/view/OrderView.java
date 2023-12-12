/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.mvc.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.mvc.controller.CustomerController;
import pos.mvc.controller.ItemController;
import pos.mvc.controller.OrderController;
import pos.mvc.model.Customer;
import pos.mvc.model.Item;
import pos.mvc.model.Order;
import pos.mvc.model.OrderDetail;

/**
 *
 * @author User
 */
public class OrderView extends javax.swing.JFrame {

    private CustomerController customerController;
    private ItemController itemController;
    private OrderController orderController;
    
    List<OrderDetail> orderDetails = new ArrayList<>();
    double total = 0.0;
    
    private Customer tempCustomer;
    private Item tempItem;
    /**
     * Creates new form OrderView
     */
    public OrderView() {
        customerController = new CustomerController();
        itemController = new ItemController();
        orderController = new OrderController();
        
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtOid = new javax.swing.JTextField();
        lblCustId = new javax.swing.JLabel();
        txtCustId = new javax.swing.JTextField();
        btnCustSearch = new javax.swing.JButton();
        lblCustData = new javax.swing.JLabel();
        lblItemId1 = new javax.swing.JLabel();
        txtItemId = new javax.swing.JTextField();
        btnItemSearch = new javax.swing.JButton();
        lblItemData = new javax.swing.JLabel();
        lblQty = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        btnAddToTable = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOder = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        lblTotalShow = new javax.swing.JLabel();
        btnPlaceOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setBackground(new java.awt.Color(51, 51, 255));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Order");

        lblId.setText("Order ID :");

        txtOid.setText(" ");

        lblCustId.setText("Customer ID :");

        txtCustId.setText(" ");

        btnCustSearch.setText("Search");
        btnCustSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustSearchActionPerformed(evt);
            }
        });

        lblCustData.setText(" ");

        lblItemId1.setText("Item ID :");

        txtItemId.setText(" ");

        btnItemSearch.setText("Search");
        btnItemSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemSearchActionPerformed(evt);
            }
        });

        lblItemData.setText(" ");

        lblQty.setText("Qty :");

        txtQty.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtQty.setText(" ");

        btnAddToTable.setText("Add");
        btnAddToTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToTableActionPerformed(evt);
            }
        });

        tblOder.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblOder);

        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTotal.setText(" ");

        lblTotalShow.setText("Total : ");

        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblQty, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(56, 56, 56)
                                            .addComponent(txtOid))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(56, 56, 56)
                                            .addComponent(txtCustId))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblItemId1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(56, 56, 56)
                                            .addComponent(txtItemId, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnItemSearch)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblItemData, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnCustSearch)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblCustData, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAddToTable)
                                        .addGap(454, 454, 454))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTotalShow, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnPlaceOrder)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustSearch)
                    .addComponent(lblCustData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemId1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnItemSearch)
                    .addComponent(lblItemData, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQty, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddToTable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(lblTotalShow))
                .addGap(47, 47, 47)
                .addComponent(btnPlaceOrder)
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustSearchActionPerformed
        searchCustomer();
    }//GEN-LAST:event_btnCustSearchActionPerformed

    private void btnItemSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemSearchActionPerformed
        searchItem();
    }//GEN-LAST:event_btnItemSearchActionPerformed

    private void btnAddToTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToTableActionPerformed
        addToTable();
    }//GEN-LAST:event_btnAddToTableActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        placeOrder();
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

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
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToTable;
    private javax.swing.JButton btnCustSearch;
    private javax.swing.JButton btnItemSearch;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCustData;
    private javax.swing.JLabel lblCustId;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblItemData;
    private javax.swing.JLabel lblItemId1;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalShow;
    private javax.swing.JTable tblOder;
    private javax.swing.JTextField txtCustId;
    private javax.swing.JTextField txtItemId;
    private javax.swing.JTextField txtOid;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables

    private void searchCustomer() {
        try {
            Customer customer = customerController.getCustomers(Integer.valueOf(txtCustId.getText()));
            if(customer != null){
                tempCustomer = customer;
                 lblCustData.setText(customer.getName());
             }else{
                JOptionPane.showMessageDialog(this,"Please enter valied Customer Id");        
            }
            
            
    
        } catch (SQLException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());        

        }
     }

    private void searchItem() {
        try {
            Item item = itemController.getItem(Integer.valueOf(txtItemId.getText()));
            
            if(item != null){
                tempItem = item;
                lblItemData.setText("Name : " + item.getName() + " | QOH : " + item.getQoh() + " | Price" + item.getUnitPrice() );
            }else{
                JOptionPane.showMessageDialog(this,"Please enter valied Item Id"); 
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
     }

    private void loadTable() {
        String [] column = {"Item Id", "Item Name", "Qty", "Unit Price", "Sub Total"};
        
        DefaultTableModel dtm = new DefaultTableModel(column,0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }        
        };
        tblOder.setModel(dtm);
        
        
     }

    private void addToTable() {
        if(tempItem!=null){
            OrderDetail od = new OrderDetail(-1,tempItem.getId(),Integer.valueOf(txtQty.getText()),tempItem.getUnitPrice(),tempItem.getName());
            orderDetails.add(od);
            DefaultTableModel dtm = (DefaultTableModel) tblOder.getModel();
            String [] rowData = {Integer.toString(od.getItemId()), 
                od.getName(), 
                Integer.toString(od.getQty()), 
                Double.toString(od.getUnitPrice()), 
                Double.toString(od.getUnitPrice()*od.getQty())};
            dtm.addRow(rowData);
            total+=od.getUnitPrice()*od.getQty();
            lblTotal.setText(Double.toHexString(total));
            cleanItemData();
        }else{            
            JOptionPane.showMessageDialog(this,"Please Select Item"); 

        }
     }

    private void cleanItemData() {
        txtItemId.setText("");
        txtQty.setText("");
        tempItem = null;
        lblItemData.setText("");
     }

    private void placeOrder() {
        Order order = new Order(Integer.valueOf(txtOid.getText()),tempCustomer.getId() , new Date(), total);
        try {
            String result = orderController.placeOrder(order, orderDetails);
            JOptionPane.showMessageDialog(this, result); 
        } catch (Exception ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage()); 
        }
        
        cleanForm();
     }

    private void cleanForm() {
        cleanItemData();
        tempCustomer = null;
        orderDetails = new ArrayList<>();
        total = 0.0;
        loadTable();
        txtCustId.setText("");
        txtOid.setText("");
        lblCustData.setText("");
     }
}