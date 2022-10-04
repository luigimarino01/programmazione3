package EsRitcher;

import java.io.IOException;


public class Richter
{	public static void main(String[] args) throws IOException
{	ConsoleReader console = new ConsoleReader(System.in);

    System.out.println
            ("Immettere una magnitudo nella scala Richter:");
    double magnitude = console.readDouble();

    Earthquake quake = new Earthquake(magnitude);
    System.out.println(quake.getDescription());
}
}

class Earthquake
{	public Earthquake(double magnitude)
{	richter = magnitude;
}

    public String getDescription()
    {	String r;
        if (richter >= 8.0)
            r = "Gran parte delle strutture crollate";
        else if (richter >= 7.0)
            r = "Molti edifici distrutti";
        else if (richter >= 6.0)
            r = "Molti edifici con danni considerevoli, alcuni collassati";
        else if (richter >= 4.5)
            r = "Danni a edifici mal costruiti";
        else if (richter >= 3.5)
            r = "Avvertito da molte persone, ma senza distruzioni";
        else if (richter >= 0)
            r = "In genere non avvertito dalle persone";
        else
            r = "I numeri negativi non sono ammessi";
        return r;
    }

    private double richter;
}
