/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeknoTuner;

/**
 *
 * @author gabrielsatriod
 */
public class Page2 extends javax.swing.JFrame {

    /**
     * Creates new form Page2
     */
    public Page2() {
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
        kolom1 = new javax.swing.JCheckBox();
        kolom2 = new javax.swing.JCheckBox();
        kolom3 = new javax.swing.JCheckBox();
        kolom4 = new javax.swing.JCheckBox();
        kolom5 = new javax.swing.JCheckBox();
        kolom6 = new javax.swing.JCheckBox();
        harga1 = new javax.swing.JTextField();
        harga2 = new javax.swing.JTextField();
        harga3 = new javax.swing.JTextField();
        harga4 = new javax.swing.JTextField();
        harga5 = new javax.swing.JTextField();
        harga6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu Service");

        kolom1.setText("Ganti Oli");
        kolom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolom1ActionPerformed(evt);
            }
        });

        kolom2.setText("Service Ringan");
        kolom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolom2ActionPerformed(evt);
            }
        });

        kolom3.setText("Service Besar");
        kolom3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolom3ActionPerformed(evt);
            }
        });

        kolom4.setText("Bore Up");
        kolom4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolom4ActionPerformed(evt);
            }
        });

        kolom5.setText("Stroke Up");
        kolom5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolom5ActionPerformed(evt);
            }
        });

        kolom6.setText("Tune Up");
        kolom6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolom6ActionPerformed(evt);
            }
        });

        jButton1.setText("Selanjutnya");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kolom1)
                    .addComponent(kolom6)
                    .addComponent(kolom5)
                    .addComponent(kolom4)
                    .addComponent(kolom3)
                    .addComponent(kolom2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(harga1)
                        .addComponent(harga2)
                        .addComponent(harga3)
                        .addComponent(harga4)
                        .addComponent(harga5)
                        .addComponent(harga6, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kolom1)
                    .addComponent(harga1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kolom2)
                    .addComponent(harga2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kolom3)
                    .addComponent(harga3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kolom4)
                    .addComponent(harga4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kolom5)
                    .addComponent(harga5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kolom6)
                    .addComponent(harga6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kolom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolom1ActionPerformed
        if(kolom1.isSelected()){
            harga1.setText("Rp 50.000 ");
            kolom1.setSelected(true);
        }else {
            harga1.setText("");
            kolom1.setSelected(false);
        }
    }//GEN-LAST:event_kolom1ActionPerformed

    private void kolom6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolom6ActionPerformed
        if(kolom6.isSelected()){
            harga6.setText("Rp 500.000 ");
            kolom6.setSelected(true);
        }else {
            harga6.setText("");
            kolom6.setSelected(false);
        }
    }//GEN-LAST:event_kolom6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Page3 action = new Page3();
        action.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kolom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolom2ActionPerformed
        if(kolom2.isSelected()){
            harga2.setText("Rp 60.000 ");
            kolom2.setSelected(true);
        }else {
            harga2.setText("");
            kolom2.setSelected(false);
        }
    }//GEN-LAST:event_kolom2ActionPerformed

    private void kolom3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolom3ActionPerformed
        if(kolom1.isSelected()){
            harga3.setText("Rp 150.000 ");
            kolom3.setSelected(true);
        }else {
            harga3.setText("");
            kolom3.setSelected(false);
        }
    }//GEN-LAST:event_kolom3ActionPerformed

    private void kolom4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolom4ActionPerformed
        if(kolom4.isSelected()){
            harga4.setText("Rp 1.000.0000 ");
            kolom4.setSelected(true);
        }else {
            harga4.setText("");
            kolom4.setSelected(false);
        }
    }//GEN-LAST:event_kolom4ActionPerformed

    private void kolom5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolom5ActionPerformed
        if(kolom5.isSelected()){
            harga5.setText("Rp 2.500.000 ");
            kolom5.setSelected(true);
        }else {
            harga5.setText("");
            kolom5.setSelected(false);
        }
    }//GEN-LAST:event_kolom5ActionPerformed

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
            java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField harga1;
    private javax.swing.JTextField harga2;
    private javax.swing.JTextField harga3;
    private javax.swing.JTextField harga4;
    private javax.swing.JTextField harga5;
    private javax.swing.JTextField harga6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox kolom1;
    private javax.swing.JCheckBox kolom2;
    private javax.swing.JCheckBox kolom3;
    private javax.swing.JCheckBox kolom4;
    private javax.swing.JCheckBox kolom5;
    private javax.swing.JCheckBox kolom6;
    // End of variables declaration//GEN-END:variables
}
