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
public class Angajat {
    private int idAngajat;
    private String nume;
    private String adresa;
    private double salariu;

    public Angajat() {
    }

    public Angajat(String nume, String adresa, double salariu) {
        this.nume = nume;
        this.adresa = adresa;
        this.salariu = salariu;
    }

    public Angajat(int idAngajat, String nume, String adresa, double salariu) {
        this.idAngajat = idAngajat;
        this.nume = nume;
        this.adresa = adresa;
        this.salariu = salariu;
    }

    public int getIdAngajat() {
        return idAngajat;
    }

    public void setIdAngajat(int idAngajat) {
        this.idAngajat = idAngajat;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return nume + " / " + adresa + " / " + salariu;
    } 
}
