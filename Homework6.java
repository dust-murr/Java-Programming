package homework.pkg6;
import java.util.Scanner;
public class Homework6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double investmentAmount, monthlyInterestRate, annualInterestRate, fiv;
        int years;
                
        System.out.print("The amount invested: ");
        investmentAmount = input.nextDouble();
     
        System.out.print("Annual interest rate in percentage: ");
        annualInterestRate = input.nextDouble();
        
        monthlyInterestRate = annualInterestRate / 1200;
        
        System.out.println("Year     Future Investment Value");
        
        for(years = 1; years < 31; ++years){
            fiv = calcFutureInvestmentValue(investmentAmount, monthlyInterestRate, years);
            System.out.printf("%3d            %8.2f\n", years, fiv);
        }
        
    }//end main 
    public static double calcFutureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        return investmentAmount * (Math.pow(1 + monthlyInterestRate, years * 12));
    }
        
}//end class

/*run:
The amount invested: 1000
Annual interest rate in percentage: 9
Year     Future Investment Value
  1             1093.81
  2             1196.41
  3             1308.65
  4             1431.41
  5             1565.68
  6             1712.55
  7             1873.20
  8             2048.92
  9             2241.12
 10             2451.36
 11             2681.31
 12             2932.84
 13             3207.96
 14             3508.89
 15             3838.04
 16             4198.08
 17             4591.89
 18             5022.64
 19             5493.80
 20             6009.15
 21             6572.85
 22             7189.43
 23             7863.85
 24             8601.53
 25             9408.41
 26            10290.99
 27            11256.35
 28            12312.28
 29            13467.25
 30            14730.58
BUILD SUCCESSFUL (total time: 5 seconds)*/
