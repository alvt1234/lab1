
package progra2;

public class Agencia extends javax.swing.JFrame {

    public Agencia() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btagregar = new javax.swing.JButton();
        bttransferir = new javax.swing.JButton();
        btintereses = new javax.swing.JButton();
        btlista = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("AGENCIA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, 40));

        btagregar.setBackground(new java.awt.Color(0, 51, 102));
        btagregar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btagregar.setForeground(new java.awt.Color(255, 255, 255));
        btagregar.setText("Agregar");
        btagregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagregarActionPerformed(evt);
            }
        });
        jPanel1.add(btagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 200, 30));

        bttransferir.setBackground(new java.awt.Color(0, 51, 102));
        bttransferir.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bttransferir.setForeground(new java.awt.Color(255, 255, 255));
        bttransferir.setText("Transferir");
        bttransferir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bttransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttransferirActionPerformed(evt);
            }
        });
        jPanel1.add(bttransferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 200, 30));

        btintereses.setBackground(new java.awt.Color(0, 51, 102));
        btintereses.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btintereses.setForeground(new java.awt.Color(255, 255, 255));
        btintereses.setText("Intereses");
        btintereses.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btintereses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btinteresesActionPerformed(evt);
            }
        });
        jPanel1.add(btintereses, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 200, 30));

        btlista.setBackground(new java.awt.Color(0, 51, 102));
        btlista.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btlista.setForeground(new java.awt.Color(255, 255, 255));
        btlista.setText("Lista");
        btlista.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btlista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlistaActionPerformed(evt);
            }
        });
        jPanel1.add(btlista, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 200, 30));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 110, 30));

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagregarActionPerformed
     Agregar agg=new Agregar();
     agg.setVisible(true);
     dispose();
    }//GEN-LAST:event_btagregarActionPerformed

    private void bttransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttransferirActionPerformed
        transferir trans=new transferir();
        trans.setVisible(true);
        dispose();
    }//GEN-LAST:event_bttransferirActionPerformed

    private void btinteresesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btinteresesActionPerformed
        Intereses interes=new Intereses();
        interes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btinteresesActionPerformed

    private void btlistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlistaActionPerformed
       Lista lista=new Lista();
       lista.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btlistaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new Inicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btagregar;
    private javax.swing.JButton btintereses;
    private javax.swing.JButton btlista;
    private javax.swing.JButton bttransferir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
