package Abcd;

public class B extends A{
    public void whoAmI(){
        System.out.println("Ho ridefinito mio padre. Io sono " + getClass().getSimpleName());
    }

    public void sayHello(){
        System.out.println("Hello World: " + getClass().getSimpleName());
    }
}
