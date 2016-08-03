package homework.lab1_6;

/**
 * Created by user on 03.08.16.
 * Класс для просмотра возможностей блокнота и записи
 * @author Stepan V. Gloukhov
 * version 1.0
 */
public class Viewer {

    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        //Notepad notepad2 = new Notepad(5);
        Note note1 = new Note();
        Note note2 = new Note("Hello!");
        notepad.addNote(note2);
        notepad.addNote(note1);
        for (int i = 0; i < 7; i++) {
            notepad.addNote(new Note("Note is " + i));
        }
        notepad.addNote(note1);
        //notepad.addNote(note2); //в блокноте больше нет места
        //notepad.delNote(5);
        //notepad.editNote(5, new Note("Edit note!"));
        notepad.showAllNotes();
        notepad.delNote(11);
        notepad.addNote(new Note("Empty."));
    }
}
