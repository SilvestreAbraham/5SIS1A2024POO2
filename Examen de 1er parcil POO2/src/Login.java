
public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botoncancelar = new javax.swing.JButton();
        botoningresar = new javax.swing.JButton();
        textcontraseña = new javax.swing.JTextField();
        textusuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botoncancelar.setBackground(new java.awt.Color(204, 204, 255));
        botoncancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botoncancelar.setText("Cancelar");
        botoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncancelarActionPerformed(evt);
            }
        });
        jPanel1.add(botoncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

        botoningresar.setBackground(new java.awt.Color(204, 204, 255));
        botoningresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botoningresar.setText("Ingresar");
        botoningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoningresarActionPerformed(evt);
            }
        });
        jPanel1.add(botoningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        textcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcontraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(textcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 230, -1));
        jPanel1.add(textusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 230, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_2024-02-06_222059393.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 90, 100));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/578edd036d950f424c03ce74cb7f16bb.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 450));

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

    private void textcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcontraseñaActionPerformed
        
    }//GEN-LAST:event_textcontraseñaActionPerformed

    private void botoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncancelarActionPerformed
       dispose();
    }//GEN-LAST:event_botoncancelarActionPerformed

    private void botoningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoningresarActionPerformed
       String usuarioIngresado = textusuario.getText();
    String contraseñaIngresada = textcontraseña.getText();

    if (usuarioIngresado.equals("usuario") && contraseñaIngresada.equals("contraseña")) {
        InterfazTabla w1 = new InterfazTabla();
        w1.setVisible(true);
        dispose();
    } else {
         textusuario.setText("");
        textcontraseña.setText("");
    }
    }//GEN-LAST:event_botoningresarActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoncancelar;
    private javax.swing.JButton botoningresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textcontraseña;
    private javax.swing.JTextField textusuario;
    // End of variables declaration//GEN-END:variables
}
