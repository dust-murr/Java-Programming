class Account {
  private int id;
  private double balance;
  private double annualInterestRate;
  private java.util.Date dateCreated;

  public Account() {
    dateCreated = new java.util.Date();
  }

  public Account(int id, double balance, double annualInterestRate) {
    this.id = id;
    this.balance = balance;
    this.annualInterestRate = annualInterestRate;
    dateCreated = new java.util.Date();
  }

  public int getId() {
    return this.id;
  }

  public double getBalance() {
    return balance;
  }

  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setId(int id) {
    this.id =id;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  public double getMonthlyInterest() {
    return balance * (annualInterestRate / 1200);
  }

  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  public void withdraw(double amount) {
    balance -= amount;
  }
  
  public void deposit(double amount) {    
    balance += amount;  
  }
  
  public String toString(){
        return "Account ID #: " + getId() + " has a balance of $" + String.format("%.2f", getBalance()) + 
                "\nMonthly interest is $" + String.format("%.2f", getMonthlyInterest()) + 
                "\nThis account was created at " + getDateCreated();
  }
}
