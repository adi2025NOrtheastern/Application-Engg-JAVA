/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aditi
 */
public class ViewVitalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    private VitalSignHistory vsh;
    
    public ViewVitalsJPanel(VitalSignHistory vsh) {
        initComponents();
        this.vsh=vsh;
        populateTable();
        //displayProduct(vsh);
    }

    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblVitalSigns.getModel();
        dtm.setRowCount(0);
        
        for(VitalSigns vs : vsh.getVitalSignHistory()){
            Object row[] = new Object[2];
            row[0]=vs;
            row[1]=vs.getBloodPressure();
            dtm.addRow(row);
        }
        
    }
    
     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitalSigns = new javax.swing.JTable();
        btnViewDetaiks = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblTemp = new javax.swing.JLabel();
        lblPressure = new javax.swing.JLabel();
        lblPulse = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        txtPressure = new javax.swing.JTextField();
        txtPulse = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Vital Sign");

        tblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "BloodPressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVitalSigns);

        btnViewDetaiks.setText("View Details");
        btnViewDetaiks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetaiksActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblTemp.setBackground(new java.awt.Color(204, 204, 255));
        lblTemp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTemp.setText("Temperature:");

        lblPressure.setBackground(new java.awt.Color(204, 204, 255));
        lblPressure.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPressure.setText("Blood Pressure:");

        lblPulse.setBackground(new java.awt.Color(204, 204, 255));
        lblPulse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPulse.setText("Pulse:");

        lblDate.setBackground(new java.awt.Color(204, 204, 255));
        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDate.setText("Date:");

        txtTemperature.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTemperature.setEnabled(false);

        txtPressure.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPressure.setEnabled(false);
        txtPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPressureActionPerformed(evt);
            }
        });

        txtPulse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPulse.setEnabled(false);

        txtDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDate.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTemp)
                            .addComponent(lblPressure)
                            .addComponent(lblPulse)
                            .addComponent(lblDate))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnViewDetaiks)
                                .addGap(37, 37, 37)
                                .addComponent(btnDelete))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPulse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDetaiks)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemp)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPressure)
                    .addComponent(txtPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulse)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPressureActionPerformed

    private void btnViewDetaiksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetaiksActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVitalSigns.getSelectedRow();  //returns index
        if(selectedRow >=0)
        {
            VitalSigns vs = (VitalSigns)tblVitalSigns.getValueAt(selectedRow, 0); //since we are binding the 
                                                                    //table at 0th position with the object so 0
           txtPressure.setText(String.valueOf(vs.getBloodPressure()));
           txtTemperature.setText(String.valueOf(vs.getTemperature()));
           txtPulse.setText(String.valueOf(vs.getPulse()));
           txtDate.setText(vs.getDate());
       
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select any row");
        }
    }//GEN-LAST:event_btnViewDetaiksActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVitalSigns.getSelectedRow();  //returns index
        if(selectedRow >=0)
        {
           VitalSigns vs = (VitalSigns)tblVitalSigns.getValueAt(selectedRow, 0); //since we are binding the 
                                                                    //table at 0th position with the object so 0
           
           int res = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?");  
           if(res == 0) {
           vsh.deleteVitals(vs);
           }
           
           
           populateTable();  // redisplay the table as we are on the same page.
       
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select any row");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnViewDetaiks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPressure;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JTable tblVitalSigns;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPressure;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
