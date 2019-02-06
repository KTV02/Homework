/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vokabelprototyp;

import static java.lang.Thread.sleep;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class VokabelGui extends javax.swing.JFrame {

    String array[] = new String[3];
    String answer;
    int r;
    int i;

    public VokabelGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vokabelEingabe = new javax.swing.JTextField();
        start = new javax.swing.JButton();
        instructions = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        vokabelEingabe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                vokabelEingabeKeyPressed(evt);
            }
        });

        start.setText("Quiz starten");
        start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startMouseClicked(evt);
            }
        });

        instructions.setText("Bitte geben sie den englischen Begriff ein");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(instructions)
                    .addComponent(vokabelEingabe)
                    .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(instructions)
                .addGap(18, 18, 18)
                .addComponent(vokabelEingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(start)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vokabelEingabeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vokabelEingabeKeyPressed

        if (evt.getKeyCode() == 10) {
            if (!(instructions.getText().contains("?"))) {
                vokabelEingabe.setText("");
            }
            if (instructions.getText().equals("Bitte geben sie den englischen Begriff ein")) {
                instructions.setText("Geben sie die deutsche Bedeutung ein");

            } else if (instructions.getText().equals("Geben sie die deutsche Bedeutung ein")) {
                vokabelEingabe.setVisible(false);
                instructions.setText("Die Vokabel wird nun von einer Lehrkraft überprüft");

            } else {
                answer = vokabelEingabe.getText();
                if (answer.equals("Baum") && r == 0) {
                    play();
                } else if (answer.equals("Haus") && r == 1) {
                    play();
                } else if (answer.equals("Sonne") && r == 2) {
                    play();
                } else {
                    instructions.setText("Besser nochmal lernen!");
                    vokabelEingabe.setText("");
                    reset();
                }

            }
    }//GEN-LAST:event_vokabelEingabeKeyPressed
    }
    private void startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseClicked
        vokabelEingabe.setVisible(true);
        start.setVisible(false);

        //instructions.setText("hallo");
        fillVocabs();
        play();
    }//GEN-LAST:event_startMouseClicked

    public void play() {
        r = new Random().nextInt(3);
        vokabelEingabe.setText("");
        instructions.setText("Was heißt " + array[r] + " auf deutsch?");
    }

    public void fillVocabs() {
        //get from Database
        array[0] = "tree";
        array[1] = "house";
        array[2] = "sun";
    }

    public void reset() {
        
        try {
            sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(VokabelGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        instructions.setText("Bitte geben sie den englischen Begriff ein");
        start.setVisible(true);
        vokabelEingabe.setText("");
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel instructions;
    private javax.swing.JButton start;
    private javax.swing.JTextField vokabelEingabe;
    // End of variables declaration//GEN-END:variables

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
            java.util.logging.Logger.getLogger(VokabelGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VokabelGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VokabelGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VokabelGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VokabelGui().setVisible(true);
            }
        });
    }
}
