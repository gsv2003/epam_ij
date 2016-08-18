package homework.lab2_4;

import homework.lab2_3.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by user on 04.08.16.
 */

/*
Используйте “набор новичка”, созданный в задании 3, (или любую другую коллекцию объектов);
отсортируйте вещи в этом наборе по стоимости, по наименованию, по стоимости и наименованию.
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Stationery> newSet = new ArrayList();
        newSet.add(new Pen("BIC", 1.25, "BLACK"));
        newSet.add(new Pencil("KOH-I-NOOR", 1.0, "GREEN"));
        newSet.add(new Eraser("Pilot", 0.85));
        newSet.add(new Scissors("Maped", 1.85));
        newSet.add(new Line("ErichKrause", 0.6));
        newSet.add(new Pen("Parker", 2.20, "BLACK"));

        System.out.println("********** not sorted **********");
        for (Stationery s: newSet) {
            System.out.println(s);
        }

        System.out.println("********** sorted by price **********");
        newSet.sort(new SortedByPrice());
        for (Stationery s: newSet) {
            System.out.println(s);
        }

        System.out.println("********** sorted by name **********");
        newSet.sort(new SortedByName());
        for (Stationery s: newSet) {
            System.out.println(s);
        }

        System.out.println("********** sorted by name and price **********");
        newSet.sort(new SortedByNameAndPrice());
        for (Stationery s: newSet) {
            System.out.println(s);
        }
    }
}