public class SavingsAccount extends Account {
    
    public SavingsAccount() {
        super();
    }
    
    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }
    
    public void withdraw(double amount) {
        if(getBalance() > amount) {
           setBalance(getBalance() - amount);
        }
        else {
            System.out.println("Transaction Denied. Insufficient Funds!");
        }
    }
    
    public String toString(){
        return "Savings " + super.toString();
    }
}
