package ui;

import business.GetById;
import business.SetId;
import ui.vendedor.PRealizarVenta;
import dao.DAOInitializationException;


import business.Validaciones;
import clases.Personal;
import clases.util.Usuario;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PLogin extends javax.swing.JFrame {
    public PLogin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocation(new java.awt.Point(200, 150));
        setMinimumSize(new java.awt.Dimension(1048, 589));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                windowResize(evt);
            }
        });
        getContentPane().setLayout(null);

        pnlLogin.setBackground(new java.awt.Color(153, 0, 51));
        pnlLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlLoginMouseExited(evt);
            }
        });

        lblUsuario.setBackground(new java.awt.Color(204, 0, 51));
        lblUsuario.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(204, 204, 204));
        lblUsuario.setText("Usuario:    ");
        lblUsuario.setToolTipText("");
        lblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseEntered(evt);
            }
        });

        lblPass.setBackground(new java.awt.Color(204, 0, 51));
        lblPass.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        lblPass.setForeground(new java.awt.Color(204, 204, 204));
        lblPass.setText("Password:");
        lblPass.setToolTipText("");
        lblPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPassMouseEntered(evt);
            }
        });

        lblLogin.setBackground(new java.awt.Color(204, 0, 51));
        lblLogin.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 48)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(204, 204, 204));
        lblLogin.setText("LOGIN");
        lblLogin.setToolTipText("");
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLoginMouseEntered(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(0, 204, 0));
        btnIngresar.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarMouseExited(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(0, 51, 153));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(153, 0, 51));
        btnSalir.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseEntered(evt);
            }
        });

        txtPass.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario)
                    .addComponent(lblPass)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(0, 56, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(txtPass))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogin)
                .addGap(162, 162, 162))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLogin)
                .addGap(82, 82, 82)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(128, 128, 128)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        getContentPane().add(pnlLogin);
        pnlLogin.setBounds(10, 10, 560, 570);

        lblBackground.setBackground(new java.awt.Color(0, 102, 153));
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/binarios/images/login.png"))); // NOI18N
        lblBackground.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1370, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void windowResize(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_windowResize
        //Cuando cambie el tamaño de la ventana
        //Obteniendo el tamañod el JFrame
        int height,width;
        height=this.getHeight();
        width=this.getWidth();
        //Modificando el background, panel y verificando que no se exceda el límite
        lblBackground.setSize(width, height);
        pnlLogin.setSize(pnlLogin.getWidth(),height-80);
    }//GEN-LAST:event_windowResize

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtUsuario.setText("");
        txtPass.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        try {
            Usuario usuario = new Usuario();
            Validaciones validaciones = new Validaciones();
            
            usuario.setCorreo(txtUsuario.getText());
            usuario.setPass(new String(txtPass.getPassword()) );
            //Validamos ese usuario
            usuario.setEstatus(validaciones.usuarioValido(usuario));//Incluye validacion de vacíos
            
            //Ahora determinamos el estado, si es válido lo mandamos a donde corresponde, sino le indicamos que los datos ingresados son incorrectos
            if(usuario.isEstatus()){
                //Primero buscamos el usuario que ha iniciado sesión
                Personal personal;
                SetId setId = new SetId();
                GetById getById = new GetById();
                personal = getById.getPersonalById(setId.setIdPersonal(usuario));
                //JOptionPane.showMessageDialog(null, "¡Bienveni@ " + setId.setIdPersonal(usuario)+ "!");
                //Mensaje de bienvenida
                String mensaje = "¡Bienvenid";
                if(personal.getCatSexo().getIdSexo()==1){//Si es hombre
                    mensaje+= "o " + personal.getCatPerfil().getPerfil();
                }else{//SI es mujer
                    mensaje+= "a " + personal.getCatPerfil().getPerfil() + "a";
                }
                mensaje += " " + personal.getNombre() + "!";
                JOptionPane.showMessageDialog(null, mensaje);
                PRealizarVenta prv = new PRealizarVenta();
                //Iniciamos el primer formulario, si es Encargado
                prv.setPersonal(personal);
                prv.preCarga();
                prv.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas, intenta de nuevo");
            }
        } catch (ClassNotFoundException|SQLException|DAOInitializationException ex) {
            Logger.getLogger(PLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseEntered
        btnIngresar.setBackground(Color.GREEN);
        Font font = new Font("Dialog", Font.BOLD, 22);
        btnIngresar.setFont(font);
        btnIngresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnIngresarMouseEntered

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
        btnIngresar.setBackground(new Color(0,204,0));
        Font font = new Font("Dialog", Font.PLAIN, 20);
        btnIngresar.setFont(font);
        btnIngresar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnIngresarMouseExited

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setBackground(Color.BLUE);
        Font font = new Font("Dialog", Font.PLAIN, 22);
        btnLimpiar.setFont(font);
        btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setBackground(new Color(0,51,153));
        Font font = new Font("Dialog", Font.PLAIN, 20);
        btnLimpiar.setFont(font);
        btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(Color.RED);
        Font font = new Font("Dialog", Font.PLAIN, 22);
        btnSalir.setFont(font);
        btnSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(153,0,51));
        Font font = new Font("Dialog", Font.PLAIN, 20);
        btnSalir.setFont(font);
        btnSalir.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnSalirMouseExited

    private void pnlLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLoginMouseEntered
        pnlLogin.setBackground(new Color(204,21,21));
        lblLogin.setForeground(Color.BLACK);
        lblPass.setForeground(Color.BLACK);
        lblUsuario.setForeground(Color.BLACK);
    }//GEN-LAST:event_pnlLoginMouseEntered

    private void pnlLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLoginMouseExited
        pnlLogin.setBackground(new Color(153,0,51));
        lblLogin.setForeground(new Color(204,204,204));
        lblPass.setForeground(new Color(204,204,204));
        lblUsuario.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_pnlLoginMouseExited

    private void lblLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseEntered
        pnlLogin.setBackground(new Color(204,21,21));
        lblLogin.setForeground(Color.BLACK);
        lblPass.setForeground(Color.BLACK);
        lblUsuario.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblLoginMouseEntered

    private void lblUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseEntered
        pnlLogin.setBackground(new Color(204,21,21));
        lblLogin.setForeground(Color.BLACK);
        lblPass.setForeground(Color.BLACK);
        lblUsuario.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblUsuarioMouseEntered

    private void lblPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPassMouseEntered
        pnlLogin.setBackground(new Color(204,21,21));
        lblLogin.setForeground(Color.BLACK);
        lblPass.setForeground(Color.BLACK);
        lblUsuario.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblPassMouseEntered

    private void txtUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseEntered
        pnlLogin.setBackground(new Color(204,21,21));
        lblLogin.setForeground(Color.BLACK);
        lblPass.setForeground(Color.BLACK);
        lblUsuario.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtUsuarioMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
