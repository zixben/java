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
        System.out.print("Please enter a word and a number");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a word: ");
        String x = scanner.next();
        System.out.println("Please give me an integer: ");  
        int y = scanner.nextInt();
        System.out.print(x + " " + y);
    }
    
}
