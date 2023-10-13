/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package James.COMPONENTS;

/**
 *
 * @author mosesjames
 */
public class SpatialCoord {
            
            private String Designation;
            private double X;
            private double Y;
            private double Z;

    public SpatialCoord(String Designation, double X, double Y, double Z) {
        this.Designation = Designation;
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public double getX() {
        return X;
    }

    public void setX(double X) {
        this.X = X;
    }

    public double getY() {
        return Y;
    }

    public void setY(double Y) {
        this.Y = Y;
    }

    public double getZ() {
        return Z;
    }

    public void setZ(double Z) {
        this.Z = Z;
    }

    @Override
    public String toString() {
        return  
                 "X:" + X + " | Y: " + Y + " | Z: " + Z ;
    }
            
            
            
            

}
