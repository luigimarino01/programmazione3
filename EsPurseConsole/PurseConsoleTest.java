package EsPurseConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PurseConsoleTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader console = new BufferedReader(reader);
        PurseConsole borsellino = new PurseConsole();
        System.out.println("Quanti nickels vuoi inserire?");
        String input = console.readLine();
        int count = Integer.parseInt(input);

        System.out.println("Quanti dimes vuoi inserire?");
        String input2 = console.readLine();
        int count2 = Integer.parseInt(input2);

        System.out.println("Quanti quarters vuoi inserire?");
        String input3 = console.readLine();
        int count3 = Integer.parseInt(input3);




        borsellino.addNickels(count);
        borsellino.addDimes(count2);
        borsellino.addQuarters(count3);

        borsellino.getAmount();

    }
}
