package homework.lab2_2;

/**
 * Created by user on 04.08.16.
 */
//Напишите приложение, позволяющее вести учет канцелярских товаров на рабочем месте сотрудника.
// Определите полную стоимость канцтоваров у определенного сотрудника.
public class Main {

    public static void main(String[] args) {
        Stationery[] setNewEmployee = new Stationery[5];
        setNewEmployee[0] = new Stationery();
        setNewEmployee[1] = new Stationery("Pencil", 0.85);
        setNewEmployee[2] = new Stationery("Scissors", 1.5);
        setNewEmployee[3] = new Stationery("Line", 0.65);
        setNewEmployee[4] = new Stationery("Notepad", 2.35);

        Employee gloukhov = new Employee("Gloukhov", setNewEmployee);
        Employee newEmployee = new Employee();
        System.out.println(gloukhov.getTotalPrice());
        System.out.println(newEmployee.getTotalPrice());
    }

}
