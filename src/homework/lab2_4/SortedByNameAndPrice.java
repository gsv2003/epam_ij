package homework.lab2_4;

import homework.lab2_3.Stationery;

import java.util.Comparator;

/**
 * Created by user on 11.08.16.
 */
public class SortedByNameAndPrice implements Comparator<Stationery> {


    @Override
    public int compare(Stationery o1, Stationery o2) {
        int result = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());

        if(result != 0){
            return result;
        }
        if (o1.getPrice() > o2.getPrice()){
            return 1;
        }else if (o1.getPrice() < o2.getPrice()){
            return -1;
        }else{
            return 0;
        }
    }
}
