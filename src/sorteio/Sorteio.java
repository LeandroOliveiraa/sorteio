/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author leandro.osouza
 */
public class Sorteio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        Random rng = new Random();

        int i = rng.nextInt(11);
        
        System.out.println(i);
      
       
       
    }

}
