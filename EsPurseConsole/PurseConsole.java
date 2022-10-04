package EsPurseConsole;

public class PurseConsole {
    private int nickel = 0;
    private int quarter = 0;
    private int dimes = 0;
    static final float nickelsValue = 0.05f;
    static final float quarterValue = 0.25f;
    static final float dimesValue = 0.10f;


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
