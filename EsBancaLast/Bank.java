package EsBancaLast;

public class Bank {
public static int prelievi = 0;
public static int depositi = 0;
public  BankAccount[] utentiBanca = new BankAccount[100];


    private String nomeBanca;
    protected int numeroConti;
    public Bank(String nome){
        nomeBanca = nome;
        numeroConti = 0;

    }
    public void creaBanca(int nmr){
        for (int i = 0; i<nmr; i++){
            utentiBanca[i] = new BankAccount(i+1);
            utentiBanca[i].deposit(100);
            numeroConti = numeroConti + 1;
        }
    }

    public void tassazione(){
        for (int i = 0; i< numeroConti; i++){
            if (utentiBanca[i].balance() > 5000) {
                utentiBanca[i].withdraw(100);
                prelievi = prelievi - 1;
            }
        }
    }
    }

