/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.planten.rowmapper;

import com.mycompany.planten.po.Offerte;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javafx.scene.input.KeyCode.O;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author od
 */
public class OfferteRowMapper implements RowMapper<Object>{

    @Override
    public Object mapRow(ResultSet rs, int i) throws SQLException {
        Offerte offerte = new Offerte();
        offerte.setLev_code(rs.getInt(1));
        offerte.setArt_lev(rs.getString(2));
        offerte.setArt_code(rs.getInt(3));
        offerte.setLev_tijd(rs.getDouble(4));
        offerte.setOff_prijs(rs.getDouble(5));
        
        return offerte;
    }
    
}
