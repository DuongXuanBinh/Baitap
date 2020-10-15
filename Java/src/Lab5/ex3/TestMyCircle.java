package Lab5.ex3;

import java.sql.SQLOutput;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle cir1= new MyCircle();
        MyCircle cir2= new MyCircle(3,4,1);
        MyCircle cir3 = new MyCircle(new MyPoint(3,4),1);

        System.out.println("Radius is "+cir2.getRadius());
        System.out.println("Center is "+cir2.getCenter());
        System.out.println("Center X is "+cir2.getCenterX());
        System.out.println("Center Y is "+cir2.getCenterY());
        System.out.println("CenterXY is "+cir2.getCenterXY()[0]+cir2.getCenterXY()[1]);
        System.out.println(cir2.toString());

        cir2.setRadius(2);
        System.out.println("Radius is "+cir2.getRadius());
        cir2.setCenter(new MyPoint(1,2));
        System.out.println("Center is "+cir2.getCenter());
        cir2.setCenterX(2);
        System.out.println("Center X is "+cir2.getCenterX());
        cir2.setCenterY(3);
        System.out.println("Center Y is "+cir2.getCenterY());
        cir2.setCenterXY(4,5);
        System.out.println("CenterXY is "+cir2.getCenterXY()[0]+cir2.getCenterXY()[1]);

        System.out.println("The area is "+cir2.getArea());
        System.out.println("The circumference is "+cir2.getCircumference());
        System.out.println("The distance to another is "+cir2.distance(cir3));

    }
}
