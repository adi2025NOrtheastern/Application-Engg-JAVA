/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.Uber;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import javax.swing.ImageIcon;

/**
 *
 * @author aditi
 */
public class CarMainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CarMainJFrame
     */
    List<Car> availableCarList;
    List<Car> bookedCarList;
    Uber uobj;
    public CarMainJFrame()  {
        initComponents();
        //this.availableCarList=new ArrayList<Car>();
        //this.bookedCarList=new ArrayList<Car>();
        uobj= new Uber();
        populateDataUber();
        ImageIcon imgThisImg = new ImageIcon("");

        lblImage.setIcon(imgThisImg);
        //jLabel2.setIcon(new ImageIcon("C:\\Users\\aditi\\Documents\\NetBeansProjects\\Assignment2\\car.jpg"));
    }
    
    private void populateDataUber() {
        
        try{
        //BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\aditi\\Desktop\\UberCar.txt"));
        File file = new File("C:\\Users\\aditi\\Desktop\\UberCar.txt"); 
        Scanner sc = new Scanner(file); 
  
        while (sc.hasNextLine()) {
        Car car= new Car();    
        String data =sc.nextLine(); 
        String[] d=data.split(",");
        UUID idOne = UUID.randomUUID();
        String uid=(String.valueOf(idOne));
        car.setUniqueId(uid);
            car.setCarName(d[0]);
            car.setManufacturer(d[1]);
            car.setCarType(d[2]);
            car.setManufactureYear(d[3]);
            car.setSeatCount(Integer.parseInt(d[4]));
            car.setSerialNumber(d[5]);
            car.setModelNumber(d[6]);
            car.setCity(d[7]);
            car.setMaintenanceCertiDate(d[8]);
            car.setAvailable(d[9]);
            String checkAvailable = d[9];
            if(checkAvailable.equals("A"))
            {
                uobj.getAvailableCarList().add(car);
            }
            else{
                uobj.getBookedCarList().add(car);
            }
        uobj.setModifiedDate(new Date().toString());
        }//end while
        }//end try
        catch(Exception e)
        {
            System.out.println("file error input!");
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

        splitPane = new javax.swing.JSplitPane();
        leftJPane = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rightJPane = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Welcome!");

        javax.swing.GroupLayout leftJPaneLayout = new javax.swing.GroupLayout(leftJPane);
        leftJPane.setLayout(leftJPaneLayout);
        leftJPaneLayout.setHorizontalGroup(
            leftJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPaneLayout.createSequentialGroup()
                .addGroup(leftJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftJPaneLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(leftJPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(leftJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(leftJPaneLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftJPaneLayout.setVerticalGroup(
            leftJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPaneLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(374, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(leftJPane);

        rightJPane.setBackground(new java.awt.Color(0, 102, 102));

        lblImage.setBackground(new java.awt.Color(153, 255, 255));
        lblImage.setForeground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout rightJPaneLayout = new javax.swing.GroupLayout(rightJPane);
        rightJPane.setLayout(rightJPaneLayout);
        rightJPaneLayout.setHorizontalGroup(
            rightJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightJPaneLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(536, Short.MAX_VALUE))
        );
        rightJPaneLayout.setVerticalGroup(
            rightJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightJPaneLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(rightJPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateCarListJPanel panel = new CreateCarListJPanel(uobj,splitPane,rightJPane);
        splitPane.setRightComponent(panel);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        SearchJPanel panel = new SearchJPanel(splitPane,uobj,this.leftJPane);
        splitPane.setRightComponent(panel);
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(CarMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarMainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblImage;
    private javax.swing.JPanel leftJPane;
    private javax.swing.JPanel rightJPane;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
