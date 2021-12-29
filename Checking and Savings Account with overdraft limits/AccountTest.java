public class AccountTest {
  public static void main (String[] args) {
    Account account = new Account(1122, 20000, 4.5);

    account.withdraw(2500);
    account.deposit(3000);
    System.out.println(account.toString());
    System.out.println("--------------------------------------------------------------------------------");
    
    CheckingAccount checking = new CheckingAccount(2233, 30000, 4.5, -100);
    
    checking.withdraw(2500);
    checking.deposit(3000);
    System.out.println(checking.toString());
    System.out.println("--------------------------------------------------------------------------------");
    
    SavingsAccount savings = new SavingsAccount(3344, 40000, 4.5);
    
    savings.withdraw(2500);
    savings.deposit(3000);
    System.out.println(savings.toString());
    System.out.println("--------------------------------------------------------------------------------");      
  }
}
