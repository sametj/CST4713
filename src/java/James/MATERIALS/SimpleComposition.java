/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivate default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package James.MATERIALS;

/**
 *
 * @author mosesjames
 */
public class SimpleComposition {
    private String Designation;
    private double Rock;
    private double Metal;

    public SimpleComposition(String Designation, double Rock, double Metal) {
        this.Designation = Designation;
        this.Rock = Rock;
        this.Metal = Metal;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public double getRock() {
        return Rock;
    }

    public void setRock(double Rock) {
        this.Rock = Rock;
    }

    public double getMetal() {
        return Metal;
    }

    public void setMetal(double Metal) {
        this.Metal = Metal;
    }

    @Override
    public String toString() {
        return "<br>" +
                  " Rock: " + Rock 
                +" | "+" Metal: " + Metal ;
    }
    
   
    
}
