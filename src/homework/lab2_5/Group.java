package homework.lab2_5;

import java.util.HashSet;

/**
 * Created by user on 12.08.16.
 */
public class Group {

    private HashSet<Student> students;

    Group(){
        this.students = new HashSet<Student>();
    }

    void addStudent(Student student){
        students.add(student);
    }


    /*public HashSet<Student> findScience(String science){

        for (Student s: students) {
            if(s.getSciencesStudent().containsKey(science)){

            }
        }

        return;
    }*/
}
