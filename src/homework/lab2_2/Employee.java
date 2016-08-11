package homework.lab2_2;

/**
 * Created by user on 04.08.16.
 */
public class Employee {

    private String surname;
    private Stationery[] set;
    public static final String DEFAULT_NAME = "Ivanov";
    public static final int DEFAULT_SET_SIZE = 2;

    public Employee()
    {
        this.surname = DEFAULT_NAME;
        this.set = new Stationery[DEFAULT_SET_SIZE];
        this.set[0] = new Stationery();
        this.set[1] = new Stationery("pencil", 0.85);
    }

    public Employee(String Surname, Stationery[] set)
    {
        this.surname = Surname;
        this.set = set;
    }

    public void getTotalPrice()
    {
        double totalPrice = 0.0;
        for (Stationery s: this.set)
        {
            totalPrice += s.getPrice();
        }
        System.out.println(totalPrice);
    }
}
