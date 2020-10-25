package Lab10;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(1,2);
        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);
        p1.moveRight();
        System.out.println(p1);

        Movable p2 = new MovablePoint(3,4);
        p2.moveLeft();
    }
}
