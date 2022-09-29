public class MainBankAccount {

    public static void main(String[] args){
        BankAccount conto = new BankAccount();
        conto.balance();

        conto.deposit(7000.00f);

        conto.balance();

        conto.withdraw(80.00f);

        conto.balance();
    }
}
