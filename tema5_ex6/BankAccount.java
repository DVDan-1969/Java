package tema5_ex6;

public class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String ownerName, double balance, double interestRate) {
        super(ownerName, balance);
        setInterestRate(interestRate);
    }

    public boolean setInterestRate(double interestRate) {
        if (interestRate < 0 || interestRate > 1) {
            return false;
        }
        this.interestRate = interestRate;
        return true;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String ownerName, double balance, double overdraftLimit) {
        super(ownerName, balance);
        setOverdraftLimit(overdraftLimit);
    }

    public boolean setOverdraftLimit(double overdraftLimit) {
        if (overdraftLimit < 0) {
            return false;
        }
        this.overdraftLimit = overdraftLimit;
        return true;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            return false;
        }

        if (getBalance() + overdraftLimit < amount) {
            return false;
        }

        setBalance(getBalance() - amount);
        return true;
    }
}

class Main {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Ion", 1000);

        if (acc.deposit(500)) {
            System.out.println("Deposit OK");
        } else {
            System.out.println("Deposit invalid");
        }

        if (acc.withdraw(2000)) {
            System.out.println("Withdraw OK");
        } else {
            System.out.println("Withdraw invalid");
        }

        SavingsAccount s = new SavingsAccount("Maria", 2000, 0.05);

        if (!s.setInterestRate(1.5)) {
            System.out.println("Interest invalid");
        }

        CheckingAccount c = new CheckingAccount("Alex", 500, 300);

        if (c.withdraw(700)) {
            System.out.println("Withdraw with overdraft OK");
        } else {
            System.out.println("Overdraft exceeded");
        }
    }
}
