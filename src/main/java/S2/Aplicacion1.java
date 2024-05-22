package S2;
public class Aplicacion1 extends javax.swing.JFrame {
    public Aplicacion1() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        BG = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        CateogoriaLabel = new javax.swing.JLabel();
        SueldoLabel = new javax.swing.JLabel();
        SueldoFinalText = new javax.swing.JTextField();
        TarifaText = new javax.swing.JTextField();
        HorasText = new javax.swing.JTextField();
        BorrarBtn = new javax.swing.JButton();
        AñosLabel = new javax.swing.JLabel();
        HorasLabel = new javax.swing.JLabel();
        AñosText = new javax.swing.JTextField();
        RadioBtnC = new javax.swing.JRadioButton();
        RadioBtnA = new javax.swing.JRadioButton();
        RadioBtnB = new javax.swing.JRadioButton();
        TarifaLabel = new javax.swing.JLabel();
        calcularSueldoBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        BG.setBackground(new java.awt.Color(153, 153, 153));
        BG.setForeground(new java.awt.Color(255, 255, 255));
        BG.setPreferredSize(new java.awt.Dimension(800, 550));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Title.setText("Calcular sueldo");
        BG.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        CateogoriaLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CateogoriaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CateogoriaLabel.setText("Categoria");
        BG.add(CateogoriaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 120, 40));

        SueldoLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SueldoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SueldoLabel.setText("Sueldo");
        BG.add(SueldoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 160, 40));

        SueldoFinalText.setEditable(false);
        SueldoFinalText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SueldoFinalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SueldoFinalTextActionPerformed(evt);
            }
        });
        BG.add(SueldoFinalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 170, -1));

        TarifaText.setEditable(false);
        TarifaText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TarifaText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TarifaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarifaTextActionPerformed(evt);
            }
        });
        BG.add(TarifaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 170, -1));

        HorasText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HorasText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorasTextActionPerformed(evt);
            }
        });
        BG.add(HorasText, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 100, -1));

        BorrarBtn.setBackground(new java.awt.Color(255, 51, 51));
        BorrarBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BorrarBtn.setText("Borrar");
        BorrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BorrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrarBtnMouseClicked(evt);
            }
        });
        BorrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarBtnActionPerformed(evt);
            }
        });
        BG.add(BorrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        AñosLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AñosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AñosLabel.setText("Años de servicio");
        BG.add(AñosLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 220, 40));

        HorasLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        HorasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HorasLabel.setText("Horas trabajadas");
        BG.add(HorasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 220, 40));

        AñosText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AñosText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñosTextActionPerformed(evt);
            }
        });
        BG.add(AñosText, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 90, -1));

        buttonGroup1.add(RadioBtnC);
        RadioBtnC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RadioBtnC.setText("C");
        BG.add(RadioBtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 40, -1));

        buttonGroup1.add(RadioBtnA);
        RadioBtnA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RadioBtnA.setText("A");
        BG.add(RadioBtnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 40, -1));

        buttonGroup1.add(RadioBtnB);
        RadioBtnB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RadioBtnB.setText("B");
        RadioBtnB.setToolTipText("");
        BG.add(RadioBtnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 40, -1));

        TarifaLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TarifaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TarifaLabel.setText("Tarifa");
        BG.add(TarifaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 160, 40));

        calcularSueldoBtn1.setBackground(new java.awt.Color(102, 255, 51));
        calcularSueldoBtn1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        calcularSueldoBtn1.setText("Aceptar");
        calcularSueldoBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcularSueldoBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcularSueldoBtn1MouseClicked(evt);
            }
        });
        calcularSueldoBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularSueldoBtn1ActionPerformed(evt);
            }
        });
        BG.add(calcularSueldoBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SueldoFinalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SueldoFinalTextActionPerformed
    }//GEN-LAST:event_SueldoFinalTextActionPerformed

    private void TarifaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarifaTextActionPerformed
    }//GEN-LAST:event_TarifaTextActionPerformed

    private void HorasTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorasTextActionPerformed
    }//GEN-LAST:event_HorasTextActionPerformed

    private void BorrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarBtnActionPerformed
        HorasText.setText(null);
        AñosText.setText(null);
    }//GEN-LAST:event_BorrarBtnActionPerformed

    private void AñosTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñosTextActionPerformed
    }//GEN-LAST:event_AñosTextActionPerformed
   
    private void BorrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarBtnMouseClicked
    }//GEN-LAST:event_BorrarBtnMouseClicked

    private void calcularSueldoBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularSueldoBtn1MouseClicked
    }//GEN-LAST:event_calcularSueldoBtn1MouseClicked

    private void calcularSueldoBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularSueldoBtn1ActionPerformed
        // TODO add your handling code here:
        String categoria = null;
        int años = Integer.parseInt(AñosText.getText());
        int horas = Integer.parseInt(HorasText.getText());
        
        if(RadioBtnA.isSelected()){
            categoria = "A";
        }if(RadioBtnB.isSelected()){
            categoria = "B";
        }if(RadioBtnC.isSelected()){
            categoria = "C";
        }
        Empleado empleado = new Empleado(categoria, años, horas);
        double sueldoFinal = empleado.calcularSueldoFinal();
        
        TarifaText.setText("S/ "+String.valueOf(empleado.getTarifa()));
        SueldoFinalText.setText("S/ "+String.valueOf(sueldoFinal));
    }//GEN-LAST:event_calcularSueldoBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Aplicacion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AñosLabel;
    private javax.swing.JTextField AñosText;
    private javax.swing.JPanel BG;
    private javax.swing.JButton BorrarBtn;
    private javax.swing.JLabel CateogoriaLabel;
    private javax.swing.JLabel HorasLabel;
    private javax.swing.JTextField HorasText;
    private javax.swing.JRadioButton RadioBtnA;
    private javax.swing.JRadioButton RadioBtnB;
    private javax.swing.JRadioButton RadioBtnC;
    private javax.swing.JTextField SueldoFinalText;
    private javax.swing.JLabel SueldoLabel;
    private javax.swing.JLabel TarifaLabel;
    private javax.swing.JTextField TarifaText;
    private javax.swing.JLabel Title;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calcularSueldoBtn1;
    // End of variables declaration//GEN-END:variables
}
