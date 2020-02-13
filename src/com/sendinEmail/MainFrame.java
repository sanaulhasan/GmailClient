
package com.sendinEmail;


import com.apple.eawt.Application;
import java.awt.Color;
import java.awt.Frame;
import javax.swing.ImageIcon;



public class MainFrame extends javax.swing.JFrame {
   public static int count = 0;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        
    // Application.getApplication().setDockIconImage(new ImageIcon("/com/sendinEmail/appicon.png").getImage());

        to.setOpaque(false);
        subject.setOpaque(false);
        new_btn.setVisible(false);
        new_btn.setEnabled(false);
        
 this.setIconImage(new ImageIcon(getClass().getResource("/com/sendinEmail/appicon.png")).getImage() );
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minimize = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        send = new javax.swing.JLabel();
        subject = new javax.swing.JTextField();
        status = new javax.swing.JLabel();
        to = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        new_btn = new javax.swing.JLabel();
        config = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                minimizeMouseReleased(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 30, 30));

        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelMouseReleased(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 40, 30));

        send.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sendMouseReleased(evt);
            }
        });
        getContentPane().add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 432, 105, 36));

        subject.setBackground(new java.awt.Color(0, 0, 0));
        subject.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        subject.setForeground(new java.awt.Color(153, 153, 153));
        subject.setBorder(null);
        subject.setCaretColor(new java.awt.Color(204, 204, 204));
        subject.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                subjectKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subjectKeyReleased(evt);
            }
        });
        getContentPane().add(subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 160, 480, 38));

        status.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 426, 210, 40));

        to.setBackground(new java.awt.Color(0, 0, 0));
        to.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        to.setForeground(new java.awt.Color(153, 153, 153));
        to.setBorder(null);
        to.setCaretColor(new java.awt.Color(204, 204, 204));
        to.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                toKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                toKeyReleased(evt);
            }
        });
        getContentPane().add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 64, 480, 38));

        jScrollPane1.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        message.setBackground(new java.awt.Color(51, 51, 51));
        message.setColumns(20);
        message.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        message.setForeground(new java.awt.Color(153, 153, 153));
        message.setRows(4);
        message.setBorder(null);
        message.setCaretColor(new java.awt.Color(204, 204, 204));
        message.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                messageKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                messageKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(message);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 470, 100));

        new_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sendinEmail/new_btn.png"))); // NOI18N
        new_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        new_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                new_btnMouseReleased(evt);
            }
        });
        getContentPane().add(new_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 432, 70, 40));

        config.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        config.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                configMouseReleased(evt);
            }
        });
        getContentPane().add(config, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 40, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sendinEmail/interfaceGmail.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseReleased
        System.exit(0);
        
    }//GEN-LAST:event_cancelMouseReleased

    private void minimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseReleased
       this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseReleased

    private void sendMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMouseReleased
      
        if(count==0){
            to.setEditable(false);
            subject.setEditable(false);
            message.setEditable(false);
            
            System.out.println("clicked");
         status.setIcon(new ImageIcon(getClass().getResource("/com/sendinEmail/wait.GIF")) );
          MainFrame.status.setForeground(Color.gray);
         MainFrame.status.setText("  Sending Email");
        count++;
        new Thread(){
        @Override
        public void run(){
        
        SendEmail se = new SendEmail(to.getText(), subject.getText(), message.getText());
        
        }
        }.start();
        }
         
         
    }//GEN-LAST:event_sendMouseReleased

    private void toKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toKeyReleased
        
    }//GEN-LAST:event_toKeyReleased

    private void subjectKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subjectKeyReleased
        
    }//GEN-LAST:event_subjectKeyReleased

    private void messageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_messageKeyReleased
       
    }//GEN-LAST:event_messageKeyReleased

    private void toKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toKeyTyped
       
        status.setIcon(null);
        MainFrame.status.setText("");
       
    }//GEN-LAST:event_toKeyTyped

    private void subjectKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subjectKeyTyped
        
        
    }//GEN-LAST:event_subjectKeyTyped

    private void messageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_messageKeyTyped
        
        
    }//GEN-LAST:event_messageKeyTyped

    private void new_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_btnMouseReleased
       to.setText("");
       subject.setText("");
       message.setText("");
       status.setIcon(null);
        MainFrame.status.setText("");
        new_btn.setVisible(false);
        new_btn.setEnabled(false);
    }//GEN-LAST:event_new_btnMouseReleased

    private void configMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configMouseReleased
      this.dispose();
      Configuration_window config = new Configuration_window();
        config.setVisible(true);
        
    }//GEN-LAST:event_configMouseReleased

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel config;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea message;
    private javax.swing.JLabel minimize;
    public static javax.swing.JLabel new_btn;
    private javax.swing.JLabel send;
    public static javax.swing.JLabel status;
    public static javax.swing.JTextField subject;
    public static javax.swing.JTextField to;
    // End of variables declaration//GEN-END:variables
}
