/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4ex3;

/**
 *
 * @author Phaedon
 */
public class L4Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String [] animals = {"cat","dog","pig","bear","bird","parrot","rabbit"};
        
        // 1st way.
        for (String animal:animals){
            if (animal.startsWith("p")){
                continue;
            }
            System.out.println(animal);
        }
        // 2nd way.
        System.out.println("...and with a second way: ");
        for (int i=0; i<=animals.length-1; ++i){
            
            if ('p' != (animals[i].charAt(0))){
              System.out.println(animals[i]);
            }
                    
        }
    }
    
}
