

package userinterface.RestaurantAdminRole;


import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  ajain
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem business;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
      
        this.account=account;
        
        this.business=business;
        Restaurant rs= business.getRestaurantDirectory().getRestaurantByManagerID(account.getEmployee().getId());
        valueLabel.setText(rs.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRestro = new javax.swing.JButton();
        manageMenu = new javax.swing.JButton();
        manageOrder = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        btnRestro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRestro.setText("Manage Restaurant Info");
        btnRestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestroActionPerformed(evt);
            }
        });
        add(btnRestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 330, -1));

        manageMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageMenu.setText("Manage menu");
        manageMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMenuActionPerformed(evt);
            }
        });
        add(manageMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 330, -1));

        manageOrder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageOrder.setText("Manage Orders");
        manageOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrderActionPerformed(evt);
            }
        });
        add(manageOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 330, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Restaurant :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestroActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        ManageRestINfoJPanel manageResturantInfoJPanel = new ManageRestINfoJPanel(userProcessContainer,account, business,business.getRestaurantDirectory(),business.getMenuDirectory());
        userProcessContainer.add("ManageResturantInfoJPanel",manageResturantInfoJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRestroActionPerformed

    private void manageMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMenuActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        ManageMenuJPanel manageMenuJPanel = new ManageMenuJPanel(userProcessContainer,account, business, business.getRestaurantDirectory(),business.getMenuDirectory());
        userProcessContainer.add("ManageMenuJPanel",manageMenuJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageMenuActionPerformed

    private void manageOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrderActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        ManageOrderJPanel manageResturantorderJPanel = new ManageOrderJPanel(userProcessContainer,account, business, business.getRestaurantDirectory(),business.getDeliveryManDirectory(),business.getMenuDirectory(),business.getOrderDirectory());
        userProcessContainer.add("ManageRestaurantOrderJPanel",manageResturantorderJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrderActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRestro;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageMenu;
    private javax.swing.JButton manageOrder;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
