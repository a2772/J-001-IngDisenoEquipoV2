package ui.encargado;

import business.GetById;
import business.GetListas;
import business.InsertIndividual;
import clases.CatCategoria;
import clases.CatMarca;
import clases.CatPerfil;
import clases.CatProducto;
import clases.CatSexo;
import ui.vendedor.*;
import clases.Personal;
import dao.DAOInitializationException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ui.PLogin;

public class PCRUDUsuarios extends javax.swing.JFrame {

    private Personal personal;
    private int vRbtn;

    public PCRUDUsuarios() {
        initComponents();
        vRbtn = 1;
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
        txtApPat = new javax.swing.JTextField();
        jLabelNombre2 = new javax.swing.JLabel();
        btnAplicar = new javax.swing.JButton();
        jButtonSalir1 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabelNombre5 = new javax.swing.JLabel();
        jLabelNombre6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtApMat = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        jLabelNombre8 = new javax.swing.JLabel();
        cboTipoPerfil = new javax.swing.JComboBox<>();
        jLabelNombre9 = new javax.swing.JLabel();
        cboSexo = new javax.swing.JComboBox<>();
        jLabelNombre10 = new javax.swing.JLabel();
        jLabelNombre11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPersonal = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        jLabelNombre7 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabelTitulo = new javax.swing.JLabel();
        dtpFechNac = new com.toedter.calendar.JDateChooser();
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
        getContentPane().add(txtApPat);
        txtApPat.setBounds(620, 140, 180, 30);

        jLabelNombre2.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre2.setText("Segundo Apellido");
        getContentPane().add(jLabelNombre2);
        jLabelNombre2.setBounds(480, 180, 120, 30);

        btnAplicar.setBackground(new java.awt.Color(0, 204, 51));
        btnAplicar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAplicar.setText("Aplicar");
        btnAplicar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAplicar);
        btnAplicar.setBounds(1050, 310, 90, 40);

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
        jButtonSalir1.setBounds(330, 330, 90, 40);

        btnLimpiar.setBackground(new java.awt.Color(0, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(910, 310, 90, 40);

        jLabelNombre5.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre5.setText("Contraseña");
        getContentPane().add(jLabelNombre5);
        jLabelNombre5.setBounds(840, 260, 110, 30);

        jLabelNombre6.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre6.setText("Correo Electronico");
        getContentPane().add(jLabelNombre6);
        jLabelNombre6.setBounds(480, 230, 120, 30);
        getContentPane().add(txtCorreo);
        txtCorreo.setBounds(620, 240, 180, 30);
        getContentPane().add(txtApMat);
        txtApMat.setBounds(620, 190, 180, 30);
        getContentPane().add(txtTel);
        txtTel.setBounds(960, 160, 160, 30);

        jLabelNombre8.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre8.setText("Teléfono");
        getContentPane().add(jLabelNombre8);
        jLabelNombre8.setBounds(840, 160, 120, 30);

        cboTipoPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboTipoPerfil);
        cboTipoPerfil.setBounds(960, 110, 160, 30);

        jLabelNombre9.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre9.setText("Fecha de nacimiento");
        getContentPane().add(jLabelNombre9);
        jLabelNombre9.setBounds(480, 290, 140, 30);

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboSexo);
        cboSexo.setBounds(960, 60, 160, 30);

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

        jtPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPersonalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPersonal);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 412, 900, 210);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(620, 100, 180, 30);
        getContentPane().add(txtId);
        txtId.setBounds(620, 60, 180, 30);

        jLabelID.setBackground(new java.awt.Color(0, 153, 153));
        jLabelID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelID.setText("ID del Empleado");
        getContentPane().add(jLabelID);
        jLabelID.setBounds(480, 60, 130, 30);
        getContentPane().add(txtCurp);
        txtCurp.setBounds(960, 210, 160, 30);

        jLabelNombre7.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre7.setText("CURP");
        getContentPane().add(jLabelNombre7);
        jLabelNombre7.setBounds(840, 210, 110, 30);

        txtPass.setText("1234");
        getContentPane().add(txtPass);
        txtPass.setBounds(960, 260, 160, 30);

        jLabelTitulo.setBackground(new java.awt.Color(0, 153, 153));
        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitulo.setText("CRUD Usuarios");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(320, 10, 220, 40);
        getContentPane().add(dtpFechNac);
        dtpFechNac.setBounds(630, 290, 170, 30);

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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtId.setText("");
        txtNombre.setText("");
        txtApPat.setText("");
        txtApMat.setText("");
        txtCorreo.setText("");
        txtCurp.setText("");
        txtTel.setText("");
        cboSexo.setSelectedIndex(0);
        cboTipoPerfil.setSelectedIndex(0);
        dtpFechNac.setDate(Date.from(LocalDateTime.now().toInstant(ZoneOffset.UTC)));
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
        enableAll();
        this.vRbtn=1;
        
    }//GEN-LAST:event_rbtnAgregarActionPerformed

    private void rbtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnConsultarActionPerformed
        disRbtn();
        this.vRbtn=2;
        this.rbtnConsultar.setSelected(true);
        try {
            consulta();
        } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
            Logger.getLogger(PCRUDUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        disableAll();
    }//GEN-LAST:event_rbtnConsultarActionPerformed

    private void rbtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnActualizarActionPerformed
        disRbtn();
        this.vRbtn=3;
        this.rbtnActualizar.setSelected(true);
        disableAll();
    }//GEN-LAST:event_rbtnActualizarActionPerformed

    private void rbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEliminarActionPerformed
        disRbtn();
        this.vRbtn=4;
        this.rbtnEliminar.setSelected(true);
        disableAll();
    }//GEN-LAST:event_rbtnEliminarActionPerformed

    private void jtPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPersonalMouseClicked
        if (vRbtn == 3) {
            enableAll();
        }
        //Llenamos valores
        int sel = jtPersonal.rowAtPoint(evt.getPoint());
        /*
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
        */
        txtId.setText(String.valueOf(jtPersonal.getValueAt(sel, 0)));
        txtNombre.setText(String.valueOf(jtPersonal.getValueAt(sel, 1)));
        txtApPat.setText(String.valueOf(jtPersonal.getValueAt(sel, 2)));
        txtApMat.setText(String.valueOf(jtPersonal.getValueAt(sel, 3)));
        //No 4
        txtCurp.setText(String.valueOf(jtPersonal.getValueAt(sel, 5)));
        txtTel.setText(String.valueOf(jtPersonal.getValueAt(sel, 6)));
        txtCorreo.setText(String.valueOf(jtPersonal.getValueAt(sel, 8)));
        
        //Obtenemos el producto por id para [4 y 9]
        GetById getById = new GetById();
        Personal p = new Personal();
        try {
            p = getById.getPersonalById(Integer.parseInt(txtId.getText()));
        } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
            Logger.getLogger(PCRUDMisProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        cboSexo.setSelectedIndex(p.getCatSexo().getIdSexo());
        cboTipoPerfil.setSelectedIndex(p.getCatPerfil().getIdCPerfil());
        
        dtpFechNac.setDate(Date.from(p.getFechaNac().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        if (vRbtn == 3) {
            enableAll();
        }
    }//GEN-LAST:event_jtPersonalMouseClicked

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed
        if(vRbtn==1){//Inserccion
            //Pendiente pedir  e insertar password
            Personal p = new Personal();
            
            p.setNombre(txtNombre.getText());
            p.setApPat(txtNombre.getText());
            p.setApMat(txtNombre.getText());
            p.setCorreo(txtNombre.getText());
            p.setCurp(txtNombre.getText());
            p.setFechaNac(dtpFechNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            p.setTel(txtNombre.getText());
            //Parte del CatPerfil
            CatPerfil cp = new CatPerfil();
            cp.setIdCPerfil(cboTipoPerfil.getSelectedIndex());
            CatSexo cs = new CatSexo();
            cs.setIdSexo(cboSexo.getSelectedIndex());
            p.setCatPerfil(cp);
            p.setCatSexo(cs);
            
            //Mandamos a insertar
            InsertIndividual insertIndividual = new InsertIndividual();
            try {
                insertIndividual.fillPersonal(p);
                JOptionPane.showMessageDialog(null, "Usuario agregado");
            } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
                Logger.getLogger(PCRUDUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error 405");
            }
        }
    }//GEN-LAST:event_btnAplicarActionPerformed

    private void enableAll() {
        txtNombre.setEditable(true);
        txtApPat.setEditable(true);
        txtApMat.setEditable(true);
        txtCurp.setEditable(true);
        txtCorreo.setEditable(true);
        txtTel.setEditable(true);
    }

    private void disableAll() {
        txtNombre.setEditable(false);
        txtApPat.setEditable(false);
        txtApMat.setEditable(false);
        txtCurp.setEditable(false);
        txtCorreo.setEditable(false);
        txtTel.setEditable(false);
    }

    private void disRbtn() {//eshabilita todos los rbtn de opciones Agrega, consultar, etc.
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
            registro[7] = String.valueOf(p.getFechaNac().getDayOfMonth() + "/" + p.getFechaNac().getMonth() + "/" + p.getFechaNac().getYear());
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
        cboSexo.removeAllItems();
        cboSexo.addItem(" ");
        for (int i = 0; i < lista.size(); i++) {
            cboSexo.addItem(lista.get(i).getSexo());
        }
    }

    private void fillCatPerfil() throws ClassNotFoundException, SQLException, SQLException, DAOInitializationException {
        List<CatPerfil> lista;
        GetListas getListas = new GetListas();
        lista = getListas.fillLCatPerfil();
        cboTipoPerfil.removeAllItems();
        cboTipoPerfil.addItem(" ");
        for (int i = 0; i < lista.size(); i++) {
            cboTipoPerfil.addItem(lista.get(i).getPerfil());
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
    private javax.swing.JButton btnAplicar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cboSexo;
    private javax.swing.JComboBox<String> cboTipoPerfil;
    private com.toedter.calendar.JDateChooser dtpFechNac;
    private javax.swing.JButton jButtonSalir1;
    private javax.swing.JLabel jLBackground;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre10;
    private javax.swing.JLabel jLabelNombre11;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelNombre4;
    private javax.swing.JLabel jLabelNombre5;
    private javax.swing.JLabel jLabelNombre6;
    private javax.swing.JLabel jLabelNombre7;
    private javax.swing.JLabel jLabelNombre8;
    private javax.swing.JLabel jLabelNombre9;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTextField txtApMat;
    private javax.swing.JTextField txtApPat;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtTel;
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

    public void preCarga() throws ClassNotFoundException, SQLException, DAOInitializationException {//Datos previos a mostrar el JFRAME pero posteriores al constructor
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
        txtId.setEditable(false);
        //Cats
        fillSexo();
        fillCatPerfil();
    }
}
