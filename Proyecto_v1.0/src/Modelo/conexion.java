package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    Connection conn = null;

    public Connection getConnection() {

        try {
            /*String myBD = "jdbc:mysql://localhost/usuarios?";

            conn = DriverManager.getConnection(myBD, "root", "");*/
            conn
                    = DriverManager.getConnection("jdbc:mysql://localhost/proyecto?"
                            + "user=root&password=");
            
            return conn;

        } catch (SQLException ex) {

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return null;
    }
}
