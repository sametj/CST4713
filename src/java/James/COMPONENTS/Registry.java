/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package James.COMPONENTS;

import James.ENUMS.*;

/**
 *
 * @author mosesjames
 */
public class Registry {
            private String Designation;
            private AType type;
            private Country nation;
            private String DDate;

    public Registry(String Designation, AType type, Country nation, String DDate) {
        this.Designation = Designation;
        this.type = type;
        this.nation = nation;
        this.DDate = DDate;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public AType getType() {
        return type;
    }

    public void setType(AType type) {
        this.type = type;
    }

    public Country getNation() {
        return nation;
    }

    public void setNation(Country nation) {
        this.nation = nation;
    }

    public String getDDate() {
        return DDate;
    }

    public void setDDate(String DDate) {
        this.DDate = DDate;
    }

    @Override
    public String toString() {
        return  "<br>"+
                " Type: " + type + " | "+
                " Nation: " + nation + " | "+
                " Date: " + DDate ;
    }
            
            
}
