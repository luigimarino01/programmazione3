package Es3;

public class Greeter {

    private String name;
    private String surname;

    public Greeter(String nome,String cognome){
        name = nome;
        surname = cognome;
    }

    public String sayHello(){
        String message  = "Cia, " + name +" " + surname + "!";
        return message;
    }
}
