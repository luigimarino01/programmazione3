package EsPurseConsole;

public class PurseConsoleTest {
    public static void main(String[] args) throws IOException{ 
        InputStreamReader reader = InputStreamReader(System.in);
        PurseConsole borsellino = new PurseConsole();
        
        System.out.println("Quanti nickels vuoi inserire?");

       
        borsellino.getAmount();


    }
}