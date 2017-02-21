
package CapaPresentacion.AteTriaje;

/**
 *
 * @author Joshua
 */
public class IntGenTicDerivacion extends javax.swing.JDialog {

    /**
     * Creates new form IntGenTicDerivacion
     * @param parent
     * @param modal
     * @param codConsulta
     * @param especialidad
     */
    public IntGenTicDerivacion(java.awt.Frame parent, boolean modal, String codConsulta, String especialidad) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.iniciarVentana(codConsulta, especialidad);
    }
    
    //Metodos Propios
    private void iniciarVentana(String codConsulta, String especialidad) {
        this.jLCodTicket.setText("TD0001");
        this.jLFecha.setText("21/02/2017 17:59:59");
        this.jLCodConsulta.setText(codConsulta);
        this.jLEspecialidad.setText(especialidad);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jBGenerar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLCodTicket = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLCodConsulta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLEspecialidad = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ticket de Derivacion");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridLayout());

        jBGenerar.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jBGenerar.setText("Generar");
        jPanel3.add(jBGenerar);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ticket de Derivacion");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, 30));

        jLCodTicket.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLCodTicket.setText("TD0001");
        jPanel2.add(jLCodTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 70, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Numero de Ticket:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 30));

        jLCodConsulta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLCodConsulta.setText("CO0001");
        jPanel2.add(jLCodConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 160, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Especialidad:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 90, 30));

        jLEspecialidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLEspecialidad.setText("ODONTOLOGIA");
        jPanel2.add(jLEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 210, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Numero de Consulta:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Fecha y Hora:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 90, 30));

        jLFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLFecha.setText("21/02/2017 17:50:59");
        jPanel2.add(jLFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntGenTicDerivacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntGenTicDerivacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntGenTicDerivacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntGenTicDerivacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IntGenTicDerivacion dialog = new IntGenTicDerivacion(new javax.swing.JFrame(), true,"CO001","ODONTOLOGIA");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGenerar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLCodConsulta;
    private javax.swing.JLabel jLCodTicket;
    private javax.swing.JLabel jLEspecialidad;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}