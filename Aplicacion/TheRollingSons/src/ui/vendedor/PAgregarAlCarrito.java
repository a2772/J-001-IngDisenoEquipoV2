package ui.vendedor;

import clases.Personal;
import clases.util.Carrito;
import javax.swing.JOptionPane;

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
        setMinimumSize(new java.awt.Dimension(1252, 652));
        getContentPane().setLayout(null);

        lblCarrito.setBackground(new java.awt.Color(0, 102, 204));
        lblCarrito.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblCarrito.setForeground(new java.awt.Color(255, 255, 255));
        lblCarrito.setText(" Mi Carrito");
        lblCarrito.setOpaque(true);
        getContentPane().add(lblCarrito);
        lblCarrito.setBounds(620, 30, 120, 40);

        lblInstrucciones.setBackground(new java.awt.Color(0, 102, 204));
        lblInstrucciones.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblInstrucciones.setForeground(new java.awt.Color(255, 255, 255));
        lblInstrucciones.setText(" Productos");
        lblInstrucciones.setOpaque(true);
        getContentPane().add(lblInstrucciones);
        lblInstrucciones.setBounds(620, 320, 120, 40);

        lblProductos2.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductos2.setText("Toca un producto para añadirlo al carrito");
        lblProductos2.setOpaque(true);
        getContentPane().add(lblProductos2);
        lblProductos2.setBounds(360, 380, 290, 19);

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
        jspCarrito.setBounds(370, 80, 600, 220);

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
        jspProductos.setViewportView(jtProductos);

        getContentPane().add(jspProductos);
        jspProductos.setBounds(360, 410, 600, 220);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(1130, 580, 110, 60);

        jpMenu.setBackground(new java.awt.Color(51, 102, 255));

        lblProductos.setBackground(new java.awt.Color(0, 153, 153));
        lblProductos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblProductos.setText("  Filtros de productos");
        lblProductos.setOpaque(true);

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

        cboMar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cboMar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblProductos4.setBackground(new java.awt.Color(0, 204, 204));
        lblProductos4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductos4.setText("Precio");
        lblProductos4.setOpaque(true);

        txtPrecMin.setText("jTextField1");

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
                .addGap(48, 48, 48)
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
                .addContainerGap(195, Short.MAX_VALUE))
        );

        getContentPane().add(jpMenu);
        jpMenu.setBounds(30, 60, 300, 570);

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

    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            private Personal personal;
            public void run() {
                new PRealizarVenta(this.personal).setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cboCat;
    private javax.swing.JComboBox<String> cboMar;
    private javax.swing.JLabel jLBackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JScrollPane jspCarrito;
    private javax.swing.JScrollPane jspProductos;
    private javax.swing.JTable jtCarrito;
    private javax.swing.JTable jtProductos;
    private javax.swing.JLabel lblCarrito;
    private javax.swing.JLabel lblInstrucciones;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblProductos1;
    private javax.swing.JLabel lblProductos2;
    private javax.swing.JLabel lblProductos3;
    private javax.swing.JLabel lblProductos4;
    private javax.swing.JLabel lblProductos5;
    private javax.swing.JLabel lblProductos6;
    private javax.swing.JTextField txtPrecMax;
    private javax.swing.JTextField txtPrecMin;
    // End of variables declaration//GEN-END:variables

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public void preCarga() {//Datos previos a mostrar el JFRAME pero posteriores al constructor
        //llenamos los combo box
        if(this.carrito!=null){//Si el carrito no es nulo
            
        }
        //Llenamos los filtros desde la BD
        
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
