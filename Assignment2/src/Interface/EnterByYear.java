/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.Uber;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.SliderUI;

/**
 *
 * @author aditi
 */
public class EnterByYear extends javax.swing.JPanel {

    Uber uobj;
    JSplitPane splitPane;
    ArrayList<Car> clist;
    JPanel previousFrame;
    String year;
    /**
     * Creates new form EnterByYear
     */
    public EnterByYear(Uber uobj, JSplitPane splitPane,JPanel previousFrame) {
        initComponents();
        this.uobj=uobj;
        this.splitPane=splitPane;
        this.previousFrame=previousFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEnter = new javax.swing.JLabel();
        txtEnter = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarYear = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnSearch1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lblEnter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEnter.setText("Enter value");

        txtEnter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblCarYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblCarYear.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car", "Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCarYear);

        btnView.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnSearch1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch1.setText("Search On this Set");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 204, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearch)
                            .addComponent(txtEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(btnView)
                        .addGap(72, 72, 72)
                        .addComponent(btnSearch1)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch1)
                    .addComponent(btnView))
                .addContainerGap(140, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String year = txtEnter.getText();
        this.year=year;
        if(year==null || "".equals(year)){
            JOptionPane.showMessageDialog(null, "Enter Year");
            return;
        }
        boolean match = year.matches("[0-9][0-9][0-9][0-9]");
        if(match == false){
            JOptionPane.showMessageDialog(null, "Enter Year correctly");
            return;
        }
        
        clist=(ArrayList) uobj.getCarListByYear(year);
        if(clist.isEmpty()){
            JOptionPane.showMessageDialog(null, "No Car");
            return;
        }
        DefaultTableModel dtm = (DefaultTableModel)tblCarYear.getModel();
        dtm.setRowCount(0);
        for(Car c :clist){
            Object[] row= new Object[2];
            row[0]=c.getCarName();
            row[1]=c.getManufactureYear();
            dtm.addRow(row);
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    
    public void refreshTable(){
        clist=(ArrayList) uobj.getCarListByYear(year);
        if(clist.isEmpty()){
            JOptionPane.showMessageDialog(null, "No Car");
            return;
        }
        DefaultTableModel dtm = (DefaultTableModel)tblCarYear.getModel();
        dtm.setRowCount(0);
        for(Car c :clist){
            Object[] row= new Object[2];
            row[0]=c.getCarName();
            row[1]=c.getManufactureYear();
            dtm.addRow(row);
        }
    }
  @Override
    public String toString() {
      //setUI((SliderUI)UIManager.getUI(this));
      //initComponents();
      refreshTable();
      return "ok";
   }
    
    
    
    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCarYear.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row from table first","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            int column = 0;
            int row = tblCarYear.getSelectedRow();
            String value = tblCarYear.getModel().getValueAt(row, column).toString();
            Car car = null;
            for (Car c :  uobj.getAvailableCarList()){
                if(c.getCarName().equals(value)){
                    car=c;
                    break;
                }
            }
            for (Car c :  uobj.getBookedCarList()){
                if(c.getCarName().equals(value)){
                    car=c;
                    break;
                }
            }
            ViewCarJPanel panel =new ViewCarJPanel(car,uobj,splitPane,this);
            splitPane.setRightComponent(panel);
        }

    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        // TODO add your handling code here:
        Uber newUobj=new Uber();
        
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
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        previousFrame.toString();
        splitPane.setRightComponent(previousFrame);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnter;
    private javax.swing.JTable tblCarYear;
    private javax.swing.JTextField txtEnter;
    // End of variables declaration//GEN-END:variables
}
