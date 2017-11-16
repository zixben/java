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
public class Sphere extends Shape3d {
    private final float radious = 4;
     public double getVolume() {
         return (4/3)* pow(radious, 3)* Math.PI;    
    }
}
