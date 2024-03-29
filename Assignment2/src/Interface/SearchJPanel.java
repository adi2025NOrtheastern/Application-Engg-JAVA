/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.Uber;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author aditi
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    JSplitPane splitPane;
    Uber uobj;
    JPanel previousPanel;
    public SearchJPanel(JSplitPane rightPane, Uber uobj,JPanel previousPanel) {
        initComponents();
        this.splitPane=rightPane;
        this.uobj=uobj;
        this.previousPanel=previousPanel;
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPssngrCar = new javax.swing.JButton();
        btnListManufactureCar = new javax.swing.JButton();
        btnCarAvailability = new javax.swing.JButton();
        btnGetCarByYear = new javax.swing.JButton();
        btnGetDate = new javax.swing.JButton();
        btnGetCarByExpDate = new javax.swing.JButton();
        btnGetCarByCity = new javax.swing.JButton();
        btnGetManufacturer = new javax.swing.JButton();
        btnFindSeatCount = new javax.swing.JButton();
        btnGetByModelNo = new javax.swing.JButton();
        btnGetBySNo = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        btnPssngrCar.setBackground(new java.awt.Color(0, 153, 204));
        btnPssngrCar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPssngrCar.setText("Find me the first available passenger car.");
        btnPssngrCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPssngrCarActionPerformed(evt);
            }
        });

        btnListManufactureCar.setBackground(new java.awt.Color(0, 153, 204));
        btnListManufactureCar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnListManufactureCar.setText("List all cars that are made by Toyota, GM, etc.");
        btnListManufactureCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListManufactureCarActionPerformed(evt);
            }
        });

        btnCarAvailability.setBackground(new java.awt.Color(0, 153, 204));
        btnCarAvailability.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCarAvailability.setText("How many cars are currently available. How many are not.");
        btnCarAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarAvailabilityActionPerformed(evt);
            }
        });

        btnGetCarByYear.setBackground(new java.awt.Color(0, 153, 204));
        btnGetCarByYear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGetCarByYear.setText("List all cars that were manufactured in a given year, ‘x’.");
        btnGetCarByYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetCarByYearActionPerformed(evt);
            }
        });

        btnGetDate.setBackground(new java.awt.Color(0, 153, 204));
        btnGetDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGetDate.setText("When was the last time the fleet catalog was updated.");
        btnGetDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDateActionPerformed(evt);
            }
        });

        btnGetCarByExpDate.setBackground(new java.awt.Color(0, 153, 204));
        btnGetCarByExpDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGetCarByExpDate.setText("List all cars that have expired maintenance certificate.");
        btnGetCarByExpDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetCarByExpDateActionPerformed(evt);
            }
        });

        btnGetCarByCity.setBackground(new java.awt.Color(0, 153, 204));
        btnGetCarByCity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGetCarByCity.setText("List all cars that are available in a given city.");
        btnGetCarByCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetCarByCityActionPerformed(evt);
            }
        });

        btnGetManufacturer.setBackground(new java.awt.Color(0, 153, 204));
        btnGetManufacturer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGetManufacturer.setText("List all the car manufacturers used by the (this) Uber.");
        btnGetManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetManufacturerActionPerformed(evt);
            }
        });

        btnFindSeatCount.setBackground(new java.awt.Color(0, 153, 204));
        btnFindSeatCount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFindSeatCount.setText("Find an available car with a minimum of x seats but no more than y seats.");
        btnFindSeatCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindSeatCountActionPerformed(evt);
            }
        });

        btnGetByModelNo.setBackground(new java.awt.Color(0, 153, 204));
        btnGetByModelNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGetByModelNo.setText("List all cars given the model number.");
        btnGetByModelNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetByModelNoActionPerformed(evt);
            }
        });

        btnGetBySNo.setBackground(new java.awt.Color(0, 153, 204));
        btnGetBySNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGetBySNo.setText("Find a car with the given serial number. List the attributes of the found car.");
        btnGetBySNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetBySNoActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPssngrCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCarAvailability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGetCarByCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGetDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListManufactureCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGetBySNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGetCarByExpDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGetByModelNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGetManufacturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFindSeatCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGetCarByYear, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnPssngrCar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCarAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGetCarByCity, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGetDate, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListManufactureCar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGetBySNo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGetCarByExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGetByModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGetManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFindSeatCount, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGetCarByYear, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPssngrCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPssngrCarActionPerformed
        // TODO add your handling code here:
        //Uber uobj= new Uber();
        Car car=uobj.getFirstAvlblPassngrCar();
        if(car==null){
            JOptionPane.showMessageDialog(null, "None available!");
            return;
        }
        System.out.println(car.getCarName()+ " " + car.getManufacturer());
        ViewCarJPanel view = new ViewCarJPanel(car,uobj,splitPane,this);
        this.splitPane.setRightComponent(view);
    }//GEN-LAST:event_btnPssngrCarActionPerformed

    private void btnListManufactureCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListManufactureCarActionPerformed
        // TODO add your handling code here:
        Map<String,ArrayList<Car>> mapObj = uobj.getCarListByManufacturer();
        if(mapObj==null){
            JOptionPane.showMessageDialog(null, "Nothing to display");
            return;
        }
        DisplayJPanel panel = new DisplayJPanel(mapObj,uobj,splitPane,this);
        this.splitPane.setRightComponent(panel);
        
    }//GEN-LAST:event_btnListManufactureCarActionPerformed

    private void btnCarAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarAvailabilityActionPerformed
        // TODO add your handling code here:
        int countAvailable=uobj.getAvailableCarCount();
        int countUnavailable=uobj.getUnavailableCarCount();
        JOptionPane.showMessageDialog(null, "Available car count ="+countAvailable +". Unavailable car count ="+countUnavailable);
        ViewCarAll panel = new ViewCarAll(uobj,splitPane,this);
        splitPane.setRightComponent(panel);
    }//GEN-LAST:event_btnCarAvailabilityActionPerformed

    private void btnGetCarByYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetCarByYearActionPerformed
        // TODO add your handling code here:
        EnterByYear panel = new EnterByYear(uobj,splitPane,this);
        splitPane.setRightComponent(panel);
    }//GEN-LAST:event_btnGetCarByYearActionPerformed

    private void btnGetDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDateActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null,"Modified date is: "+uobj.getModifiedDate());
    }//GEN-LAST:event_btnGetDateActionPerformed

    private void btnGetCarByExpDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetCarByExpDateActionPerformed
        // TODO add your handling code here:
        ArrayList<Car> carList = (ArrayList)uobj.getCarListByExpCerti();
        if(carList==null){
            JOptionPane.showMessageDialog(null, "No car found! refine search!");
            return;
        }
        DisplayCarDateList panel = new DisplayCarDateList(carList,splitPane,this,uobj);
        splitPane.setRightComponent(panel);
    }//GEN-LAST:event_btnGetCarByExpDateActionPerformed

    private void btnGetCarByCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetCarByCityActionPerformed
        // TODO add your handling code here:
        DisplayCarCity panel = new DisplayCarCity(uobj,splitPane,this);
        splitPane.setRightComponent(panel);
        
    }//GEN-LAST:event_btnGetCarByCityActionPerformed

    private void btnGetManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetManufacturerActionPerformed
        // TODO add your handling code here:
        //ArrayList<String> manufacturer = (ArrayList)uobj.getFleetManufacturerList();
        DisplayCarManufacturer panel= new DisplayCarManufacturer(uobj,splitPane,this);
        splitPane.setRightComponent(panel);
        
    }//GEN-LAST:event_btnGetManufacturerActionPerformed

    private void btnFindSeatCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindSeatCountActionPerformed
        // TODO add your handling code here:
        ViewCarJPanel panel = new ViewCarJPanel(uobj,splitPane,this);
        splitPane.setRightComponent(panel);
    }//GEN-LAST:event_btnFindSeatCountActionPerformed

    private void btnGetByModelNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetByModelNoActionPerformed
        // TODO add your handling code here:
        DisplayCarModelNo panel=new DisplayCarModelNo(uobj,splitPane,this);
        splitPane.setRightComponent(panel);
    }//GEN-LAST:event_btnGetByModelNoActionPerformed

    private void btnGetBySNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetBySNoActionPerformed
        // TODO add your handling code here:
        
        
        EnterValueJPanel panel = new EnterValueJPanel(uobj,splitPane,this);
        splitPane.setRightComponent(panel);
    }//GEN-LAST:event_btnGetBySNoActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        previousPanel.toString();
        splitPane.setRightComponent(previousPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCarAvailability;
    private javax.swing.JButton btnFindSeatCount;
    private javax.swing.JButton btnGetByModelNo;
    private javax.swing.JButton btnGetBySNo;
    private javax.swing.JButton btnGetCarByCity;
    private javax.swing.JButton btnGetCarByExpDate;
    private javax.swing.JButton btnGetCarByYear;
    private javax.swing.JButton btnGetDate;
    private javax.swing.JButton btnGetManufacturer;
    private javax.swing.JButton btnListManufactureCar;
    private javax.swing.JButton btnPssngrCar;
    // End of variables declaration//GEN-END:variables
}
