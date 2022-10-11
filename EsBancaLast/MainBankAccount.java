package EsBancaLast;


public class MainBankAccount {
    public static void main(String[] args){

        Bank banca = new Bank("Santander");
        banca.creaBanca(100);
        System.out.println(banca.utentiBanca[1].balance());
        banca.utentiBanca[1].deposit(10000);
        System.out.println(banca.utentiBanca[1].balance());
        banca.tassazione();
        System.out.println(banca.utentiBanca[1].balance());
        banca.tassazione();
        System.out.println(banca.utentiBanca[1].balance());
        banca.utentiBanca[8].stampaConto();










    }

}
