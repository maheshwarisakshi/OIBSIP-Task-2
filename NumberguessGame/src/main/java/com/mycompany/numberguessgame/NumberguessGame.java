/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

        
package com.mycompany.numberguessgame;

/**
 *
 * @author sakshi
 */
import java.util.Random;
import java.util.Scanner;

public class NumberguessGame {
    
    public static void startGame() {
        
        try ( 
                Scanner scanner = new Scanner(System.in)) {
            // Random number generator (from 1 to 100)
            Random random = new Random();
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfAttempts = 10; 
            int userGuess = 0;         
            
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I'm thinking of a number between 1 and 100.");
            System.out.println("You have " + numberOfAttempts + " attempts to guess it.");
            
            for (int i = 1; i <= numberOfAttempts; i++) {
                // Prompt user to enter a guess
                System.out.print("Attempt " + i + ": Enter your guess: ");
                
                
                userGuess = scanner.nextInt();
                
                
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number: " + numberToGuess);
                    System.out.println("It took you " + i + " attempts to guess correctly.");
                    break;
                }
               
                else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                }
               
                else {
                    System.out.println("Too low! Try again.");
                }
                
                
                if (i == numberOfAttempts) {
                    System.out.println("Sorry, you've used all your attempts. The correct number was: " + numberToGuess);
                }
            }
            
        }
    }

public static void main(String[] args) {
        
        startGame();
        }

        
    
}


    
   

    