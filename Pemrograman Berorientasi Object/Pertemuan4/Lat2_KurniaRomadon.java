package Pertemuan4;
/**
 *
 * @author kurniaromadon
 */
public class Lat2_KurniaRomadon extends javax.swing.JFrame {

    /**
     * Creates new form Lat2_KurniaRomadon
     */
    public Lat2_KurniaRomadon() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_kurnia1 = new javax.swing.JTextField();
        txt_kurnia2 = new javax.swing.JTextField();
        btn_kurnia_sin = new javax.swing.JButton();
        btn_kurnia_cos = new javax.swing.JButton();
        btn_kurnia_tan = new javax.swing.JButton();
        btn_kurnia_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INPUT");

        jLabel2.setText("OUTPUT");

        btn_kurnia_sin.setText("SIN");
        btn_kurnia_sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kurnia_sinActionPerformed(evt);
            }
        });

        btn_kurnia_cos.setText("COS");
        btn_kurnia_cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kurnia_cosActionPerformed(evt);
            }
        });

        btn_kurnia_tan.setText("TAN");
        btn_kurnia_tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kurnia_tanActionPerformed(evt);
            }
        });

        btn_kurnia_clear.setText("CLEAR");
        btn_kurnia_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kurnia_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_kurnia1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(txt_kurnia2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(btn_kurnia_sin)
                .addGap(18, 18, 18)
                .addComponent(btn_kurnia_cos)
                .addGap(18, 18, 18)
                .addComponent(btn_kurnia_tan)
                .addGap(18, 18, 18)
                .addComponent(btn_kurnia_clear)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_kurnia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_kurnia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_kurnia_sin)
                    .addComponent(btn_kurnia_cos)
                    .addComponent(btn_kurnia_tan)
                    .addComponent(btn_kurnia_clear))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    double input,output;
    String hasil;
    private void btn_kurnia_cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kurnia_cosActionPerformed
        // TODO add your handling code here:
        input = Double.parseDouble(String.valueOf(txt_kurnia1.getText()));
        output = Math.cos(input);
        hasil = Double.toString(output);
        txt_kurnia2.setText(hasil);
    }//GEN-LAST:event_btn_kurnia_cosActionPerformed

    private void btn_kurnia_sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kurnia_sinActionPerformed
        // TODO add your handling code here:
        input = Double.parseDouble(String.valueOf(txt_kurnia1.getText()));
        output = Math.sin(input);
        hasil = Double.toString(output);
        txt_kurnia2.setText(hasil);
    }//GEN-LAST:event_btn_kurnia_sinActionPerformed

    private void btn_kurnia_tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kurnia_tanActionPerformed
        // TODO add your handling code here:
        input = Double.parseDouble(String.valueOf(txt_kurnia1.getText()));
        output = Math.tan(input);
        hasil = Double.toString(output);
        txt_kurnia2.setText(hasil);
    }//GEN-LAST:event_btn_kurnia_tanActionPerformed

    private void btn_kurnia_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kurnia_clearActionPerformed
        // TODO add your handling code here:
        txt_kurnia1.setText("");
        txt_kurnia2.setText("");
    }//GEN-LAST:event_btn_kurnia_clearActionPerformed

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
            java.util.logging.Logger.getLogger(Lat2_KurniaRomadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lat2_KurniaRomadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lat2_KurniaRomadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lat2_KurniaRomadon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lat2_KurniaRomadon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kurnia_clear;
    private javax.swing.JButton btn_kurnia_cos;
    private javax.swing.JButton btn_kurnia_sin;
    private javax.swing.JButton btn_kurnia_tan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_kurnia1;
    private javax.swing.JTextField txt_kurnia2;
    // End of variables declaration//GEN-END:variables
}
