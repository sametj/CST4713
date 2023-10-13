/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package James.ASTEROID;

import James.FACTORY.*;
import java.sql.SQLException;

/**
 *
 * @author mosesjames
 */
public class AsteroidCarbon extends Asteroid {
    /*
    
            private String Designation;
            private Registry registry;
            private SpatialCoord location;
            private Specification specs;
            private Orbit orbit;
            private CommonComposition cComp;
            private PreciousComposition pComp;
            private SimpleComposition sComp;
            private StrategicComposition stComp;
    */

    public AsteroidCarbon(String Designation) throws SQLException, ClassNotFoundException {
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
