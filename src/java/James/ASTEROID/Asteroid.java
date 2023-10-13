/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package James.ASTEROID;

import James.COMPONENTS.*;
import James.MATERIALS.*;

/**
 *
 * @author mosesjames
 */
public abstract class Asteroid {
    
            private String Designation;
            private Registry registry;
            private SpatialCoord location;
            private Specification specs;
            private Orbit orbit;
            private CommonComposition cComp;
            private PreciousComposition pComp;
            private SimpleComposition sComp;
            private StrategicComposition stComp;
    
            public Asteroid(){
                
            }

    public Asteroid(String Designation, Registry registry, SpatialCoord location, Specification specs, Orbit orbit, CommonComposition cComp, PreciousComposition pComp, SimpleComposition sComp, StrategicComposition stComp) {
        this.Designation = Designation;
        this.registry = registry;
        this.location = location;
        this.specs = specs;
        this.orbit = orbit;
        this.cComp = cComp;
        this.pComp = pComp;
        this.sComp = sComp;
        this.stComp = stComp;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public Registry getRegistry() {
        return registry;
    }

    public void setRegistry(Registry registry) {
        this.registry = registry;
    }

    public SpatialCoord getLocation() {
        return location;
    }

    public void setLocation(SpatialCoord location) {
        this.location = location;
    }

    public Specification getSpecs() {
        return specs;
    }

    public void setSpecs(Specification specs) {
        this.specs = specs;
    }

    public Orbit getOrbit() {
        return orbit;
    }

    public void setOrbit(Orbit orbit) {
        this.orbit = orbit;
    }

    public CommonComposition getcComp() {
        return cComp;
    }

    public void setcComp(CommonComposition cComp) {
        this.cComp = cComp;
    }

    public PreciousComposition getpComp() {
        return pComp;
    }

    public void setpComp(PreciousComposition pComp) {
        this.pComp = pComp;
    }

    public SimpleComposition getsComp() {
        return sComp;
    }

    public void setsComp(SimpleComposition sComp) {
        this.sComp = sComp;
    }

    public StrategicComposition getStComp() {
        return stComp;
    }

    public void setStComp(StrategicComposition stComp) {
        this.stComp = stComp;
    }

    @Override
    public String toString() {
        return "<h3>" +"<br>"+"</br>"
                +" Designation: " + Designation + "<br>"+"</br>"+
                " Registry " + registry + "<br>"+"</br>"+
                " Location: " + location + "<br>"+"</br>"+
                " Specs " + specs + "<br>"+"</br>"+
                " Orbit: " + orbit + "<br>"+"</br>"+
                " Common Composition: " + cComp + "<br>"+"</br>"+
                " Precious Composition: " + pComp + "<br>"+"</br>"+
                " Simple Composition: " + sComp + "<br>"+"</br>"+
                " Strategic Composition: " + stComp + "</h3>";
    }
            
            
                    
}
