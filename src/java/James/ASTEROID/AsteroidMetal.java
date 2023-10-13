/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package James.ASTEROID;

import James.FACTORY.AsteroidAssembler;
import java.sql.SQLException;

/**
 *
 * @author mosesjames
 */
public class AsteroidMetal extends Asteroid {

    public AsteroidMetal(String Designation) throws SQLException, ClassNotFoundException {
        super.setDesignation(Designation);
        super.setRegistry(AsteroidAssembler.buildRegistry(Designation));
        super.setLocation(AsteroidAssembler.buildSpatialCoord(Designation));
        super.setSpecs(AsteroidAssembler.buildSpecification(Designation));
        super.setOrbit(AsteroidAssembler.buildOrbit(Designation));
        super.setcComp(AsteroidAssembler.buildCommonComposition(Designation));
        super.setpComp(AsteroidAssembler.buildPreciousComposition(Designation));
        super.setsComp(AsteroidAssembler.buildSimpleComposition(Designation));
        super.setStComp(AsteroidAssembler.buildStrategicComposition(Designation));
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
    
}
