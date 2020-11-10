/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.Uber;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.plaf.SliderUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aditi
 */
public class ViewCarAll extends javax.swing.JPanel {

    /**
     * Creates new form ViewCarSeat
     */
     
    Uber uobj;
    JSplitPane splitPane;
    JPanel previousPanel;
    
    
    public ViewCarAll(Uber uobj, JSplitPane splitPane, SearchJPanel aThis) {
        initComponents();
        this.uobj=uobj;
        this.splitPane=splitPane;
        this.previousPanel=aThis;
        populate();
    }

    private void populate(){
    ArrayList<Car> carList = (ArrayList)uobj.getAvailableCarList();
    DefaultTableModel dtm = (DefaultTableModel)tblAvailable.getModel();
        dtm.setRowCount(0);
        for(Car c :carList){
            Object[] row= new Object[1];
            row[0]=c.getCarName();
            //row[1]=c.getCity();
            dtm.addRow(row);
        }
        carList = (ArrayList)uobj.getBookedCarList();
        dtm = (DefaultTableModel)tblUnavilable.getModel();
        dtm.setRowCount(0);
        for(Car c :carList){
            Object[] row= new Object[1];
            row[0]=c.getCarName();
            //row[1]=c.getCity();
            dtm.addRow(row);
        }
        
        
        
}
    
    
    public void refreshTable(){
        populate();
    }
    
    @Override
    public String toString() {
      //setUI((SliderUI)UIManager.getUI(this));
      //initComponents();
      refreshTable();
      return "ok";
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
        tblAvailable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUnavilable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnViewA = new javax.swing.JButton();
        btnSearchA = new javax.swing.JButton();
        btnViewU = new javax.swing.JButton();
        btnSearchU = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        tblAvailable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tblAvailable.setForeground(new java.awt.Color(0, 153, 153));
        tblAvailable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAvailable);

        tblUnavilable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tblUnavilable.setForeground(new java.awt.Color(0, 204, 51));
        tblUnavilable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unavailable"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblUnavilable);

        btnBack.setBackground(new java.awt.Color(0, 204, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnViewA.setBackground(new java.awt.Color(153, 153, 0));
        btnViewA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewA.setText("View");
        btnViewA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAActionPerformed(evt);
            }
        });

        btnSearchA.setBackground(new java.awt.Color(204, 153, 0));
        btnSearchA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearchA.setText("Search On this Set");
        btnSearchA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAActionPerformed(evt);
            }
        });

        btnViewU.setBackground(new java.awt.Color(153, 153, 0));
        btnViewU.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewU.setText("View");
        btnViewU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUActionPerformed(evt);
            }
        });

        btnSearchU.setBackground(new java.awt.Color(204, 153, 0));
        btnSearchU.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearchU.setText("Search On this Set");
        btnSearchU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnViewA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchA)))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnViewU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchU)))))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchA)
                    .addComponent(btnViewA)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearchU)
                        .addComponent(btnViewU)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        previousPanel.toString();
        splitPane.setRightComponent(previousPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAActionPerformed
        // TODO add your handling code here:
        int selectedRowA = tblAvailable.getSelectedRow();
        
        if(selectedRowA<0 ){
                  
            JOptionPane.showMessageDialog(null, "Please select a row from table first","Warning",JOptionPane.WARNING_MESSAGE);
            return;
                    
        }
        else{
            int column = 0;
            int row = tblAvailable.getSelectedRow();
            String value = tblAvailable.getModel().getValueAt(row, column).toString();
            Car car = null;
            for (Car c :  uobj.getAvailableCarList()){
                if(c.getCarName().equals(value)){
                    car=c;
                    break;
                }
            }
            /*for (Car c :  uobj.getBookedCarList()){
                if(c.getCarName().equals(value)){
                    car=c;
                    break;
                }
            }*/
            ViewCarJPanel panel =new ViewCarJPanel(car,uobj,splitPane,this);
            
            splitPane.setRightComponent(panel);
        }
    }//GEN-LAST:event_btnViewAActionPerformed

    private void btnSearchAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAActionPerformed
        // TODO add your handling code here:
        Uber newUobj=new Uber();
        ArrayList<Car> clist=(ArrayList)uobj.getAvailableCarList();
        if(clist==null){
            JOptionPane.showMessageDialog(null, "No data");
            return;
        }
        
        for(Car c:clist){
            if(c.getAvailable().equals("A"))
            {
                newUobj.getAvailableCarList().add(c);
            }
            else{
                newUobj.getBookedCarList().add(c);
            }
        }

        SearchJPanel panel = new SearchJPanel(splitPane,newUobj,this);
        splitPane.setRightComponent(panel);
    }//GEN-LAST:event_btnSearchAActionPerformed

    private void btnViewUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUActionPerformed
        // TODO add your handling code here:
        int selectedRowU = tblUnavilable.getSelectedRow();
        if(selectedRowU<0 ){
                  
            JOptionPane.showMessageDialog(null, "Please select a row from table first","Warning",JOptionPane.WARNING_MESSAGE);
            return;
                    
        }
        else{
            int column = 0;
            int row = tblUnavilable.getSelectedRow();
            String value = tblUnavilable.getModel().getValueAt(row, column).toString();
            Car car = null;
            /*for (Car c :  uobj.getAvailableCarList()){
                if(c.getCarName().equals(value)){
                    car=c;
                    break;
                }
            }*/
            for (Car c :  uobj.getBookedCarList()){
                if(c.getCarName().equals(value)){
                    car=c;
                    break;
                }
            }
            ViewCarJPanel panel =new ViewCarJPanel(car,uobj,splitPane,this);
            splitPane.setRightComponent(panel);
        }
    }//GEN-LAST:event_btnViewUActionPerformed

    private void btnSearchUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchUActionPerformed
        // TODO add your handling code here:
                Uber newUobj=new Uber();
        ArrayList<Car> clist=(ArrayList)uobj.getBookedCarList();
        if(clist==null){
            JOptionPane.showMessageDialog(null, "No data");
            return;
        }
        for(Car c:clist){
            if(c.getAvailable().equals("A"))
            {
                newUobj.getAvailableCarList().add(c);
            }
            else{
                newUobj.getBookedCarList().add(c);
            }
        }

        SearchJPanel panel = new SearchJPanel(splitPane,newUobj,this);
        splitPane.setRightComponent(panel);
    }//GEN-LAST:event_btnSearchUActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearchA;
    private javax.swing.JButton btnSearchU;
    private javax.swing.JButton btnViewA;
    private javax.swing.JButton btnViewU;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAvailable;
    private javax.swing.JTable tblUnavilable;
    // End of variables declaration//GEN-END:variables
}
