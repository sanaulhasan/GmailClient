
package com.sendinEmail;

import java.awt.Frame;






public class Configuration_window extends javax.swing.JFrame {
             
    Configuration config = new Configuration();
    public Configuration_window() {
        initComponents();
        address.setOpaque(false);
        password.setOpaque(false);
        address.setText(config.getProperty("address"));
        password.setText(config.getProperty("password"));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        address = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        cancel = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        save = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        address.setBackground(new java.awt.Color(0, 0, 0));
        address.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        address.setForeground(new java.awt.Color(153, 153, 153));
        address.setBorder(null);
        address.setCaretColor(new java.awt.Color(204, 204, 204));
        address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addressKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addressKeyReleased(evt);
            }
        });
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 480, 38));

        password.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setBorder(null);
        password.setCaretColor(new java.awt.Color(204, 204, 204));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 183, 480, 32));

        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelMouseReleased(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 40, 30));

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                minimizeMouseReleased(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 30, 30));

        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                saveMouseReleased(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 260, 105, 36));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sendinEmail/Config_interfaceGmail.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressKeyTyped
        
    }//GEN-LAST:event_addressKeyTyped

    private void addressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressKeyReleased

    }//GEN-LAST:event_addressKeyReleased

    private void cancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseReleased
        this.dispose();
        MainFrame main = new MainFrame();
              main.setVisible(true);

    }//GEN-LAST:event_cancelMouseReleased

    private void minimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseReleased
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseReleased

    private void saveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseReleased
                
              
              config.saveProperty("address", address.getText());
              config.saveProperty("password", password.getText());
              this.dispose();
              
              MainFrame main = new MainFrame();
              main.setVisible(true);

    }//GEN-LAST:event_saveMouseReleased

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Configuration_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuration_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuration_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuration_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuration_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField address;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel save;
    // End of variables declaration//GEN-END:variables
}
