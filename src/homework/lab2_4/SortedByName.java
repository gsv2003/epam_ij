package homework.lab2_4;

import homework.lab2_3.Stationery;

import java.util.Comparator;

/**
 * Created by user on 11.08.16.
 */
public class SortedByName implements Comparator<Stationery> {

    public int compare(Stationery o1, Stationery o2) {

        String name1 = o1.getClass().getSimpleName();
        String name2 = o2.getClass().getSimpleName();
        return name1.compareTo(name2);
    }
}
