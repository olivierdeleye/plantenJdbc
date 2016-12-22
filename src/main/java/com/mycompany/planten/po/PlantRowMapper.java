/*
 * Class PlantRowMapper to map database record to Plant Object.
 */
package com.mycompany.planten.po;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author od
 */
public class PlantRowMapper implements RowMapper{
    
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Plant plant = new Plant();
        plant.setArt_code(rs.getInt(1));
        plant.setPlantennm(rs.getString(2));
        plant.setSoort(rs.getString(3));
        plant.setKleur(rs.getString(4));
        plant.setHoogte(rs.getInt(5));
        plant.setBl_b(rs.getInt(6));
        plant.setBl_e(rs.getInt(7));
        plant.setPrijs(rs.getDouble(8));
        
        return plant;
    }
    
}
