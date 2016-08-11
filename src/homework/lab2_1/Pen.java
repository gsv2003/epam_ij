package homework.lab2_1;

/**
 * Created by user on 04.08.16.
 */

public class Pen {

    private Color color;
    private boolean auto;
    private boolean ballpoint;

    public Pen() {
        color = Color.BLACK;
        auto = true;
        ballpoint = true;
    }

    public Pen(Color color, boolean auto, boolean ballpoint) {
        this.color = color;
        this.auto = auto;
        this.ballpoint = ballpoint;
    }

    @Override
    public boolean equals(Object pen) {
        if (pen.equals(this) || pen instanceof Pen & ((Pen) pen).color == color & ((Pen) pen).ballpoint == ballpoint & ((Pen) pen).auto == auto) {
            return true;
        }
        return false;

    }

    @Override
    public int hashCode() {
        return color.hashCode() + (this.auto ? 1 : 0) + (this.ballpoint ? 1 : 0);
    }

    @Override
    public String toString() {
        return "Pen is " + this.color + " color. It is " + (this.auto ? "auto &" : "mechanical &") +
                (this.ballpoint ? " ballpoint" : " gel") + " pen.";
    }
}
