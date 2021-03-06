
package CapaPresentacion.AdmDatPaciente;

import CapaEntidades.AdmDatPaciente.TarPaciente;
import CapaNegocio.AdmDatPaciente.TarPaciente_LN;
import CapaNegocio.Date_LN;
import javax.swing.JOptionPane;

/**
 *
 * @author Joshua
 */
public class IntGenTarPaciente extends javax.swing.JDialog {

    /**
     * Creates new form IntGenTarPaciente
     * @param parent
     * @param modal
     * @param medico
     * @param especialidad
     */
    public IntGenTarPaciente(java.awt.Frame parent, boolean modal,String medico, String especialidad,String codConsulta) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.jLMedico.setText(medico);
        this.jLEspecialidad.setText(especialidad);
        this.jLDate.setText(new Date_LN().obtenerFecha());
        
        TarPaciente tarjeta = new TarPaciente_LN().genTarPaciente(codConsulta);
        this.jLPaciente.setText(tarjeta.getNombre().toUpperCase());
        this.jLDireccion.setText(tarjeta.getDireccion().toUpperCase());
        this.jLMovil.setText(tarjeta.getMovil());
        this.jLSangre.setText(tarjeta.getgSanguineo().toUpperCase());
        System.out.println(tarjeta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLPaciente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLDireccion = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLMovil = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLMedico = new javax.swing.JLabel();
        jLEspecialidad = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLSangre = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLDate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>\n<center>HOSPITAL NACIONAL ARZOBISPO LOAYZA</center>\n<center>Tarjeta del Paciente</center>\n</html>");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 90));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLPaciente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLPaciente.setText("JOSHUA NICOLAS NAVARRO RUIZ");
        jPanel2.add(jLPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 360, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Paciente:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 70, 30));

        jLDireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLDireccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLDireccion.setText("JR. ALFONSO UGARTE #115, COMAS");
        jPanel2.add(jLDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 360, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Direccion:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 70, 30));

        jLMovil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLMovil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLMovil.setText("962229088");
        jPanel2.add(jLMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 220, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Telefono:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 70, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("72 kg.");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 80, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Peso:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 70, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Medico:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 70, 30));

        jLMedico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLMedico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLMedico.setText("GREGORIO NICOLAS NAVARRO LEON");
        jPanel2.add(jLMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 360, 30));

        jLEspecialidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLEspecialidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLEspecialidad.setText("OFTALMOLOGIA");
        jPanel2.add(jLEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 320, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Especialidad:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Gr. Sanguineo:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 100, 30));

        jLSangre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLSangre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLSangre.setText("O+");
        jPanel2.add(jLSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 80, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Fecha:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 50, 30));

        jLDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLDate.setText("23/02/2018");
        jPanel2.add(jLDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 120, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Datos de la tarjeta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel18)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Tarjeta de Paciente impresa satisfactoriamente");
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
//
//    public static void main(String args[]) {
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(IntGenTarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(IntGenTarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(IntGenTarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(IntGenTarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                IntGenTarPaciente dialog = new IntGenTarPaciente(new javax.swing.JFrame(), true,"ASD ASD ","CACALOGIA","CO0031");
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLDate;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLEspecialidad;
    private javax.swing.JLabel jLMedico;
    private javax.swing.JLabel jLMovil;
    private javax.swing.JLabel jLPaciente;
    private javax.swing.JLabel jLSangre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
