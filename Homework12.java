package homework.pkg12;
import java.util.Scanner;
import java.util.Date;
public class Homework12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account(1122, 20000);
        myAccount.setAnnualInterestRate(4.5);
        System.out.println("The initial balance for Account ID # " + myAccount.getId() + ": $" + myAccount.getBalance());
        myAccount.withdraw(2500);
        System.out.println("The balance for Account ID # " + myAccount.getId() + " after withdrawl: $" + myAccount.getBalance());
        myAccount.deposit(3000);
        System.out.println("The final balance for Account ID # " + myAccount.getId() + " after deposit: $" + myAccount.getBalance());
        System.out.println("The monthly interest amount for Account ID # " + myAccount.getId() + ": $" + myAccount.getMonthlyInterest());
        System.out.println("Date Account ID # " + myAccount.getId() + " was created: " + myAccount.getDate());
    }//end main()
}//end Homework12 class

class Account{
    //properties
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    //methods
    Account(){                                        //no argument constructor              
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    Account(int newId, double newBalance){             //second constructor
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    }
    public int getId(){                                //accessor method
        return id;
    }
    public double getBalance(){                        //accessor method
        return balance;
    }
    public double getAnnualInterestRate(){             //accessor method
        return annualInterestRate;
    }
    public void setId(int newId){                      //mutator method
        if(newId > 0){
           id = newId; 
        }   
    }
    public void setBalance(double newBalance){         //mutator method
        if(newBalance > 0){
           balance = newBalance; 
        }   
    }
    public void setAnnualInterestRate(double newAnnualInterestRate){ //mutator method
        if(newAnnualInterestRate > 0){
           annualInterestRate = newAnnualInterestRate;
        }
    }
    public String getDate(){                           //accessor method
        return dateCreated.toString();
    }
    public double getMonthlyInterestRate(){           //accessor method
        return annualInterestRate / 1200;
    }
    public double getMonthlyInterest(){               //accessor method
        return (int)(balance * getMonthlyInterestRate() * 100 + .5) / 100.0;
    }
    public void withdraw(double newAmount){           //mutator method
        balance-=newAmount;
    }
    public void deposit(double newAmount){            //mutator method
        balance+=newAmount;
    }
}//end Account class

/*run:
The initial balance for Account ID # 1122: $20000.0
The balance for Account ID # 1122 after withdrawl: $17500.0
The final balance for Account ID # 1122 after deposit: $20500.0
The monthly interest amount for Account ID # 1122: $76.88
Date Account ID # 1122 was created: Thu Apr 29 19:34:49 EDT 2021
BUILD SUCCESSFUL (total time: 0 seconds)*/
