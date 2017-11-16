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
public class Circle extends Shape2d{
    private final float radious = 4;

    public double getArea() {
        return pow(radious, 2)* Math.PI;
    }
}
