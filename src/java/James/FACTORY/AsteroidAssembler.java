/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package James.FACTORY;

import James.COMPONENTS.*;
import James.DBSPT.DBConnect;
import James.ENUMS.*;
import James.MATERIALS.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mosesjames
 */
public class AsteroidAssembler {
    
   
    public static Orbit buildOrbit(String D) throws SQLException, ClassNotFoundException{
       
             DBConnect DB = new DBConnect("asteroids","3306","root","%G0d5peed");
        try (Connection C = DB.getConnection()) {
            DB.executeUseQuery(C);
            String query = "Select * from orbit where Designation = '" + D + "'";
            ResultSet rs = DB.executeSelectQuery(query, C);
           double AP = 0;  
           double PE = 0; 
           double EC = 0; 
           double PO = 0; 
           double RO = 0;
            while(rs.next()){
                AP = rs.getDouble("Aphelion");
                PE = rs.getDouble("Perihelion");
                EC = rs.getDouble("Eccentricity");
                PO = rs.getDouble("Period_Orbit"); 
                RO = rs.getDouble("Radius_Orbit"); 
                       
            }
            C.close();
            Orbit O = new Orbit(D,AP,PE,EC,PO,RO);
              return O;
        }
    }
    
public static Registry  buildRegistry(String D) throws SQLException, ClassNotFoundException{
    DBConnect DB = new DBConnect("asteroids","3306","root","%G0d5peed");
       Connection C = DB.getConnection();
            DB.executeUseQuery(C);
            String query = "Select * from registry where Designation = '" + D + "'";
            ResultSet rs = DB.executeSelectQuery(query, C);
            String AT = "";
            String CT = "";
            String DA = "";
            
            AType t = null;
            Country c = null;
            while(rs.next()){
                AT = rs.getString("Atype");
                CT = rs.getString("Country");    
                DA = rs.getString("DDate");    
            }
            C.close();
            
            if(AT.equals("Carboneous")){
                t = AType.Carboneous;   
            }
            if(AT.equals("Metallic")){
                t = AType.Metallic;   
            }
            if(AT.equals("Silicaceous")){
                t = AType.Silicaceous;   
            }
           
            if(CT.equals("US")){
                c = Country.US;   
            }
            if(CT.equals("UK")){
                c = Country.UK; 
            }
            if(CT.equals("RUSSIA")){
               c = Country.RUSSIA ; 
            }
            if(CT.equals("CHINA")){
               c = Country.CHINA;  
            }
            Registry R = new Registry(D,t,c,DA);
        return R;
    
}
public static SpatialCoord buildSpatialCoord(String D) throws SQLException, ClassNotFoundException{
    DBConnect DB = new DBConnect("asteroids","3306","root","%G0d5peed");
       Connection C = DB.getConnection();
            DB.executeUseQuery(C);
            String query = "Select * from SpatialCoord where Designation = '" + D + "'";
            ResultSet rs = DB.executeSelectQuery(query, C);
            double x = 0;
           double y = 0;
           double z = 0;
           
            while(rs.next()){
                x = rs.getDouble("X");
                
                y = rs.getDouble("Y");    
                z = rs.getDouble("Z");    
            }
            C.close();
            SpatialCoord scoord = new SpatialCoord(D,x,y,z);
    
        return scoord;
    
}
public static Specification buildSpecification(String D) throws SQLException, ClassNotFoundException{
    DBConnect DB = new DBConnect("asteroids","3306","root","%G0d5peed");
       Connection C = DB.getConnection();
            DB.executeUseQuery(C);
            String query = "Select * from specifications where Designation = '" + D + "'";
            ResultSet rs = DB.executeSelectQuery(query, C);
            double DI = 0;
           double M = 0;
           double DE = 0;
           double IN = 0;
           double RO = 0; 
            while(rs.next()){
                DI = rs.getDouble("Diameter");
                M = rs.getDouble("Mass");    
                DE = rs.getDouble("Density");  
                IN = rs.getDouble("Inclination");  
                RO = rs.getDouble("Rotation");  
            }
            C.close();
            Specification SP = new Specification(D,DI,M,DE,IN,RO);
            return SP;
   

}
        

public static  SimpleComposition buildSimpleComposition(String D) throws SQLException, ClassNotFoundException{
        
        DBConnect DB = new DBConnect("asteroids","3306","root","%G0d5peed");
        try (Connection C = DB.getConnection()) {
            DB.executeUseQuery(C);
            
            String query = "Select * from composition_simple where Designation = '" + D + "'";
            ResultSet rs = DB.executeSelectQuery(query, C);
            double R = 0;
           double M = 0;
            while(rs.next()){
                R = rs.getDouble("Content_Rock");
                M = rs.getDouble("Content_Metal");    
            }
            C.close();
            SimpleComposition SC = new SimpleComposition(D,R,M);
             return SC;
        }

       
      
    
    
}
public static CommonComposition buildCommonComposition(String D) throws SQLException, ClassNotFoundException{
    
     DBConnect DB = new DBConnect("asteroids","3306","root","%G0d5peed");
        try (Connection C = DB.getConnection()) {
            DB.executeUseQuery(C);
            
            String query = "Select * from composition_common where Designation = '" + D + "'";
            ResultSet rs = DB.executeSelectQuery(query, C);
            double N = 0;
           double M = 0;
           double I = 0;
           double Z = 0;
            while(rs.next()){
                N = rs.getDouble("Nickel");
                M = rs.getDouble("Molybdenum");
                I = rs.getDouble("Iron");
                Z = rs.getDouble("Zinc");      
            }
            C.close();
            CommonComposition CC = new CommonComposition(D,N,M,I,Z);
            return CC;
        }
        
    
}
        
