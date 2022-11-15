package EsTemplate;


//Contenitore con tipi generici
public class TestTemplate <T1>{
    private T1 oggetto;
    public void setOggetto(T1 oggetto){
        this.oggetto = oggetto;
    }

    public T1 getOggetto(){
        return oggetto;
    }

    public static void main(String[] args){
        TestTemplate<String> contenitore = new TestTemplate<>();

    }
}
