/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.planten.dao;

import com.mycompany.planten.po.Plant;
import com.mycompany.planten.po.PlantRowMapper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

/**
 *
 * @author od
 */
public class PlantDao {
    private JdbcTemplate jdbcTemplate;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    
    public int savePlant(Plant p){  
        String query="insert into planten values('"+p.getArt_code()+"','"+p.getPlantennm()+"','"+p.getSoort()+"','"+p.getKleur()+"','"+p.getHoogte()+
                     "','"+p.getBl_b()+"','"+p.getBl_e()+"','"+p.getPrijs()+"') ";  
        return jdbcTemplate.update(query);  
    }  
    public int updatePlant(Plant p){  
            String query="insert into planten values('"+p.getArt_code()+"','"+p.getPlantennm()+"','"+p.getSoort()+"','"+p.getKleur()+"','"+p.getHoogte()+
                         "','"+p.getBl_b()+"','"+p.getBl_e()+"','"+p.getPrijs()+"') "; 
            return jdbcTemplate.update(query);  
    }  
    public int deletePlant(Plant p){  
            String query="delete from planten where ART_CODE='"+p.getArt_code()+"' ";  
            return jdbcTemplate.update(query);  
    }
    
    /**
     * Voorbeeld PreparedStatement met JdbcTemplate
     * @param p
     * @return 
     */
    public Boolean savePlantByPreparedStatement(final Plant p){
        String query = "insert into planten values(?,?,?,?,?,?,?,?)";
        return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>(){
            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                     
                ps.setInt(1, p.getArt_code());
                ps.setString(2, p.getPlantennm());
                ps.setString(3, p.getSoort());
                ps.setString(4, p.getKleur());
                ps.setInt(5, p.getHoogte());
                ps.setInt(6, p.getBl_b());
                ps.setInt(7, p.getBl_e());
                ps.setDouble(8, p.getPrijs());
                return ps.execute();
            }
        });
      
    };
    
    
    /**
     * Voorbeelden met eigen RowMapper 
     * @param art_code
     * @return plant Object
     */
    
    // Een enkele record: queryForObject() method
    public Plant findByPlantArt_code(int art_code){

	String sql = "SELECT * FROM planten WHERE ART_CODE = ?";

	Plant plant = (Plant)jdbcTemplate.queryForObject(sql, new Object[] { art_code }, new PlantRowMapper());

	return plant;
    }
    
    // Lijst van alle planten
    // RowMapper is not supported in queryForList() method :-((( -> map it manually
    public List<Plant> findAll(){

	String sql = "SELECT * FROM planten";

	return jdbcTemplate.query(sql, new ResultSetExtractor<List<Plant>>(){
            
             
            @Override
            public List<Plant> extractData(ResultSet rs) throws SQLException, DataAccessException {
               List <Plant> planten = new ArrayList<>();
               while(rs.next()) {
                    Plant plant = new Plant();
                    plant.setArt_code(rs.getInt(1));
                    plant.setPlantennm(rs.getString(2));
                    plant.setSoort(rs.getString(3));
                    plant.setKleur(rs.getString(4));
                    plant.setHoogte(rs.getInt(5));
                    plant.setBl_b(rs.getInt(6));
                    plant.setBl_e(rs.getInt(7));
                    plant.setPrijs(rs.getDouble(8));
                    planten.add(plant);
                } 
               return planten;
            };
        });
    }
    
    //#############################################################################################################################################################
    /**
     * BeanPropertyRowMapper (SIMPLEST SOLUTION !!!)
     * Voorbeeld met BeanPropertyRowMapper 
     * In Spring 2.5, comes with a handy RowMapper implementation called ‘BeanPropertyRowMapper’, which can maps a row’s column value to a property by matching their names. 
     * Just make sure both the property and column has the same name, e.g property ‘Art_code’ will match to column ‘ART_CODE’.
     * @param art_code
     * @return plant Object
     */
    
    // Een enkele record : queryForObject() method
    public Plant findPlantByArt_code2(int art_code){
        
        String sql = "SELECT * FROM planten WHERE ART_CODE = ?";
        
        Plant plant = (Plant)jdbcTemplate.queryForObject(sql, new Object [] {art_code}, new BeanPropertyRowMapper(Plant.class));
        
        return plant;
    }
    
    // Lijst van alle planten: query
    public List<Plant> findAll2(){
        
        String query = "SELECT * FROM planten";
        
        List <Plant> planten = jdbcTemplate.query(query, new BeanPropertyRowMapper(Plant.class));
        
        return planten;      
    }
    
    
    
    
    
    
}
