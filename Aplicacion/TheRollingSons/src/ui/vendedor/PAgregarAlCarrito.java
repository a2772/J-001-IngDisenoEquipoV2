package ui.vendedor;

import business.GetListas;
import clases.CatCategoria;
import clases.CatMarca;
import clases.Inventario;
import clases.Personal;
import clases.util.Articulo;
import clases.util.Carrito;
import dao.DAOInitializationException;
import java.sql.SQLException;
import java.util.List;
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
        btnAdd = new javax.swing.JButton();
        txtDisponibles = new javax.swing.JTextField();
        txtIdRegistro1 = new javax.swing.JTextField();
        txtCantAnadir = new javax.swing.JTextField();
        jspDescription = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jspCarrito = new javax.swing.JScrollPane();
        jtCarrito = new javax.swing.JTable();
        jspProductos = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        jpMenu = new javax.swing.JPanel();
        lblProductos = new javax.swing.JLabel();
        cboCat = new javax.swing.JComboBox<>();
        lblProductos1 = new javax.swing.JLabel();
        lblProductos3 = new javax.swing.JLabel();
        cboMar = new javax.swing.JComboBox<>();
        lblProductos4 = new javax.swing.JLabel();
        txtPrecMin = new javax.swing.JTextField();
        txtPrecMax = new javax.swing.JTextField();
        lblProductos5 = new javax.swing.JLabel();
        lblProductos6 = new javax.swing.JLabel();
        jLBackground = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 300));
        setMaximumSize(new java.awt.Dimension(1252, 683));
        setMinimumSize(new java.awt.Dimension(1252, 683));
        setSize(new java.awt.Dimension(1252, 683));
        getContentPane().setLayout(null);

        lblCarrito.setBackground(new java.awt.Color(0, 102, 204));
        lblCarrito.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblCarrito.setForeground(new java.awt.Color(255, 255, 255));
        lblCarrito.setText(" Mi Carrito");
        lblCarrito.setOpaque(true);
        getContentPane().add(lblCarrito);
        lblCarrito.setBounds(550, 30, 120, 40);

        lblInstrucciones.setBackground(new java.awt.Color(0, 102, 204));
        lblInstrucciones.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblInstrucciones.setForeground(new java.awt.Color(255, 255, 255));
        lblInstrucciones.setText(" Seleccionado");
        lblInstrucciones.setOpaque(true);
        getContentPane().add(lblInstrucciones);
        lblInstrucciones.setBounds(960, 20, 160, 40);

        lblProductos2.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductos2.setText("Añadir al carrito:");
        lblProductos2.setOpaque(true);
        getContentPane().add(lblProductos2);
        lblProductos2.setBounds(860, 270, 110, 19);

        lblSeleccion.setBackground(new java.awt.Color(0, 102, 204));
        lblSeleccion.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccion.setText(" Productos");
        lblSeleccion.setOpaque(true);
        getContentPane().add(lblSeleccion);
        lblSeleccion.setBounds(520, 320, 120, 40);

        lblProductos7.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductos7.setText("Toca un producto para visualizar");
        lblProductos7.setOpaque(true);
        getContentPane().add(lblProductos7);
        lblProductos7.setBounds(680, 330, 230, 19);

        lblProductos8.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductos8.setText("Id del Registro:");
        lblProductos8.setOpaque(true);
        getContentPane().add(lblProductos8);
        lblProductos8.setBounds(860, 90, 110, 19);

        lblProductos9.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductos9.setText("Diponibles:");
        lblProductos9.setOpaque(true);
        getContentPane().add(lblProductos9);
        lblProductos9.setBounds(860, 130, 110, 19);

        lblProductos10.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductos10.setText("Descripción:");
        lblProductos10.setOpaque(true);
        getContentPane().add(lblProductos10);
        lblProductos10.setBounds(860, 170, 110, 19);

        btnAdd.setBackground(new java.awt.Color(0, 204, 0));
        btnAdd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAdd.setText("Añadir");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(1040, 320, 120, 40);

        txtDisponibles.setBackground(new java.awt.Color(255, 204, 102));
        txtDisponibles.setText("jTextField2");
        getContentPane().add(txtDisponibles);
        txtDisponibles.setBounds(1000, 120, 120, 30);

        txtIdRegistro1.setBackground(new java.awt.Color(255, 204, 102));
        txtIdRegistro1.setText("jTextField2");
        getContentPane().add(txtIdRegistro1);
        txtIdRegistro1.setBounds(1000, 80, 120, 30);

        txtCantAnadir.setBackground(new java.awt.Color(255, 204, 102));
        txtCantAnadir.setText("jTextField2");
        getContentPane().add(txtCantAnadir);
        txtCantAnadir.setBounds(1000, 263, 120, 30);

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jspDescription.setViewportView(txtDescripcion);

        getContentPane().add(jspDescription);
        jspDescription.setBounds(990, 170, 210, 80);

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
        jspProductos.setBounds(360, 370, 760, 230);

        btnGuardar.setBackground(new java.awt.Color(0, 204, 0));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar Carrito");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(90, 520, 150, 80);

        jpMenu.setBackground(new java.awt.Color(51, 102, 255));

        lblProductos.setBackground(new java.awt.Color(0, 153, 153));
        lblProductos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblProductos.setText("  Filtros de productos");
        lblProductos.setOpaque(true);

        cboCat.setBackground(new java.awt.Color(102, 153, 255));
        cboCat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cboCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblProductos1.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductos1.setText("Categoría:");
        lblProductos1.setOpaque(true);

        lblProductos3.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductos3.setText("Marca");
        lblProductos3.setOpaque(true);

        cboMar.setBackground(new java.awt.Color(102, 153, 255));
        cboMar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cboMar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblProductos4.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductos4.setText("Precio");
        lblProductos4.setOpaque(true);

        txtPrecMin.setBackground(new java.awt.Color(102, 153, 255));
        txtPrecMin.setText("jTextField1");

        txtPrecMax.setBackground(new java.awt.Color(102, 153, 255));
        txtPrecMax.setText("jTextField2");

        lblProductos5.setBackground(new java.awt.Color(51, 255, 153));
        lblProductos5.setText("Mínimo");
        lblProductos5.setOpaque(true);

        lblProductos6.setBackground(new java.awt.Color(51, 255, 153));
        lblProductos6.setText("Máximo");
        lblProductos6.setOpaque(true);

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblProductos5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblProductos6)
                .addGap(65, 65, 65))
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpMenuLayout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(lblProductos1))
                            .addGroup(jpMenuLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(cboCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboMar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jpMenuLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(txtPrecMin, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecMax, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)))
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(lblProductos4))
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lblProductos3)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblProductos1)
                .addGap(18, 18, 18)
                .addComponent(cboCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblProductos3)
                .addGap(18, 18, 18)
                .addComponent(cboMar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblProductos4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductos5)
                    .addComponent(lblProductos6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecMax, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecMin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        getContentPane().add(jpMenu);
        jpMenu.setBounds(30, 60, 300, 430);

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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void jtProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseClicked
        int sel=jtProductos.rowAtPoint(evt.getPoint());
        txtIdRegistro1.setText(String.valueOf(jtProductos.getValueAt(sel, 0)));
        txtDisponibles.setText(String.valueOf(jtProductos.getValueAt(sel, 8)));
        String d="";
        d+="Descripición: " + String.valueOf(jtProductos.getValueAt(sel, 3));
        d+="\n\nNombre: " + String.valueOf(jtProductos.getValueAt(sel, 2));
        d+="\nSección: " + String.valueOf(jtProductos.getValueAt(sel, 1));
        d+="\nMarca: " + String.valueOf(jtProductos.getValueAt(sel, 7));
        d+="\nCategoría: " + String.valueOf(jtProductos.getValueAt(sel, 6));
        d+="\nColor: " + String.valueOf(jtProductos.getValueAt(sel, 5));
        d+="\nPrecio unitario: " + String.valueOf(jtProductos.getValueAt(sel, 4));
        
        
        txtDescripcion.setText(d);
    }//GEN-LAST:event_jtProductosMouseClicked

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
    private javax.swing.JComboBox<String> cboCat;
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
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblProductos1;
    private javax.swing.JLabel lblProductos10;
    private javax.swing.JLabel lblProductos2;
    private javax.swing.JLabel lblProductos3;
    private javax.swing.JLabel lblProductos4;
    private javax.swing.JLabel lblProductos5;
    private javax.swing.JLabel lblProductos6;
    private javax.swing.JLabel lblProductos7;
    private javax.swing.JLabel lblProductos8;
    private javax.swing.JLabel lblProductos9;
    private javax.swing.JLabel lblSeleccion;
    private javax.swing.JTextField txtCantAnadir;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDisponibles;
    private javax.swing.JTextField txtIdRegistro1;
    private javax.swing.JTextField txtPrecMax;
    private javax.swing.JTextField txtPrecMin;
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
        if(this.carrito!=null){//Si el carrito no es nulo, llenamos la tabla de
            reloadCarrito();
        }
        //Llenamos los filtros desde la BD
        fillCategoria();
        fillMarca();
    }
    public void reloadCarrito(){//Recarga el carrito cada que se haga un cambio, inventarios se quedan iguales
        
    }
    private void fillCategoria() throws ClassNotFoundException, SQLException, SQLException, DAOInitializationException {
        List<CatCategoria> lista;
        GetListas getListas = new GetListas();
        lista = getListas.fillLCatCategoria();
        cboCat.removeAllItems();
        cboCat.addItem("No aplicar");
        for (int i = 0; i < lista.size(); i++) {
            cboCat.addItem(lista.get(i).getCategoria());
        }
    }
    private void fillMarca() throws ClassNotFoundException, SQLException, SQLException, DAOInitializationException {
        List<CatMarca> lista;
        GetListas getListas = new GetListas();
        lista = getListas.fillLCatMarca();
        cboMar.removeAllItems();
        cboMar.addItem("No aplicar");
        for (int i = 0; i < lista.size(); i++) {
            cboMar.addItem(lista.get(i).getMarca());
        }
    }
    private  void fillTablaProductos() throws ClassNotFoundException, SQLException, DAOInitializationException{
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
        JOptionPane.showMessageDialog(null, lista.size());
        
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
