package Lab5.ex3;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1= new MyPoint();
        MyPoint p2 = new MyPoint(5,8);
        System.out.println("p2 x"+p2.getX());
        System.out.println("p2 y"+p2.getY());
        System.out.println(p2.getXY()[0]);
        System.out.println(p2.getXY()[1]);

        p2.setX(2);
        p2.setY(9);
        p2.setXY(2,9);
        System.out.println(p2.toString());

        System.out.println(p2.distance(2,5));
        System.out.println(p2.distance());
        System.out.println(p2.distance(new MyPoint(1,3)));

        MyPoint[] p3=new MyPoint[10];
        for(int i=0;i<p3.length;i++){
            p3[i]=new MyPoint(i+1,i+1);
            System.out.println("p3["+i+"]="+p3[i]);
        }
    }
}
