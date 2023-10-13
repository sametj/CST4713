/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivate default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package James.MATERIALS;

/**
 *
 * @author mosesjames
 */
public class PreciousComposition {
        private String Designation;
        private double Gold;
        private double Silver;
        private double Platinum;
        private double Palladium;
        private double Rhodium;
        private double Ruthenium;
        private double Iridium;
        private double Osmium;

    public PreciousComposition(String Designation, double Gold, double Silver, double Platinum, double Palladium, double Rhodium, double Ruthenium, double Iridium, double Osmium) {
        this.Designation = Designation;
        this.Gold = Gold;
        this.Silver = Silver;
        this.Platinum = Platinum;
        this.Palladium = Palladium;
        this.Rhodium = Rhodium;
        this.Ruthenium = Ruthenium;
        this.Iridium = Iridium;
        this.Osmium = Osmium;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public double getGold() {
        return Gold;
    }

    public void setGold(double Gold) {
        this.Gold = Gold;
    }

    public double getSilver() {
        return Silver;
    }

    public void setSilver(double Silver) {
        this.Silver = Silver;
    }

    public double getPlatinum() {
        return Platinum;
    }

    public void setPlatinum(double Platinum) {
        this.Platinum = Platinum;
    }

    public double getPalladium() {
        return Palladium;
    }

    public void setPalladium(double Palladium) {
        this.Palladium = Palladium;
    }

    public double getRhodium() {
        return Rhodium;
    }

    public void setRhodium(double Rhodium) {
        this.Rhodium = Rhodium;
    }

    public double getRuthenium() {
        return Ruthenium;
    }

    public void setRuthenium(double Ruthenium) {
        this.Ruthenium = Ruthenium;
    }

    public double getIridium() {
        return Iridium;
    }

    public void setIridium(double Iridium) {
        this.Iridium = Iridium;
    }

    public double getOsmium() {
        return Osmium;
    }

    public void setOsmium(double Osmium) {
        this.Osmium = Osmium;
    }

    @Override
    public String toString() {
        return "<br>"+
                " Gold: " + Gold + " | "+
                " Silver: " + Silver + " | "+
                " Platinum: " + Platinum + " | "+
                " Palladium: " + Palladium + " | "+
                " Rhodium: " + Rhodium + " | "+
                " Ruthenium: " + Ruthenium + " | "+
                " Iridium: " + Iridium + " | "+
                " Osmium: " + Osmium ;
    }
        
        
    
}
