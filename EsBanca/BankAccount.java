public class BankAccount {
    private float amount;

    public BankAccount(){
        amount = 0.0f;
    }

    public void balance(){
        System.out.println("Your balance is: " + amount);
    }

    public void deposit(float x){
        if (x>0)
        amount = amount + x;
        else
            System.out.println("Importo invalido");
    }

    public void withdraw(float x){
        if (amount >= x)
        amount = amount - x;
        else
            System.out.println("Denaro insufficiente");
    }



    
}
