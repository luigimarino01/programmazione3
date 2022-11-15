package myException;

public class test {
    public static void main(String[] args){
        BankAccount b = new BankAccount();
        b.deposit(100);
        System.out.println(b.getBalance());
        b.withdraw(1000);
        System.out.println(b.getBalance());
        b.withdraw(1000);
        System.out.println(b.getBalance());
        b.withdraw(1000);
        System.out.println(b.getBalance());


    }
}
