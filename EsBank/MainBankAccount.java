package EsBank;

import javax.swing.*;

public class MainBankAccount {
     public static void main(String[] args){
        BankAccount conto = new BankAccount();
        int uscita = 0;
        while (uscita != 1) {
            String choice = JOptionPane.showInputDialog("Scegli l'operazione da effettuare tra : \n1)Mostra bilancio\n2)Preleva denaro\n3)Deposita denaro\n4)Esci");

            switch (Integer.parseInt(choice)) {
                case 1:
                    float a = conto.balance();
                    System.out.println(a);
                    break;

                case 2:
                    String amount = JOptionPane.showInputDialog("Scegli l'importo da prelevare:");
                    conto.withdraw(Float.parseFloat(amount));
                    break;

                case 3:
                    String amount2 = JOptionPane.showInputDialog("Scegli l'importo da prelevare:");
                    conto.deposit(Float.parseFloat(amount2));
                    break;

                case 4:
                    uscita = 1;
                    break;


            }

        }
    }


}
