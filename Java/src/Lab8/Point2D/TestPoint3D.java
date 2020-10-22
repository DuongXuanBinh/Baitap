package Lab8.Point2D;

public class TestPoint3D {
    public static void main(String[] args) {
        Point2D pnt = new Point2D(10,12);
        System.out.println(pnt.getXY()[1]);

        Point3D obj = new Point3D(1,1,2);
        System.out.println(obj.getXYZ()[0]);
        System.out.println(obj.getXYZ()[1]);
        System.out.println(obj.getXYZ()[2]);
    }
}
