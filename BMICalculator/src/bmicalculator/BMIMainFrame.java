/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bmicalculator;

import bmicalculatorserver.Account;

/**
 *
 * @author Andreas Bayu P
 */
public class BMIMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form BMIMainForm
     */
    User accountAktif;
    public BMIMainFrame() {
        initComponents();
    }
    
    public BMIMainFrame(User account) {
        initComponents();    
        accountAktif = new User();
        accountAktif = account;
        labelSelamatDatang.setText("Selamat datang, " + accountAktif.getEmail());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSelamatDatang = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jAccount = new javax.swing.JMenu();
        jMenuItemHistoryBMI = new javax.swing.JMenuItem();
        jMenuItemHistoryIdeal = new javax.swing.JMenuItem();
        jOperation = new javax.swing.JMenu();
        jCalculate = new javax.swing.JMenuItem();
        jViewGraph = new javax.swing.JMenuItem();
        jExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelSelamatDatang.setText("Selamat datang, nama");

        jAccount.setText("Account");

        jMenuItemHistoryBMI.setText("History BMI");
        jMenuItemHistoryBMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHistoryBMIActionPerformed(evt);
            }
        });
        jAccount.add(jMenuItemHistoryBMI);

        jMenuItemHistoryIdeal.setText("History Berat Ideal");
        jMenuItemHistoryIdeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHistoryIdealActionPerformed(evt);
            }
        });
        jAccount.add(jMenuItemHistoryIdeal);

        jMenuBar1.add(jAccount);

        jOperation.setText("Operation");

        jCalculate.setText("Calculate BMI");
        jCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCalculateActionPerformed(evt);
            }
        });
        jOperation.add(jCalculate);

        jViewGraph.setText("View Graph");
        jViewGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewGraphActionPerformed(evt);
            }
        });
        jOperation.add(jViewGraph);

        jMenuBar1.add(jOperation);

        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        jMenuBar1.add(jExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelSelamatDatang)
                .addContainerGap(352, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSelamatDatang)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemHistoryBMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHistoryBMIActionPerformed
        BMIHistoryBMIFrame formHistoryBMI = new BMIHistoryBMIFrame(accountAktif);
        formHistoryBMI.setVisible(true);
    }//GEN-LAST:event_jMenuItemHistoryBMIActionPerformed

    private void jCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalculateActionPerformed
        BMICalculatorFrame formCalc = new BMICalculatorFrame(accountAktif);
        formCalc.setVisible(true);
    }//GEN-LAST:event_jCalculateActionPerformed

    private void jViewGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewGraphActionPerformed
        BMIGraphicFrame formGraph = new BMIGraphicFrame(accountAktif);
        formGraph.setVisible(true);
    }//GEN-LAST:event_jViewGraphActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jExitActionPerformed

    private void jMenuItemHistoryIdealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHistoryIdealActionPerformed
        BMIHistoryIdealFrame formHistoryIdeal = new BMIHistoryIdealFrame(accountAktif);
        formHistoryIdeal.setVisible(true);
    }//GEN-LAST:event_jMenuItemHistoryIdealActionPerformed

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
            java.util.logging.Logger.getLogger(BMIMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMIMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMIMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMIMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BMIMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jAccount;
    private javax.swing.JMenuItem jCalculate;
    private javax.swing.JMenu jExit;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemHistoryBMI;
    private javax.swing.JMenuItem jMenuItemHistoryIdeal;
    private javax.swing.JMenu jOperation;
    private javax.swing.JMenuItem jViewGraph;
    private javax.swing.JLabel labelSelamatDatang;
    // End of variables declaration//GEN-END:variables
}
