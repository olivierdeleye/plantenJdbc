/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.planten.po;

import java.io.Serializable;

/**
 *
 * @author od
 */
public class Plant implements Serializable{

    private int art_code;
    private String plantennm;
    private String soort;
    private String kleur;
    private int hoogte;
    private int bl_b;
    private int bl_e;
    private double prijs;
    
    public Plant() {
    }

    public Plant(int art_code, String plantennm, String soort, String kleur, int hoogte, int bloeibegin, int bloeieind, double prijs) {
        this.art_code = art_code;
        this.plantennm = plantennm;
        this.soort = soort;
        this.kleur = kleur;
        this.hoogte = hoogte;
        this.bl_b = bloeibegin;
        this.bl_e = bloeieind;
        this.prijs = prijs;
    }
   
    public int getArt_code() {
        return art_code;
    }

    public void setArt_code(int art_code) {
        this.art_code = art_code;
    }

    public String getPlantennm() {
        return plantennm;
    }

    public void setPlantennm(String plantennm) {
        this.plantennm = plantennm;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public int getHoogte() {
        return hoogte;
    }

    public void setHoogte(int hoogte) {
        this.hoogte = hoogte;
    }

    public int getBl_b() {
        return bl_b;
    }

    public void setBl_b(int bl_b) {
        this.bl_b = bl_b;
    }

    public int getBl_e() {
        return bl_e;
    }

    public void setBl_e(int bl_e) {
        this.bl_e = bl_e;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.art_code;
        hash = 79 * hash + (this.plantennm != null ? this.plantennm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Plant other = (Plant) obj;
        if (this.art_code != other.art_code) {
            return false;
        }
        return !((this.plantennm == null) ? (other.plantennm != null) : !this.plantennm.equals(other.plantennm));
    }

    @Override
    public String toString() {
        return "Plant: art_code=" + art_code + ", plantennaam=" + plantennm + ", soort=" + soort + ", kleur=" + kleur + ", hoogte=" + hoogte + ", bloeibegin=" + bl_b + ", bloeieind=" + bl_e + ", prijs=" + prijs;
    }
    
  
}
