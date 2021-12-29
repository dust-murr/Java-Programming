package homework.pkg2;
import java.util.Scanner;
public class Homework2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //These are my variables
        double investmentAmount, monthlyRate, annualRate, fiv;
        int years;
                
        //Inputs
        System.out.println("Enter the investment amount: ");
        investmentAmount = input.nextDouble();
     
        System.out.println("Enter the annual interest rate in percentage: ");
        annualRate = input.nextDouble();
        
        System.out.println("Enter number of years: ");
        years = input.nextInt();
        
        //Process or calculations
        monthlyRate = annualRate/1200;
        fiv = investmentAmount * (Math.pow(1 + monthlyRate, years * 12));
        fiv = (int)(fiv * 100 + 0.5) / 100.0;
        
        //Outputs
        System.out.println("The future investment value is: $" + fiv);
        
    }
    
}

/*run:
Enter the investment amount: 
1000.56
Enter the annual interest rate in percentage: 
4.25
Enter number of years: 
1
The future investment value is: $1043.92
BUILD SUCCESSFUL (total time: 12 seconds)*/
