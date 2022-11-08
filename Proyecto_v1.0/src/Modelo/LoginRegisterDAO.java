package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginRegisterDAO {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    public Usuario logear(String nombre, String password) {
        Usuario log = new Usuario();
        String sql = "SELECT * FROM usuarios WHERE Nombre = ? AND Password = ?";
        try {
            conn = cn.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                log.setNombre(rs.getString("nombre"));
                log.setContraseña(rs.getString("password"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, toString(), "ERROR", 0);
        }
        return log;
    }

    public boolean registrarUsuarios(Usuario nuevoUsuario) {
        String sql = "INSERT INTO usuarios (nombre, password) VALUES (?,?)";
        try {
            conn = cn.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, nuevoUsuario.getNombre());
            ps.setString(2, nuevoUsuario.getContraseña());
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

    public boolean validarNuevoUsuario(String nombre) {
        try {
            conn = cn.getConnection();
            ps = conn.prepareStatement("SELECT * FROM usuarios WHERE nombre = ?");
            ps.setString(1, nombre);

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
