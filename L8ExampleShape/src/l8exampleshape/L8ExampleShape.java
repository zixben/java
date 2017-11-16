/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l8exampleshape;

/**
 *
 * @author Phaedon
 */
public class L8ExampleShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Shape2d shape2d = new Shape2d();        
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Sphere sphere = new Sphere();
        Cube cube = new Cube();
        Tetrahedron tetra = new Tetrahedron();
        
        //System.out.println(shape2d.getArea());
        System.out.println(circle.getArea());
        System.out.println(square.getArea());
        System.out.println(triangle.getArea());
        System.out.println(sphere.getVolume());
        System.out.println(cube.getVolume());
        System.out.println(tetra.getVolume());
        
    }
    
}
