/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg321_project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author Sierra Laney
 */
public class GamePlayFrame extends javax.swing.JFrame {
Storyline storyline = new Storyline();
boolean checkpoint = false; 

    /**
     * Creates new form NewJFrame
     */
    public GamePlayFrame() {
        initComponents();
        StoryTextArea.setLineWrap(true);
        StoryTextArea.setText(storyline.tree.current.story);
    }
    
    public GamePlayFrame(Node cont) {
        initComponents();
        StoryTextArea.setLineWrap(true);
        storyline.tree.current=cont;
        StoryTextArea.setText(storyline.tree.current.story); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonA = new javax.swing.JButton();
        jButtonB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        StoryTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonA.setText("A");
        jButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAActionPerformed(evt);
            }
        });

        jButtonB.setText("B");
        jButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBActionPerformed(evt);
            }
        });

        StoryTextArea.setColumns(20);
        StoryTextArea.setRows(5);
        jScrollPane1.setViewportView(StoryTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonA, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                        .addComponent(jButtonB, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonA)
                    .addComponent(jButtonB))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAActionPerformed
      Node new_node_a = storyline.tree.current;
      update_text_a(StoryTextArea, new_node_a); 
      storyline.tree.current=storyline.tree.current.left; 
    }//GEN-LAST:event_jButtonAActionPerformed

    private void jButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBActionPerformed
     Node new_node_b = storyline.tree.current;
     update_text_b(StoryTextArea, new_node_b);
     storyline.tree.current=storyline.tree.current.right;
    }//GEN-LAST:event_jButtonBActionPerformed

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
            java.util.logging.Logger.getLogger(GamePlayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePlayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePlayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePlayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePlayFrame().setVisible(true);
            }
        });
    }
    
     public void update_text_a(JTextArea a, Node n) { 
        Node current;
        current = n;
        a.setText(current.left.story);
    }
    
    public void update_text_b(JTextArea a, Node n) {
        Node current;
        current = n; 
        a.setText(current.right.story);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea StoryTextArea;
    private javax.swing.JButton jButtonA;
    private javax.swing.JButton jButtonB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
