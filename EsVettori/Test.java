package EsVettori;
import MeasurableExercise.Coin;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList coins = new ArrayList();
        coins.add(new Coin(0.1));
        coins.add(new Coin(0.25));
        Coin acoin = (Coin)coins.get(0);
    }
}
