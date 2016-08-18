package homework.lab3_1;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 18.08.16.
 */
/*
Необходимо создать класс CrazyLogger, ведущий журнал лога, используя как накопитель объект типа StringBuilder.
Логгер должен содержать методы поиска определенной информации в таком логе [с возможностью вывода ее в поток ввода вывода].
Информацию логгер хранит в форматированном виде: dd-mm-YYYY : hh-mm – message;.
 */
public class CrazyLogger {

    private StringBuilder logger;

    CrazyLogger(){
        logger = new StringBuilder();
    }

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY : hh-mm");

    public void addInLog(String message){
        Date date = new Date();
        logger.append(dateFormat.format(date));
        logger.append(" - ");
        logger.append(message);
        logger.append(";\n");
    }

    /*
    Не совсем понимаю задание:
    "Логгер должен содержать методы поиска определенной информации в таком логе
    [с возможностью вывода ее в поток ввода вывода]."
    О какой "определенной информации" идет речь?
     */
    public String findMessageInLog(String message){

        for (int i = 0; i < logger.length(); i++) {

        }
        return "";
    }

    public void showAllLog(){
            System.out.println(logger.toString());
    }

}
