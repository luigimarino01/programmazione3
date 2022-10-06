package EsSavingsAccount;

public class MainSavingsAccount {
    public static void main(String[] args){
        SavingsAccount conto = new SavingsAccount(5);
        conto.deposit(100);
        System.out.println(conto.balance());
        conto.addInterest();
        System.out.println(conto.balance());

    }
}
