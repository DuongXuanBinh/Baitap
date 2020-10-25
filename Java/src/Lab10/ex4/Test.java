package Lab10.ex4;



public class Test {
    public static void main(String[] args) {
        Movable m1 = new MovableRectangle(1,2,7,8,1,3);
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
    }
}