    public static PreciousComposition buildPreciousComposition(String D) throws SQLException, ClassNotFoundException{
        
         DBConnect DB = new DBConnect("asteroids","3306","root","%G0d5peed");
        try (Connection C = DB.getConnection()) {
            DB.executeUseQuery(C);
            
            String query = "Select * from composition_precious where Designation = '" + D + "'";
            ResultSet rs = DB.executeSelectQuery(query, C);
           double G = 0;  double S = 0;
           double PL = 0; double PA = 0;
           double RH = 0; double RU = 0;
           double IR = 0; double OS = 0;
            while(rs.next()){
                G = rs.getDouble("Gold");
                S = rs.getDouble("Silver");
                PL = rs.getDouble("Platinum");
                PA = rs.getDouble("Palladium"); 
                RH = rs.getDouble("Rhodium"); 
                RU = rs.getDouble("Ruthenium"); 
                IR = rs.getDouble("Iridium"); 
                OS = rs.getDouble("Osmium");        
            }
            C.close();
            PreciousComposition PC = new PreciousComposition(D,G,S,PL,PA,RH,RU,IR,OS); 
        return PC;
        } 
}
    
    
public static StrategicComposition buildStrategicComposition(String D) throws SQLException, ClassNotFoundException{
    DBConnect DB = new DBConnect("asteroids","3306","root","%G0d5peed");
        try (Connection C = DB.getConnection()) {
            DB.executeUseQuery(C);
            
            String query = "Select * from composition_strategic where Designation = '" + D + "'";
            ResultSet rs = DB.executeSelectQuery(query, C);
           double CH = 0;  
           double CO = 0; 
           double TU = 0; 
           double UR = 0; 
           
            while(rs.next()){
                CH = rs.getDouble("Chromium");
                CO = rs.getDouble("Cobalt");
                TU = rs.getDouble("Tungsten");
                UR = rs.getDouble("Uranium"); 
                       
            }
            C.close();
            StrategicComposition SCO = new StrategicComposition(D,CH,CO,TU,UR);
        return SCO;
    
}
}   
}
