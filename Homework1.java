package homework.pkg1;
import java.util.Scanner;
public class Homework1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double subtotal, gratuityRate, gratuity, total; //These are my variables
        
        //Inputs
        System.out.println("Enter the subtotal and a gratuity rate: ");
        subtotal = input.nextDouble();
        gratuityRate = input.nextDouble();
        
        //Process or calculations
        gratuity = subtotal * (gratuityRate / 100);
        total = gratuity + subtotal;
        
        //Outputs
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
    
}

/*run:
Enter the subtotal and a gratuity rate: 
225 20
The gratuity is $45.0 and total is $270.0
BUILD SUCCESSFUL (total time: 6 seconds)*/
