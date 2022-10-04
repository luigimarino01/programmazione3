package EsPurseConsole;
public class PurseConsole {


    private int nickel;
    private int quarter;
    private int dimes;
    static final float nickelsValue = 0.05f;
    static final float quarterValue = 0.25f;
    static final float dimesValue = 0.10f;

    public PurseConsole(){
        this.nickel = 0;
        this.quarter = 0;
        this.dimes = 0;
    }

    public void addNickels(int x){
        this.nickel += x;
    }

    public void addQuarters(int x){
        this.quarter += x;
    }

    public void addDimes(int x){
        this.dimes += x;
    }

    public void getAmount(){
        System.out.println("Il totale del tuo saldo e' $" + (nickel * nickelsValue + quarter * quarterValue + dimes * dimesValue)); 
    }

}
