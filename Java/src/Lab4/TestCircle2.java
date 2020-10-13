package Lab4;

public class TestCircle2 {
    public static void main(String[] args) {
        Circle2 c1= new Circle2();
        System.out.println("The circle has radius of "+c1.getRadius()+" and area of "+c1.getArea());
        System.out.println(c1.toString());
        Circle2 c2 = new Circle2(2.0);
        System.out.println("The circle has radius of "+c2.getRadius()+" and area of "+c2.getArea());

        Circle2 c3= new Circle2();
        c3.setRadius(5.0);
        System.out.println("radius is: "+c3.getRadius());
        c3.setColor("blue");
        System.out.println("color is: "+c3.getColor());


    }
}
