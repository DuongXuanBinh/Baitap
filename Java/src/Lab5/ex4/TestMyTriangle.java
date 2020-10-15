package Lab5.ex4;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle tr1 = new MyTriangle(1,0,2,1,4,3);

        System.out.println(tr1.toString());
        System.out.println("Perimeter is "+tr1.getPerimeter());
        System.out.println("Type of Triangle is "+tr1.getType());

    }
}
