package myException;

public class BankAccount implements Measurable {
    public double getMeasure() {
        return balance;
    }

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        try {
            if (balance < 0) {
                throw new NoFundsException();
            }
            balance = balance - amount;
        } catch(NoFundsException exc)
    {
        System.out.println(exc.toString());
    }

}

   public double getBalance()
   {  return balance; 
   }

   private double balance; 
}