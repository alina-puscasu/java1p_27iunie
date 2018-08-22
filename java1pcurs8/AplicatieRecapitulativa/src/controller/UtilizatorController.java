/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Utilizator;

/**
 *
 * @author student
 */
public class UtilizatorController {
    private Connection con;
    
    public UtilizatorController() throws SQLException {
        String url = "jdbc:mysql://localhost/java1pcurs8";
        String username = "root";
        String password = "";
        con = DriverManager.getConnection(url, username, password);
    }
    
    public void adaugaUtilizator(Utilizator utilizator) {
        try {
            String sql = "insert into utilizatori values (null, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, utilizator.getUsername());
            stmt.setString(2, utilizator.getPassword());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean verificaUtilizator(Utilizator utilizator) {
        try {
            String sql = "select id_utilizator from utilizatori " +
                         " where username = ? " +
                         " and password = ? ";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, utilizator.getUsername());
            stmt.setString(2, utilizator.getPassword());
            ResultSet rs = stmt.executeQuery();
            if(rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
