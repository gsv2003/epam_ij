package homework.lab2_2;

/**
 * Created by user on 04.08.16.
 */
public class Employee {

    private String Surname;
    private Stationery[] set;
    private double totalPrice;

    public Employee()
    {
        this.Surname = "Ivanov";
        this.set = new Stationery[2];
        this.set[0] = new Stationery();
        this.set[1] = new Stationery("pencil", 0.85);
    }

    public Employee(String Surname, Stationery[] set)
    {
        this.Surname = Surname;
        this.set = set;
    }

    public double getTotalPrice()
    {
        for (Stationery s: this.set)
        {
            totalPrice += s.getPrice();
        }
        return totalPrice;
    }
}
