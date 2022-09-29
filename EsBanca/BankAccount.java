public class BankAccount {
    private float amount;

    public BankAccount(){
        amount = 0.0f;
    }

    public void balance(){
        System.out.println("Your balance is: " + amount);
    }

    public void deposit(float x){
        amount = amount + x;
    }

    public void withdraw(float x){
        amount = amount - x;
    }



    
}
