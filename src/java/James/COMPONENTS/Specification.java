/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivate default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package James.COMPONENTS;

/**
 *
 * @author mosesjames
 */
public class Specification {
    private  String Designation;
    private double Diameter;
    private double Mass;
    private double Density;
    private double Inclination;
    private double Rotation;

    public Specification(String Designation, double Diameter, double Mass, double Density, double Inclination, double Rotation) {
        this.Designation = Designation;
        this.Diameter = Diameter;
        this.Mass = Mass;
        this.Density = Density;
        this.Inclination = Inclination;
        this.Rotation = Rotation;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public double getDiameter() {
        return Diameter;
    }

    public void setDiameter(double Diameter) {
        this.Diameter = Diameter;
    }

    public double getMass() {
        return Mass;
    }

    public void setMass(double Mass) {
        this.Mass = Mass;
    }

    public double getDensity() {
        return Density;
    }

    public void setDensity(double Density) {
        this.Density = Density;
    }

    public double getInclination() {
        return Inclination;
    }

    public void setInclination(double Inclination) {
        this.Inclination = Inclination;
    }

    public double getRotation() {
        return Rotation;
    }

    public void setRotation(double Rotation) {
        this.Rotation = Rotation;
    }

    @Override
    public String toString() {
        return "<br>"+
                " Diameter: " + Diameter + " | "+
                " Mass: " + Mass + " | "+
                " Density: " + Density + " | "+
                " Inclination: " + Inclination + " | "+
                " Rotation: " + Rotation ;
    }
    
    
    
}
