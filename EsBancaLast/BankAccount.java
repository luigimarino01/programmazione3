package EsBancaLast;

public class BankAccount{
    private float amount;
    private final int numeroConto;

    public BankAccount(int numConto){
        amount = 0.0f;
        numeroConto = numConto;
    }

    public float balance(){
        return amount;
    }

    public void deposit(float x){
        if (x>0) {
            amount = amount + x;
            Bank.depositi += 1;
        }
        else

            System.out.println("Importo invalido");
    }

    public void withdraw(float x){
        if (amount >= x) {
            amount = amount - x;
            Bank.prelievi+=1;
        }
        else
            System.out.println("Denaro insufficiente");
    }

    public void stampaConto(){
        int cont = 0;
        int tmp = numeroConto;
        while (tmp/10 > 0){
            cont++;
            tmp = tmp/10;
        }
    System.out.print("Numero conto: ");
        for (int i = 0; i<10-cont-1; i++){
            System.out.print("0");
        }
        System.out.println(numeroConto);

    }






}
