package homework.lab2_5;

import java.util.HashSet;

/**
 * Created by user on 12.08.16.
 */

/*
Разработайте приложение, позволяющее формировать группы студентов по разным дисциплинам.
Состав групп может быть разным. Каждая дисциплина в отдельности определяет, целыми или вещественными будут оценки по ней.
Необходимо найти группы, в которые входит студент X, и сравнить его оценки.
Для огранизации перечня дисциплин можно использовать перечисление.
 */
public class Main {

    public static void main(String[] args) {

        Student romashko = new Student("Romashko");
        romashko.setSciencesStudent(ScienceSet.ALGEBRA, new Rating(3.5));
        romashko.setSciencesStudent(ScienceSet.HISTORY, new Rating(4));
        romashko.setSciencesStudent(ScienceSet.PHYSICS, new Rating(3.9));

        Student vitaliev = new Student("Vitaliev");
        vitaliev.setSciencesStudent(ScienceSet.BIOLOGY, new Rating(4));
        vitaliev.setSciencesStudent(ScienceSet.ALGEBRA, new Rating(5.0));
        vitaliev.setSciencesStudent(ScienceSet.GEOMETRY, new Rating(4.5));

        Student belyaev = new Student("Belyaev");
        vitaliev.setSciencesStudent(ScienceSet.BIOLOGY, new Rating(3));
        vitaliev.setSciencesStudent(ScienceSet.ALGEBRA, new Rating(3.5));
        vitaliev.setSciencesStudent(ScienceSet.PHYSICS, new Rating(3.8));

//        HashSet<Student> group3331 = new HashSet();
//        group3331.add(romashko);
//        group3331.add(vitaliev);
//        group3331.add(belyaev);

        Group gr3331 = new Group();
        gr3331.addStudent(romashko);
        gr3331.addStudent(vitaliev);
        gr3331.addStudent(belyaev);


        /*for (Student s: gr3331) {
            System.out.println(s);
        }*/



    }
}
