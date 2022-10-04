package Stringhe;

public class StringheTest {
    public static void main(String[] args){
        String a = "Simone";
        String b = "Simone";
        String c = new String("Simone");

    
        System.out.println(a==b);
        System.out.println(b==c);

        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
    }
}
