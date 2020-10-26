package Java.Lab10.ex5;

public class Test {
    public static void main(String[] args) {
        Circle c1= new Circle(2.5);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        Circle c2 = new ResizableCircle(2.6);
        System.out.println(c2);
        ResizableCircle c3 = (ResizableCircle) c2;
        System.out.println(c3);
        c3.resize(25);
        System.out.println(c3);
    }
}
