package ui.vendedor;

import business.GetListas;
import clases.CatCategoria;
import clases.CatMarca;
import clases.Inventario;
import clases.Personal;
import clases.util.Articulo;
import clases.util.Carrito;
import dao.DAOInitializationException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PAgregarAlCarrito extends javax.swing.JFrame {

    private Personal personal;
    private Carrito carrito;

    public PAgregarAlCarrito() {
        this.carrito = null;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCarrito = new javax.swing.JLabel();
        lblInstrucciones = new javax.swing.JLabel();
        lblProductos2 = new javax.swing.JLabel();
        lblSeleccion = new javax.swing.JLabel();
        lblProductos7 = new javax.swing.JLabel();
        lblProductos8 = new javax.swing.JLabel();
        lblProductos9 = new javax.swing.JLabel();
        lblProductos10 = new javax.swing.JLabel();
        lblProductos11 = new javax.swing.JLabel();
        btnQuitar = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtDisponibles = new javax.swing.JTextField();
        txtIdRegistro1 = new javax.swing.JTextField();
        txtCantAnadir = new javax.swing.JTextField();
        cboElimina = new javax.swing.JComboBox<>();
        lblInstrucciones1 = new javax.swing.JLabel();
        lblTRS = new javax.swing.JLabel();
        jspDescription = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jspCarrito = new javax.swing.JScrollPane();
        jtCarrito = new javax.swing.JTable();
        jspProductos = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jpMenu = new javax.swing.JPanel();
        lblProductos = new javax.swing.JLabel();
        cboCat = new javax.swing.JComboBox<>();
        lblProductos1 = new javax.swing.JLabel();
        lblProductos3 = new javax.swing.JLabel();
        cboMar = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jLBackground = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 300));
        setMaximumSize(new java.awt.Dimension(1252, 683));
        setMinimumSize(new java.awt.Dimension(1252, 683));
        setSize(new java.awt.Dimension(1252, 683));
        getContentPane().setLayout(null);

        lblCarrito.setBackground(new java.awt.Color(0, 102, 204));
        lblCarrito.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCarrito.setForeground(new java.awt.Color(255, 255, 255));
        lblCarrito.setText("Carrito de Compras");
        getContentPane().add(lblCarrito);
        lblCarrito.setBounds(550, 30, 240, 40);

        lblInstrucciones.setBackground(new java.awt.Color(0, 102, 204));
        lblInstrucciones.setFont(new java.awt.Font("Pristina", 1, 30)); // NOI18N
        lblInstrucciones.setForeground(new java.awt.Color(255, 255, 255));
        lblInstrucciones.setText("The Rolling Sons");
        getContentPane().add(lblInstrucciones);
        lblInstrucciones.setBounds(70, 10, 210, 40);

        lblProductos2.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductos2.setForeground(new java.awt.Color(255, 255, 255));
        lblProductos2.setText("Añadir al carrito:");
        getContentPane().add(lblProductos2);
        lblProductos2.setBounds(860, 270, 110, 30);

        lblSeleccion.setBackground(new java.awt.Color(0, 102, 204));
        lblSeleccion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccion.setText(" Productos");
        getContentPane().add(lblSeleccion);
        lblSeleccion.setBounds(680, 310, 140, 40);

        lblProductos7.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos7.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblProductos7.setForeground(new java.awt.Color(255, 255, 255));
        lblProductos7.setText("Toca un producto para visualizar");
        getContentPane().add(lblProductos7);
        lblProductos7.setBounds(650, 350, 220, 17);

        lblProductos8.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProductos8.setForeground(new java.awt.Color(255, 255, 255));
        lblProductos8.setText("Id del Registro:");
        getContentPane().add(lblProductos8);
        lblProductos8.setBounds(20, 150, 110, 17);

        lblProductos9.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductos9.setForeground(new java.awt.Color(255, 255, 255));
        lblProductos9.setText("Disponibles:");
        getContentPane().add(lblProductos9);
        lblProductos9.setBounds(860, 130, 110, 30);

        lblProductos10.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductos10.setForeground(new java.awt.Color(255, 255, 255));
        lblProductos10.setText("Descripción:");
        getContentPane().add(lblProductos10);
        lblProductos10.setBounds(860, 170, 110, 19);

        lblProductos11.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductos11.setForeground(new java.awt.Color(255, 255, 255));
        lblProductos11.setText("Id del Registro:");
        getContentPane().add(lblProductos11);
        lblProductos11.setBounds(860, 90, 110, 30);

        btnQuitar.setBackground(new java.awt.Color(204, 0, 0));
        btnQuitar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnQuitar.setText("Quitar");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuitar);
        btnQuitar.setBounds(100, 190, 120, 40);

        btnAdd.setBackground(new java.awt.Color(0, 204, 0));
        btnAdd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdd.setText("Añadir");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(1090, 270, 120, 30);

        txtDisponibles.setBackground(new java.awt.Color(255, 204, 102));
        txtDisponibles.setText("N/A");
        getContentPane().add(txtDisponibles);
        txtDisponibles.setBounds(1000, 130, 210, 30);

        txtIdRegistro1.setBackground(new java.awt.Color(255, 204, 102));
        txtIdRegistro1.setText("N/A");
        txtIdRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdRegistro1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdRegistro1);
        txtIdRegistro1.setBounds(1000, 90, 210, 30);

        txtCantAnadir.setBackground(new java.awt.Color(255, 204, 102));
        txtCantAnadir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantAnadirKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantAnadir);
        txtCantAnadir.setBounds(1000, 270, 80, 30);

        cboElimina.setBackground(new java.awt.Color(255, 204, 153));
        cboElimina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboElimina);
        cboElimina.setBounds(160, 150, 150, 20);

        lblInstrucciones1.setBackground(new java.awt.Color(0, 102, 204));
        lblInstrucciones1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblInstrucciones1.setForeground(new java.awt.Color(255, 255, 255));
        lblInstrucciones1.setText("Añadir producto");
        getContentPane().add(lblInstrucciones1);
        lblInstrucciones1.setBounds(920, 30, 220, 40);

        lblTRS.setBackground(new java.awt.Color(0, 102, 204));
        lblTRS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTRS.setForeground(new java.awt.Color(255, 255, 255));
        lblTRS.setText("Elimina Producto");
        getContentPane().add(lblTRS);
        lblTRS.setBounds(70, 90, 210, 40);

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jspDescription.setViewportView(txtDescripcion);

        getContentPane().add(jspDescription);
        jspDescription.setBounds(1000, 170, 210, 80);

        jtCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jspCarrito.setViewportView(jtCarrito);

        getContentPane().add(jspCarrito);
        jspCarrito.setBounds(370, 80, 470, 220);

        jtProductos.setBackground(new java.awt.Color(153, 255, 204));
        jtProductos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductosMouseClicked(evt);
            }
        });
        jspProductos.setViewportView(jtProductos);

        getContentPane().add(jspProductos);
        jspProductos.setBounds(360, 370, 830, 230);

        jpMenu.setBackground(new java.awt.Color(51, 102, 255));

        lblProductos.setBackground(new java.awt.Color(0, 153, 153));
        lblProductos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblProductos.setForeground(new java.awt.Color(255, 255, 255));
        lblProductos.setText("Filtros de productos");

        cboCat.setBackground(new java.awt.Color(102, 153, 255));
        cboCat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cboCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCatActionPerformed(evt);
            }
        });

        lblProductos1.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProductos1.setForeground(new java.awt.Color(255, 255, 255));
        lblProductos1.setText("Categoría:");

        lblProductos3.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProductos3.setForeground(new java.awt.Color(255, 255, 255));
        lblProductos3.setText("Marca");

        cboMar.setBackground(new java.awt.Color(102, 153, 255));
        cboMar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cboMar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboMar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 204, 0));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar Carrito");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblProductos1))
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboMar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lblProductos3))
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProductos1)
                .addGap(18, 18, 18)
                .addComponent(cboCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblProductos3)
                .addGap(18, 18, 18)
                .addComponent(cboMar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        getContentPane().add(jpMenu);
        jpMenu.setBounds(20, 250, 300, 350);

        jLBackground.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/binarios/images/Degradado4.jpg"))); // NOI18N
        getContentPane().add(jLBackground);
        jLBackground.setBounds(0, 0, 1250, 650);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 20, 220, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        PRealizarVenta pRealizarVenta = new PRealizarVenta();
        pRealizarVenta.setCarrito(this.carrito);
        pRealizarVenta.setPersonal(this.personal);
        pRealizarVenta.preCarga();
        pRealizarVenta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private boolean cantValid() throws ClassNotFoundException, SQLException, DAOInitializationException {//Valida si la cantidad ingresada es valida en tipo y rango
        boolean val = true;
        //Restamos lo de inventario menos el carrito menos lo que se quiere ingresar
        if (txtCantAnadir.getText().isEmpty()) {
            val = false;
            JOptionPane.showMessageDialog(null, "No has seleccionado una cantidad", "Warning!", JOptionPane.WARNING_MESSAGE);
        } else if ("N/A".equals(txtIdRegistro1.getText())) {
            val = false;
            JOptionPane.showMessageDialog(null, "No has seleccionado un producto de la tabla Productos", "Warning!", JOptionPane.WARNING_MESSAGE);
        } else {//Validacion de cantidades
            int idTxt = Integer.parseInt(txtIdRegistro1.getText());
            int disponiblesTxt = Integer.parseInt(txtDisponibles.getText());
            if (this.carrito != null) {
                GetListas getListas = new GetListas();
                List<Inventario> lista;
                lista = getListas.fillLInventario();

                //Primero restamos lo del carrito a lo disponible
                if (txtIdRegistro1.getText() != "N/A" && txtDisponibles.getText() != "N/A") {
                    for (Articulo ar : carrito.getlArticulo()) {
                        if (idTxt == ar.getInventario().getIdInventario()) {
                            disponiblesTxt -= ar.getCantidad();
                        }
                    }
                }
            }
            //Ahora restamos también la cantidad que se desea insertar
            if (disponiblesTxt - Integer.parseInt(txtCantAnadir.getText()) < 0) {
                String fr = "¡No puedes añadir esa cantidad!";
                JOptionPane.showMessageDialog(null, fr, "Cantidad no existente", JOptionPane.WARNING_MESSAGE);
                val = false;
            }
        }
        return val;
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            if (cantValid()) {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Añadir " + txtCantAnadir.getText() + " unidades?", "Añade item", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (opcion == 0) {
                    //El carrito deja de ser nulo en caso de que lo fuera antes
                    if (carrito == null) {
                        this.carrito = new Carrito();
                    }
                    //Antes de añadir, comprobamos que no se haya insertado antes ese registro, en cuyo caso solo actualizaríamos las existencias
                    boolean existArticle = false;
                    int posArt = 0;
                    for (Articulo articulo : carrito.getlArticulo()) {
                        if (articulo.getInventario().getIdInventario() == (Integer.parseInt(txtIdRegistro1.getText()))) {//Si ya existe
                            existArticle = true;
                            break;
                        }
                        posArt++;
                    }

                    if (!existArticle) {
                        Articulo ar = new Articulo();
                        Inventario inventario = new Inventario();
                        ar.setCantidad(Integer.parseInt(txtCantAnadir.getText()));
                        inventario.setIdInventario(Integer.parseInt(txtIdRegistro1.getText()));
                        ar.setInventario(inventario);

                        //Fase de pasar el inventario, ya lo tenemos pues con ese llenamos la tabla
                        GetListas getListas = new GetListas();
                        List<Inventario> lista = null;
                        try {
                            lista = getListas.fillLInventario();
                        } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
                            Logger.getLogger(PAgregarAlCarrito.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        //Buscamos la ID correspondiente y se la pasamos a artículo
                        for (Inventario in : lista) {
                            if (in.getIdInventario() == ar.getInventario().getIdInventario()) {
                                ar.setInventario(in);
                                break;
                            }
                        }

                        //Ahora añadimos el catProducto que está dentro del inventario para accesibilidad más sencilla
                        ar.setCatProducto(ar.getInventario().getCatProducto());

                        //La parte de producto Venta será añadida cuando se concrete la venta, por el momento solo dejamos ese atributo faltante.
                        //Añadimos el artículo
                        this.carrito.pushArticulo(ar);
                        JOptionPane.showMessageDialog(null, "Añadidas " + ar.getCantidad() + " unidades");
                        fillEliminar();
                    } else {
                        //Si ya existe solo actualizamos las existencias sumándolas
                        int existentes = this.carrito.getlArticulo().get(posArt).getCantidad();
                        int ingresadas = Integer.parseInt(txtCantAnadir.getText());
                        this.carrito.getlArticulo().get(posArt).setCantidad(existentes + ingresadas);
                        JOptionPane.showMessageDialog(null, "Añadidas " + ingresadas + " unidades más");
                    }
                    //Actualizamos carrito
                    reloadCarrito();
                }
            } else {//Sino, no se ha seleccionado registro válido
                JOptionPane.showMessageDialog(null, "Error al insertar", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PAgregarAlCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PAgregarAlCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DAOInitializationException ex) {
            Logger.getLogger(PAgregarAlCarrito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void jtProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseClicked
        int sel = jtProductos.rowAtPoint(evt.getPoint());
        txtIdRegistro1.setText(String.valueOf(jtProductos.getValueAt(sel, 0)));
        txtDisponibles.setText(String.valueOf(jtProductos.getValueAt(sel, 8)));
        String d = "";
        d += "Descripición: " + String.valueOf(jtProductos.getValueAt(sel, 3));
        d += "\n\nNombre: " + String.valueOf(jtProductos.getValueAt(sel, 2));
        d += "\nSección: " + String.valueOf(jtProductos.getValueAt(sel, 1));
        d += "\nMarca: " + String.valueOf(jtProductos.getValueAt(sel, 7));
        d += "\nCategoría: " + String.valueOf(jtProductos.getValueAt(sel, 6));
        d += "\nColor: " + String.valueOf(jtProductos.getValueAt(sel, 5));
        d += "\nPrecio unitario: " + String.valueOf(jtProductos.getValueAt(sel, 4));

        txtDescripcion.setText(d);
    }//GEN-LAST:event_jtProductosMouseClicked

    private void txtCantAnadirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantAnadirKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE)
            evt.consume();
    }//GEN-LAST:event_txtCantAnadirKeyTyped

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        if (this.carrito != null) {
            int idTxt = Integer.parseInt(String.valueOf(cboElimina.getSelectedItem()));
            List<Articulo> lArticulo = new ArrayList<>();
            for (Articulo ar : carrito.getlArticulo()) {
                if (ar.getInventario().getIdInventario() == idTxt) {//Si llegamos al artículo a eliminar, no lo almacenamos
                    ;
                } else {
                    lArticulo.add(ar);
                }
            }
            carrito.setlArticulo(lArticulo);//Actualizando con la nueva
            JOptionPane.showMessageDialog(null, "Eliminado del carrito", "Aviso", JOptionPane.WARNING_MESSAGE);
            try {
                fillEliminar();
                reloadCarrito();
            } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
                Logger.getLogger(PAgregarAlCarrito.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No tienes ningún artículo para eliminar", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void txtIdRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdRegistro1ActionPerformed
        
    }//GEN-LAST:event_txtIdRegistro1ActionPerformed

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

    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            private Personal personal;
            public void run() {
                new PRealizarVenta(this.personal).setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JComboBox<String> cboCat;
    private javax.swing.JComboBox<String> cboElimina;
    private javax.swing.JComboBox<String> cboMar;
    private javax.swing.JLabel jLBackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JScrollPane jspCarrito;
    private javax.swing.JScrollPane jspDescription;
    private javax.swing.JScrollPane jspProductos;
    private javax.swing.JTable jtCarrito;
    private javax.swing.JTable jtProductos;
    private javax.swing.JLabel lblCarrito;
    private javax.swing.JLabel lblInstrucciones;
    private javax.swing.JLabel lblInstrucciones1;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblProductos1;
    private javax.swing.JLabel lblProductos10;
    private javax.swing.JLabel lblProductos11;
    private javax.swing.JLabel lblProductos2;
    private javax.swing.JLabel lblProductos3;
    private javax.swing.JLabel lblProductos7;
    private javax.swing.JLabel lblProductos8;
    private javax.swing.JLabel lblProductos9;
    private javax.swing.JLabel lblSeleccion;
    private javax.swing.JLabel lblTRS;
    private javax.swing.JTextField txtCantAnadir;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDisponibles;
    private javax.swing.JTextField txtIdRegistro1;
    // End of variables declaration//GEN-END:variables

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public void preCarga() throws ClassNotFoundException, SQLException, DAOInitializationException {//Datos previos a mostrar el JFRAME pero posteriores al constructor
        //Llenamos la tabla de produtos basándonos en inventario
        fillTablaProductos();
        //Inicializamos
        txtIdRegistro1.setEditable(false);
        txtDescripcion.setEditable(false);
        txtDisponibles.setEditable(false);
        if (this.carrito != null) {//Si el carrito no es nulo, llenamos la tabla de
            reloadCarrito();
        }
        //Llenamos los filtros desde la BD
        fillCategoria();
        fillMarca();
        fillEliminar();
    }

    public void reloadCarrito() {//Recarga el carrito cada que se haga un cambio, inventarios se quedan iguales
        //Recargamos con la información actualizada del objeto carrito
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Id del registro");
        modelo.addColumn("Id del producto");
        modelo.addColumn("Producto");
        modelo.addColumn("Precio $");
        modelo.addColumn("Cantidad");

        String registro[] = new String[5];
        for (int i = 0; i < this.carrito.getlArticulo().size(); i++) {
            Articulo ar = this.carrito.getlArticulo().get(i);

            registro[0] = String.valueOf(ar.getInventario().getIdInventario());
            registro[1] = String.valueOf(ar.getCatProducto().getIdCProducto());
            registro[2] = String.valueOf(ar.getCatProducto().getProducto());//Ruta corta a CatProducto
            registro[3] = String.valueOf("$" + Math.round(ar.getInventario().getCatProducto().getPrecio() * 100) / 100);//Ruta larga a CatProducto
            registro[4] = String.valueOf(ar.getCantidad());
            modelo.addRow(registro);
        }
        jtCarrito.setModel(modelo);
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

    private void fillEliminar() throws ClassNotFoundException, SQLException, SQLException, DAOInitializationException {
        cboElimina.removeAllItems();
        if (this.carrito != null) {
            for (int i = 0; i < this.carrito.getlArticulo().size(); i++) {
                cboElimina.addItem(String.valueOf(this.carrito.getlArticulo().get(i).getInventario().getIdInventario()));
            }
        } else {
            cboElimina.addItem(" ");
        }
    }

    private void fillTablaProductos() throws ClassNotFoundException, SQLException, DAOInitializationException {
        GetListas getListas = new GetListas();
        List<Inventario> lista;
        lista = getListas.fillLInventario();
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
        jtProductos.setModel(modelo);
    }

    private void aplicaFiltros() throws ClassNotFoundException, SQLException, DAOInitializationException {
        //Cada que se invoque, actualiza la tabla de productos
        
            GetListas getListas = new GetListas();
            List<CatMarca> catLMarca = getListas.fillLCatMarca();
            List<CatCategoria> catLCategoria = getListas.fillLCatCategoria();

            //Obteniendo las id de los combo box
            int idMarca = -1, idCategoria = -1, aux=0;
            int indxM = cboMar.getSelectedIndex(),indxC = cboCat.getSelectedIndex();
            //Marcas
            if(indxM>0)
                idMarca = catLMarca.get(indxM-1).getIdMarca();
            
            //Categorias
            if(indxC>0)
                idCategoria = catLCategoria.get(indxC-1).getIdCategoria();
            //JOptionPane.showMessageDialog(null, "idM: " + idMarca + ". IdC: " + idCategoria);
            ///Fin
            List<Inventario> lista;
            lista = getListas.fillLInventarioFiltro(idMarca, idCategoria);
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
            jtProductos.setModel(modelo);
        
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
}
