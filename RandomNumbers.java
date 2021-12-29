public class RandomNumbers {

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		int[] randomNumbers = new int[5];
		 
        for(int i =0; i < 5; i ++){
            randomNumbers[i] = (int)(Math.random() * 100 + 1);
        }
        
        Arrays.sort(randomNumbers);
        
        java.io.File file = new java.io.File("data.txt");
        
        if(file.exists()) {
            
            System.out.println("File already exisits");
            //System.exit(0);
        }
        
      //WRITE
        try(java.io.PrintWriter outputFile = new java.io.PrintWriter(file);) {
                
            for(int i = 0; i < 5; i++) {
                outputFile.print(randomNumbers[i] + " ");
            }
            
            outputFile.close();
        } 
        catch(IOException e) {
            System.out.println("File Error");
        }
        
        //READ
        try(Scanner input = new Scanner(file);) {
            System.out.print("[ ");
            while(input.hasNext()) {
                System.out.print(input.next() + " ");
            }
            
            System.out.println("]");
            
            input.close();
            } 
            catch(IOException e) {
                System.out.println("File Read Error");
            }
        
    }   
    
}
