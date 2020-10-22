package Lab8.Point;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(1.5f,2.4f);

        MovablePoint move1 = new MovablePoint(1.5f,2.4f,0.3f,1.5f);
        System.out.println(move1.move());

    }

}
