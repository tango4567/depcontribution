
import java.util.Random;
import javax.swing.JFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win-7
 */
public class GanretOTP extends javax.swing.JFrame {

    /**
     * Creates new form GanretOTP
     */
    String otp,otpcheck;
    public GanretOTP() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        jPanelVerify = new javax.swing.JPanel();
        jLabelMono1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldOTPCode = new javax.swing.JTextField();
        jLabelClose1 = new javax.swing.JLabel();
        jLabelmin1 = new javax.swing.JLabel();
        jButtonverify = new javax.swing.JButton();
        jLabelCode = new javax.swing.JLabel();
        jTextFieldVirifycode = new javax.swing.JTextField();
        jButtonOTP = new javax.swing.JButton();
        jLabelChechotp = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 0));
        setBounds(new java.awt.Rectangle(100, 100, 300, 300));
        setUndecorated(true);

        jPanelVerify.setBackground(new java.awt.Color(102, 102, 0));

        jLabelMono1.setFont(new java.awt.Font("Vladimir Script", 1, 48)); // NOI18N
        jLabelMono1.setForeground(new java.awt.Color(153, 204, 0));
        jLabelMono1.setText("FR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 153));
        jLabel2.setText("  Code : ");

        jTextFieldOTPCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOTPCodeActionPerformed(evt);
            }
        });

        jLabelClose1.setFont(new java.awt.Font("Shruti", 0, 24)); // NOI18N
        jLabelClose1.setForeground(new java.awt.Color(153, 204, 0));
        jLabelClose1.setText("X");
        jLabelClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClose1MouseClicked(evt);
            }
        });

        jLabelmin1.setFont(new java.awt.Font("Shruti", 0, 24)); // NOI18N
        jLabelmin1.setForeground(new java.awt.Color(153, 204, 0));
        jLabelmin1.setText("-");
        jLabelmin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelmin1MouseClicked(evt);
            }
        });

        jButtonverify.setText("Verify");
        jButtonverify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonverifyMouseClicked(evt);
            }
        });
        jButtonverify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonverifyActionPerformed(evt);
            }
        });

        jLabelCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCode.setForeground(new java.awt.Color(255, 0, 204));
        jLabelCode.setText("Your Verify Code is :");

        jTextFieldVirifycode.setEnabled(false);

        jButtonOTP.setText("OTP");
        jButtonOTP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOTPMouseClicked(evt);
            }
        });
        jButtonOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOTPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVerifyLayout = new javax.swing.GroupLayout(jPanelVerify);
        jPanelVerify.setLayout(jPanelVerifyLayout);
        jPanelVerifyLayout.setHorizontalGroup(
            jPanelVerifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVerifyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMono1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelVerifyLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabelCode, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldVirifycode, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButtonOTP)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVerifyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldOTPCode, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(jPanelVerifyLayout.createSequentialGroup()
                .addGroup(jPanelVerifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVerifyLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButtonverify, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVerifyLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabelChechotp, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelVerifyLayout.setVerticalGroup(
            jPanelVerifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVerifyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVerifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMono1)
                    .addGroup(jPanelVerifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelClose1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVerifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCode, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldVirifycode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOTP))
                .addGap(29, 29, 29)
                .addGroup(jPanelVerifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldOTPCode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelChechotp, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addComponent(jButtonverify, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelVerify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelVerify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldOTPCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOTPCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOTPCodeActionPerformed
    
    private void jLabelClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelClose1MouseClicked

    private void jLabelmin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelmin1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelmin1MouseClicked

    private void jButtonverifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonverifyMouseClicked
       UserInformation information = new UserInformation();
       int a=0;
do{
       otpcheck= jTextFieldOTPCode.getText();
       if(otpcheck.equalsIgnoreCase(otp)){
        information.setVisible(true);
        information.pack();
        information.setLocationByPlatform(false);
        information.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
       } else {
           jTextFieldVirifycode.setText("");
           jTextFieldOTPCode.setText("");
       jLabelChechotp.setText("Please check the oTP");
       }}while(a>1);
    }//GEN-LAST:event_jButtonverifyMouseClicked

    private void jButtonverifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonverifyActionPerformed

    }//GEN-LAST:event_jButtonverifyActionPerformed

    private void jButtonOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOTPActionPerformed

    private void jButtonOTPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOTPMouseClicked
       Random r=new Random();
        int  guess=r.nextInt(10000);
        int  t=1000;
        otp = String.valueOf(guess).toString();
        jTextFieldVirifycode.setText(otp);
    }//GEN-LAST:event_jButtonOTPMouseClicked

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
            java.util.logging.Logger.getLogger(GanretOTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GanretOTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GanretOTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GanretOTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GanretOTP().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOTP;
    private javax.swing.JButton jButtonverify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelChechotp;
    private javax.swing.JLabel jLabelClose1;
    private javax.swing.JLabel jLabelCode;
    private javax.swing.JLabel jLabelMono1;
    private javax.swing.JLabel jLabelmin1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelVerify;
    private javax.swing.JTextField jTextFieldOTPCode;
    private javax.swing.JTextField jTextFieldVirifycode;
    // End of variables declaration//GEN-END:variables
}
