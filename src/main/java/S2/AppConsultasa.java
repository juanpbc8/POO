package S2;
public class AppConsultasa extends javax.swing.JFrame {
    public AppConsultasa() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        RadioBtnC = new javax.swing.JRadioButton();
        RadioBtnA = new javax.swing.JRadioButton();
        RadioBtnB = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        ConsultasLabel = new javax.swing.JLabel();
        ConsultasTotalesTxt = new javax.swing.JTextField();
        AceptarBtn = new javax.swing.JButton();
        BorrarBtn = new javax.swing.JButton();
        ConsultasAdTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TotalTxt1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 650));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Seguro de Salud");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        buttonGroup1.add(RadioBtnC);
        RadioBtnC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RadioBtnC.setText("C");
        RadioBtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtnCActionPerformed(evt);
            }
        });
        jPanel1.add(RadioBtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        buttonGroup1.add(RadioBtnA);
        RadioBtnA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RadioBtnA.setText("A");
        jPanel1.add(RadioBtnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        buttonGroup1.add(RadioBtnB);
        RadioBtnB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RadioBtnB.setText("B");
        jPanel1.add(RadioBtnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("# Consultas Adicionales");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        ConsultasLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ConsultasLabel.setText("Consultas Totales");
        jPanel1.add(ConsultasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, -1));

        ConsultasTotalesTxt.setEditable(false);
        ConsultasTotalesTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ConsultasTotalesTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ConsultasTotalesTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 130, -1));

        AceptarBtn.setBackground(new java.awt.Color(102, 255, 102));
        AceptarBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AceptarBtn.setText("Aceptar");
        AceptarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AceptarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        BorrarBtn.setBackground(new java.awt.Color(255, 51, 51));
        BorrarBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BorrarBtn.setText("Borrar");
        BorrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BorrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BorrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        ConsultasAdTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ConsultasAdTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ConsultasAdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 130, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Categoria");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Total a pagar");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, -1, -1));

        TotalTxt1.setEditable(false);
        TotalTxt1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TotalTxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(TotalTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 130, -1));

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

    private void RadioBtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtnCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBtnCActionPerformed

    private void AceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarBtnActionPerformed
        // TODO add your handling code here:
        String categoria = null;
        int consultasAdicionales = Integer.parseInt(ConsultasAdTxt.getText());
        if(RadioBtnA.isSelected()){
            categoria = "A";
        }if(RadioBtnB.isSelected()){
            categoria = "B";
        }if(RadioBtnC.isSelected()){
            categoria = "C";
        }
        
        Consulta consulta = new Consulta(categoria, consultasAdicionales);
        
        TotalTxt1.setText(String.valueOf(consulta.calcularMontoFinal()));
//        ConsultasTotalesTxt.setText(String.valueOf(consulta.calcularConsultasTotales()));
    }//GEN-LAST:event_AceptarBtnActionPerformed

    private void BorrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarBtnActionPerformed
        // TODO add your handling code here:
        TotalTxt1.setText(null);
        ConsultasTotalesTxt.setText(null);
        ConsultasAdTxt.setText(null);
    }//GEN-LAST:event_BorrarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AppConsultasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppConsultasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppConsultasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppConsultasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppConsultasa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarBtn;
    private javax.swing.JButton BorrarBtn;
    private javax.swing.JTextField ConsultasAdTxt;
    private javax.swing.JLabel ConsultasLabel;
    private javax.swing.JTextField ConsultasTotalesTxt;
    private javax.swing.JRadioButton RadioBtnA;
    private javax.swing.JRadioButton RadioBtnB;
    private javax.swing.JRadioButton RadioBtnC;
    private javax.swing.JTextField TotalTxt1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
