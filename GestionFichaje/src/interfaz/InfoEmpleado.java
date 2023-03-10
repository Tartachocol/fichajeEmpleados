/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package interfaz;

import java.util.Random;
import javax.swing.ImageIcon;
import modelos.Departamento;
import modelos.Empleado;

/**
 *
 * @author Francisco
 */
public class InfoEmpleado extends javax.swing.JDialog {

    private ImageIcon imagen;
    private int numero;
    private Empleado emp;

    /**
     * Creates new form InfoEmpleado
     */
    public InfoEmpleado(Empleado emp, Departamento dpto) {

        numero = (int) (Math.random() * 22);  // 0 a 21
        imagen = new ImageIcon("imagen/avatar-" + numero + ".jpg");
        this.emp = emp;

        initComponents();
        if (!dpto.getNombre().equals("Recursos Humanos")) {
            jButtonAdmin.setVisible(false);
        }

        jLabelImg.setIcon(imagen);
        jTextFieldNombre.setText(emp.getNombre());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelImg = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonClose = new javax.swing.JButton();
        jButtonAdmin = new javax.swing.JButton();

        jLabelImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelImg.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jTextFieldNombre.setEditable(false);
        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButtonClose.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonClose.setText("Salir");

        jButtonAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonAdmin.setText("Administrar");
        jButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButtonAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonClose)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClose)
                    .addComponent(jButtonAdmin))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdminActionPerformed
    
        EmpresaGUI ventana = new EmpresaGUI(this, true);

        ventana.setVisible(true);


    }//GEN-LAST:event_jButtonAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdmin;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JLabel jLabelImg;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
