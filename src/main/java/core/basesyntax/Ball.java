package core.basesyntax;

public class Ball extends Lottery {
    String color;
    int number;
    public Ball() {
    }
    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }
    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
