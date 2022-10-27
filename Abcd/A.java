package Abcd;

public class A {
    public void whoAmI() {
        System.out.println("I'm class " + getClass().getSimpleName());
    }


    public static void main(String[] args) {
        A a = new A();
        A ab = new B();
        A ac = new C();
        A ad = new D();
        B b = new D();

        D d = new D();



        /*TEST ISTANZE
        System.out.println("Test istanza di");
        System.out.println("Oggetto a");

        System.out.println("\ta istanceof A: " + (a instanceof A));
        System.out.println("\t a istance of B: " + (a instanceof B));

        System.out.println("Oggetto ab");
        System.out.println("\tab instance of A: " + (ab instanceof A));
        System.out.println("\tab instance of B: " + (ab instanceof B));

        System.out.println("Oggetto ac");
        System.out.println("\tac instance of A: " + (ac instanceof A));
        System.out.println("\tac instance of B: " + (ac instanceof B));
        System.out.println("\tac instance of C: " + (ac instanceof C));

        System.out.println("Oggetto ad");
        System.out.println("\tad instance of A: " + (ad instanceof A));
        System.out.println("\tad instance of B: " + (ad instanceof B));
        System.out.println("\tad instance of C: " + (ad instanceof C));
        System.out.println("\tad instance of D: " + (ad instanceof D));

        System.out.println("Oggetto b");
        System.out.println("\tb instance of A: " + (b instanceof A));
        System.out.println("\tb instance of B: " + (b instanceof B));*/
        /*TEST METODI
        System.out.println("Test metodi");
        a.whoAmI();
        ab.whoAmI();
        ac.whoAmI();
        ad.whoAmI();
        b.whoAmI();
        */


    }

}