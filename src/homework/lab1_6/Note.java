package homework.lab1_6;

import java.util.Date;

/**
 * Created by user on 03.08.16.
 * Домашнее задание 1.6
 * Класс "Запись в блокноте"
 * @author Stepan V. Gloukhov
 * @version 1.0
 */
public class Note {

    private String s;
    private Date dateOfCreate;

    /**
     * Данный конструктор создает запись по умолчанию
     */
    public Note()
    {
        s = "Default note";
        dateOfCreate = new Date();
    }

    /**
     * Данный конструктор создает запись на основе параметра
     * @param s Параметр, задающий для создания записи в блокноте произвольную строку.
     */
    public Note(String s)
    {
        this.s = s;
        dateOfCreate = new Date();
    }

    @Override
    public String toString()
    {
        return s;
    }

    public Date getDateOfCreate(){
        return dateOfCreate;
    }

}
