package homework.lab3_2;

import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Created by user on 18.08.16.
 */
/*
Разработать приложение, позволяющее по выбору пользователя использовать русский или английский язык, для отображения информации.
Приложение должно представлять собой перечень вопросов под номерами (на английском или русском соответственно).
Выбрав номер вопроса пользователь может узнать ответ на него.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите желаемый язык: (Select a language)\n" + "English - 1\nRussian - 2");
        ResourceBundle res;
        String selectLanguage = new Scanner(System.in).nextLine();
        switch(selectLanguage){
            case("1"):
                res = ResourceBundle.getBundle("homework.lab3_2.data_en");
                break;
            case("2"):
                res = ResourceBundle.getBundle("homework.lab3_2.data");
                break;
            default:
                res = ResourceBundle.getBundle("homework.lab3_2.data");
                break;
        }

        System.out.println(res.getString("greetings"));
        System.out.println(res.getString("question1") + "\n" + res.getString("question2"));
        String selectQuestion = new Scanner(System.in).nextLine();

        switch(selectQuestion){
            case("1"):
                System.out.println(res.getString("answer1"));
                break;
            case("2"):
                System.out.println(res.getString("answer2"));
                break;
            default:
                System.out.println(res.getString("error"));
                break;
        }

    }
}
