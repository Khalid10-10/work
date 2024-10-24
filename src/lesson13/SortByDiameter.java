package lesson13;

import java.util.Comparator;

public class SortByDiameter implements Comparator<Coin> {

    @Override
    public int compare(Coin o1, Coin o2) {
        if (o1.getNominal() != o2.getNominal()) {
            return o1.getNominal() - o1.getNominal();
        }
        if (o1.getYear() != o2.getYear()) {
            return o1.getNominal() - o2.getYear();
        }


        return o1.getMetalName().compareTo(o2.getMetalName());

    }
}
