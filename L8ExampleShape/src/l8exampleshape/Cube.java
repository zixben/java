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
public class Cube extends Shape3d{
     float x = 4;
     public double getVolume() {
         return pow(x, 3);    
    }
    
}
