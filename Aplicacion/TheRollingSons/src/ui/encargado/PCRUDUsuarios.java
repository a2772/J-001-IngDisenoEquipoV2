package ui.encargado;

import ui.vendedor.*;
import clases.Personal;
import dao.DAOInitializationException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PCRUDUsuarios extends javax.swing.JFrame {

    private Personal personal;

    public PCRUDUsuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
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
        jLabelNombre7 = new javax.swing.JLabel();
        jLabelNombre8 = new javax.swing.JLabel();
        jLabelNombre9 = new javax.swing.JLabel();
        jTextFieldCalle = new javax.swing.JTextField();
        jLabelNombre10 = new javax.swing.JLabel();
        jTextFieldNumInt = new javax.swing.JTextField();
        jTextFieldNumExt1 = new javax.swing.JTextField();
        jLabelNombre11 = new javax.swing.JLabel();
        jTextFieldCP = new javax.swing.JTextField();
        jLabelNombre12 = new javax.swing.JLabel();
        jTextFieldMun = new javax.swing.JTextField();
        jLabelNombre13 = new javax.swing.JLabel();
        jTextFieldEstado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
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
        jLabelNombre.setBounds(480, 100, 120, 30);

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton1.setText("Actualizar");
        jRadioButton1.setOpaque(false);
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(320, 220, 120, 31);

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton2.setText("Consultar");
        jRadioButton2.setOpaque(false);
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(320, 160, 120, 31);

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton3.setText("Agregar");
        jRadioButton3.setOpaque(false);
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(320, 100, 100, 31);

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton4.setText("Eliminar");
        jRadioButton4.setOpaque(false);
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(320, 280, 100, 23);

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
        jButtonAplicar.setBounds(940, 410, 90, 40);

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
        jButtonSalir1.setBounds(480, 410, 90, 40);

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
        jButtonLimpiar.setBounds(710, 410, 90, 40);

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
        jTextFieldTelefono.setBounds(620, 300, 180, 30);

        jLabelNombre7.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombre7.setText("Dirección");
        getContentPane().add(jLabelNombre7);
        jLabelNombre7.setBounds(840, 30, 170, 30);

        jLabelNombre8.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre8.setText("Teléfono");
        getContentPane().add(jLabelNombre8);
        jLabelNombre8.setBounds(480, 300, 120, 30);

        jLabelNombre9.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre9.setText("Calle");
        getContentPane().add(jLabelNombre9);
        jLabelNombre9.setBounds(840, 60, 170, 30);
        getContentPane().add(jTextFieldCalle);
        jTextFieldCalle.setBounds(1020, 60, 220, 30);

        jLabelNombre10.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre10.setText("Número Exterior e Interior");
        getContentPane().add(jLabelNombre10);
        jLabelNombre10.setBounds(840, 100, 170, 30);
        getContentPane().add(jTextFieldNumInt);
        jTextFieldNumInt.setBounds(1140, 100, 100, 30);
        getContentPane().add(jTextFieldNumExt1);
        jTextFieldNumExt1.setBounds(1020, 100, 100, 30);

        jLabelNombre11.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre11.setText("Código Postal ");
        getContentPane().add(jLabelNombre11);
        jLabelNombre11.setBounds(840, 140, 170, 30);
        getContentPane().add(jTextFieldCP);
        jTextFieldCP.setBounds(1020, 140, 100, 30);

        jLabelNombre12.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre12.setText("Alcaldia/Municipio");
        getContentPane().add(jLabelNombre12);
        jLabelNombre12.setBounds(840, 180, 170, 30);
        getContentPane().add(jTextFieldMun);
        jTextFieldMun.setBounds(1020, 180, 220, 30);

        jLabelNombre13.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre13.setText("Estado");
        getContentPane().add(jLabelNombre13);
        jLabelNombre13.setBounds(840, 220, 170, 30);
        getContentPane().add(jTextFieldEstado);
        jTextFieldEstado.setBounds(1020, 220, 220, 30);

        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 492, 880, 110);
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
        // TODO add your handling code here:
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

    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            private Personal personal;
            public void run() {
                new PRealizarVenta(this.personal).setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAplicar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonSalir1;
    private javax.swing.JLabel jLBackground;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre10;
    private javax.swing.JLabel jLabelNombre11;
    private javax.swing.JLabel jLabelNombre12;
    private javax.swing.JLabel jLabelNombre13;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelNombre4;
    private javax.swing.JLabel jLabelNombre5;
    private javax.swing.JLabel jLabelNombre6;
    private javax.swing.JLabel jLabelNombre7;
    private javax.swing.JLabel jLabelNombre8;
    private javax.swing.JLabel jLabelNombre9;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCP;
    private javax.swing.JTextField jTextFieldCURP;
    private javax.swing.JTextField jTextFieldCalle;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldMun;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNumExt1;
    private javax.swing.JTextField jTextFieldNumInt;
    private javax.swing.JTextField jTextFieldPriApellido;
    private javax.swing.JTextField jTextFieldSegApellido;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JPanel jpMenu;
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
    }
}
