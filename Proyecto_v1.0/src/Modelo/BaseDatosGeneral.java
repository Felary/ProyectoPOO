package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class BaseDatosGeneral {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    Statement st;
    Conexion cn = new Conexion();

    public void RegistrarProducto(Producto nuevoProducto) {
        String sql = "INSERT INTO productos (codigo, descripcion, cantidad, precio, proveedor) VALUES (?,?,?,?,?)";
        try {
            conn = cn.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, nuevoProducto.getCodigo());
            ps.setString(2, nuevoProducto.getDescripcion());
            ps.setString(3, String.valueOf(nuevoProducto.getCantidad()));
            ps.setString(4, String.valueOf(nuevoProducto.getPrecio()));
            ps.setString(5, nuevoProducto.getProveedor());
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "ERROR", 0);            
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString(), "ERROR", 0);
            }
        }
    }
    
    public boolean modificarProveedor(Proveedor nuevoProveedor){
        try {
            conn = cn.getConnection();
            ps = conn.prepareStatement("UPDATE productos set ruc=?,nombre=?,telefono=?,direccion=?");
            ps.setString(1, nuevoProveedor.getRuc());
            ps.setString(2, nuevoProveedor.getNombre());
            ps.setString(3, nuevoProveedor.getTelefono());
            ps.setString(4, nuevoProveedor.getDireccion());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "ERROR", 0);   
            return false;
        }      
    }
    
    public boolean modificarProducto(Producto nuevoProducto){
        
        try {
            conn = cn.getConnection();
            ps = conn.prepareStatement("UPDATE productos set codigo=?,descripcion=?,cantidad=?,precio=?,proveedor=? ");
            ps.setString(1, nuevoProducto.getCodigo());
            ps.setString(2, nuevoProducto.getDescripcion());
            ps.setString(3, String.valueOf(nuevoProducto.getCantidad()));
            ps.setString(4, String.valueOf(nuevoProducto.getPrecio()));
            ps.setString(5, nuevoProducto.getProveedor());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "ERROR", 0);   
            return false;
        }        
    }

    public boolean validarNuevoProducto(String codigo) {
        try {
            conn = cn.getConnection();
            ps = conn.prepareStatement("SELECT * FROM productos WHERE codigo = ?");
            ps.setString(1, codigo);

            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            return false;
        }
        return false;
    }

    public boolean RegistrarProveedor(Proveedor nuevoProveedor) {
        String sql = "INSERT INTO proveedores (ruc, nombre, telefono, direccion) VALUES (?,?,?,?)";
        try {
            conn = cn.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, nuevoProveedor.getRuc());
            ps.setString(2, nuevoProveedor.getNombre());
            ps.setString(3, nuevoProveedor.getTelefono());
            ps.setString(4, nuevoProveedor.getDireccion());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "ERROR", 0);
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString(), "ERROR", 0);
            }
        }
    }

    public boolean validarNuevoProveedor(String ruc) {
        try {
            conn = cn.getConnection();
            ps = conn.prepareStatement("SELECT * FROM proveedores WHERE ruc = ?");
            ps.setString(1, ruc);

            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            return false;
        }
        return false;
    }

    
}
