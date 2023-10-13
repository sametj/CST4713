/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivate default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package James.MATERIALS;

/**
 *
 * @author mosesjames
 */
public class CommonComposition {
        private String Designation;
        private double Nickel;
        private double Molybdenum;
        private double Iron;
        private double Zinc;

    public CommonComposition(String Designation, double Nickel, double Molybdenum, double Iron, double Zinc) {
        this.Designation = Designation;
        this.Nickel = Nickel;
        this.Molybdenum = Molybdenum;
        this.Iron = Iron;
        this.Zinc = Zinc;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public double getNickel() {
        return Nickel;
    }

    public void setNickel(double Nickel) {
        this.Nickel = Nickel;
    }

    public double getMolybdenum() {
        return Molybdenum;
    }

    public void setMolybdenum(double Molybdenum) {
        this.Molybdenum = Molybdenum;
    }

    public double getIron() {
        return Iron;
    }

    public void setIron(double Iron) {
        this.Iron = Iron;
    }

    public double getZinc() {
        return Zinc;
    }

    public void setZinc(double Zinc) {
        this.Zinc = Zinc;
    }

    @Override
    public String toString() {
        return "<br>"+
                " Nickel: " + Nickel + " | "+
                " Molybdenum: " + Molybdenum + " | "+
                " Iron: " + Iron + " | "+
                " Zinc: " + Zinc ;
    }
        
        
    
                
}
