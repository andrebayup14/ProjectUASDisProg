/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bmicalculator;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vince
 */
public class BMIRegisterFrame extends javax.swing.JFrame implements Runnable {
    Socket s;
    BufferedReader input;
    DataOutputStream output;
    Thread t;
    String email;
    String password;
    String gender;
    
    public void run() {
        while (true) {
            getMessage();
        }
    }
    
    private void getMessage() {
        try {
            String message = this.input.readLine();
            String[] part = message.split("~");
            if (part[0].equals("berhasil")) {
                JOptionPane.showMessageDialog(this, "Berhasil mendaftarkan akun.\n");
            } else if (part[0].equals("gagal")) {
                JOptionPane.showMessageDialog(this, "Gagal membuat akun. Coba lagi.\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(BMILoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void start() {
        if (this.t == null) {
            this.t = new Thread(this, "myThread");
            this.t.start();
        }
    }
    
    public BMIRegisterFrame() {
        initComponents();
        try {
            String ip = "192.168.117.85";
            s = new Socket(ip, 10013); //string host dan int port
            input = new BufferedReader(new InputStreamReader(s.getInputStream()));
            this.start();
            output = new DataOutputStream(s.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(BMILoginFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroupGender = new javax.swing.ButtonGroup();
        textFieldPassword = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        buttonLogin = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();
        panelJudul = new javax.swing.JPanel();
        labelJudul = new javax.swing.JLabel();
        labelTinggiBadan = new javax.swing.JLabel();
        labelBeratBadan = new javax.swing.JLabel();
        labelBeratBadan1 = new javax.swing.JLabel();
        textFieldRetypePassword = new javax.swing.JTextField();
        radioButtonPria = new javax.swing.JRadioButton();
        radioButtonWanita = new javax.swing.JRadioButton();
        labelTinggiBadan1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonLogin.setBackground(new java.awt.Color(0, 0, 102));
        buttonLogin.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setText("Register");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        buttonBack.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        buttonBack.setForeground(new java.awt.Color(0, 0, 102));
        buttonBack.setText("Back");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        panelJudul.setBackground(new java.awt.Color(0, 0, 102));

        labelJudul.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelJudul.setForeground(new java.awt.Color(255, 255, 255));
        labelJudul.setText("REGISTER ACCOUNT");

        javax.swing.GroupLayout panelJudulLayout = new javax.swing.GroupLayout(panelJudul);
        panelJudul.setLayout(panelJudulLayout);
        panelJudulLayout.setHorizontalGroup(
            panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJudulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelJudul)
                .addGap(80, 80, 80))
        );
        panelJudulLayout.setVerticalGroup(
            panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJudulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelJudul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelTinggiBadan.setText("email :");

        labelBeratBadan.setText("password :");

        labelBeratBadan1.setText("retype password :");

        buttonGroupGender.add(radioButtonPria);
        radioButtonPria.setText("Pria");

        buttonGroupGender.add(radioButtonWanita);
        radioButtonWanita.setText("Wanita");

        labelTinggiBadan1.setText("Gender :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelBeratBadan)
                            .addComponent(labelTinggiBadan))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buttonBack)
                                .addGap(18, 18, 18)
                                .addComponent(buttonLogin))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelTinggiBadan1)
                                    .addComponent(labelBeratBadan1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(textFieldRetypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(radioButtonPria)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButtonWanita)))))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap(6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTinggiBadan)
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBeratBadan)
                    .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBeratBadan1)
                    .addComponent(textFieldRetypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonPria)
                    .addComponent(radioButtonWanita)
                    .addComponent(labelTinggiBadan1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBack)
                    .addComponent(buttonLogin))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            this.email = textFieldEmail.getText();
            this.password = textFieldPassword.getText();
            if (radioButtonPria.isSelected()) {
                this.gender = "L";
            } else if (radioButtonWanita.isSelected()) {
                this.gender = "P";
            }
            
            if (textFieldRetypePassword.getText().equals(textFieldPassword.getText())) {
                this.output.writeBytes("register~" + this.email + "~" + this.password + "~" + this.gender + "\n");
            } else {
                JOptionPane.showMessageDialog(this, "Password yang anda isikan tidak sama. Silahkan ulangi.");
            }
        } catch (IOException ex) {
            Logger.getLogger(BMILoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_buttonBackActionPerformed

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
            java.util.logging.Logger.getLogger(BMIRegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMIRegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMIRegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMIRegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BMIRegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JLabel labelBeratBadan;
    private javax.swing.JLabel labelBeratBadan1;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel labelTinggiBadan;
    private javax.swing.JLabel labelTinggiBadan1;
    private javax.swing.JPanel panelJudul;
    private javax.swing.JRadioButton radioButtonPria;
    private javax.swing.JRadioButton radioButtonWanita;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldPassword;
    private javax.swing.JTextField textFieldRetypePassword;
    // End of variables declaration//GEN-END:variables
}
