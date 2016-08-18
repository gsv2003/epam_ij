package homework.lab3_1;

import java.util.Scanner;

/**
 * Created by user on 18.08.16.
 */
/*
Необходимо создать класс CrazyLogger, ведущий журнал лога, используя как накопитель объект типа StringBuilder.
Логгер должен содержать методы поиска определенной информации в таком логе [с возможностью вывода ее в поток ввода вывода].
Информацию логгер хранит в форматированном виде: dd-mm-YYYY : hh-mm – message;.
 */
public class Main {
    public static void main(String[] args) {
        CrazyLogger logger = new CrazyLogger();
        boolean isContinue = true;
        while(isContinue){
            String message = new Scanner(System.in).nextLine();
            if(message.equals("Stop log")){
                isContinue = false;
            }else{
                logger.addInLog(message);
            }

        }
        logger.showAllLog();
    }
}
