package lezioneEccezioni;

public class Ecc1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException exc) {
            System.out.println("Arithmetic exc");
        } catch (NullPointerException exc){
            System.out.println("Null Pointer exc");
        } catch (Exception exc){
            exc.printStackTrace();
        } finally {
            System.out.println("Controllo eccezioni terminate");
        }
    }
}

