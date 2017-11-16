/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l8exampleshape;

import static java.lang.Math.pow;

/**
 *
 * @author Phaedon
 */
public class Tetrahedron extends Shape3d{
        double height = 8;
        double x = 5;
        double baseHeight = 6;
        double baseArea = ((1/2)* x * baseHeight);
        double tetraVolume = (1/3)* baseArea * height;
     public double getVolume() {        
        
        return tetraVolume;    
    }
    
}
