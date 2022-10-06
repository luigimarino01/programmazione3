package EsSavingsAccount;
import EsBank.BankAccount;

public class SavingsAccount extends BankAccount {
    private float tassoDiInteresse;
    private float add;
    public SavingsAccount(float tax){
        tassoDiInteresse = tax;
    }

    public void addInterest(){
        add = balance()*tassoDiInteresse/100;
        deposit(add);
    }

}
