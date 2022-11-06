package Vista;

import Modelo.Usuario;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
        
        setLocationRelativeTo(null);
        setResizable(false);
        //setIconImage(new ImageIcon(getClass().getResource("/icono_ventana")).getImage());
        SetImagenLabel(imgUsuario, "src/Imagenes/Usuario.png");
        SetImagenLabel(imgContraseña, "src/Imagenes/Contraseña.png");
        SetImagenLabel(imgFondoLogin, "src/imagenes/login.jpg");
        SetImagenLabel(ImgLogo, "src/imagenes/logo.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        imgInicio = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        imgUsuario = new javax.swing.JLabel();
        imgContraseña = new javax.swing.JLabel();
        botonIniciar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ImgLogo = new javax.swing.JLabel();
        LabelNombreEmpreza = new javax.swing.JLabel();
        imgFondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 550));

        imgInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciar.png"))); // NOI18N

        labelUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(0, 0, 255));
        labelUsuario.setText("Usuario");

        labelContraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelContraseña.setForeground(new java.awt.Color(0, 0, 255));
        labelContraseña.setText("Contraseña");

        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        txtContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        botonIniciar.setBackground(new java.awt.Color(0, 0, 255));
        botonIniciar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonIniciar.setForeground(new java.awt.Color(255, 255, 255));
        botonIniciar.setText("Iniciar sesion");
        botonIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIniciar.setPreferredSize(new java.awt.Dimension(70, 25));
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });

        botonCancelar.setBackground(new java.awt.Color(0, 0, 255));
        botonCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setText("Cancelar");
        botonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCancelar.setMaximumSize(new java.awt.Dimension(70, 25));
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(labelUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelContraseña)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imgContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imgUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(botonIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(imgInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 115, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(imgInicio)
                .addGap(27, 27, 27)
                .addComponent(labelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(labelContraseña)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imgContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 320, 370));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        LabelNombreEmpreza.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelNombreEmpreza.setText("Nombre de la empreza");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(LabelNombreEmpreza))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(ImgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(ImgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(LabelNombreEmpreza)
                .addContainerGap(308, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 500));
        getContentPane().add(imgFondoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 250, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Funciones 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    
    private boolean valirdarLoginUsuario(Usuario usuarioLogin, ArrayList<Usuario> usuariosRegistrados) {
        
        if (!usuariosRegistrados.isEmpty()) {

            //usuariosRegistrados.contains(usuarioLogin);
            long numeroUsuariosRepetidos = usuariosRegistrados.stream()
                    .filter(
                            usuario -> (usuarioLogin.getNombre().equals(usuario.getNombre()))
                            && usuarioLogin.getContraseña().equals(usuario.getContraseña()
                            )
                    ).count();
            if (numeroUsuariosRepetidos == 0) {
                return false;
            }
            return true;
        }
        return false;        
    }
    
    private void iniciarSesion() {
        ArrayList<Usuario> listaUsuarios;
        Usuario usuarioLogin = new Usuario();
        boolean usuarioEncontrado;
        String fichero = "";
        String nombreUsuario = txtUsuario.getText();
        String contraseña = txtContraseña.getText();
        
        try {
            BufferedReader brVerificar = new BufferedReader(new FileReader("Usuarios.json"));
            String linea;
            while ((linea = brVerificar.readLine()) != null) {
                fichero += linea;
            }
            if (!fichero.isEmpty()) {
                try {
                    BufferedReader br = new BufferedReader(new FileReader("Usuarios.json"));
                    
                    listaUsuarios = new Gson().fromJson(br, new TypeToken<ArrayList<Usuario>>() {
                    }.getType());
                    usuarioLogin.setNombre(nombreUsuario);
                    usuarioLogin.setContraseña(contraseña);
                    
                    usuarioEncontrado = valirdarLoginUsuario(usuarioLogin, listaUsuarios);
                    
                    if (usuarioEncontrado) {
                        
                        SistemaAdministradores abrir = new SistemaAdministradores();
                        abrir.setVisible(true);
                        this.setVisible(false);
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "ERROR", 0);
                        txtUsuario.setText("");
                        txtContraseña.setText("");
                    }
                    br.close();
                    
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);
                    
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se ha registrado ningun usuario", "ERROR", 0);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);
            
        } catch (IOException ex) {
            
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
    }

    private void SetImagenLabel(JLabel LabelName, String root) {
        ImageIcon imagen = new ImageIcon(root);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(LabelName.getWidth(), LabelName.getHeight(), Image.SCALE_DEFAULT));
        LabelName.setIcon(icono);
        this.repaint();
    }
    
    // </editor-fold> 

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        Inicio abrir = new Inicio();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        iniciarSesion();
    }//GEN-LAST:event_botonIniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgLogo;
    private javax.swing.JLabel LabelNombreEmpreza;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JLabel imgContraseña;
    private javax.swing.JLabel imgFondoLogin;
    private javax.swing.JLabel imgInicio;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}