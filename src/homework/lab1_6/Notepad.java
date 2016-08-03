package homework.lab1_6;

/**
 * Created by user on 03.08.16.
 * Домашнее задание 1.6
 * Класс "Блокнот"
 * @author Stepan V. Gloukhov
 * @version 1.0
 */
public class Notepad {

    private Note[] notepad;

    /**
     * Данный конструктор создает блокнот размером по умолчанию = 10
     */
    public Notepad()
    {
        notepad = new Note[10];
    }

    /**
     * Данный конструктор создает блокнот с длиной передаваемой параметром
     * @param size Длина блокнота
     */
    public Notepad(int size)
    {
        notepad = new Note[size];
    }

    /**
     * Метод для создания новой записи. С проверкой на наличие свободного места в блокноте
     * @param note записываемая строка
     */
    public void addNote(Note note)
    {
        for (int i = 0; i < notepad.length; i++) {
            if(notepad[i] == null)
            {
                notepad[i] = note;
                return;
            }else if((i + 1) == notepad.length)
            {
                System.out.println("В блокноте больше нет свободного места!");

            }
        }
    }

    /**
     * Метод для удаления строки по индексу. С проверкой границ индекса
     * @param index
     */
    public void delNote(int index)
    {
        if(isAvailableIndex(index))
        {
            notepad[index] = null;
        }else
        {
            System.out.println("Такой записи нет!");
        }
    }

    /**
     * Метод для проверки индекс на выход за границы размерности блокнота
     * @param index
     * @return Возвращает true, если в блокноте есть "чистые листы"
     */
    public boolean isAvailableIndex(int index)
    {
        return (index < 0 || index > notepad.length) ? false : true;
    }

    /**
     * Метод для редактирования записи по индексу, с проверкой индекса на выход за границы.
     * @param index Номер записи для редактирования
     * @param note
     */
    public void editNote(int index, Note note)
    {
        if (isAvailableIndex(index))
        {

            notepad[index] = note;
        }else
        {
            System.out.println("Такой записи нет!");
        }
    }

    /**
     * Метод для отобрадения всех записей в блокноте
     */
    public void showAllNotes()
    {
        for (Note note: notepad) {
            System.out.println(note);
        }
    }
}
