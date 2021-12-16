package ui.encargado;

import business.GetListas;
import clases.CatCategoria;
import clases.CatMarca;
import clases.CatProducto;
import clases.Personal;
import dao.DAOInitializationException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ui.PLogin;
import ui.vendedor.PConsultaProductos;
import ui.vendedor.PRealizarVenta;

public class PCRUDMisProductos extends javax.swing.JFrame {

    private int vRbtn;
    private Personal personal;

    public PCRUDMisProductos() {
        initComponents();
        this.vRbtn = 1;//Siempre empieza con el radio button de Agregar
        this.txtId.setEditable(false);

        //DESACTIVA
        btnLimpiar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        rbtnActu = new javax.swing.JRadioButton();
        rbtnConsult = new javax.swing.JRadioButton();
        rbtnAdd = new javax.swing.JRadioButton();
        jLabelNombre4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabelNombre1 = new javax.swing.JLabel();
        jLabelNombre2 = new javax.swing.JLabel();
        jLabelNombre3 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cboCat = new javax.swing.JComboBox<>();
        cboMar = new javax.swing.JComboBox<>();
        txtColor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabelID = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombre5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcionA = new javax.swing.JTextArea();
        jLabelNombre6 = new javax.swing.JLabel();
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
        setLocation(new java.awt.Point(500, 300));
        setMinimumSize(new java.awt.Dimension(1252, 652));
        getContentPane().setLayout(null);

        jLabelNombre.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombre ");
        getContentPane().add(jLabelNombre);
        jLabelNombre.setBounds(500, 50, 100, 30);

        rbtnActu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbtnActu.setText("Actualizar");
        rbtnActu.setOpaque(false);
        rbtnActu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnActuActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnActu);
        rbtnActu.setBounds(330, 150, 140, 31);

