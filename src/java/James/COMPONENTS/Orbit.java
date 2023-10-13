/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package James.COMPONENTS;

/**
 *
 * @author mosesjames
 */
public class Orbit {
                private String Designation;
                private double Aphelion;
                private double Perihelion;
                private double Eccentricity;
                private double PeriodOrbit;
                private double RadiusOrbit;

    public Orbit(String Designation, double Aphelion, double Perihelion, double Eccentricity, double PeriodOrbit, double RadiusOrbit) {
        this.Designation = Designation;
        this.Aphelion = Aphelion;
        this.Perihelion = Perihelion;
        this.Eccentricity = Eccentricity;
        this.PeriodOrbit = PeriodOrbit;
        this.RadiusOrbit = RadiusOrbit;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public double getAphelion() {
        return Aphelion;
    }

    public void setAphelion(double Aphelion) {
        this.Aphelion = Aphelion;
    }

    public double getPerihelion() {
        return Perihelion;
    }

    public void setPerihelion(double Perihelion) {
        this.Perihelion = Perihelion;
    }

    public double getEccentricity() {
        return Eccentricity;
    }

    public void setEccentricity(double Eccentricity) {
        this.Eccentricity = Eccentricity;
    }

    public double getPeriodOrbit() {
        return PeriodOrbit;
    }

    public void setPeriodOrbit(double PeriodOrbit) {
        this.PeriodOrbit = PeriodOrbit;
    }

    public double getRadiusOrbit() {
        return RadiusOrbit;
    }

    public void setRadiusOrbit(double RadiusOrbit) {
        this.RadiusOrbit = RadiusOrbit;
    }

    @Override
    public String toString() {
        return "<br>"+
                " Aphelion: " + Aphelion + " | "+
                " Perihelion: " + Perihelion + " | "+
                " Eccentricity: " + Eccentricity + " | "+
                " PeriodOrbit: " + PeriodOrbit + " | "+
                " RadiusOrbit: " + RadiusOrbit ;
    }
                
                
                
}
