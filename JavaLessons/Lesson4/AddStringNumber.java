/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addstringnumber;

import java.util.Scanner;

/**
 *
 * @author Phaedon
 */
public class AddStringNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Please enter 3 numbers.\n2nd number must be 3 times the 1st \nand the 3d must be greater than the sum of the 1st and the 2nd.");
        while (true)
        { Scanner scanner = new Scanner(System.in);
          System.out.println("\nPlease insert 1st number here:");
          int x = scanner.nextInt();
          System.out.println("Please insert 2nd number here:");
          int y = scanner.nextInt();
          System.out.println("Please insert 3d number here:");
          int z = scanner.nextInt();
          
          if ((y == 3*x) && (z > (x + y)))
          {
              System.out.println("\nBraVo!! \n1st:"+x +"\n2nd:" + y + "\n3d: " + z);
              break;
          }
          else
          {
              System.out.println("Please try again");
          }
        }
        //String a = "a";
        //int tessera = 4 ;
        //System.out.print(a + " " + tessera);
    }
    
}
