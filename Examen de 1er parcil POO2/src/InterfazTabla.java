
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazTabla extends javax.swing.JFrame {

   DefaultTableModel modelo;
    private Object columnNames;
    private Object model;
   

    
    public InterfazTabla() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        tabla1.setModel(modelo);
        
        InterfazFactura tabla2 = new InterfazFactura();
        tabla2.setVisible(true);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        botontabla = new javax.swing.JButton();
        textprendas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textfecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textreporte = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textmodelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "PRENDA", "COLOR", "TALLA", "CANTIDAD"
            }
        ));
        jScrollPane1.setViewportView(tabla1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 660, 220));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Guardar y Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        botontabla.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botontabla.setText("Generar Tabla");
        botontabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botontablaActionPerformed(evt);
            }
        });
        jPanel1.add(botontabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, -1, -1));
        jPanel1.add(textprendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 110, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Numero de Prendas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, -1));
        jPanel1.add(textfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 90, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de Inspeccion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));
        jPanel1.add(textreporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 90, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numero de Reporte");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));
        jPanel1.add(textmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modelo o Codigo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro de Datos de Prendas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngtree-network-connected-digital-technology-background-design-concept-image_669166.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void botontablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botontablaActionPerformed
       generarTabla();
    }//GEN-LAST:event_botontablaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InterfazFactura w1 = new InterfazFactura();
        w1.setVisible(true);
        dispose();
        
        for(int i = 0; i < tabla1.getRowCount(); i++){
            String Datos[] = new String[2];
            Datos[0] = tabla1.getValueAt(i, 0).toString();
            Datos[1] = tabla1.getValueAt(i, 0).toString();
            
            InterfazFactura.tabla2.addRow(Datos);
        }
        nuevatabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new InterfazTabla().setVisible(true);
        });
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botontabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField textfecha;
    private javax.swing.JTextField textmodelo;
    private javax.swing.JTextField textprendas;
    private javax.swing.JTextField textreporte;
    // End of variables declaration//GEN-END:variables


    public void nuevatabla(){
         modelo = new DefaultTableModel();
         tabla1.setModel(modelo);
    }
    
    private void generarTabla() {
        String[] columnNames = {"CODIGO", "PRENDA", "COLOR", "TALLA", "CANTIDAD"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        tabla1.setModel(tableModel);

        try {
            int numFilas = Integer.parseInt(textprendas.getText());

            tableModel.setRowCount(0);

            for (int i = 0; i < numFilas; i++) {
                Object[] row = new Object[columnNames.length];
                tableModel.addRow(row);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingresa un número válido en 'textprendas'.");
        }
    }
    
    public void mostrar(){
        
        textmostrar.setText(textmodelo.getText());
        
    }
}
