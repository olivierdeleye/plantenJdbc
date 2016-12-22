/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.planten.rowmapper;

import com.mycompany.planten.po.Leverancier;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author od
 */
public class LeverancierRowMapper implements RowMapper<Object>{

    @Override
    public Object mapRow(ResultSet rs, int i) throws SQLException {
        Leverancier leverancier = new Leverancier();
        leverancier.setLev_code(rs.getInt(1));
        leverancier.setLev_naam(rs.getString(2));
        leverancier.setAdres(rs.getString(3));
        leverancier.setWoonpl(rs.getString(4));
        
        return leverancier;
    }
    
    
}
