package EsPurse;
import javax.swing.JOptionPane;

public class PurseTest {
    public static void main(String[] args){
        Purse borsellino = new Purse();
        String inputNickels = JOptionPane.showInputDialog("Quanti nickels vuoi inserire?");
        String inputDimes = JOptionPane.showInputDialog("Quanti dimes vuoi inserire?");
        String inputQuarters =JOptionPane.showInputDialog("Quanti quarters vuoi inserire?");

        borsellino.addNickels(Integer.parseInt(inputNickels));
        borsellino.addDimes(Integer.parseInt(inputDimes));
        borsellino.addQuarters(Integer.parseInt(inputQuarters));

       
        borsellino.getAmount();


    }
}