        rbtnConsult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbtnConsult.setText("Consultar");
        rbtnConsult.setOpaque(false);
        rbtnConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnConsultActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnConsult);
        rbtnConsult.setBounds(330, 110, 140, 31);

        rbtnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rbtnAdd.setSelected(true);
        rbtnAdd.setText("Agregar");
        rbtnAdd.setOpaque(false);
        rbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAddActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnAdd);
        rbtnAdd.setBounds(330, 70, 140, 31);

        jLabelNombre4.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre4.setText("Descripcion Producto:");
        getContentPane().add(jLabelNombre4);
        jLabelNombre4.setBounds(500, 200, 160, 30);
        getContentPane().add(txtPrecio);
        txtPrecio.setBounds(990, 10, 220, 30);

        jLabelNombre1.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre1.setText("Categoría:");
        getContentPane().add(jLabelNombre1);
        jLabelNombre1.setBounds(900, 200, 80, 30);

        jLabelNombre2.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre2.setText("Color:");
        getContentPane().add(jLabelNombre2);
        jLabelNombre2.setBounds(500, 280, 60, 30);

        jLabelNombre3.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre3.setText("Marca:");
        getContentPane().add(jLabelNombre3);
        jLabelNombre3.setBounds(900, 150, 70, 30);

        btnAceptar.setBackground(new java.awt.Color(0, 204, 51));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAceptar.setText("Aplicar");
        btnAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(1050, 250, 90, 40);

        btnSalir.setBackground(new java.awt.Color(204, 0, 0));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(350, 220, 90, 40);

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
        btnLimpiar.setBounds(350, 270, 90, 40);

        cboCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Producto", "Proteccion", "Refaccion", "Accesorio" }));
        cboCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCatActionPerformed(evt);
            }
        });
        getContentPane().add(cboCat);
        cboCat.setBounds(990, 200, 230, 30);

        cboMar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patines", "Patinetas", "Scooters" }));
        cboMar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMarActionPerformed(evt);
            }
        });
        getContentPane().add(cboMar);
        cboMar.setBounds(990, 150, 230, 30);
        getContentPane().add(txtColor);
        txtColor.setBounds(660, 280, 220, 30);

        jScrollPane1.setViewportView(jtProductos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 322, 880, 290);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(660, 50, 220, 30);
        getContentPane().add(txtId);
        txtId.setBounds(660, 10, 220, 30);

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(660, 180, 220, 80);

        jLabelID.setBackground(new java.awt.Color(0, 153, 153));
        jLabelID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelID.setText("ID del Producto");
        getContentPane().add(jLabelID);
        jLabelID.setBounds(500, 10, 110, 30);

        jLabelTitulo.setBackground(new java.awt.Color(0, 153, 153));
        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTitulo.setText("CRU Mis productos");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(330, 10, 170, 40);

        jLabelNombre5.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre5.setText("Descripcion Almacén:");
        getContentPane().add(jLabelNombre5);
        jLabelNombre5.setBounds(500, 110, 160, 30);

        txtDescripcionA.setColumns(20);
        txtDescripcionA.setRows(5);
        jScrollPane3.setViewportView(txtDescripcionA);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(660, 90, 220, 80);

        jLabelNombre6.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre6.setText("Costo:");
        getContentPane().add(jLabelNombre6);
        jLabelNombre6.setBounds(900, 10, 60, 30);

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
        rbtnCRUDUsr.setText("CRUD Usuarios");
        rbtnCRUDUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCRUDUsrActionPerformed(evt);
            }
        });

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
        rbtnCRUDPM.setSelected(true);
        rbtnCRUDPM.setText("CRUD Mis Productos");

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
                .addGap(17, 17, 17)
                .addComponent(rbtnCRUDPM)
                .addGap(18, 18, 18)
                .addComponent(rbtnCRUDHor)
                .addContainerGap(54, Short.MAX_VALUE))
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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Realmente desea salir de su sesión?", "Cerrando Sesión...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == 0) {
            JOptionPane.showMessageDialog(null, "        Cerrando sesión        \n     Ten un excelente día\n          " + personal.getNombre());
            PLogin pLogin = new PLogin();
            pLogin.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void rbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAddActionPerformed
        desSelect();
        rbtnAdd.setSelected(true);
        this.vRbtn = 1;
        try {
            casoRbtn();
        } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
            Logger.getLogger(PCRUDMisProductos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_rbtnAddActionPerformed

    private void rbtnConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnConsultActionPerformed
        desSelect();
        rbtnConsult.setSelected(true);
        this.vRbtn = 2;
        try {
            casoRbtn();
        } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
            Logger.getLogger(PCRUDMisProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rbtnConsultActionPerformed

    private void rbtnActuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnActuActionPerformed
        desSelect();
        rbtnActu.setSelected(true);
        this.vRbtn = 3;
        try {
            casoRbtn();
        } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
            Logger.getLogger(PCRUDMisProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rbtnActuActionPerformed

    private void rbtnConsProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnConsProdActionPerformed
        PConsultaProductos p = new PConsultaProductos();
        //Iniciamos el primer formulario, si es Encargado
        p.setPersonal(personal);
        try {
            p.preCarga();
        } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
            Logger.getLogger(PCRUDMisProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_rbtnConsProdActionPerformed

    private void rbtnCRUDUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCRUDUsrActionPerformed
        PCRUDUsuarios p = new PCRUDUsuarios();
        //Iniciamos el primer formulario, si es Encargado
        p.setPersonal(personal);
        p.preCarga();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_rbtnCRUDUsrActionPerformed

    private void cboMarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMarActionPerformed
        try {
            if (vRbtn != 1) {
                consulta();
            }
        } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
            Logger.getLogger(PCRUDMisProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cboMarActionPerformed

    private void cboCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCatActionPerformed
        try {
            if (vRbtn != 1) {
                consulta();
            }
        } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
            Logger.getLogger(PCRUDMisProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cboCatActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (vRbtn == 1) {
            //Insertamos
            //Primero obtenemos id's
            GetListas getListas = new GetListas();
            List<CatMarca> catLMarca = null;
            List<CatCategoria> catLCategoria = null;
            try {
                catLMarca = getListas.fillLCatMarca();
                catLCategoria = getListas.fillLCatCategoria();
            } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
                Logger.getLogger(PCRUDMisProductos.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Obteniendo las id de los combo box
            int idMarca = -1, idCategoria = -1, aux = 0;
            int indxM = cboMar.getSelectedIndex(), indxC = cboCat.getSelectedIndex();
            //Marcas
            if (indxM > 0) {
                idMarca = catLMarca.get(indxM - 1).getIdMarca();
            }

            //Categorias
            if (indxC > 0) {
                idCategoria = catLCategoria.get(indxC - 1).getIdCategoria();
            }
            
            //Insertamos
            
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            private Personal personal;
            public void run() {
                new PRealizarVenta(this.personal).setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboCat;
    private javax.swing.JComboBox<String> cboMar;
    private javax.swing.JLabel jLBackground;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelNombre3;
    private javax.swing.JLabel jLabelNombre4;
    private javax.swing.JLabel jLabelNombre5;
    private javax.swing.JLabel jLabelNombre6;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JTable jtProductos;
    private javax.swing.JLabel lblMss1;
    private javax.swing.JLabel lblMss2;
    private javax.swing.JLabel lblMss3;
    private javax.swing.JRadioButton rbtnActu;
    private javax.swing.JRadioButton rbtnAdd;
    private javax.swing.JRadioButton rbtnCRUDHor;
    private javax.swing.JRadioButton rbtnCRUDInv;
    private javax.swing.JRadioButton rbtnCRUDPM;
    private javax.swing.JRadioButton rbtnCRUDUsr;
    private javax.swing.JRadioButton rbtnConsProd;
    private javax.swing.JRadioButton rbtnConsult;
    private javax.swing.JRadioButton rbtnVenta;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextArea txtDescripcionA;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    private void desSelect() {//Desselecciona todos los RBTN
        rbtnActu.setSelected(false);
        rbtnAdd.setSelected(false);
        rbtnConsult.setSelected(false);
    }

    private void casoRbtn() throws ClassNotFoundException, SQLException, DAOInitializationException {//Según el radio button seleccionado, se hará una acción específica
        switch (this.vRbtn) {
            case 1://Agregar
                enableAllFields();
                jtProductos.setModel(new DefaultTableModel());
                break;
            case 2://Consultar
                disableAllFields();
                consulta();
                break;
            case 3://Actualizar
                disableAllFields();
                JOptionPane.showMessageDialog(null, "Para actualizar un producto, seleccionalo de la tabla inferior", "Aviso", JOptionPane.WARNING_MESSAGE);
                consulta();

                break;
        }
    }

    private void consulta() throws ClassNotFoundException, SQLException, DAOInitializationException {//Se usa en actualización y en consulta
        //Hacemos consulta llenando los desplegables con filtros
        //Cada que se invoque, actualiza la tabla de productos
        GetListas getListas = new GetListas();
        List<CatMarca> catLMarca = getListas.fillLCatMarca();
        List<CatCategoria> catLCategoria = getListas.fillLCatCategoria();

        //Obteniendo las id de los combo box
        int idMarca = -1, idCategoria = -1, aux = 0;
        int indxM = cboMar.getSelectedIndex(), indxC = cboCat.getSelectedIndex();
        //Marcas
        if (indxM > 0) {
            idMarca = catLMarca.get(indxM - 1).getIdMarca();
        }

        //Categorias
        if (indxC > 0) {
            idCategoria = catLCategoria.get(indxC - 1).getIdCategoria();
        }
        //JOptionPane.showMessageDialog(null, "idM: " + idMarca + ". IdC: " + idCategoria);
        ///Fin
        List<CatProducto> lista;
        lista = getListas.fillLCatProductoFiltro(idMarca, idCategoria);
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Id producto");
        modelo.addColumn("Producto");
        modelo.addColumn("Descripción");
        modelo.addColumn("Descripción Almacén");
        modelo.addColumn("Precio $");
        modelo.addColumn("Color");
        modelo.addColumn("Categoría");
        modelo.addColumn("Marca");

        String registro[] = new String[8];
        for (int i = 0; i < lista.size(); i++) {
            CatProducto in = lista.get(i);

            registro[0] = String.valueOf(in.getIdCProducto());
            registro[1] = String.valueOf(in.getProducto());
            registro[2] = String.valueOf(in.getDescripcion());
            registro[3] = String.valueOf(in.getDescripcionAlmacenar());
            registro[4] = String.valueOf("$" + Math.round(in.getPrecio() * 100) / 100);
            registro[5] = String.valueOf(in.getColor());
            registro[6] = String.valueOf(in.getCatCategoria().getCategoria());
            registro[7] = String.valueOf(in.getCatMarca().getMarca());
            modelo.addRow(registro);
        }
        jtProductos.setModel(modelo);
    }

    private void enableAllFields() {
        txtColor.setEditable(true);
        txtDescripcion.setEditable(true);
        txtDescripcionA.setEditable(true);
        txtNombre.setEditable(true);
        txtPrecio.setEditable(true);
    }

    private void disableAllFields() {
        txtColor.setEditable(false);
        txtDescripcion.setEditable(false);
        txtDescripcionA.setEditable(false);
        txtNombre.setEditable(false);
        txtPrecio.setEditable(false);
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
        fillCategoria();
        fillMarca();
    }

    private void fillCategoria() throws ClassNotFoundException, SQLException, SQLException, DAOInitializationException {
        List<CatCategoria> lista;
        GetListas getListas = new GetListas();
        lista = getListas.fillLCatCategoria();
        cboCat.removeAllItems();
        cboCat.addItem(" ");
        for (int i = 0; i < lista.size(); i++) {
            cboCat.addItem(lista.get(i).getCategoria());
        }
    }

    private void fillMarca() throws ClassNotFoundException, SQLException, SQLException, DAOInitializationException {
        List<CatMarca> lista;
        GetListas getListas = new GetListas();
        lista = getListas.fillLCatMarca();
        cboMar.removeAllItems();
        cboMar.addItem(" ");
        for (int i = 0; i < lista.size(); i++) {
            cboMar.addItem(lista.get(i).getMarca());
        }
    }
}
