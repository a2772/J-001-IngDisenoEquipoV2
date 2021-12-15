package ui.vendedor;

import business.InsertList;
import clases.Personal;
import clases.ProductoVenta;
import clases.Venta;
import clases.util.Articulo;
import clases.util.Carrito;
import dao.DAOInitializationException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ui.PLogin;

public class PRealizarVenta extends javax.swing.JFrame {

    private Personal personal;
    private Carrito carrito;

    public PRealizarVenta() {
        this.carrito = null;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCompraCarrito = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnIrCarrito1 = new javax.swing.JButton();
        btnBorrar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jspCarrito = new javax.swing.JScrollPane();
        jtCarrito = new javax.swing.JTable();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 300));
        setMaximumSize(new java.awt.Dimension(1240, 683));
        setMinimumSize(new java.awt.Dimension(1252, 683));
        setResizable(false);
        setSize(new java.awt.Dimension(1252, 683));
        getContentPane().setLayout(null);

        btnCompraCarrito.setBackground(new java.awt.Color(51, 204, 0));
        btnCompraCarrito.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCompraCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnCompraCarrito.setText("Confirmar Compra");
        btnCompraCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraCarritoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompraCarrito);
        btnCompraCarrito.setBounds(1020, 560, 200, 70);

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

        btnIrCarrito1.setBackground(new java.awt.Color(0, 255, 204));
        btnIrCarrito1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnIrCarrito1.setText("Cambiar Carrito");
        btnIrCarrito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrCarrito1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIrCarrito1);
        btnIrCarrito1.setBounds(790, 560, 200, 70);

        btnBorrar1.setBackground(new java.awt.Color(255, 102, 102));
        btnBorrar1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnBorrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar1.setText("BORRAR");
        btnBorrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar1);
        btnBorrar1.setBounds(550, 560, 200, 70);

        jLabel2.setBackground(new java.awt.Color(255, 153, 51));
        jLabel2.setFont(new java.awt.Font("DialogInput", 3, 36)); // NOI18N
        jLabel2.setText("       Carrito Actual     ");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 40, 600, 60);

        jtCarrito.setBackground(new java.awt.Color(102, 255, 204));
        jtCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jspCarrito.setViewportView(jtCarrito);

        getContentPane().add(jspCarrito);
        jspCarrito.setBounds(340, 120, 700, 402);

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
        rbtnVenta.setSelected(true);
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
                .addGap(16, 16, 16)
                .addComponent(rbtnCRUDPM)
                .addGap(18, 18, 18)
                .addComponent(rbtnCRUDHor)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jpMenu);
        jpMenu.setBounds(20, 40, 270, 540);

        jLBackground.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/binarios/images/Degradado1.jpg"))); // NOI18N
        getContentPane().add(jLBackground);
        jLBackground.setBounds(0, 0, 1240, 650);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 20, 220, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnCRUDInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCRUDInvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnCRUDInvActionPerformed

    private void rbtnCRUDHorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCRUDHorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnCRUDHorActionPerformed

    private void rbtnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnVentaActionPerformed

    }//GEN-LAST:event_rbtnVentaActionPerformed

    private void rbtnConsProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnConsProdActionPerformed
        PConsultaProductos pConsultaProductos = new PConsultaProductos();
        //Iniciamos el primer formulario, si es Encargado
        pConsultaProductos.setPersonal(personal);
        pConsultaProductos.setCarrito(carrito);
        pConsultaProductos.preCarga();
        pConsultaProductos.setVisible(true);
        dispose();
    }//GEN-LAST:event_rbtnConsProdActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Realmente desea salir de su sesión?", "Cerrando Sesión...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == 0) {
            JOptionPane.showMessageDialog(null, "        Cerrando sesión        \n     Ten un excelente día\n          " + personal.getNombre());
            PLogin pLogin = new PLogin();
            pLogin.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCompraCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraCarritoActionPerformed
        if (this.carrito == null) {
            JOptionPane.showConfirmDialog(null, "No hay nada en el carrito", "Error 402", JOptionPane.DEFAULT_OPTION);
        } else {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas registrar la compra?", "Comprando el Carrito", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opcion == 0) {
                //Añadiendo datos de la venta a carrito Venta
                Venta venta = new Venta();
                ProductoVenta pv;
                venta.setIdVenta(0);//Como no la vamos a insertar la dejamos en 0, pero al insertarla la recuperamos para mostrar el número de tiquet
                //obtenemos el total
                float total=0;
                for (Articulo ar : this.carrito.getlArticulo()) {
                    total+=ar.getCatProducto().getPrecio()*ar.getInventario().getCantidad();
                }
                venta.setTotal(total);
                venta.setIva((float) ((total/1.16)*0.16));
                venta.setFecha(LocalDate.now());
                venta.setPersonal(this.personal);
                
                this.carrito.setVenta(venta); //Añadiendo los datos que le faltan al carrito: ProductoVenta
                for (Articulo ar : this.carrito.getlArticulo()) {
                    pv = new ProductoVenta();
                    pv.setIdProductoVenta(0);
                    pv.setPrecio(ar.getCatProducto().getPrecio()*ar.getCantidad());
                    pv.setCantidad(ar.getCantidad());
                    pv.setCatProducto(ar.getCatProducto());
                    pv.setVenta(venta);
                    
                    ar.setProductoVenta(pv);
                }

                //Agregar la venta mandando el carrito
                InsertList insertList = new InsertList();
                try {
                    insertList.registraVentaCarrito(this.carrito);
                    JOptionPane.showMessageDialog(null, "¡Compra realizada!");
                } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
                    Logger.getLogger(PRealizarVenta.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "¡Error al realizar la compra!");
                }

            }
        }
    }//GEN-LAST:event_btnCompraCarritoActionPerformed

    private void btnIrCarrito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrCarrito1ActionPerformed
        PAgregarAlCarrito pAgregarAlCarrito = new PAgregarAlCarrito();
        //Iniciamos el primer formulario, si es Encargado
        pAgregarAlCarrito.setPersonal(personal);
        pAgregarAlCarrito.setCarrito(carrito);
        try {
            pAgregarAlCarrito.preCarga();
        } catch (ClassNotFoundException | SQLException | DAOInitializationException ex) {
            Logger.getLogger(PRealizarVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        pAgregarAlCarrito.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIrCarrito1ActionPerformed

    private void btnBorrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar1ActionPerformed
        if (this.carrito == null) {
            JOptionPane.showConfirmDialog(null, "No hay nada en el carrito", "Error 401", JOptionPane.DEFAULT_OPTION);
        } else {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Realmente deseas eliminar la selección?", "Borrar Carrito", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opcion == 0) {
                JOptionPane.showMessageDialog(null, "     Selección borrada exitosamente    ");
                this.carrito = null;
                jtCarrito.setModel(new DefaultTableModel());
            }
        }
    }//GEN-LAST:event_btnBorrar1ActionPerformed

    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            private Personal personal;
            public void run() {
                new PRealizarVenta(this.personal).setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar1;
    private javax.swing.JButton btnCompraCarrito;
    private javax.swing.JButton btnIrCarrito1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLBackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JScrollPane jspCarrito;
    private javax.swing.JTable jtCarrito;
    private javax.swing.JLabel lblMss1;
    private javax.swing.JLabel lblMss2;
    private javax.swing.JLabel lblMss3;
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
        if (this.carrito != null) {
            JOptionPane.showMessageDialog(null, "EA");
            reloadCarrito();
        }
    }

    //Fill table
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

    /**
     * @return the carrito
     */
    public Carrito getCarrito() {
        return carrito;
    }

    /**
     * @param carrito the carrito to set
     */
    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
}
