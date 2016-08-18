package homework.lab2_5;

import java.util.HashMap;
import java.util.TreeSet;

/**
 * Created by user on 12.08.16.
 */
public class Student {

    private String surname;
    private int id;
    private HashMap<ScienceSet, Rating> sciences;

    Student(String surname){
        this.surname = surname;
        this.id = this.hashCode();
        sciences = new HashMap();
    }

    public void setSciencesStudent(ScienceSet science, Rating rating){
        this.sciences.put(science, rating);
    }

    public HashMap getSciencesStudent(){
        return sciences;
    }

    @Override
    public String toString(){
        return "Student is " + this.surname + " has id number " + this.id;
    }

}
