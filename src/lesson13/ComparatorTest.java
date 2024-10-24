package lesson13;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest {
    public static void main(String[] args) {
        Coin coin1 = new Coin(50, 1999, "Serebro", 2.5);
        Coin coin2 = new Coin(10, 2005, "Gold", 3);
        Coin coin3 = new Coin(40, 1996, "Brilliant", 3.5);
        Coin coin4 = new Coin(37, 1973, "Serebro", 4.5);
        Coin coin5 = new Coin(27, 1926, "Izumrud", 2.5);
        Coin coin6 = new Coin(15, 1983, "Gold", 5.5);


        Set<Coin> coinSet = new TreeSet<>();
        coinSet.add(coin1);
        coinSet.add(coin2);
        coinSet.add(coin3);
        coinSet.add(coin4);
        coinSet.add(coin5);
        coinSet.add(coin6);

        for (Coin coin : coinSet) {
            System.out.println(coin);
        }

    }
}
