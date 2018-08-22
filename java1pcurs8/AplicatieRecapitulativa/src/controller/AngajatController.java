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
import java.util.ArrayList;
import java.util.List;
import model.Angajat;

/**
 *
 * @author student
 */
public class AngajatController {
    private Connection con;
    
    public AngajatController() throws SQLException {
        String url = "jdbc:mysql://localhost/java1pcurs8";
        String username = "root";
        String password = "";
        con = DriverManager.getConnection(url, username, password);
    }
    
    public void adaugaAngajat(Angajat angajat) {
        try {
            String sql = "insert into angajati values (null, ?, ?, ?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, angajat.getNume());
            stmt.setString(2, angajat.getAdresa());
            stmt.setDouble(3, angajat.getSalariu());
            
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public List<Angajat> gasesteAngajati() {
        List<Angajat> lista = new ArrayList<>();
        try {            
            String sql = "select * from angajati";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                String name = rs.getString("nume");
                String address = rs.getString("adresa");
                double salary = rs.getDouble("salariu");
                lista.add(new Angajat(name, address, salary));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
}
