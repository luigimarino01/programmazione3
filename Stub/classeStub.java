package Stub;

public class classeStub implements Notifiche{
    @Override
    public void notificheCellulare() {
        System.out.println("Hai ricevuto una notifica per cellulare!");
    }

    @Override
    public void notificheComputer() {}

    @Override
    public void notificheTablet(){}

    public static void main(String[] args){
    }
}
