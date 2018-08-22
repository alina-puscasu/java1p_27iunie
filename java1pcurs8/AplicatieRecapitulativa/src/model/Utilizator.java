/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author student
 */
public class Utilizator implements java.io.Serializable {
    private int idUtilizator;
    private String username;
    private String password;

    public Utilizator() {
    }

    public Utilizator(int idUtilizator, String username, String password) {
        this.idUtilizator = idUtilizator;
        this.username = username;
        this.password = password;
    }

    public Utilizator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getIdUtilizator() {
        return idUtilizator;
    }

    public void setIdUtilizator(int idUtilizator) {
        this.idUtilizator = idUtilizator;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return username;
    } 
}
