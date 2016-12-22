package com.mycompany.planten.main;

import com.mycompany.planten.dao.PlantDao;
import com.mycompany.planten.po.Plant;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class JdbcTemplateTest 
{
     
    
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  
      
        PlantDao dao=(PlantDao)ctx.getBean("plantdao"); 
        Plant p = new Plant();
        
        // Voorbeelden queries vanuit PlantDao
        
        // voorbeeld simple CRUD 
//        int status=dao.savePlant(new Plant(888,"OLIVIER","BOOM","OLIJFGROEN",6,5,9,1500));
//        p.setArt_code(888);
//        int status = dao.deletePlant(p);
//         voorbeeld PreparedStatement
//        boolean status = dao.savePlantByPreparedStatement(new Plant(450,"ESDOORN","BOOM","ROOD",6,6,10,75.50));       
//        System.out.println(status); 
        
        //Alle planten met eigen mapping
//        List <Plant> planten = dao.findAll();
//        for(Plant pl : planten){
//            System.out.println(pl.toString());
//            System.out.println("===============================================================================================================");
//        }
        
        //Alle planten met BeanPropertyRowMapper
//        List <Plant> planten = dao.findAll2();
//        for(Plant pl : planten){
//            System.out.println(pl.toString());
//            System.out.println("=====================================================================================================================");
//        }

        //Een record met BeanPropertyRowMapper
        Plant plant = new Plant();
        plant = dao.findPlantByArt_code2(263);
        System.out.println(plant.toString());
        
        
 
    }
      
}
        
       
       

