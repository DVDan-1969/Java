package tema5_ex2;

public class BankAccount {
    private String ownerName;
    private double balance;
    
    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited:"+amount);
    }
    public void withdraw(double amount) {
        if(amount<=balance){
            balance-= amount;
            System.out.println("Withdrawn:"+amount);
        }else{
            System.out.println("Not enough balance");
        }
    }
    public void displayBalance() {
        System.out.println("Balance:"+this.balance);
    }
    public static void main(String[] args) {
            //Create acccount
            BankAccount bankAccount = new BankAccount("Ana",500);
            // Initial balance
            bankAccount.displayBalance();
            // Deposit money
            bankAccount.deposit(500);
            bankAccount.displayBalance();
            // Valid withdraw
            bankAccount.withdraw(100);
            bankAccount.displayBalance();
            // Invalid withdraw
            bankAccount.withdraw(2000);
            bankAccount.displayBalance();
    }
}
