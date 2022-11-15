package myException;

public class NoFundsException extends Exception{
    public NoFundsException(){
        super("Sei in banca rotta!");
    }
    public String toString(){
        return getMessage() + ": non puoi prelevare!";
    }
}
