/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Abstract.User;
import Business.Users.Admin;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AEDSpring2019
 */
public class AdminMainScreen extends javax.swing.JPanel {

    /**
     * Creates new form AdminMainScreen
     */
    private JPanel panelRight;
    private Admin admin;
    JSplitPane splitPane;
    public AdminMainScreen(JPanel panelRight, Admin admin,JSplitPane splitPane) {
        initComponents();
        this.panelRight = panelRight;
        this.admin = admin;
        this.splitPane=splitPane;
        populate();
        populateCustomer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCust = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSup = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 204));

        btnCreate.setBackground(new java.awt.Color(204, 255, 204));
        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreate.setText("Create User >>");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        tableCust.setBackground(new java.awt.Color(204, 204, 0));
        tableCust.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        tableCust.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tableCust.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Date Created"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCust);

        tableSup.setBackground(new java.awt.Color(204, 204, 0));
        tableSup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tableSup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier Name", "Number of Products"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableSup);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreate)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(466, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        /*CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.add(new AdminCreateScreen(panelRight, admin, splitPane));
        layout.next(panelRight);*/
        
        AdminCreateScreen panel = new AdminCreateScreen(panelRight, admin, splitPane);
        splitPane.setRightComponent(panel);
        
        
    }//GEN-LAST:event_btnCreateActionPerformed


    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel)tableSup.getModel();
        dtm.setRowCount(0);
        if(admin.getSuppDir().getSupplierList()!=null){
            
        for(User u : admin.getSuppDir().getSupplierList()){
            Supplier s = (Supplier)u;
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=s.getUserName();
            row[1]=s.getDirectory().getProductList().size();
            dtm.addRow(row);
            System.out.println("row-->"+row[0]+" "+row[1]);
        }
        }

    }
    
    
    public void populateCustomer(){
        DefaultTableModel dtm = (DefaultTableModel)tableCust.getModel();
        dtm.setRowCount(0);
        if( admin.getCustDir().getCustomerList()!=null){
        for(User u : admin.getCustDir().getCustomerList()){
            Customer s = (Customer)u;
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=s.getUserName();
            row[1]=s.getDateCreated();
            dtm.addRow(row);
            System.out.println("row-->"+row[0]+" "+row[1]);
        }
        }
    }
    
    
     public void updateData(){
         populate();
         populateCustomer();
     }
     
    /*@Override
    public String toString(){
        populate();
        populateCustomer();
        return "ok";
    }*/
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableCust;
    private javax.swing.JTable tableSup;
    // End of variables declaration//GEN-END:variables
}
