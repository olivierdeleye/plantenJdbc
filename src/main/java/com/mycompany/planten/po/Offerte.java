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
public class Offerte {
    
    private int lev_code;
    private String art_lev;
    private int art_code;
    private double lev_tijd;
    private double off_prijs;

    public Offerte(int lev_code, String art_lev, int art_code, double lev_tijd, double off_prijs) {
        this.lev_code = lev_code;
        this.art_lev = art_lev;
        this.art_code = art_code;
        this.lev_tijd = lev_tijd;
        this.off_prijs = off_prijs;
    }

    public Offerte() {
    }

    public int getLev_code() {
        return lev_code;
    }

    public void setLev_code(int lev_code) {
        this.lev_code = lev_code;
    }

    public String getArt_lev() {
        return art_lev;
    }

    public void setArt_lev(String art_lev) {
        this.art_lev = art_lev;
    }

    public int getArt_code() {
        return art_code;
    }

    public void setArt_code(int art_code) {
        this.art_code = art_code;
    }

    public double getLev_tijd() {
        return lev_tijd;
    }

    public void setLev_tijd(double lev_tijd) {
        this.lev_tijd = lev_tijd;
    }

    public double getOff_prijs() {
        return off_prijs;
    }

    public void setOff_prijs(double off_prijs) {
        this.off_prijs = off_prijs;
    }

    @Override
    public String toString() {
        return "Offerte{" + "lev_code=" + lev_code + ", art_lev=" + art_lev + ", art_code=" + art_code + ", lev_tijd=" + lev_tijd + ", off_prijs=" + off_prijs + '}';
    }
    
    
    
    
    
}
