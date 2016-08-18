package homework.lab2_4;

import homework.lab2_3.Stationery;

import java.util.Comparator;

/**
 * Created by user on 11.08.16.
 */
public class SortedByPrice implements Comparator<Stationery> {

    public int compare(Stationery o1, Stationery o2) {

        double price1 = o1.getPrice();
        double price2 = o2.getPrice();
        if (price1 > price2){
            return 1;
        }else if(price1 < price2){
            return -1;
        }else {
            return 0;
        }
    }
}
