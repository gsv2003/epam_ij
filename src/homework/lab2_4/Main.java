package homework.lab2_4;

import homework.lab2_3.*;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by user on 04.08.16.
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Stationery> newSet = new ArrayList();
        newSet.add(new Pen("BIC", 1.25, "BLACK"));
        newSet.add(new Pencil("KOH-I-NOOR", 1.0, "GREEN"));
        newSet.add(new Eraser("Pilot", 0.85));
        newSet.add(new Scissors("Maped", 1.85));
        newSet.add(new Line("ErichKrause", 0.6));

    }
}