
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class GuessingGame
{
    
    /**
     * Constructor for objects of class Main
     */
    public static void main (String [] args) {
        Scanner game = new Scanner (System.in);
        int x, guess,tries;
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Guess a number between 1 and 10");
        guess = game.nextInt();
        x = (int) (Math.random()*6 +1); 
        tries= 0;
       
        while (guess != x) { 
            tries++;
        if (guess < x){
            System.out.println("Your guess is too small!");
            System.out.println("Enter a number between 1 and 10");
            guess = game.nextInt();
        }
        if (guess > x){
            System.out.println("Your guess is too big!");
            System.out.println("Enter a number between 1 and 10");
            guess= game.nextInt();
        }
        if (guess == x){
            System.out.println("Your guess is correct! You got it in " + tries + " tries");
            
        }   
        
       }
}
}

