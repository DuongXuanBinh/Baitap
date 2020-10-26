package Java.Lab8.Shape;

public class TestShape {
    public static void main(String[] args) {
        Circle cir = new Circle(2.3);
        System.out.println(cir.getArea());
        System.out.println(cir.getPerimeter());

        Rectangle rec = new Rectangle(1.0,2.0);
        System.out.println(rec);

        Square squ=new Square(3,"blue",false);
        squ.setSide(2);
        System.out.println(squ.getSide());
        squ.setWidth(1);
        System.out.println(squ.getWidth());
        System.out.println(squ.getLength());
        System.out.println(squ);

    }


}
