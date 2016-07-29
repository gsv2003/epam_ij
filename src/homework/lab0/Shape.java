package homework.lab0;

/**
 * Created by user on 29.07.16.
 */
public abstract class Shape {

    private Color color;
    private boolean filled;

    //Если не указано иное, фигура будет черная и незалитая
    Shape ()
    {
        color = Color.BLACK;
        filled = false;
    }

    //В противном случае создаем фигуру нужного цвета и заливки
    Shape(Color color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    //gпереопределяем в каждом классе, ибо поведение вычисления периметра и площади для разных фигур разные
    public abstract double getSquare();
    public abstract double getPerimetr();

    //Получаем имя фигуры из простого названия класса
    public String getName(){
        return getClass().getSimpleName();
    }


    @Override
    public String toString()
    {
        String text = "Hi! My name is " + getName() + ". My P = " + getPerimetr() + ", S = " + getSquare() + ".\n"
                + "My color is " + color + " and I am " + (filled ? "filled." : "not filled.");
        return text;
    }

}
