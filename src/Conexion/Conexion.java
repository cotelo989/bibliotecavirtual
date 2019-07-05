/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Menu.Menu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class Conexion {
    
    private Connection conn;
    
    public Conexion() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=convertToNull", "root", "");
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getCon() {
        return conn;
    }

    public void setCon(Connection con) {
        this.conn = con;
    }
    
    public void cerrarconexion(){
        try {
            this.conn.close();
            this.conn = null;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Object getcnn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
