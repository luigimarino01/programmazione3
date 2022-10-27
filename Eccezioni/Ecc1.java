package Eccezioni;

public class Ecc1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        System.out.println("----FASE DI TESTING INIZIATA----");
        int i = 0;
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch (ArithmeticException exc){
            ++i;
            System.out.println("ERRORE ARITMETICO -  NUMERO ERRORI: " + i);
        }
        catch(NullPointerException exc){
            ++i;
            System.out.println("ERRORE DI REFERENCE - NUMERO ERRORI: " + i);
        }
        finally {
            System.out.println("----TESTING TERMINATO----");
        }
    }
}
