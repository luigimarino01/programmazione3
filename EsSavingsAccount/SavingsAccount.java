package EsSavingsAccount;
import EsBank.BankAccount;

public class SavingsAccount extends BankAccount {
    private float tassoDiInteresse;
    private float tmpAmount;
    private float add;
    public SavingsAccount(float tax){
        tassoDiInteresse = tax;
    }

    public void addInterest(){
        tmpAmount = this.balance();
        add = tmpAmount*tassoDiInteresse/100;
        this.deposit(add);
    }

}
