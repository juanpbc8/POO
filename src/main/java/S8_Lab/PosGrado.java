package S8_Lab;

import javax.swing.table.DefaultTableModel;

public class PosGrado extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();
    private void mostrarCabecera(){
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Semestre");
        model.addColumn("Grado academico");
        model.addColumn("Condicion social");
        model.addColumn("Pago parcial");
        model.addColumn("Descuentos");
        model.addColumn("Pago final");
        tblSalida.setModel(model);
    }
    public PosGrado() {
        initComponents();
        mostrarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fldNombre = new javax.swing.JTextField();
        fldSemestre = new javax.swing.JTextField();
        fldCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rdTitulado = new javax.swing.JRadioButton();
        rdBachiller = new javax.swing.JRadioButton();
        comboxCondicion = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalida = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        BG.setMinimumSize(new java.awt.Dimension(900, 600));
        BG.setPreferredSize(new java.awt.Dimension(900, 600));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Codigo");
        BG.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Semestre");
        BG.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Condicion social");
        BG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        fldNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BG.add(fldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 322, -1));

        fldSemestre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BG.add(fldSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 322, -1));

        fldCodigo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BG.add(fldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 322, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Nombre Completo");
        BG.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Grado academico");
        BG.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        rdTitulado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rdTitulado.setText("Titulado");
        BG.add(rdTitulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        rdBachiller.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rdBachiller.setText("Bachiller");
        BG.add(rdBachiller, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        comboxCondicion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        comboxCondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Bombero activo", "Licenciado de FF. AA." }));
        BG.add(comboxCondicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        BG.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, -1, -1));

        tblSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Semestre", "Grado academico", "Condicion social", "Pago parcial", "Descuentos", "Pago final"
            }
        ));
        jScrollPane1.setViewportView(tblSalida);

        BG.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 760, 200));

        btnAtras.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        BG.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, -1, -1));

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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        
        EstudiantePosgrado e = new EstudiantePosgrado();
        e.setCodigo(fldCodigo.getText());
        e.setNombres(fldNombre.getText());
        e.setSemestreDeIngreso(Integer.parseInt(fldSemestre.getText()));
        if(rdBachiller.isSelected()){
            e.setGradoAcademico("Bachiller");
        }else{
            e.setGradoAcademico("Titulado");
        }
        e.setCondicionSocial(comboxCondicion.getSelectedItem().toString());
        e.pagoParcialPension();
        e.descuentoCondicion();
        e.descuentos();
        e.calculoPagoFinal();
        
        Object[] data = {e.getCodigo(),e.getNombres(),e.getSemestreDeIngreso(),e.getGradoAcademico(),e.getCondicionSocial(),e.pagoParcialPension(),e.descuentos(),e.calculoPagoFinal()};
        model.addRow(data);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(PosGrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PosGrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PosGrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PosGrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PosGrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JComboBox<String> comboxCondicion;
    private javax.swing.JTextField fldCodigo;
    private javax.swing.JTextField fldNombre;
    private javax.swing.JTextField fldSemestre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdBachiller;
    private javax.swing.JRadioButton rdTitulado;
    private javax.swing.JTable tblSalida;
    // End of variables declaration//GEN-END:variables
}
