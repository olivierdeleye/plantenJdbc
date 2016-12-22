/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.planten.po;

/**
 *
 * @author od
 */
public class Leverancier {
    
    private int lev_code;
    private String lev_naam;
    private String adres;
    private String woonpl;

    public Leverancier(int lev_code, String lev_naam, String adres, String woonpl) {
        this.lev_code = lev_code;
        this.lev_naam = lev_naam;
        this.adres = adres;
        this.woonpl = woonpl;
    }

    public Leverancier() {
    }

    public int getLev_code() {
        return lev_code;
    }

    public void setLev_code(int lev_code) {
        this.lev_code = lev_code;
    }

    public String getLev_naam() {
        return lev_naam;
    }

    public void setLev_naam(String lev_naam) {
        this.lev_naam = lev_naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getWoonpl() {
        return woonpl;
    }

    public void setWoonpl(String woonpl) {
        this.woonpl = woonpl;
    }

    @Override
    public String toString() {
        return "Leverancier{" + "lev_code=" + lev_code + ", lev_naam=" + lev_naam + ", adres=" + adres + ", woonpl=" + woonpl + '}';
    }   
    
}
