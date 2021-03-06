package homework.pkg5;
import java.util.Scanner;
public class Homework5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numYears;
        double monthlyPayment, loanAmount, monthlyInterestRate, totalPayment, annualInterestRate; 
        
        System.out.println("Loan Amount: ");
        loanAmount = input.nextDouble();
        System.out.println("Number of Years: ");
        numYears = input.nextInt();
        System.out.println("Interest Rate     Monthly Payment     Total Payment");
        
        for(annualInterestRate = 5; annualInterestRate < 8.125; annualInterestRate+=0.125){
            monthlyInterestRate = annualInterestRate / 1200;
            monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numYears * 12)); 
            totalPayment = monthlyPayment * numYears * 12;
            System.out.printf("%8.3f%s             $%6.2f           $%8.2f \n", annualInterestRate, "%", monthlyPayment, totalPayment);
        }
    }    
}

/*run:
Loan Amount: 
10000
Number of Years: 
5
Interest Rate     Monthly Payment     Total Payment
   5.000%             $188.71           $11322.74 
   5.125%             $189.29           $11357.13 
   5.250%             $189.86           $11391.59 
   5.375%             $190.44           $11426.11 
   5.500%             $191.01           $11460.70 
   5.625%             $191.59           $11495.35 
   5.750%             $192.17           $11530.06 
   5.875%             $192.75           $11564.84 
   6.000%             $193.33           $11599.68 
   6.125%             $193.91           $11634.59 
   6.250%             $194.49           $11669.56 
   6.375%             $195.08           $11704.59 
   6.500%             $195.66           $11739.69 
   6.625%             $196.25           $11774.85 
   6.750%             $196.83           $11810.08 
   6.875%             $197.42           $11845.37 
   7.000%             $198.01           $11880.72 
   7.125%             $198.60           $11916.14 
   7.250%             $199.19           $11951.62 
   7.375%             $199.79           $11987.16 
   7.500%             $200.38           $12022.77 
   7.625%             $200.97           $12058.44 
   7.750%             $201.57           $12094.18 
   7.875%             $202.17           $12129.97 
   8.000%             $202.76           $12165.84 
BUILD SUCCESSFUL (total time: 5 seconds)*/
