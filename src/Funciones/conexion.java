/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {

   public String db = Controlador.FRMPRINCIPAL.DB;
    public String url = "jdbc:mysql://" + Controlador.FRMPRINCIPAL.HOST +"/" + Controlador.FRMPRINCIPAL.DB;
    public String user = Controlador.FRMPRINCIPAL.USER;
    public String pass = Controlador.FRMPRINCIPAL.PASS;

    public conexion() {
    }

    public Connection conectar() {
        Connection link = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);

        }

        return link;
    }

}
