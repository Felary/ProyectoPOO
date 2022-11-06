package Vista;

import Modelo.DatosEmpresa;
import Modelo.Producto;
import Modelo.Proveedor;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SistemaAdministradores extends javax.swing.JFrame {

    public SistemaAdministradores() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        SetImagenLabel(imgLogo, "src/Imagenes/Logo.png");
        mostrarPorveedoresEnProductos();

        // mostrarDatosEmpreza();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelOpciones = new javax.swing.JPanel();
        botonNuevaVenta = new javax.swing.JButton();
        botonClientes = new javax.swing.JButton();
        botonProveedor = new javax.swing.JButton();
        botonProductos = new javax.swing.JButton();
        botonVentas = new javax.swing.JButton();
        botonConfiguracion = new javax.swing.JButton();
        imgLogo = new javax.swing.JLabel();
        imgEncabezado = new javax.swing.JLabel();
        tablaPrincipal = new javax.swing.JTabbedPane();
        panelNuevaVenta = new javax.swing.JPanel();
        labelCodigoNuevaVenta = new javax.swing.JLabel();
        labelDescripcionNuevaVenta = new javax.swing.JLabel();
        labelCantidadNuevaVenta = new javax.swing.JLabel();
        labelPrecioNuevaVenta = new javax.swing.JLabel();
        labelStockNuevaVenta = new javax.swing.JLabel();
        botonBorrarNuevaVenta = new javax.swing.JButton();
        txtCodigoNuevaVenta = new javax.swing.JTextField();
        txtDescripcionNuevaVenta = new javax.swing.JTextField();
        txtCantidadNuevaVenta = new javax.swing.JTextField();
        txtPrecioNuevaVenta = new javax.swing.JTextField();
        txtStockNuevaVenta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNuevaVenta = new javax.swing.JTable();
        labelDNINuevaVenta = new javax.swing.JLabel();
        txtDNINuevaVenta = new javax.swing.JTextField();
        labelNombreNuevaVenta = new javax.swing.JLabel();
        txtNombreNuevaVenta = new javax.swing.JTextField();
        botonImprimirNuevaVenta = new javax.swing.JButton();
        labelTotalNuevaVenta = new javax.swing.JLabel();
        txtTelefonoNuevaVenta = new javax.swing.JTextField();
        txtDireccionNuevaVenta = new javax.swing.JTextField();
        panelClientes = new javax.swing.JPanel();
        labelDNIClientes = new javax.swing.JLabel();
        labelNombreClientes = new javax.swing.JLabel();
        labelTelefonoClientes = new javax.swing.JLabel();
        labelDireccionClientes = new javax.swing.JLabel();
        txtDNIClientes = new javax.swing.JTextField();
        txtNombreClientes = new javax.swing.JTextField();
        txtTelefonoClientes = new javax.swing.JTextField();
        txtDireccionClientes = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        botonGuardarTodoClientes = new javax.swing.JButton();
        botonActualizarClientes = new javax.swing.JButton();
        botonEliminarClientes = new javax.swing.JButton();
        botonNuevoClientes = new javax.swing.JButton();
        panelProveedor = new javax.swing.JPanel();
        labelRUCProveedores = new javax.swing.JLabel();
        labelNombreProveedores = new javax.swing.JLabel();
        labelTelefonoProveedores = new javax.swing.JLabel();
        labelDireccionProveedores = new javax.swing.JLabel();
        txtRucProveedores = new javax.swing.JTextField();
        txtNombreProveedores = new javax.swing.JTextField();
        txtTelefonoProveedores = new javax.swing.JTextField();
        txtDireccionProveedores = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        botonGuardarTodoProveedores = new javax.swing.JButton();
        botonActualizarProveedores = new javax.swing.JButton();
        botonEliminarProveedores = new javax.swing.JButton();
        botonNuevoProveedores = new javax.swing.JButton();
        botonBuscarProveedor = new javax.swing.JButton();
        txtBuscarProveedor = new javax.swing.JTextField();
        panelProductos = new javax.swing.JPanel();
        labelCodigoProducto = new javax.swing.JLabel();
        labelDescripcionProducto = new javax.swing.JLabel();
        labelCantidadProducto = new javax.swing.JLabel();
        labelPrecioProducto = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        txtDescripccionProducto = new javax.swing.JTextField();
        txtCantdadProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        botonGuardarTodoProducto = new javax.swing.JButton();
        botonActualizarProducto = new javax.swing.JButton();
        botonEliminarProducto = new javax.swing.JButton();
        botonNuevoProducto = new javax.swing.JButton();
        labelProveedorProducto = new javax.swing.JLabel();
        boxProveedorProducto = new javax.swing.JComboBox<>();
        botonExcelProducto = new javax.swing.JButton();
        botonBuscarProductos = new javax.swing.JButton();
        txtBuscarProducto = new javax.swing.JTextField();
        panelVentas = new javax.swing.JPanel();
        botonPdfVentas = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        panelConfiguraciones = new javax.swing.JPanel();
        labellDatosEmprezaConfiguraciones = new javax.swing.JLabel();
        labelRUCConfiguraciones = new javax.swing.JLabel();
        labelNombreConfiguraciones = new javax.swing.JLabel();
        labelDireccionConfiguraciones = new javax.swing.JLabel();
        labelTelefonoConfiguraciones = new javax.swing.JLabel();
        botonActualizarConfiguraciones = new javax.swing.JButton();
        txtRUCConfiguraciones = new javax.swing.JTextField();
        txtNombreConfiguraciones = new javax.swing.JTextField();
        txtTelefonoConfiguraciones = new javax.swing.JTextField();
        txtDireccionConfiguraciones = new javax.swing.JTextField();
        botonGuardarDatosConfiguraciones = new javax.swing.JButton();
        botonCerrarSesionConfiguraciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelOpciones.setBackground(new java.awt.Color(0, 0, 255));

        botonNuevaVenta.setBackground(new java.awt.Color(153, 153, 153));
        botonNuevaVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuevaventa.png"))); // NOI18N
        botonNuevaVenta.setText("  Nueva venta");
        botonNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaVentaActionPerformed(evt);
            }
        });

        botonClientes.setBackground(new java.awt.Color(153, 153, 153));
        botonClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clientes.png"))); // NOI18N
        botonClientes.setText("  Clientes");
        botonClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClientesActionPerformed(evt);
            }
        });

        botonProveedor.setBackground(new java.awt.Color(153, 153, 153));
        botonProveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedor.png"))); // NOI18N
        botonProveedor.setText("  Proveedor");
        botonProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProveedorActionPerformed(evt);
            }
        });

        botonProductos.setBackground(new java.awt.Color(153, 153, 153));
        botonProductos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/producto.png"))); // NOI18N
        botonProductos.setText("  Productos");
        botonProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProductosActionPerformed(evt);
            }
        });

        botonVentas.setBackground(new java.awt.Color(153, 153, 153));
        botonVentas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compras.png"))); // NOI18N
        botonVentas.setText("  Ventas");
        botonVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVentas.setPreferredSize(new java.awt.Dimension(119, 32));
        botonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVentasActionPerformed(evt);
            }
        });

        botonConfiguracion.setBackground(new java.awt.Color(153, 153, 153));
        botonConfiguracion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/config.png"))); // NOI18N
        botonConfiguracion.setText("  Configuracion");
        botonConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfiguracionActionPerformed(evt);
            }
        });

        imgLogo.setForeground(new java.awt.Color(204, 255, 204));
        imgLogo.setText("logo empreza");

        javax.swing.GroupLayout PanelOpcionesLayout = new javax.swing.GroupLayout(PanelOpciones);
        PanelOpciones.setLayout(PanelOpcionesLayout);
        PanelOpcionesLayout.setHorizontalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(botonVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(botonConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(botonProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(botonProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(botonNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                    .addGroup(PanelOpcionesLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        PanelOpcionesLayout.setVerticalGroup(
            PanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(botonNuevaVenta)
                .addGap(30, 30, 30)
                .addComponent(botonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(botonProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(botonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(botonVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(botonConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        getContentPane().add(PanelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 700));

        imgEncabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/encabezado.png"))); // NOI18N
        getContentPane().add(imgEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1000, 140));

        tablaPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        tablaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelNuevaVenta.setBackground(new java.awt.Color(153, 153, 153));

        labelCodigoNuevaVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCodigoNuevaVenta.setText("Codigo");

        labelDescripcionNuevaVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDescripcionNuevaVenta.setText("Descripción");

        labelCantidadNuevaVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCantidadNuevaVenta.setText("Cantidad");

        labelPrecioNuevaVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelPrecioNuevaVenta.setText("Precio");

        labelStockNuevaVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelStockNuevaVenta.setForeground(new java.awt.Color(0, 0, 255));
        labelStockNuevaVenta.setText("Stock Disponible");

        botonBorrarNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        botonBorrarNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtCodigoNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtDescripcionNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtCantidadNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtPrecioNuevaVenta.setEditable(false);
        txtPrecioNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtStockNuevaVenta.setEditable(false);
        txtStockNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        tablaNuevaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCIÓN", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(tablaNuevaVenta);
        if (tablaNuevaVenta.getColumnModel().getColumnCount() > 0) {
            tablaNuevaVenta.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaNuevaVenta.getColumnModel().getColumn(1).setPreferredWidth(100);
            tablaNuevaVenta.getColumnModel().getColumn(2).setPreferredWidth(30);
            tablaNuevaVenta.getColumnModel().getColumn(3).setPreferredWidth(30);
            tablaNuevaVenta.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        labelDNINuevaVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDNINuevaVenta.setText("DNI/RUC");

        txtDNINuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        labelNombreNuevaVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNombreNuevaVenta.setText("Nombre");

        txtNombreNuevaVenta.setEditable(false);
        txtNombreNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        botonImprimirNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/print.png"))); // NOI18N
        botonImprimirNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelTotalNuevaVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTotalNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/money.png"))); // NOI18N
        labelTotalNuevaVenta.setText("Total a pagar");

        javax.swing.GroupLayout panelNuevaVentaLayout = new javax.swing.GroupLayout(panelNuevaVenta);
        panelNuevaVenta.setLayout(panelNuevaVentaLayout);
        panelNuevaVentaLayout.setHorizontalGroup(
            panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevaVentaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelNuevaVentaLayout.createSequentialGroup()
                            .addComponent(txtCodigoNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addGroup(panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelDescripcionNuevaVenta)
                                .addComponent(txtDescripcionNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelCantidadNuevaVenta)
                                .addComponent(txtCantidadNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(45, 45, 45)
                            .addGroup(panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelPrecioNuevaVenta)
                                .addComponent(txtPrecioNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(45, 45, 45)
                            .addGroup(panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelNuevaVentaLayout.createSequentialGroup()
                                    .addComponent(labelStockNuevaVenta)
                                    .addGap(41, 41, 41)
                                    .addComponent(botonBorrarNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtStockNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelNuevaVentaLayout.createSequentialGroup()
                            .addGroup(panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelNuevaVentaLayout.createSequentialGroup()
                                    .addGroup(panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelNuevaVentaLayout.createSequentialGroup()
                                            .addComponent(txtDNINuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(350, 350, 350))
                                        .addComponent(txtNombreNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtTelefonoNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDireccionNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonImprimirNuevaVenta)
                                    .addGap(92, 92, 92))
                                .addGroup(panelNuevaVentaLayout.createSequentialGroup()
                                    .addComponent(labelDNINuevaVenta)
                                    .addGap(199, 199, 199)
                                    .addComponent(labelNombreNuevaVenta)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(labelTotalNuevaVenta)
                            .addGap(20, 20, 20)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodigoNuevaVenta))
                .addGap(25, 25, 25))
        );
        panelNuevaVentaLayout.setVerticalGroup(
            panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevaVentaLayout.createSequentialGroup()
                .addGroup(panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNuevaVentaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCodigoNuevaVenta)
                            .addComponent(labelDescripcionNuevaVenta)
                            .addComponent(labelCantidadNuevaVenta)
                            .addComponent(labelPrecioNuevaVenta)
                            .addComponent(labelStockNuevaVenta)))
                    .addGroup(panelNuevaVentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonBorrarNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStockNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecioNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCantidadNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDescripcionNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCodigoNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNuevaVentaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonImprimirNuevaVenta)
                            .addComponent(labelTotalNuevaVenta)))
                    .addGroup(panelNuevaVentaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDNINuevaVenta)
                            .addComponent(labelNombreNuevaVenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNombreNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefonoNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDireccionNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDNINuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26))
        );

        tablaPrincipal.addTab("Nueva Venta", panelNuevaVenta);

        panelClientes.setBackground(new java.awt.Color(153, 153, 153));

        labelDNIClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDNIClientes.setText("DNI/RUC");

        labelNombreClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNombreClientes.setText("NOMBRE");

        labelTelefonoClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTelefonoClientes.setText("TELEFONO");

        labelDireccionClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDireccionClientes.setText("DIRECCIÓN");

        txtDNIClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIClientesActionPerformed(evt);
            }
        });

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI/RUC", "NOMBRE", "TELEFONO", "DIRECCIÓN"
            }
        ));
        jScrollPane2.setViewportView(tablaClientes);
        if (tablaClientes.getColumnModel().getColumnCount() > 0) {
            tablaClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaClientes.getColumnModel().getColumn(1).setPreferredWidth(50);
            tablaClientes.getColumnModel().getColumn(2).setPreferredWidth(20);
            tablaClientes.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        botonGuardarTodoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTodo.png"))); // NOI18N
        botonGuardarTodoClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonActualizarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar (2).png"))); // NOI18N
        botonActualizarClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonEliminarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        botonEliminarClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonNuevoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        botonNuevoClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelClientesLayout.createSequentialGroup()
                                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTelefonoClientes)
                                    .addComponent(labelDireccionClientes))
                                .addGap(32, 32, 32)
                                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefonoClientes)
                                    .addComponent(txtDireccionClientes)))
                            .addGroup(panelClientesLayout.createSequentialGroup()
                                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNombreClientes)
                                    .addComponent(labelDNIClientes))
                                .addGap(51, 51, 51)
                                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreClientes)
                                    .addComponent(txtDNIClientes))))
                        .addGap(47, 47, 47))
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonGuardarTodoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonActualizarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonNuevoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDNIClientes)
                            .addComponent(txtDNIClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombreClientes)
                            .addComponent(txtNombreClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTelefonoClientes)
                            .addComponent(txtTelefonoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDireccionClientes)
                            .addComponent(txtDireccionClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonGuardarTodoClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(botonActualizarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonNuevoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        tablaPrincipal.addTab("Clientes", panelClientes);

        panelProveedor.setBackground(new java.awt.Color(153, 153, 153));

        labelRUCProveedores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelRUCProveedores.setText("RUC");

        labelNombreProveedores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNombreProveedores.setText("NOMBRE");

        labelTelefonoProveedores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTelefonoProveedores.setText("TELEFONO");

        labelDireccionProveedores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDireccionProveedores.setText("DIRECCIÓN");

        tablaProveedores.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RUC", "NOMBRE", "TELEFONO", "DIRECCIÓN"
            }
        ));
        jScrollPane3.setViewportView(tablaProveedores);
        if (tablaProveedores.getColumnModel().getColumnCount() > 0) {
            tablaProveedores.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaProveedores.getColumnModel().getColumn(1).setPreferredWidth(80);
            tablaProveedores.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaProveedores.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        botonGuardarTodoProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTodo.png"))); // NOI18N
        botonGuardarTodoProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardarTodoProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarTodoProveedoresActionPerformed(evt);
            }
        });
        botonGuardarTodoProveedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                botonGuardarTodoProveedoresKeyReleased(evt);
            }
        });

        botonActualizarProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar (2).png"))); // NOI18N
        botonActualizarProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonEliminarProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        botonEliminarProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarProveedoresActionPerformed(evt);
            }
        });

        botonNuevoProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        botonNuevoProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonNuevoProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoProveedoresActionPerformed(evt);
            }
        });

        botonBuscarProveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonBuscarProveedor.setText("Buscar");
        botonBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProveedorLayout = new javax.swing.GroupLayout(panelProveedor);
        panelProveedor.setLayout(panelProveedorLayout);
        panelProveedorLayout.setHorizontalGroup(
            panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProveedorLayout.createSequentialGroup()
                .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProveedorLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRUCProveedores)
                            .addComponent(labelNombreProveedores)
                            .addComponent(labelTelefonoProveedores)
                            .addComponent(labelDireccionProveedores)
                            .addComponent(botonBuscarProveedor))
                        .addGap(59, 59, 59)
                        .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRucProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txtNombreProveedores)
                            .addComponent(txtTelefonoProveedores)
                            .addComponent(txtDireccionProveedores)
                            .addGroup(panelProveedorLayout.createSequentialGroup()
                                .addComponent(txtBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelProveedorLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonEliminarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonGuardarTodoProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonActualizarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonNuevoProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panelProveedorLayout.setVerticalGroup(
            panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProveedorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProveedorLayout.createSequentialGroup()
                        .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonBuscarProveedor)
                            .addComponent(txtBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProveedorLayout.createSequentialGroup()
                                .addComponent(labelRUCProveedores)
                                .addGap(55, 55, 55)
                                .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelNombreProveedores)
                                    .addComponent(txtNombreProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelTelefonoProveedores)
                                    .addComponent(txtTelefonoProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelDireccionProveedores)
                                    .addComponent(txtDireccionProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtRucProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonGuardarTodoProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonActualizarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(panelProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonEliminarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonNuevoProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        tablaPrincipal.addTab("Proveedores", panelProveedor);

        panelProductos.setBackground(new java.awt.Color(153, 153, 153));

        labelCodigoProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCodigoProducto.setText("CÓDIGO");

        labelDescripcionProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDescripcionProducto.setText("DESCRIPCIÓN");

        labelCantidadProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCantidadProducto.setText("CANTIDAD");

        labelPrecioProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelPrecioProducto.setText("PRECIO");

        tablaProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "descripcion", "cantidad", "precio", "proveedor"
            }
        ));
        jScrollPane4.setViewportView(tablaProducto);
        if (tablaProducto.getColumnModel().getColumnCount() > 0) {
            tablaProducto.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaProducto.getColumnModel().getColumn(1).setPreferredWidth(80);
            tablaProducto.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaProducto.getColumnModel().getColumn(3).setPreferredWidth(50);
            tablaProducto.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        botonGuardarTodoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTodo.png"))); // NOI18N
        botonGuardarTodoProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardarTodoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarTodoProductoActionPerformed(evt);
            }
        });

        botonActualizarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar (2).png"))); // NOI18N
        botonActualizarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarProductoActionPerformed(evt);
            }
        });

        botonEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        botonEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarProductoActionPerformed(evt);
            }
        });

        botonNuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        botonNuevoProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoProductoActionPerformed(evt);
            }
        });

        labelProveedorProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelProveedorProducto.setText("PROVEEDOR");

        boxProveedorProducto.setEditable(true);

        botonExcelProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/excel.png"))); // NOI18N
        botonExcelProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonBuscarProductos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonBuscarProductos.setText("Buscar");
        botonBuscarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCodigoProducto)
                            .addComponent(labelDescripcionProducto)
                            .addComponent(labelCantidadProducto)
                            .addComponent(labelPrecioProducto)
                            .addComponent(labelProveedorProducto)
                            .addComponent(botonBuscarProductos))
                        .addGap(57, 57, 57)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProductosLayout.createSequentialGroup()
                                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(txtDescripccionProducto)
                                    .addComponent(txtCantdadProducto)
                                    .addComponent(txtPrecioProducto)
                                    .addComponent(boxProveedorProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(37, 37, 37))
                            .addGroup(panelProductosLayout.createSequentialGroup()
                                .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonGuardarTodoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(botonExcelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonBuscarProductos)
                            .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCodigoProducto)
                            .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDescripcionProducto)
                            .addComponent(txtDescripccionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCantidadProducto)
                            .addComponent(txtCantdadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPrecioProducto)
                            .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelProveedorProducto)
                            .addComponent(boxProveedorProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProductosLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botonGuardarTodoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelProductosLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(botonExcelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)))
                .addGap(31, 31, 31))
        );

        tablaPrincipal.addTab("Productos", panelProductos);

        panelVentas.setBackground(new java.awt.Color(153, 153, 153));

        botonPdfVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf.png"))); // NOI18N
        botonPdfVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPdfVentasActionPerformed(evt);
            }
        });

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CLIENTE", "VENDEDOR", "TOTAL"
            }
        ));
        jScrollPane5.setViewportView(tablaVentas);
        if (tablaVentas.getColumnModel().getColumnCount() > 0) {
            tablaVentas.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaVentas.getColumnModel().getColumn(1).setPreferredWidth(50);
            tablaVentas.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaVentas.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        javax.swing.GroupLayout panelVentasLayout = new javax.swing.GroupLayout(panelVentas);
        panelVentas.setLayout(panelVentasLayout);
        panelVentasLayout.setHorizontalGroup(
            panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentasLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonPdfVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
        panelVentasLayout.setVerticalGroup(
            panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentasLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(botonPdfVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        tablaPrincipal.addTab("Ventas", panelVentas);

        panelConfiguraciones.setBackground(new java.awt.Color(153, 153, 153));

        labellDatosEmprezaConfiguraciones.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        labellDatosEmprezaConfiguraciones.setText("DATOS DE LA EMPRESA");

        labelRUCConfiguraciones.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        labelRUCConfiguraciones.setText("RUC");

        labelNombreConfiguraciones.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        labelNombreConfiguraciones.setText("NOMBRE");

        labelDireccionConfiguraciones.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        labelDireccionConfiguraciones.setText("DIRECCIOÓN");

        labelTelefonoConfiguraciones.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        labelTelefonoConfiguraciones.setText("TELEFONO");

        botonActualizarConfiguraciones.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonActualizarConfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar (2).png"))); // NOI18N
        botonActualizarConfiguraciones.setText("ACTUALIZAR");
        botonActualizarConfiguraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarConfiguracionesActionPerformed(evt);
            }
        });

        botonGuardarDatosConfiguraciones.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonGuardarDatosConfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTodo.png"))); // NOI18N
        botonGuardarDatosConfiguraciones.setText("GUARDAR DATOS");
        botonGuardarDatosConfiguraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarDatosConfiguracionesActionPerformed(evt);
            }
        });

        botonCerrarSesionConfiguraciones.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonCerrarSesionConfiguraciones.setText("CERRAR SESION");
        botonCerrarSesionConfiguraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionConfiguracionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConfiguracionesLayout = new javax.swing.GroupLayout(panelConfiguraciones);
        panelConfiguraciones.setLayout(panelConfiguracionesLayout);
        panelConfiguracionesLayout.setHorizontalGroup(
            panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfiguracionesLayout.createSequentialGroup()
                .addGroup(panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConfiguracionesLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelConfiguracionesLayout.createSequentialGroup()
                                .addComponent(labelRUCConfiguraciones)
                                .addGap(309, 309, 309)
                                .addComponent(labelNombreConfiguraciones))
                            .addGroup(panelConfiguracionesLayout.createSequentialGroup()
                                .addGroup(panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTelefonoConfiguraciones)
                                    .addComponent(txtTelefonoConfiguraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRUCConfiguraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(102, 102, 102)
                                .addGroup(panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDireccionConfiguraciones)
                                    .addComponent(txtNombreConfiguraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccionConfiguraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelConfiguracionesLayout.createSequentialGroup()
                                .addComponent(botonActualizarConfiguraciones)
                                .addGap(32, 32, 32)
                                .addComponent(botonGuardarDatosConfiguraciones)
                                .addGap(29, 29, 29)
                                .addComponent(botonCerrarSesionConfiguraciones))))
                    .addGroup(panelConfiguracionesLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(labellDatosEmprezaConfiguraciones)))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        panelConfiguracionesLayout.setVerticalGroup(
            panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfiguracionesLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(labellDatosEmprezaConfiguraciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRUCConfiguraciones)
                    .addComponent(labelNombreConfiguraciones))
                .addGap(18, 18, 18)
                .addGroup(panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRUCConfiguraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreConfiguraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDireccionConfiguraciones, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTelefonoConfiguraciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoConfiguraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccionConfiguraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(panelConfiguracionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonActualizarConfiguraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGuardarDatosConfiguraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCerrarSesionConfiguraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        tablaPrincipal.addTab("Configuraciones", panelConfiguraciones);

        getContentPane().add(tablaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 990, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Funciones Configuraciones"> 
    private void actualizarDatosEmpreza() {
        Gson documento = new Gson();
        DatosEmpresa datos = new DatosEmpresa();
        String fichero = "";
        ArrayList<DatosEmpresa> listaDatos = new ArrayList<>();

        String ruc = txtRUCConfiguraciones.getText();
        String nombre = txtNombreConfiguraciones.getText();
        String telefono = txtTelefonoConfiguraciones.getText();
        String direccion = txtDireccionConfiguraciones.getText();

        try {
            BufferedReader br = new BufferedReader(new FileReader("DatosEmpreza.json"));
            String linea;
            while ((linea = br.readLine()) != null) {
                fichero += linea;
            }

            if (fichero.isEmpty()) {

                datos.setRuc(ruc);
                datos.setNombreEmpreza(nombre);
                datos.setTelefono(telefono);
                datos.setDireccion(direccion);

                listaDatos.add(datos);

                String empreza = documento.toJson(listaDatos);

                try (BufferedWriter bw = new BufferedWriter(new FileWriter("DatosEmpreza.json"))) {
                    bw.write(empreza);

                    JOptionPane.showMessageDialog(null, "Los datos se han actualizado con exito", "Felicidades", 1);

                } catch (IOException ex) {
                    Logger.getLogger(DatosEmpresa.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                try {
                    BufferedReader br2 = new BufferedReader(new FileReader("DatosEmpreza.json"));
                    listaDatos = new Gson().fromJson(br2, new TypeToken<ArrayList<DatosEmpresa>>() {
                    }.getType());

                    datos.setRuc(ruc);
                    datos.setNombreEmpreza(nombre);
                    datos.setTelefono(telefono);
                    datos.setDireccion(direccion);

                    listaDatos.add(0, datos);

                    String empreza = documento.toJson(listaDatos);

                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("DatosEmpreza.json"))) {
                        bw.write(empreza);

                        JOptionPane.showMessageDialog(null, "Los datos se han actualizado con exito", "Felicidades", 1);

                    } catch (IOException ex) {
                        Logger.getLogger(DatosEmpresa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    br2.close();

                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
                }
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
        mostrarDatosEmpreza();
    }   //actualiza los datos de la empreza

    private void mostrarDatosEmpreza() {
        String fichero = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("Proveedores.json"));
            String linea;
            while ((linea = br.readLine()) != null) {
                fichero += linea;
            }
            if (!fichero.isEmpty()) {
                txtNombreConfiguraciones.setEnabled(false);
                txtRUCConfiguraciones.setEnabled(false);
                txtTelefonoConfiguraciones.setEnabled(false);
                txtDireccionConfiguraciones.setEnabled(false);
                ArrayList<DatosEmpresa> listaDatosEmpreza;
                try {
                    BufferedReader br2 = new BufferedReader(new FileReader("DatosEmpreza.json"));
                    listaDatosEmpreza = new Gson().fromJson(br2, new TypeToken<ArrayList<DatosEmpresa>>() {
                    }.getType());
                    txtNombreConfiguraciones.setText(listaDatosEmpreza.get(0).getNombreEmpreza());
                    txtRUCConfiguraciones.setText(listaDatosEmpreza.get(0).getRuc());
                    txtTelefonoConfiguraciones.setText(listaDatosEmpreza.get(0).getTelefono());
                    txtDireccionConfiguraciones.setText(listaDatosEmpreza.get(0).getDireccion());

                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);
                }
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);
        } catch (IOException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
    } //muestra todos los datos de la empreza

    // </editor-fold> 
    //fin funciones configuariones
    // <editor-fold defaultstate="collapsed" desc="Funciones Productos"> 
    private void mostrarDatosProductoEnTabla(ArrayList<Producto> listaProductos) {
        DefaultTableModel tabla = new DefaultTableModel();
        tablaProducto.setModel(tabla);

        tabla.addColumn("codigo");
        tabla.addColumn("descripcion");
        tabla.addColumn("cantidad");
        tabla.addColumn("precio");
        tabla.addColumn("proveedor");

        String[] vectorProductos = new String[5];

        for (int i = 0; i < listaProductos.size(); i++) {
            vectorProductos[0] = listaProductos.get(i).getCodigo();
            vectorProductos[1] = listaProductos.get(i).getDescripcion();
            vectorProductos[2] = String.valueOf(listaProductos.get(i).getCantidad());
            vectorProductos[3] = String.valueOf(listaProductos.get(i).getPrecio());            
            vectorProductos[4] = listaProductos.get(i).getProveedor();
            tabla.addRow(vectorProductos);
        }

    }

    private void mandarDatosProductoATabla() {
        ArrayList<Producto> listaProductos;
        String fichero = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("productos.json"));
            String linea;
            while ((linea = br.readLine()) != null) {
                fichero += linea;
            }

            if (!fichero.isEmpty()) {
                try {
                    BufferedReader br2 = new BufferedReader(new FileReader("productos.json"));
                    listaProductos = new Gson().fromJson(br2, new TypeToken<ArrayList<Producto>>() {
                    }.getType());
                    mostrarDatosProductoEnTabla(listaProductos);

                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);
                }
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
    }

    private void mostrarPorveedoresEnProductos() {
        ArrayList<Proveedor> listaProveedores;
        String fichero = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("Proveedores.json"));
            String linea;
            while ((linea = br.readLine()) != null) {
                fichero += linea;
            }

            if (!fichero.isEmpty()) {
                try {
                    BufferedReader br2 = new BufferedReader(new FileReader("Proveedores.json"));
                    listaProveedores = new Gson().fromJson(br2, new TypeToken<ArrayList<Proveedor>>() {
                    }.getType());
                    boxProveedorProducto.removeAllItems();
                    for (int i = 0; i < listaProveedores.size(); i++) {
                        String nombre = listaProveedores.get(i).getNombre();
                        boxProveedorProducto.addItem(nombre);
                    }

                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);
                }
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);
        } catch (IOException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
    }

    private Producto verificarCodigo(String codigo, ArrayList<Producto> listaProductosRegistrados) {

        for (int i = 0; i < listaProductosRegistrados.size(); i++) {
            if (codigo.equals(listaProductosRegistrados.get(i).getCodigo())) {
                return listaProductosRegistrados.get(i);
            }
        }
        return null;
    }

    private void buscarMostrarProductos() {
        ArrayList<Producto> listaproductos;
        String fichero = "";
        Producto productoEncontrado;
        String codigo = txtBuscarProducto.getText();
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Para realizar la busqueda \ndebe ingresar el codigo del producto", "ERROR", 0);
            return;
        }

        try {
            BufferedReader brVerificar = new BufferedReader(new FileReader("Productos.json"));
            String linea;
            while ((linea = brVerificar.readLine()) != null) {
                fichero += linea;
            }
            if (!fichero.isEmpty()) {
                try {
                    BufferedReader br = new BufferedReader(new FileReader("Productos.json"));

                    listaproductos = new Gson().fromJson(br, new TypeToken<ArrayList<Producto>>() {
                    }.getType());

                    productoEncontrado = verificarCodigo(codigo, listaproductos);

                    if (productoEncontrado == null) {

                        JOptionPane.showMessageDialog(null, "No se ha registrado ningun producto con ese codigo", "ERROR", 0);
                        limpiarDatosProductos();

                    } else {
                        txtCodigoProducto.setText(productoEncontrado.getCodigo());
                        txtDescripccionProducto.setText(productoEncontrado.getDescripcion());
                        txtCantdadProducto.setText(String.valueOf(productoEncontrado.getCantidad()));
                        txtPrecioProducto.setText(String.valueOf(productoEncontrado.getPrecio()));
                        boxProveedorProducto.setSelectedItem(productoEncontrado.getProveedor());

                    }
                    br.close();

                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se ha registrado ningun producto", "ERROR", 0);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
    }

    private boolean valirdarProductoExistente(String codigoProducto, ArrayList<Producto> productosRegistrados) {

        if (productosRegistrados != null) {

            long numeroProductosRepetidos = productosRegistrados.stream().filter(producto -> codigoProducto.equals(producto.getCodigo())).count();

            if (numeroProductosRepetidos == 0) {
                return false;
            }

            return true;
        }
        return false;
    }  //verifica que el producto se encuentra en el json.

    public void modificarProducto() {

        Gson documento = new Gson();
        Producto productoModificado = new Producto();
        ArrayList<Producto> listaProductos;

        String codigo = txtCodigoProducto.getText();
        String descripcion = txtDescripccionProducto.getText();
        int cantidad = Integer.parseInt(txtCantdadProducto.getText());
        double precion = Double.parseDouble(txtPrecioProducto.getText());
        String proveedor = boxProveedorProducto.getSelectedItem().toString();

        try {

            BufferedReader br = new BufferedReader(new FileReader("Productos.json"));
            listaProductos = new Gson().fromJson(br, new TypeToken<ArrayList<Producto>>() {
            }.getType());

            productoModificado.setCodigo(codigo);
            productoModificado.setDescripcion(descripcion);
            productoModificado.setCantidad(cantidad);
            productoModificado.setPrecio(precion);
            productoModificado.setProveedor(proveedor);

            for (int i = 0; i < listaProductos.size(); i++) {
                if (codigo.equals(listaProductos.get(i).getCodigo())) {
                    listaProductos.set(i, productoModificado);
                }
            }

            String producto = documento.toJson(listaProductos);

            try (BufferedWriter bw = new BufferedWriter(new FileWriter("Productos.json"))) {

                bw.write(producto);
                JOptionPane.showMessageDialog(null, "Los datos se han actualizado con exito", "Felicidades", 1);

            } catch (IOException ex) {
                Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
            }

            br.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
    }

    private void registrarNuevoProducto() {
        Gson documento = new Gson();
        Producto nuevoProducto = new Producto();
        String fichero = "";
        ArrayList<Producto> listaProductos = new ArrayList<>();
        boolean productoEncontrado;

        String codigo = txtCodigoProducto.getText();
        String descripcion = txtDescripccionProducto.getText();
        int cantidad = Integer.parseInt(txtCantdadProducto.getText());
        double precion = Double.parseDouble(txtPrecioProducto.getText());
        String proveedor = boxProveedorProducto.getSelectedItem().toString();

        try {
            BufferedReader br = new BufferedReader(new FileReader("Productos.json"));
            String linea;
            while ((linea = br.readLine()) != null) {
                fichero += linea;
            }

            if (fichero.isEmpty()) {

                nuevoProducto.setCodigo(codigo);
                nuevoProducto.setDescripcion(descripcion);
                nuevoProducto.setCantidad(cantidad);
                nuevoProducto.setPrecio(precion);
                nuevoProducto.setProveedor(proveedor);

                listaProductos.add(nuevoProducto);

                String productos = documento.toJson(listaProductos);

                try (BufferedWriter bw = new BufferedWriter(new FileWriter("Productos.json"))) {
                    bw.write(productos);
                    JOptionPane.showMessageDialog(null, "Nuevo producto añadido", "Felicidades", 1);

                } catch (IOException ex) {
                    Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                try {
                    BufferedReader br2 = new BufferedReader(new FileReader("Productos.json"));
                    listaProductos = new Gson().fromJson(br2, new TypeToken<ArrayList<Producto>>() {
                    }.getType());
                    productoEncontrado = valirdarProductoExistente(codigo, listaProductos);

                    if (productoEncontrado) {
                        JOptionPane.showMessageDialog(null, "El producto ya ha sido registrado con ese codigo", "ERROR", 0);
                    } else {

                        nuevoProducto.setCodigo(codigo);
                        nuevoProducto.setDescripcion(descripcion);
                        nuevoProducto.setCantidad(cantidad);
                        nuevoProducto.setPrecio(precion);
                        nuevoProducto.setProveedor(proveedor);
                        listaProductos.add(nuevoProducto);

                        String productos = documento.toJson(listaProductos);

                        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Productos.json"))) {
                            bw.write(productos);
                            JOptionPane.showMessageDialog(null, "Nuevo producto añadido", "Felicidades", 1);

                        } catch (IOException ex) {
                            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        br2.close();
                    }
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
                }
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
    }

    private void eliminarProducto() {
        Gson documento = new Gson();

        ArrayList<Producto> listaProductos;

        String codigo = txtCodigoProducto.getText();

        if (!codigo.isEmpty()) {

            try {
                BufferedReader br = new BufferedReader(new FileReader("Productos.json"));
                listaProductos = new Gson().fromJson(br, new TypeToken<ArrayList<Producto>>() {
                }.getType());

                for (int i = 0; i < listaProductos.size(); i++) {
                    if (codigo.equals(listaProductos.get(i).getCodigo())) {
                        listaProductos.remove(i);
                    }
                }
                String producto = documento.toJson(listaProductos);

                try (BufferedWriter bw = new BufferedWriter(new FileWriter("Productos.json"))) {

                    bw.write(producto);
                    limpiarDatosProductos();
                    JOptionPane.showMessageDialog(null, "El producto se ha eliminado con exito", "Felicidades", 1);

                } catch (IOException ex) {
                    Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
                }

                br.close();

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);

            } catch (IOException ex) {

                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
            }
        }
    }

    // </editor-fold> 
    //fin funciones Productos
    // <editor-fold defaultstate="collapsed" desc="Funciones Proveedores "> 
    private boolean valirdarProveedorExistente(String rucProveedor, ArrayList<Proveedor> proveedoresRegistrados) {

        if (proveedoresRegistrados != null) {

            long numeroProveedoresRepetidos = proveedoresRegistrados.stream().filter(proveedor -> rucProveedor.equals(proveedor.getRuc())).count();

            if (numeroProveedoresRepetidos == 0) {
                return false;
            }

            return true;
        }
        return false;
    }

    private void registrarNuevoProveedor() {
        Gson documento = new Gson();
        Proveedor nuevoProveedor = new Proveedor();
        String fichero = "";
        ArrayList<Proveedor> listaProveedores = new ArrayList<>();
        boolean proveedorEncontrado;

        String ruc = txtRucProveedores.getText();
        String nombre = txtNombreProveedores.getText();
        String telefono = txtTelefonoProveedores.getText();
        String direccion = txtDireccionProveedores.getText();

        try {
            BufferedReader br = new BufferedReader(new FileReader("Proveedores.json"));
            String linea;
            while ((linea = br.readLine()) != null) {
                fichero += linea;
            }

            if (fichero.isEmpty()) {

                nuevoProveedor.setRuc(ruc);
                nuevoProveedor.setNombre(nombre);
                nuevoProveedor.setTelefono(telefono);
                nuevoProveedor.setDireccion(direccion);

                listaProveedores.add(nuevoProveedor);

                String proveedor = documento.toJson(listaProveedores);

                try (BufferedWriter bw = new BufferedWriter(new FileWriter("Proveedores.json"))) {
                    bw.write(proveedor);

                    JOptionPane.showMessageDialog(null, "Nuevo proveedor añadido", "Felicidades", 1);

                } catch (IOException ex) {
                    Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                try {
                    BufferedReader br2 = new BufferedReader(new FileReader("Proveedores.json"));
                    listaProveedores = new Gson().fromJson(br2, new TypeToken<ArrayList<Proveedor>>() {
                    }.getType());

                    proveedorEncontrado = valirdarProveedorExistente(ruc, listaProveedores);

                    if (proveedorEncontrado) {
                        JOptionPane.showMessageDialog(null, "El proveedor ya ha sido registrado con ese ruc", "ERROR", 0);
                    } else {

                        nuevoProveedor.setRuc(ruc);
                        nuevoProveedor.setNombre(nombre);
                        nuevoProveedor.setTelefono(telefono);
                        nuevoProveedor.setDireccion(direccion);

                        listaProveedores.add(nuevoProveedor);

                        String proveedor = documento.toJson(listaProveedores);

                        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Proveedores.json"))) {
                            bw.write(proveedor);

                            JOptionPane.showMessageDialog(null, "Nuevo proveedor añadido", "Felicidades", 1);

                        } catch (IOException ex) {
                            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        br2.close();
                    }
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
                }
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
        mostrarPorveedoresEnProductos();
    }

    private Proveedor verificarRuc(String ruc, ArrayList<Proveedor> listaProveedoresRegistrados) {

        for (int i = 0; i < listaProveedoresRegistrados.size(); i++) {
            if (ruc.equals(listaProveedoresRegistrados.get(i).getRuc())) {
                return listaProveedoresRegistrados.get(i);
            }
        }
        return null;
    }

    private void buscarMostrarProveedores() {
        ArrayList<Proveedor> listaProveedores;
        String fichero = "";
        Proveedor proveedorEncontrado;
        String ruc = txtBuscarProveedor.getText();
        if (ruc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Para realizar la busqueda \ndebe ingresar el ruc del proveedor", "ERROR", 0);
            return;
        }

        try {
            BufferedReader brVerificar = new BufferedReader(new FileReader("Proveedores.json"));
            String linea;
            while ((linea = brVerificar.readLine()) != null) {
                fichero += linea;
            }
            if (!fichero.isEmpty()) {
                try {
                    BufferedReader br = new BufferedReader(new FileReader("Proveedores.json"));

                    listaProveedores = new Gson().fromJson(br, new TypeToken<ArrayList<Proveedor>>() {
                    }.getType());

                    proveedorEncontrado = verificarRuc(ruc, listaProveedores);

                    if (proveedorEncontrado == null) {

                        JOptionPane.showMessageDialog(null, "No se ha registrado ningun proveedor con ese ruc", "ERROR", 0);
                        limpiarDatosProveedores();

                    } else {
                        txtRucProveedores.setText(proveedorEncontrado.getRuc());
                        txtNombreProveedores.setText(proveedorEncontrado.getNombre());
                        txtTelefonoProveedores.setText(proveedorEncontrado.getTelefono());
                        txtDireccionProveedores.setText(proveedorEncontrado.getDireccion());
                    }
                    br.close();

                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se han registrado ningun proveedor", "ERROR", 0);
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
    }

    private void eliminarproveedor() {
        Gson documento = new Gson();
        ArrayList<Proveedor> listaproveedor;

        String ruc = txtRucProveedores.getText();
        if (!ruc.isEmpty()) {
            try {
                BufferedReader br = new BufferedReader(new FileReader("Proveedores.json"));
                listaproveedor = new Gson().fromJson(br, new TypeToken<ArrayList<Proveedor>>() {
                }.getType());

                for (int i = 0; i < listaproveedor.size(); i++) {
                    if (ruc.equals(listaproveedor.get(i).getRuc())) {
                        listaproveedor.remove(i);
                    }
                }
                String proveedor = documento.toJson(listaproveedor);

                try (BufferedWriter bw = new BufferedWriter(new FileWriter("Proveedores.json"))) {

                    bw.write(proveedor);
                    limpiarDatosProveedores();
                    mostrarPorveedoresEnProductos();
                    JOptionPane.showMessageDialog(null, "El proveedor se ha eliminado con exito", "Felicidades", 1);

                } catch (IOException ex) {
                    Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
                }

                br.close();

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Fichero no encontrado", 0);

            } catch (IOException ex) {

                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
            }
        }
    }

    // </editor-fold> 
    //fin funciones Proveedores
    // <editor-fold defaultstate="collapsed" desc="Funciones Globales"> 
    private void SetImagenLabel(JLabel LabelName, String root) {
        ImageIcon imagen = new ImageIcon(root);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(LabelName.getWidth(), LabelName.getHeight(), Image.SCALE_DEFAULT));
        LabelName.setIcon(icono);
        this.repaint();
    }

    private void limpiarDatosProductos() {
        txtCodigoProducto.setEnabled(true);
        txtCodigoProducto.setText("");
        txtDescripccionProducto.setText("");
        txtCantdadProducto.setText("");
        txtPrecioProducto.setText("");
    }

    private void limpiarDatosProveedores() {
        txtRucProveedores.setEnabled(true);
        txtRucProveedores.setText("");
        txtNombreProveedores.setText("");
        txtTelefonoProveedores.setText("");
        txtDireccionProveedores.setText("");
    }

    // </editor-fold> 
    //fin funciones Globales

    private void botonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClientesActionPerformed
        tablaPrincipal.setSelectedIndex(1);
    }//GEN-LAST:event_botonClientesActionPerformed

    private void botonNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaVentaActionPerformed
        tablaPrincipal.setSelectedIndex(0);
    }//GEN-LAST:event_botonNuevaVentaActionPerformed

    private void botonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVentasActionPerformed
        tablaPrincipal.setSelectedIndex(4);
    }//GEN-LAST:event_botonVentasActionPerformed

    private void txtDNIClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIClientesActionPerformed

    private void botonGuardarTodoProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarTodoProveedoresActionPerformed
        registrarNuevoProveedor();
    }//GEN-LAST:event_botonGuardarTodoProveedoresActionPerformed

    private void botonGuardarTodoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarTodoProductoActionPerformed
        registrarNuevoProducto();
        mandarDatosProductoATabla();
    }//GEN-LAST:event_botonGuardarTodoProductoActionPerformed

    private void botonPdfVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPdfVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPdfVentasActionPerformed

    private void botonProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProveedorActionPerformed
        tablaPrincipal.setSelectedIndex(2);
    }//GEN-LAST:event_botonProveedorActionPerformed

    private void botonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProductosActionPerformed
        mandarDatosProductoATabla();
        tablaPrincipal.setSelectedIndex(3);
    }//GEN-LAST:event_botonProductosActionPerformed

    private void botonConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfiguracionActionPerformed
        tablaPrincipal.setSelectedIndex(5);
    }//GEN-LAST:event_botonConfiguracionActionPerformed

    private void botonNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoProductoActionPerformed
        limpiarDatosProductos();
    }//GEN-LAST:event_botonNuevoProductoActionPerformed

    private void botonActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarProductoActionPerformed
        modificarProducto();
        mandarDatosProductoATabla();
    }//GEN-LAST:event_botonActualizarProductoActionPerformed

    private void botonBuscarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarProductosActionPerformed
        buscarMostrarProductos();
        txtBuscarProducto.setText("");
        txtCodigoProducto.setEnabled(false);
    }//GEN-LAST:event_botonBuscarProductosActionPerformed

    private void botonGuardarTodoProveedoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonGuardarTodoProveedoresKeyReleased

    }//GEN-LAST:event_botonGuardarTodoProveedoresKeyReleased

    private void botonNuevoProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoProveedoresActionPerformed
        limpiarDatosProveedores();
    }//GEN-LAST:event_botonNuevoProveedoresActionPerformed

    private void botonActualizarConfiguracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarConfiguracionesActionPerformed
        txtNombreConfiguraciones.setEnabled(true);
        txtRUCConfiguraciones.setEnabled(true);
        txtTelefonoConfiguraciones.setEnabled(true);
        txtDireccionConfiguraciones.setEnabled(true);
    }//GEN-LAST:event_botonActualizarConfiguracionesActionPerformed

    private void botonCerrarSesionConfiguracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionConfiguracionesActionPerformed
        Inicio abrir = new Inicio();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCerrarSesionConfiguracionesActionPerformed

    private void botonGuardarDatosConfiguracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarDatosConfiguracionesActionPerformed
        actualizarDatosEmpreza();
    }//GEN-LAST:event_botonGuardarDatosConfiguracionesActionPerformed

    private void botonEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarProductoActionPerformed
        eliminarProducto();
        mandarDatosProductoATabla();
    }//GEN-LAST:event_botonEliminarProductoActionPerformed

    private void botonBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarProveedorActionPerformed
        buscarMostrarProveedores();
        txtBuscarProveedor.setText("");
        txtRucProveedores.setEnabled(false);
    }//GEN-LAST:event_botonBuscarProveedorActionPerformed

    private void botonEliminarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarProveedoresActionPerformed
        eliminarproveedor();
    }//GEN-LAST:event_botonEliminarProveedoresActionPerformed

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
            java.util.logging.Logger.getLogger(SistemaAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaAdministradores().setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Variables declaration"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelOpciones;
    private javax.swing.JButton botonActualizarClientes;
    private javax.swing.JButton botonActualizarConfiguraciones;
    private javax.swing.JButton botonActualizarProducto;
    private javax.swing.JButton botonActualizarProveedores;
    private javax.swing.JButton botonBorrarNuevaVenta;
    private javax.swing.JButton botonBuscarProductos;
    private javax.swing.JButton botonBuscarProveedor;
    private javax.swing.JButton botonCerrarSesionConfiguraciones;
    private javax.swing.JButton botonClientes;
    private javax.swing.JButton botonConfiguracion;
    private javax.swing.JButton botonEliminarClientes;
    private javax.swing.JButton botonEliminarProducto;
    private javax.swing.JButton botonEliminarProveedores;
    private javax.swing.JButton botonExcelProducto;
    private javax.swing.JButton botonGuardarDatosConfiguraciones;
    private javax.swing.JButton botonGuardarTodoClientes;
    private javax.swing.JButton botonGuardarTodoProducto;
    private javax.swing.JButton botonGuardarTodoProveedores;
    private javax.swing.JButton botonImprimirNuevaVenta;
    private javax.swing.JButton botonNuevaVenta;
    private javax.swing.JButton botonNuevoClientes;
    private javax.swing.JButton botonNuevoProducto;
    private javax.swing.JButton botonNuevoProveedores;
    private javax.swing.JButton botonPdfVentas;
    private javax.swing.JButton botonProductos;
    private javax.swing.JButton botonProveedor;
    private javax.swing.JButton botonVentas;
    private javax.swing.JComboBox<String> boxProveedorProducto;
    private javax.swing.JLabel imgEncabezado;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labelCantidadNuevaVenta;
    private javax.swing.JLabel labelCantidadProducto;
    private javax.swing.JLabel labelCodigoNuevaVenta;
    private javax.swing.JLabel labelCodigoProducto;
    private javax.swing.JLabel labelDNIClientes;
    private javax.swing.JLabel labelDNINuevaVenta;
    private javax.swing.JLabel labelDescripcionNuevaVenta;
    private javax.swing.JLabel labelDescripcionProducto;
    private javax.swing.JLabel labelDireccionClientes;
    private javax.swing.JLabel labelDireccionConfiguraciones;
    private javax.swing.JLabel labelDireccionProveedores;
    private javax.swing.JLabel labelNombreClientes;
    private javax.swing.JLabel labelNombreConfiguraciones;
    private javax.swing.JLabel labelNombreNuevaVenta;
    private javax.swing.JLabel labelNombreProveedores;
    private javax.swing.JLabel labelPrecioNuevaVenta;
    private javax.swing.JLabel labelPrecioProducto;
    private javax.swing.JLabel labelProveedorProducto;
    private javax.swing.JLabel labelRUCConfiguraciones;
    private javax.swing.JLabel labelRUCProveedores;
    private javax.swing.JLabel labelStockNuevaVenta;
    private javax.swing.JLabel labelTelefonoClientes;
    private javax.swing.JLabel labelTelefonoConfiguraciones;
    private javax.swing.JLabel labelTelefonoProveedores;
    private javax.swing.JLabel labelTotalNuevaVenta;
    private javax.swing.JLabel labellDatosEmprezaConfiguraciones;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelConfiguraciones;
    private javax.swing.JPanel panelNuevaVenta;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JPanel panelProveedor;
    private javax.swing.JPanel panelVentas;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaNuevaVenta;
    private javax.swing.JTabbedPane tablaPrincipal;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtBuscarProveedor;
    private javax.swing.JTextField txtCantdadProducto;
    private javax.swing.JTextField txtCantidadNuevaVenta;
    private javax.swing.JTextField txtCodigoNuevaVenta;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDNIClientes;
    private javax.swing.JTextField txtDNINuevaVenta;
    private javax.swing.JTextField txtDescripccionProducto;
    private javax.swing.JTextField txtDescripcionNuevaVenta;
    private javax.swing.JTextField txtDireccionClientes;
    private javax.swing.JTextField txtDireccionConfiguraciones;
    private javax.swing.JTextField txtDireccionNuevaVenta;
    private javax.swing.JTextField txtDireccionProveedores;
    private javax.swing.JTextField txtNombreClientes;
    private javax.swing.JTextField txtNombreConfiguraciones;
    private javax.swing.JTextField txtNombreNuevaVenta;
    private javax.swing.JTextField txtNombreProveedores;
    private javax.swing.JTextField txtPrecioNuevaVenta;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtRUCConfiguraciones;
    private javax.swing.JTextField txtRucProveedores;
    private javax.swing.JTextField txtStockNuevaVenta;
    private javax.swing.JTextField txtTelefonoClientes;
    private javax.swing.JTextField txtTelefonoConfiguraciones;
    private javax.swing.JTextField txtTelefonoNuevaVenta;
    private javax.swing.JTextField txtTelefonoProveedores;
    // End of variables declaration//GEN-END:variables
// </editor-fold> 
}
