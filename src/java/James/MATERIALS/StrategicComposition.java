/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivate default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package James.MATERIALS;

/**
 *
 * @author mosesjames
 */
public class StrategicComposition {
    private String Designation;
    private double Chromium;
    private double Cobalt;
    private double Tungsten;
    private double Uranium;

    public StrategicComposition(String Designation, double Chromium, double Cobalt, double Tungsten, double Uranium) {
        this.Designation = Designation;
        this.Chromium = Chromium;
        this.Cobalt = Cobalt;
        this.Tungsten = Tungsten;
        this.Uranium = Uranium;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public double getChromium() {
        return Chromium;
    }

    public void setChromium(double Chromium) {
        this.Chromium = Chromium;
    }

    public double getCobalt() {
        return Cobalt;
    }

    public void setCobalt(double Cobalt) {
        this.Cobalt = Cobalt;
    }

    public double getTungsten() {
        return Tungsten;
    }

    public void setTungsten(double Tungsten) {
        this.Tungsten = Tungsten;
    }

    public double getUranium() {
        return Uranium;
    }

    public void setUranium(double Uranium) {
        this.Uranium = Uranium;
    }

    @Override
    public String toString() {
        return "<br>"+ 
                " Chromium: " + Chromium + " | "+
                " Cobalt: " + Cobalt + " | "+
                " Tungsten: " + Tungsten + " | "+
                " Uranium: " + Uranium  ;
    }
    
    
    
    
}
