package ui.encargado;

import business.GetListas;
import clases.CatCategoria;
import clases.CatMarca;
import clases.CatProducto;
import clases.CatSexo;
import ui.vendedor.*;
import clases.Personal;
import dao.DAOInitializationException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ui.PLogin;

public class PCRUDUsuarios extends javax.swing.JFrame {

    private Personal personal;

    public PCRUDUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        rbtnActualizar = new javax.swing.JRadioButton();
        rbtnConsultar = new javax.swing.JRadioButton();
        rbtnAgregar = new javax.swing.JRadioButton();
        rbtnEliminar = new javax.swing.JRadioButton();
        jLabelNombre4 = new javax.swing.JLabel();
        jTextFieldPriApellido = new javax.swing.JTextField();
        jLabelNombre2 = new javax.swing.JLabel();
        jButtonAplicar = new javax.swing.JButton();
        jButtonSalir1 = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabelNombre5 = new javax.swing.JLabel();
        jTextFieldCURP = new javax.swing.JTextField();
        jLabelNombre6 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldSegApellido = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabelNombre8 = new javax.swing.JLabel();
        cboTipoPerfil = new javax.swing.JComboBox<>();
        jLabelNombre9 = new javax.swing.JLabel();
        cboSexo = new javax.swing.JComboBox<>();
        jLabelNombre10 = new javax.swing.JLabel();
        jLabelNombre11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPersonal = new javax.swing.JTable();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jpMenu = new javax.swing.JPanel();
        lblMss1 = new javax.swing.JLabel();
        rbtnVenta = new javax.swing.JRadioButton();
        rbtnConsProd = new javax.swing.JRadioButton();
        rbtnCRUDUsr = new javax.swing.JRadioButton();
        rbtnCRUDInv = new javax.swing.JRadioButton();
        rbtnCRUDPM = new javax.swing.JRadioButton();
        rbtnCRUDHor = new javax.swing.JRadioButton();
        lblMss3 = new javax.swing.JLabel();
        lblMss2 = new javax.swing.JLabel();
        jLBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(30, 40));
        setMinimumSize(new java.awt.Dimension(1252, 652));
        getContentPane().setLayout(null);

        jLabelNombre.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombre ");
        getContentPane().add(jLabelNombre);
        jLabelNombre.setBounds(480, 100, 120, 30);

        rbtnActualizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbtnActualizar.setText("Actualizar");
        rbtnActualizar.setOpaque(false);
        rbtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnActualizar);
        rbtnActualizar.setBounds(320, 220, 120, 31);

        rbtnConsultar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbtnConsultar.setText("Consultar");
        rbtnConsultar.setOpaque(false);
        rbtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnConsultar);
        rbtnConsultar.setBounds(320, 160, 120, 31);

        rbtnAgregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbtnAgregar.setSelected(true);
        rbtnAgregar.setText("Agregar");
        rbtnAgregar.setOpaque(false);
        rbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnAgregar);
        rbtnAgregar.setBounds(320, 100, 100, 31);

        rbtnEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbtnEliminar.setText("Eliminar");
        rbtnEliminar.setOpaque(false);
        rbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnEliminar);
        rbtnEliminar.setBounds(320, 280, 140, 23);

        jLabelNombre4.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre4.setText("Primer Apellido");
        getContentPane().add(jLabelNombre4);
        jLabelNombre4.setBounds(480, 140, 130, 30);
        getContentPane().add(jTextFieldPriApellido);
        jTextFieldPriApellido.setBounds(620, 140, 180, 30);

        jLabelNombre2.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre2.setText("Segundo Apellido");
        getContentPane().add(jLabelNombre2);
        jLabelNombre2.setBounds(480, 180, 120, 30);

        jButtonAplicar.setBackground(new java.awt.Color(0, 204, 51));
        jButtonAplicar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAplicar.setText("Aplicar");
        jButtonAplicar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jButtonAplicar);
        jButtonAplicar.setBounds(1060, 180, 90, 40);

        jButtonSalir1.setBackground(new java.awt.Color(204, 0, 0));
        jButtonSalir1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSalir1.setText("Salir");
        jButtonSalir1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalir1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir1);
        jButtonSalir1.setBounds(330, 380, 90, 40);

        jButtonLimpiar.setBackground(new java.awt.Color(0, 255, 255));
        jButtonLimpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpiar);
        jButtonLimpiar.setBounds(900, 180, 90, 40);

        jLabelNombre5.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre5.setText("CURP");
        getContentPane().add(jLabelNombre5);
        jLabelNombre5.setBounds(480, 220, 110, 30);
        getContentPane().add(jTextFieldCURP);
        jTextFieldCURP.setBounds(620, 220, 180, 30);

        jLabelNombre6.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre6.setText("Correo Electronico");
        getContentPane().add(jLabelNombre6);
        jLabelNombre6.setBounds(480, 260, 120, 30);
        getContentPane().add(jTextFieldEmail);
        jTextFieldEmail.setBounds(620, 260, 180, 30);
        getContentPane().add(jTextFieldSegApellido);
        jTextFieldSegApellido.setBounds(620, 180, 180, 30);
        getContentPane().add(jTextFieldTelefono);
        jTextFieldTelefono.setBounds(630, 300, 170, 30);

        jLabelNombre8.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre8.setText("Teléfono");
        getContentPane().add(jLabelNombre8);
        jLabelNombre8.setBounds(480, 300, 120, 30);

        cboTipoPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboTipoPerfil);
        cboTipoPerfil.setBounds(960, 110, 130, 30);

        jLabelNombre9.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre9.setText("Fecha de nacimiento");
        getContentPane().add(jLabelNombre9);
        jLabelNombre9.setBounds(480, 340, 170, 30);

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboSexo);
        cboSexo.setBounds(960, 60, 130, 30);

        jLabelNombre10.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre10.setText("Sexo");
        getContentPane().add(jLabelNombre10);
        jLabelNombre10.setBounds(840, 60, 90, 30);

        jLabelNombre11.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre11.setText("Tipo de Perfil");
        getContentPane().add(jLabelNombre11);
        jLabelNombre11.setBounds(840, 110, 110, 30);

        jScrollPane1.setViewportView(jtPersonal);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 482, 900, 140);
        getContentPane().add(jTextFieldNombre);
        jTextFieldNombre.setBounds(620, 100, 180, 30);
        getContentPane().add(jTextFieldID);
        jTextFieldID.setBounds(620, 60, 180, 30);

        jLabelID.setBackground(new java.awt.Color(0, 153, 153));
        jLabelID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelID.setText("ID del Empleado");
        getContentPane().add(jLabelID);
        jLabelID.setBounds(480, 60, 130, 30);

        jLabelTitulo.setBackground(new java.awt.Color(0, 153, 153));
        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitulo.setText("CRUD Usuarios");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(320, 10, 220, 40);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(630, 340, 170, 30);

        jpMenu.setBackground(new java.awt.Color(204, 255, 255));

        lblMss1.setBackground(new java.awt.Color(23, 144, 144));
        lblMss1.setFont(new java.awt.Font("Bookman Old Style", 3, 17)); // NOI18N
        lblMss1.setForeground(new java.awt.Color(255, 255, 255));
        lblMss1.setText("            ");
        lblMss1.setName("lblMss1"); // NOI18N
        lblMss1.setOpaque(true);

        rbtnVenta.setBackground(new java.awt.Color(127, 248, 248));
        rbtnVenta.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        rbtnVenta.setForeground(new java.awt.Color(255, 153, 51));
        rbtnVenta.setText("Realizar Venta");
        rbtnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnVentaActionPerformed(evt);
            }
        });

        rbtnConsProd.setBackground(new java.awt.Color(127, 248, 248));
        rbtnConsProd.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        rbtnConsProd.setForeground(new java.awt.Color(255, 153, 51));
        rbtnConsProd.setText("Consultar Productos");
        rbtnConsProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnConsProdActionPerformed(evt);
            }
        });

        rbtnCRUDUsr.setBackground(new java.awt.Color(127, 248, 248));
        rbtnCRUDUsr.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        rbtnCRUDUsr.setForeground(new java.awt.Color(255, 153, 51));
        rbtnCRUDUsr.setSelected(true);
        rbtnCRUDUsr.setText("CRUD Usuarios");

        rbtnCRUDInv.setBackground(new java.awt.Color(127, 248, 248));
        rbtnCRUDInv.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        rbtnCRUDInv.setForeground(new java.awt.Color(255, 153, 51));
        rbtnCRUDInv.setText("CRUD Inventarios");
        rbtnCRUDInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCRUDInvActionPerformed(evt);
            }
        });

        rbtnCRUDPM.setBackground(new java.awt.Color(127, 248, 248));
        rbtnCRUDPM.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        rbtnCRUDPM.setForeground(new java.awt.Color(255, 153, 51));
        rbtnCRUDPM.setText("CRUD Mis Productos");
        rbtnCRUDPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCRUDPMActionPerformed(evt);
            }
        });

        rbtnCRUDHor.setBackground(new java.awt.Color(127, 248, 248));
        rbtnCRUDHor.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        rbtnCRUDHor.setForeground(new java.awt.Color(255, 153, 51));
        rbtnCRUDHor.setText("CRUD Horarios");
        rbtnCRUDHor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCRUDHorActionPerformed(evt);
            }
        });

        lblMss3.setBackground(new java.awt.Color(0, 204, 204));
        lblMss3.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lblMss3.setText("            ");
        lblMss3.setName("jLabel2"); // NOI18N
        lblMss3.setOpaque(true);

        lblMss2.setBackground(new java.awt.Color(23, 144, 144));
        lblMss2.setFont(new java.awt.Font("Bookman Old Style", 3, 17)); // NOI18N
        lblMss2.setForeground(new java.awt.Color(255, 255, 255));
        lblMss2.setText("            ");
        lblMss2.setName("jLabel2"); // NOI18N
        lblMss2.setOpaque(true);

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMss1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMss3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMss2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnCRUDUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnCRUDInv, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnCRUDPM, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnConsProd, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnCRUDHor, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblMss1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMss2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMss3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(rbtnVenta)
                .addGap(18, 18, 18)
                .addComponent(rbtnConsProd)
                .addGap(18, 18, 18)
                .addComponent(rbtnCRUDUsr)
                .addGap(18, 18, 18)
                .addComponent(rbtnCRUDInv)
                .addGap(21, 21, 21)
                .addComponent(rbtnCRUDPM)
                .addGap(18, 18, 18)
                .addComponent(rbtnCRUDHor)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jpMenu);
        jpMenu.setBounds(20, 40, 270, 550);

        jLBackground.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/binarios/images/Degradado1.jpg"))); // NOI18N
        getContentPane().add(jLBackground);
        jLBackground.setBounds(0, 0, 1250, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnCRUDInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCRUDInvActionPerformed
        PCRUDInventarios p = new PCRUDInventarios();
        //Iniciamos el primer formulario, si es Encargado
        p.setPersonal(personal);
        p.preCarga();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_rbtnCRUDInvActionPerformed

    private void rbtnCRUDHorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCRUDHorActionPerformed
        PCRUDHorarios p = new PCRUDHorarios();
        //Iniciamos el primer formulario, si es Encargado
        p.setPersonal(personal);
        p.preCarga();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_rbtnCRUDHorActionPerformed

    private void rbtnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnVentaActionPerformed
        PRealizarVenta p = new PRealizarVenta();
        //Iniciamos el primer formulario, si es Encargado
        p.setPersonal(personal);
        p.preCarga();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_rbtnVentaActionPerformed

    private void jButtonSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalir1ActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Realmente desea salir de su sesión?", "Cerrando Sesión...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == 0) {
            JOptionPane.showMessageDialog(null, "        Cerrando sesión        \n     Ten un excelente día\n          " + personal.getNombre());
            PLogin pLogin = new PLogin();
            pLogin.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButtonSalir1ActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void rbtnConsProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnConsProdActionPerformed
        PConsultaProductos p = new PConsultaProductos();
        //Iniciamos el primer formulario, si es Encargado
        p.setPersonal(personal);
        try {
            p.preCarga();
        } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
            Logger.getLogger(PCRUDUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_rbtnConsProdActionPerformed

    private void rbtnCRUDPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCRUDPMActionPerformed
        PCRUDMisProductos p = new PCRUDMisProductos();
        //Iniciamos el primer formulario, si es Encargado
        p.setPersonal(personal);
        try {
            p.preCarga();
        } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
            Logger.getLogger(PCRUDUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_rbtnCRUDPMActionPerformed

    private void rbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAgregarActionPerformed
        disRbtn();
        this.rbtnAgregar.setSelected(true);
    }//GEN-LAST:event_rbtnAgregarActionPerformed

    private void rbtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnConsultarActionPerformed
        disRbtn();
        this.rbtnConsultar.setSelected(true);
        try {
            consulta();
        } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
            Logger.getLogger(PCRUDUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rbtnConsultarActionPerformed

    private void rbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnActualizarActionPerformed
        disRbtn();
        this.rbtnActualizar.setSelected(true);
    }//GEN-LAST:event_rbtnActualizarActionPerformed

    private void rbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEliminarActionPerformed
        disRbtn();
        this.rbtnEliminar.setSelected(true);
    }//GEN-LAST:event_rbtnEliminarActionPerformed

    private void disRbtn(){//eshabilita todos los rbtn de opciones Agrega, consultar, etc.
        this.rbtnAgregar.setSelected(false);
        this.rbtnActualizar.setSelected(false);
        this.rbtnConsultar.setSelected(false);
        this.rbtnEliminar.setSelected(false);
    }
    private void consulta() throws ClassNotFoundException, SQLException, DAOInitializationException {//Se usa en actualización y en consulta
        //Hacemos consulta llenando los desplegables con filtros
        //Cada que se invoque, actualiza la tabla de productos
        GetListas getListas = new GetListas();
        List<Personal> lista = getListas.fillLPersonal();
        
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Id personal");
        modelo.addColumn("Nombre");
        modelo.addColumn("Ap. paterno");
        modelo.addColumn("Ap. Materno");
        modelo.addColumn("Sexo");
        modelo.addColumn("CURP");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Fecha de Nac.");
        modelo.addColumn("E-mail");
        modelo.addColumn("Tipo Perfil");

        String registro[] = new String[10];
        for (int i = 0; i < lista.size(); i++) {
            Personal p = lista.get(i);

            registro[0] = String.valueOf(p.getIdPersonal());
            registro[1] = String.valueOf(p.getNombre());
            registro[2] = String.valueOf(p.getApPat());
            registro[3] = String.valueOf(p.getApMat());
            registro[4] = String.valueOf(p.getCatSexo().getSexo());
            registro[5] = String.valueOf(p.getCurp());
            registro[6] = String.valueOf(p.getTel());
            registro[7] = String.valueOf(p.getFechaNac().getDayOfMonth() + "/" + p.getFechaNac().getMonth() + "/"+p.getFechaNac().getYear());
            registro[8] = String.valueOf(p.getCorreo());
            registro[9] = String.valueOf(p.getCatPerfil().getPerfil());
            
            modelo.addRow(registro);
        }
        jtPersonal.setModel(modelo);
    }
    
    private void fillSexo() throws ClassNotFoundException, SQLException, SQLException, DAOInitializationException {
        List<CatSexo> lista;
        GetListas getListas = new GetListas();
        lista = getListas.fillLCatSexo();
        cboMar.removeAllItems();
        cboMar.addItem(" ");
        for (int i = 0; i < lista.size(); i++) {
            cboMar.addItem(lista.get(i).getMarca());
        }
    }
    private void fillCatPerfil() throws ClassNotFoundException, SQLException, SQLException, DAOInitializationException {
        List<CatMarca> lista;
        GetListas getListas = new GetListas();
        lista = getListas.fillLCatMarca();
        cboMar.removeAllItems();
        cboMar.addItem(" ");
        for (int i = 0; i < lista.size(); i++) {
            cboMar.addItem(lista.get(i).getMarca());
        }
    }
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            private Personal personal;
            public void run() {
                new PRealizarVenta(this.personal).setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboSexo;
    private javax.swing.JComboBox<String> cboTipoPerfil;
    private javax.swing.JButton jButtonAplicar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonSalir1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLBackground;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre10;
    private javax.swing.JLabel jLabelNombre11;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelNombre4;
    private javax.swing.JLabel jLabelNombre5;
    private javax.swing.JLabel jLabelNombre6;
    private javax.swing.JLabel jLabelNombre8;
    private javax.swing.JLabel jLabelNombre9;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCURP;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPriApellido;
    private javax.swing.JTextField jTextFieldSegApellido;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JTable jtPersonal;
    private javax.swing.JLabel lblMss1;
    private javax.swing.JLabel lblMss2;
    private javax.swing.JLabel lblMss3;
    private javax.swing.JRadioButton rbtnActualizar;
    private javax.swing.JRadioButton rbtnAgregar;
    private javax.swing.JRadioButton rbtnCRUDHor;
    private javax.swing.JRadioButton rbtnCRUDInv;
    private javax.swing.JRadioButton rbtnCRUDPM;
    private javax.swing.JRadioButton rbtnCRUDUsr;
    private javax.swing.JRadioButton rbtnConsProd;
    private javax.swing.JRadioButton rbtnConsultar;
    private javax.swing.JRadioButton rbtnEliminar;
    private javax.swing.JRadioButton rbtnVenta;
    // End of variables declaration//GEN-END:variables

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    private void desSelect() {//Desselecciona todos los RBTN
        rbtnConsProd.setSelected(false);
        rbtnVenta.setSelected(false);
        rbtnCRUDHor.setSelected(false);
        rbtnCRUDInv.setSelected(false);
        rbtnCRUDPM.setSelected(false);
        rbtnCRUDUsr.setSelected(false);
    }

    public void preCarga() {//Datos previos a mostrar el JFRAME pero posteriores al constructor
        int spndt = 0;
        String txt = "            ¡Bienvenid";
        if (this.personal.getCatSexo().getIdSexo() != 1) {
            txt += "a!";
        } else {
            txt += "o!";
        }
        lblMss1.setText(txt);

        txt = "";
        spndt = (34 - personal.getNombre().length()) / 2;
        for (int i = 0; i < spndt; i++) {
            txt += " ";
        }
        lblMss2.setText(txt + personal.getNombre());
        txt = "";
        for (int i = 0; i < 22; i++) {
            txt += " ";
        }
        lblMss3.setText(txt + personal.getCatPerfil().getPerfil());

        //Segun el tipo de Usuario
        if (personal.getCatPerfil().getIdCPerfil() == 1) {

        } else {
            rbtnCRUDHor.setVisible(false);
            rbtnCRUDInv.setVisible(false);
            rbtnCRUDPM.setVisible(false);
            rbtnCRUDUsr.setVisible(false);
            jpMenu.setSize(270, 305);
        }
    }
}
