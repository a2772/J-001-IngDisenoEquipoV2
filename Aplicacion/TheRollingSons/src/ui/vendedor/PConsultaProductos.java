package ui.vendedor;

import bd.r.ConsultaCats;
import business.GetById;
import business.GetListas;
import clases.CatCategoria;
import clases.CatMarca;
import clases.CatSeccion;
import clases.Inventario;
import clases.Personal;
import clases.ProductoVenta;
import clases.Venta;
import clases.util.Carrito;
import dao.DAOInitializationException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ui.PLogin;
import ui.encargado.PCRUDHorarios;
import ui.encargado.PCRUDInventarios;
import ui.encargado.PCRUDMisProductos;
import ui.encargado.PCRUDUsuarios;

public class PConsultaProductos extends javax.swing.JFrame {

    private Personal personal;
    private Carrito carrito;
    private int idVenta;//Auxiliar

    public PConsultaProductos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jspProductos = new javax.swing.JScrollPane();
        jtArticulos = new javax.swing.JTable();
        lblSeleccion = new javax.swing.JLabel();
        lblSeleccion1 = new javax.swing.JLabel();
        jspProductos2 = new javax.swing.JScrollPane();
        jtMisVentas1 = new javax.swing.JTable();
        lblSeleccion2 = new javax.swing.JLabel();
        jspProductos1 = new javax.swing.JScrollPane();
        jtProductos1 = new javax.swing.JTable();
        jpMenu1 = new javax.swing.JPanel();
        lblProductos = new javax.swing.JLabel();
        cboCat = new javax.swing.JComboBox<>();
        lblProductos1 = new javax.swing.JLabel();
        lblProductos3 = new javax.swing.JLabel();
        cboMar = new javax.swing.JComboBox<>();
        lblProductos2 = new javax.swing.JLabel();
        cboSeccion = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 300));
        setMinimumSize(new java.awt.Dimension(1252, 652));
        getContentPane().setLayout(null);

        jtArticulos.setBackground(new java.awt.Color(153, 255, 204));
        jtArticulos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jspProductos.setViewportView(jtArticulos);

        getContentPane().add(jspProductos);
        jspProductos.setBounds(590, 550, 600, 70);

        lblSeleccion.setBackground(new java.awt.Color(0, 102, 204));
        lblSeleccion.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccion.setText(" Artículos de la venta");
        lblSeleccion.setOpaque(true);
        getContentPane().add(lblSeleccion);
        lblSeleccion.setBounds(320, 560, 240, 40);

        lblSeleccion1.setBackground(new java.awt.Color(0, 102, 204));
        lblSeleccion1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblSeleccion1.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccion1.setText(" Productos");
        lblSeleccion1.setOpaque(true);
        getContentPane().add(lblSeleccion1);
        lblSeleccion1.setBounds(700, 190, 120, 40);

        jtMisVentas1.setBackground(new java.awt.Color(153, 255, 204));
        jtMisVentas1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtMisVentas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtMisVentas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMisVentas1MouseClicked(evt);
            }
        });
        jspProductos2.setViewportView(jtMisVentas1);

        getContentPane().add(jspProductos2);
        jspProductos2.setBounds(460, 430, 730, 80);

        lblSeleccion2.setBackground(new java.awt.Color(0, 102, 204));
        lblSeleccion2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblSeleccion2.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccion2.setText("Mis Ventas");
        lblSeleccion2.setOpaque(true);
        getContentPane().add(lblSeleccion2);
        lblSeleccion2.setBounds(320, 450, 120, 40);

        jtProductos1.setBackground(new java.awt.Color(153, 255, 204));
        jtProductos1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtProductos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtProductos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductos1MouseClicked(evt);
            }
        });
        jspProductos1.setViewportView(jtProductos1);

        getContentPane().add(jspProductos1);
        jspProductos1.setBounds(320, 240, 870, 160);

        jpMenu1.setBackground(new java.awt.Color(102, 255, 204));

        lblProductos.setBackground(new java.awt.Color(102, 204, 0));
        lblProductos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblProductos.setText("   Filtros de productos");
        lblProductos.setOpaque(true);

        cboCat.setBackground(new java.awt.Color(102, 153, 255));
        cboCat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cboCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCatActionPerformed(evt);
            }
        });

        lblProductos1.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductos1.setText("Categoría");
        lblProductos1.setOpaque(true);

        lblProductos3.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductos3.setText("  Marca  ");
        lblProductos3.setOpaque(true);

        cboMar.setBackground(new java.awt.Color(102, 153, 255));
        cboMar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cboMar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboMar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMarActionPerformed(evt);
            }
        });

        lblProductos2.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductos2.setText("  Sección");
        lblProductos2.setOpaque(true);

        cboSeccion.setBackground(new java.awt.Color(102, 153, 255));
        cboSeccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cboSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSeccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMenu1Layout = new javax.swing.GroupLayout(jpMenu1);
        jpMenu1.setLayout(jpMenu1Layout);
        jpMenu1Layout.setHorizontalGroup(
            jpMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboCat, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblProductos2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(cboMar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jpMenu1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jpMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpMenu1Layout.createSequentialGroup()
                        .addComponent(lblProductos1)
                        .addGap(120, 120, 120)
                        .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(lblProductos3)
                .addGap(98, 98, 98))
        );
        jpMenu1Layout.setVerticalGroup(
            jpMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenu1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductos1)
                    .addComponent(lblProductos3))
                .addGroup(jpMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMenu1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpMenu1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblProductos2)))
                .addGap(18, 18, 18)
                .addComponent(cboSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpMenu1);
        jpMenu1.setBounds(370, 30, 780, 150);

        btnSalir.setBackground(new java.awt.Color(153, 0, 51));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(30, 590, 90, 50);

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
        rbtnConsProd.setSelected(true);
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
                .addGap(23, 23, 23)
                .addComponent(rbtnCRUDInv)
                .addGap(18, 18, 18)
                .addComponent(rbtnCRUDPM)
                .addGap(18, 18, 18)
                .addComponent(rbtnCRUDHor)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jpMenu);
        jpMenu.setBounds(20, 40, 270, 540);

        jLBackground.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/binarios/images/Degradado1.jpg"))); // NOI18N
        getContentPane().add(jLBackground);
        jLBackground.setBounds(0, 0, 1250, 650);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 20, 220, 40);

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 590, 65, 22);

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
        PRealizarVenta pRealizarVenta = new PRealizarVenta();
        pRealizarVenta.setCarrito(this.carrito);
        pRealizarVenta.setPersonal(this.personal);
        pRealizarVenta.preCarga();
        pRealizarVenta.setVisible(true);
        dispose();
    }//GEN-LAST:event_rbtnVentaActionPerformed

    private void rbtnConsProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnConsProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnConsProdActionPerformed

    private void cboCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCatActionPerformed
        try {
            aplicaFiltros();
        } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
            Logger.getLogger(PAgregarAlCarrito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cboCatActionPerformed

    private void cboMarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMarActionPerformed
        try {
            aplicaFiltros();
        } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
            Logger.getLogger(PAgregarAlCarrito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cboMarActionPerformed

    private void cboSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSeccionActionPerformed
        try {
            aplicaFiltros();
        } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
            Logger.getLogger(PAgregarAlCarrito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cboSeccionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Realmente desea salir de su sesión?", "Cerrando Sesión...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == 0) {
            JOptionPane.showMessageDialog(null, "        Cerrando sesión        \n     Ten un excelente día\n          " + personal.getNombre());
            PLogin pLogin = new PLogin();
            pLogin.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void rbtnCRUDUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCRUDUsrActionPerformed
        PCRUDUsuarios p = new PCRUDUsuarios();
        //Iniciamos el primer formulario, si es Encargado
        p.setPersonal(personal);
        p.preCarga();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_rbtnCRUDUsrActionPerformed

    private void rbtnCRUDPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCRUDPMActionPerformed
        PCRUDMisProductos p = new PCRUDMisProductos();
        //Iniciamos el primer formulario, si es Encargado
        p.setPersonal(personal);
        try {
            p.preCarga();
        } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
            Logger.getLogger(PConsultaProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_rbtnCRUDPMActionPerformed

    private void jtProductos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductos1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtProductos1MouseClicked

    private void jtMisVentas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMisVentas1MouseClicked
        int sel = jtMisVentas1.rowAtPoint(evt.getPoint());
        this.idVenta = Integer.parseInt(String.valueOf(jtMisVentas1.getValueAt(sel, 0)));
        //Obtenemos la Venta por ID
        Venta ve= new Venta();
        GetById getById = new GetById();
        JOptionPane.showMessageDialog(null, "Id Venta: " + this.idVenta);
        try {
            ve = getById.getVentaById(this.idVenta);
        } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
            Logger.getLogger(PConsultaProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        ve.setPersonal(this.personal);
        ve.setIdVenta(idVenta);
        //Procedemos a llenar la tabla
        
        GetListas getListas = new GetListas();
        
        List<ProductoVenta> lista = new ArrayList<>();
        try {
            lista = getListas.fillLProductoVenta(ve);
        } catch (SQLException | DAOInitializationException | ClassNotFoundException ex) {
            Logger.getLogger(PConsultaProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Parte de Ventas
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Id registro");
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio total");
        modelo.addColumn("Id de la venta");

        String registro[] = new String[5];
        for (int i = 0; i < lista.size(); i++) {
            ProductoVenta pve = lista.get(i);

            registro[0] = String.valueOf(pve.getIdProductoVenta());
            registro[1] = String.valueOf(pve.getCatProducto().getProducto());
            registro[2] = String.valueOf(pve.getCantidad());
            registro[3] = String.valueOf("$" + Math.round(pve.getPrecio() * 100) / 100);//Ruta larga a CatProducto
            registro[4] = String.valueOf(pve.getVenta().getIdVenta());
            modelo.addRow(registro);
        }
        jtArticulos.setModel(modelo);        
    }//GEN-LAST:event_jtMisVentas1MouseClicked

    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            private Personal personal;
            public void run() {
                new PRealizarVenta(this.personal).setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboCat;
    private javax.swing.JComboBox<String> cboMar;
    private javax.swing.JComboBox<String> cboSeccion;
    private javax.swing.JLabel jLBackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpMenu1;
    private javax.swing.JScrollPane jspProductos;
    private javax.swing.JScrollPane jspProductos1;
    private javax.swing.JScrollPane jspProductos2;
    private javax.swing.JTable jtArticulos;
    private javax.swing.JTable jtMisVentas1;
    private javax.swing.JTable jtProductos1;
    private javax.swing.JLabel lblMss1;
    private javax.swing.JLabel lblMss2;
    private javax.swing.JLabel lblMss3;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblProductos1;
    private javax.swing.JLabel lblProductos2;
    private javax.swing.JLabel lblProductos3;
    private javax.swing.JLabel lblSeleccion;
    private javax.swing.JLabel lblSeleccion1;
    private javax.swing.JLabel lblSeleccion2;
    private javax.swing.JRadioButton rbtnCRUDHor;
    private javax.swing.JRadioButton rbtnCRUDInv;
    private javax.swing.JRadioButton rbtnCRUDPM;
    private javax.swing.JRadioButton rbtnCRUDUsr;
    private javax.swing.JRadioButton rbtnConsProd;
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
        //Llenado
        fillMarca();
        fillCategoria();
        fillSeccion();
        
        //Obtención del registro de las ventas del vendedor
        fillVenta();
    }
    private void fillVenta() throws ClassNotFoundException, SQLException, DAOInitializationException{
        //Cada que se invoque, actualiza la tabla de productos
        ConsultaCats consultaCats = new ConsultaCats();
        List<Venta> lista;
        lista = consultaCats.getLVenta(this.personal);
        //Parte de Ventas
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Id venta");
        modelo.addColumn("IVA");
        modelo.addColumn("Total");
        modelo.addColumn("Fecha y hora");

        String registro[] = new String[4];
        for (int i = 0; i < lista.size(); i++) {
            Venta ve = lista.get(i);

            registro[0] = String.valueOf(ve.getIdVenta());
            registro[1] = String.valueOf("$" + ve.getIva());
            registro[2] = String.valueOf("$" + ve.getTotal());
            registro[3] = String.valueOf(ve.getFecha().getDayOfMonth() + "/" + ve.getFecha().getMonthValue() + "/" + ve.getFecha().getYear() + "; " + ve.getFecha().getHour() + ":" + ve.getFecha().getMinute());
            modelo.addRow(registro);
        }
        jtMisVentas1.setModel(modelo);
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

    private void fillSeccion() throws ClassNotFoundException, SQLException, SQLException, DAOInitializationException {
        List<CatSeccion> lista;
        GetListas getListas = new GetListas();
        lista = getListas.fillLCatSeccion();
        cboSeccion.removeAllItems();
        cboSeccion.addItem(" ");
        for (int i = 0; i < lista.size(); i++) {
            cboSeccion.addItem(lista.get(i).getSeccion());
        }
    }

    private void aplicaFiltros() throws ClassNotFoundException, SQLException, DAOInitializationException {
        //Cada que se invoque, actualiza la tabla de productos
        
        GetListas getListas = new GetListas();
        List<CatMarca> catLMarca = getListas.fillLCatMarca();
        List<CatCategoria> catLCategoria = getListas.fillLCatCategoria();
        List<CatSeccion> catLSeccion = getListas.fillLCatSeccion();

        //Obteniendo las id de los combo box
        int idMarca = -1, idCategoria = -1, idSeccion = -1, aux = 0;
        int indxM = cboMar.getSelectedIndex(), indxC = cboCat.getSelectedIndex(), indxS = cboSeccion.getSelectedIndex();
        //Marcas
        if (indxM > 0) {
            idMarca = catLMarca.get(indxM-1).getIdMarca();
        }

        //Categorias
        if (indxC > 0) {
            idCategoria = catLCategoria.get(indxC-1).getIdCategoria();
        }
        
        //Seccion
        if (indxS > 0) {
            idSeccion = catLSeccion.get(indxS-1).getIdSeccion();
        }
        
        //JOptionPane.showMessageDialog(null, "idM: " + idMarca + ". IdC: " + idCategoria + ". IdC: " + idSeccion);
        ///Fin
        List<Inventario> lista;
        lista = getListas.fillLInventarioFiltro2(idMarca, idCategoria, idSeccion);
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Id del registro");
        modelo.addColumn("Sección");
        modelo.addColumn("Producto");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio $");
        modelo.addColumn("Color");
        modelo.addColumn("Categoría");
        modelo.addColumn("Marca");
        modelo.addColumn("Existencias");

        String registro[] = new String[9];
        for (int i = 0; i < lista.size(); i++) {
            Inventario in = lista.get(i);

            registro[0] = String.valueOf(in.getIdInventario());
            registro[1] = String.valueOf(in.getCatSeccion().getSeccion());
            registro[2] = String.valueOf(in.getCatProducto().getProducto());
            registro[3] = String.valueOf(in.getCatProducto().getDescripcion());
            registro[4] = String.valueOf("$" + Math.round(in.getCatProducto().getPrecio() * 100) / 100);
            registro[5] = String.valueOf(in.getCatProducto().getColor());
            registro[6] = String.valueOf(in.getCatProducto().getCatCategoria().getCategoria());
            registro[7] = String.valueOf(in.getCatProducto().getCatMarca().getMarca());
            registro[8] = String.valueOf(in.getCantidad());
            modelo.addRow(registro);
        }
        jtProductos1.setModel(modelo);
        
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
}
