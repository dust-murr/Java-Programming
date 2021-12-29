/*Write a program that:

Creates an array of 100 random integers that range between  1 and 100
array[i] = (int)(Math.random() * 100) +1 
Then prompt the user to enter an index number
use Scanner(System.in)
Then use a try and catch block to capture integers that are greater than 99
Use the superclass Exception in the catch statement
If an index is out of range a statement should appear stating so*/

import java.util.Scanner;
public class ExceptionTest {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] randomNumbers = new int[100];
        for(int i = 0; i < 100; i++) {
            randomNumbers[i] = (int)(Math.random() * 10000 + 1);
        }
        
        System.out.println("Enter an index number: ");
        int userInput = input.nextInt();
       
        input.close();
        
        try {
            System.out.println(randomNumbers[userInput]);
        }
        catch(Exception e) {
            System.out.println("Index out of range");
            
        }
        
    }
    
}
