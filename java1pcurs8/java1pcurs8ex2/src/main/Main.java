package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/java1pcurs8";
        String username = "root";
        String password = "";
        
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();
            String sql = "select * from produse";
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                int idProdus = rs.getInt(1);
                String denumire = rs.getString("denumire");
                double pret = rs.getDouble("pret");
                int stoc = rs.getInt("stoc");
                System.out.println(idProdus + " / " + denumire + " / " + 
                                    pret + " / " + stoc);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                con.close();
            } catch(Exception e) {
            
            }
        }
    } 
}
