public class CheckingAccount extends Account {
    private double overdraftLimit;
    
    CheckingAccount() {
        super();
        this.overdraftLimit = -10;
    }
    
    CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit) {
        super(id, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }
    
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;        
    }
    
    public void withdraw(double amount) {
        if(getBalance() - amount > overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Your withdrawl has exceeded account balance!");
        }
    }
    
    public String toString(){
        return "Checking " + super.toString() + "\nOverdraft Limit is $" + String.format("%.2f", getOverdraftLimit());
    }
    
}
