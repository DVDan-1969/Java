package tema5_ex5;

class BankAccount {
    protected String ownerName;
    protected double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Deposit must be positive");
            return;
        }
        balance += amount;
        System.out.println(ownerName + " deposited " + amount + " New balance: " + balance);
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Withdrawal must be positive");
            return;
        }
        if (balance >= amount){
            balance -= amount;
            System.out.println(ownerName + " withdrew " + amount + " New balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal of " + amount + " Current balance: " + balance);
        }
    }

    public void displayBalance(){
        System.out.println("Account owner: " + ownerName + " Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String ownerName, double balance, double interestRate) {
        super(ownerName, balance);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        double interest = balance * interestRate;
        balance += interest;
        System.out.println(ownerName + " earned interest: " + interest + " New balance: " + balance);
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String ownerName, double balance, double overdraftLimit) {
        super(ownerName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Withdrawal must be positive");
            return;
        }

        double available = balance + overdraftLimit;

        if(amount <= available){
            balance -= amount;
            System.out.println(ownerName + " withdrew " + amount + " New balance: " + balance);
        } else {
            System.out.println("Withdrawal of " + amount + " exceeds overdraft limit. Available: " + available);
        }
    }
}

 class Main {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("Alice", 1000.0, 0.05);
        System.out.println("=== SavingsAccount ===");
        savings.displayBalance();
        savings.addInterest();
        savings.displayBalance();

        System.out.println();

        CheckingAccount checking = new CheckingAccount("Bob", 200.0, 500.0);
        System.out.println("=== CheckingAccount overdraft ===");
        checking.displayBalance();
        checking.withdraw(350.0);
        checking.displayBalance();
        checking.withdraw(400.0);
        checking.displayBalance();
        checking.withdraw(200.0);
        checking.displayBalance();
    }
}