/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import bd.GestionBD;
import java.awt.Window;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.WindowConstants;
import modelos.Departamento;
import modelos.Departamentos;
import modelos.Empleado;
import modelos.Empleados;

/**
 *
 * @author damm
 */
public class EmpresaGUI extends JDialog {
//Objeto clases

    private GestionBD conexion;
    private Departamentos listadoDeptos;
    private Empleados listadoEmpleado;
    private DefaultListModel modeloJlistDptos;
    private DefaultComboBoxModel modeloComboDeptos;
    private DefaultListModel modeloJlistEmps;

    /**
     * Creates new form Empresas
     */
    public EmpresaGUI(JDialog parent, boolean modal) {
   super(parent, modal);
        //Iniciamos los datos de los modelos
        modeloJlistDptos = new DefaultListModel();
        listadoDeptos = new Departamentos();
        modeloJlistEmps = new DefaultListModel();
        listadoEmpleado = new Empleados();
        modeloComboDeptos = new DefaultComboBoxModel();

        conexion = new GestionBD("localhost", "root", "root", "fichaje", 3306);
        listadoEmpleado = conexion.listaEmpleados();
        listadoDeptos = conexion.listaDepartamentos();
        cargarDepartamentos();
        cargarEmpleado();

        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanelListDepto1 = new javax.swing.JPanel();
        textIdEmp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        jBtnGuardarEmp = new javax.swing.JButton();
        jBtnNuevoEmp = new javax.swing.JButton();
        jBtnBorrarTextoEmp = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtApellidoEmpleado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxDepartamento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSpinnerSalario = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        txtEmailEmpleado = new javax.swing.JTextField();
        jPanelListadoEmpleado = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListEmpleasdos = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jPanelListDepto = new javax.swing.JPanel();
        textIdDepto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNombreDpto = new javax.swing.JTextField();
        jBtnGuardar = new javax.swing.JButton();
        jBtnNuevoDpo = new javax.swing.JButton();
        jBtnBorrarTextoDpto = new javax.swing.JButton();
        jPanelListadoDepartamentos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListDptos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelListDepto1.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado"));

        textIdEmp.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        textIdEmp.setEnabled(false);

        jLabel3.setText("id");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        txtNombreEmpleado.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        jBtnGuardarEmp.setText("Guardar");
        jBtnGuardarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarEmpActionPerformed(evt);
            }
        });

        jBtnNuevoEmp.setText("Nuevo");
        jBtnNuevoEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNuevoEmpActionPerformed(evt);
            }
        });

        jBtnBorrarTextoEmp.setText("Borrar");
        jBtnBorrarTextoEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBorrarTextoEmpActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellido:");

        txtApellidoEmpleado.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        jLabel6.setText("Departamento");

        jComboBoxDepartamento.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jComboBoxDepartamento.setModel(modeloComboDeptos);

        jLabel7.setText("Salario");

        jSpinnerSalario.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jSpinnerSalario.setModel(new javax.swing.SpinnerNumberModel(950.0f, 950.0f, null, 1.0f));

        jLabel8.setText("Email:");

        txtEmailEmpleado.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelListDepto1Layout = new javax.swing.GroupLayout(jPanelListDepto1);
        jPanelListDepto1.setLayout(jPanelListDepto1Layout);
        jPanelListDepto1Layout.setHorizontalGroup(
            jPanelListDepto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListDepto1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelListDepto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListDepto1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelListDepto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListDepto1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListDepto1Layout.createSequentialGroup()
                                .addComponent(jBtnBorrarTextoEmp)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnNuevoEmp)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnGuardarEmp))))
                    .addGroup(jPanelListDepto1Layout.createSequentialGroup()
                        .addGroup(jPanelListDepto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jSpinnerSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtEmailEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(jPanelListDepto1Layout.createSequentialGroup()
                        .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textIdEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelListDepto1Layout.setVerticalGroup(
            jPanelListDepto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListDepto1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelListDepto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanelListDepto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textIdEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jSpinnerSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtEmailEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanelListDepto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardarEmp)
                    .addComponent(jBtnNuevoEmp)
                    .addComponent(jBtnBorrarTextoEmp))
                .addContainerGap())
        );

        jPanelListadoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado"));

        jListEmpleasdos.setModel(this.modeloJlistEmps);
        jListEmpleasdos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListEmpleasdosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListEmpleasdos);

        javax.swing.GroupLayout jPanelListadoEmpleadoLayout = new javax.swing.GroupLayout(jPanelListadoEmpleado);
        jPanelListadoEmpleado.setLayout(jPanelListadoEmpleadoLayout);
        jPanelListadoEmpleadoLayout.setHorizontalGroup(
            jPanelListadoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListadoEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelListadoEmpleadoLayout.setVerticalGroup(
            jPanelListadoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListadoEmpleadoLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanelListadoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelListDepto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelListadoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelListDepto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Empleados", jPanel1);

        jPanelListDepto.setBorder(javax.swing.BorderFactory.createTitledBorder("Departamento"));

        textIdDepto.setEnabled(false);

        jLabel1.setText("id");

        jLabel2.setText("Nombre:");

        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jBtnNuevoDpo.setText("Nuevo");
        jBtnNuevoDpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNuevoDpoActionPerformed(evt);
            }
        });

        jBtnBorrarTextoDpto.setText("Borrar");
        jBtnBorrarTextoDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBorrarTextoDptoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelListDeptoLayout = new javax.swing.GroupLayout(jPanelListDepto);
        jPanelListDepto.setLayout(jPanelListDeptoLayout);
        jPanelListDeptoLayout.setHorizontalGroup(
            jPanelListDeptoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListDeptoLayout.createSequentialGroup()
                .addGroup(jPanelListDeptoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListDeptoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnBorrarTextoDpto)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnNuevoDpo)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnGuardar))
                    .addGroup(jPanelListDeptoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanelListDeptoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNombreDpto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textIdDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 256, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelListDeptoLayout.setVerticalGroup(
            jPanelListDeptoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListDeptoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(textIdDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(textNombreDpto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                .addGroup(jPanelListDeptoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardar)
                    .addComponent(jBtnNuevoDpo)
                    .addComponent(jBtnBorrarTextoDpto))
                .addContainerGap())
        );

        jPanelListadoDepartamentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado"));

        jListDptos.setModel(this.modeloJlistDptos);
        jListDptos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListDptos.setSelectedIndex(0);
        jListDptos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListDptosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListDptos);

        javax.swing.GroupLayout jPanelListadoDepartamentosLayout = new javax.swing.GroupLayout(jPanelListadoDepartamentos);
        jPanelListadoDepartamentos.setLayout(jPanelListadoDepartamentosLayout);
        jPanelListadoDepartamentosLayout.setHorizontalGroup(
            jPanelListadoDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListadoDepartamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelListadoDepartamentosLayout.setVerticalGroup(
            jPanelListadoDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListadoDepartamentosLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelListadoDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelListDepto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelListDepto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelListadoDepartamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Departamentos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListDptosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListDptosValueChanged

        mostrarDepartamento(this.jListDptos.getSelectedIndex());

    }//GEN-LAST:event_jListDptosValueChanged

    private void jBtnNuevoDpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNuevoDpoActionPerformed
        // TODO add your handling code here:
        this.limpiarFormularioDeptos();
    }//GEN-LAST:event_jBtnNuevoDpoActionPerformed

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        //  crear un objeto de partamento
        Departamento depto = new Departamento();
        if (!this.textIdDepto.getText().isBlank()) {
            depto.setIdDepartamento(Integer.parseInt(this.textIdDepto.getText()));
        }

        depto.setNombre(this.textNombreDpto.getText());

        guardarDepartamento(depto);


    }//GEN-LAST:event_jBtnGuardarActionPerformed

    private void jBtnBorrarTextoDptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBorrarTextoDptoActionPerformed
        //  crear un objeto de partamento

        Departamento depto = new Departamento();

        // Asignamos valores de interfaz
        if (!this.textIdDepto.getText().isBlank()) {
            depto.setIdDepartamento(Integer.parseInt(this.textIdDepto.getText()));
            borrarDepartamento(depto);
            cargarDepartamentos();
            this.mostrarDepartamento(0);
            this.jListEmpleasdos.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jBtnBorrarTextoDptoActionPerformed

    private void jListEmpleasdosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListEmpleasdosValueChanged
        mostarEmpleado(this.jListEmpleasdos.getSelectedIndex());
    }//GEN-LAST:event_jListEmpleasdosValueChanged

    private void jBtnBorrarTextoEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBorrarTextoEmpActionPerformed

        Empleado emp = new Empleado();

        if (!this.txtNombreEmpleado.getText().isBlank()) {

            emp.setIdEmpleado(Integer.parseInt(this.textIdEmp.getText()));
            borrarEmpleado(emp);

            cargarEmpleado();
            this.mostrarDepartamento(0);
            this.jListEmpleasdos.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jBtnBorrarTextoEmpActionPerformed

    private void jBtnNuevoEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNuevoEmpActionPerformed
        this.limpiarEmpleados();
    }//GEN-LAST:event_jBtnNuevoEmpActionPerformed

    private void jBtnGuardarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarEmpActionPerformed
        Empleado emp = new Empleado();

        if (!textIdDepto.getText().isEmpty()) {
            emp.setIdEmpleado(Integer.parseInt(textIdEmp.getText()));

        }

        emp.setNombre(txtNombreEmpleado.getText());
        emp.setApellidos(txtApellidoEmpleado.getText());
        emp.setEmail(txtEmailEmpleado.getText());
        emp.setSalario(Float.parseFloat(jSpinnerSalario.getValue().toString()));
        emp.setDpto(listadoDeptos.getListaDepartamento(jComboBoxDepartamento.getSelectedIndex()));
        guardarEmpleado(emp);
    }//GEN-LAST:event_jBtnGuardarEmpActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBorrarTextoDpto;
    private javax.swing.JButton jBtnBorrarTextoEmp;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnGuardarEmp;
    private javax.swing.JButton jBtnNuevoDpo;
    private javax.swing.JButton jBtnNuevoEmp;
    private javax.swing.JComboBox<String> jComboBoxDepartamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jListDptos;
    private javax.swing.JList<String> jListEmpleasdos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelListDepto;
    private javax.swing.JPanel jPanelListDepto1;
    private javax.swing.JPanel jPanelListadoDepartamentos;
    private javax.swing.JPanel jPanelListadoEmpleado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerSalario;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField textIdDepto;
    private javax.swing.JTextField textIdEmp;
    private javax.swing.JTextField textNombreDpto;
    private javax.swing.JTextField txtApellidoEmpleado;
    private javax.swing.JTextField txtEmailEmpleado;
    private javax.swing.JTextField txtNombreEmpleado;
    // End of variables declaration//GEN-END:variables

    private void cargarDepartamentos() {
        //limpiqaar el listado

        modeloJlistDptos.clear();
        modeloComboDeptos.removeAllElements();
        listadoDeptos = conexion.listaDepartamentos();

        //actualizar el listado
        for (int i = 0; i < listadoDeptos.size(); i++) {
            //A??adimos cada departamento al jListDptos

            modeloJlistDptos.addElement(listadoDeptos.getListaDepartamento(i).getNombre());
            modeloComboDeptos.addElement(listadoDeptos.getListaDepartamento(i).getNombre());

        }
    }

    private void mostrarDepartamento(int i) {

        if (i >= 0) {

            Departamento deptoSel = new Departamento();

            deptoSel = this.listadoDeptos.getListaDepartamento(i);

            this.textIdDepto.setText(String.valueOf(deptoSel.getIdDepartamento()));
            this.textNombreDpto.setText(deptoSel.getNombre());
        }
    }

    private void limpiarFormularioDeptos() {
        this.textIdDepto.setText("");
        this.textNombreDpto.setText("");
    }

    private void guardarDepartamento(Departamento dpto) {

        if (dpto.getIdDepartamento() == -1) {
            conexion.insertarDepartamento(dpto);
            cargarDepartamentos();

            this.jListDptos.setSelectedIndex(listadoDeptos.size() - 1);
            this.mostrarDepartamento(dpto.getIdDepartamento());
        } else {

            conexion.modificarDepartamentos(dpto, dpto);
            int posSel = this.jListDptos.getSelectedIndex();
            cargarDepartamentos();

            this.jListDptos.setSelectedIndex(posSel);
        }
    }

    private void borrarDepartamento(Departamento depto) {
        if (depto.getIdDepartamento() > -1) {
            conexion.borrarDepartamento(depto);

            cargarDepartamentos();
        }
    }

    private void cargarEmpleado() {
        //limpiqaar el listado
        modeloJlistEmps.clear();
        listadoEmpleado = conexion.listaEmpleados();
        //actualizar el listado

        for (int i = 0; i < listadoEmpleado.size(); i++) {
            //A??adimos cada departamento al jListDptos

            modeloJlistEmps.addElement(listadoEmpleado.getEmpleado(i).getNombre());

        }
    }

    private void limpiarEmpleados() {
        textIdEmp.setText("");
        txtNombreEmpleado.setText("");
        txtApellidoEmpleado.setText("");
        txtEmailEmpleado.setText("");
        jComboBoxDepartamento.setSelectedItem(null);
        jSpinnerSalario.setValue(950);
    }

    private void mostarEmpleado(int i) {

        if (i >= 0) {
            Empleado empSel = new Empleado();

            empSel = listadoEmpleado.getEmpleado(i);
            this.textIdEmp.setText(String.valueOf(empSel.getIdEmpleado()));
            this.txtNombreEmpleado.setText(empSel.getNombre());
            this.txtApellidoEmpleado.setText(empSel.getApellidos());

            this.txtEmailEmpleado.setText(empSel.getEmail());
            jSpinnerSalario.setValue(empSel.getSalario());

            jComboBoxDepartamento.setSelectedItem(empSel.getDpto().getNombre());
        }
    }

    private void borrarEmpleado(Empleado emp) {

        if (emp.getIdEmpleado() > -1) {
            conexion.borrarEmpleado(emp);
            cargarEmpleado();

        }
    }

    private void guardarEmpleado(Empleado emp) {
        if (emp.getIdEmpleado() == -1) {

            conexion.insertarEmpleado(emp);
            cargarEmpleado();
            this.jListEmpleasdos.setSelectedIndex(listadoEmpleado.size() - 1);
            this.mostrarDepartamento(emp.getIdEmpleado());
        } else {

            conexion.modificarEmpleado(emp, emp);

            int posSel = this.jListEmpleasdos.getSelectedIndex();
            cargarEmpleado();

            this.jListEmpleasdos.setSelectedIndex(posSel);
        }
    }
}
