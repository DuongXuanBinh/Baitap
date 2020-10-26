package Java.Session6;

public class Point {
    float x;
    float y;
    public void SetX(float z){
        x = z;
    }
    public void SetY(float z){
        y = z;
    }
    public void displayPoints(){
        System.out.println("X is "+x);
        System.out.println("Y is "+y);
    }

    public static void main(String[] args) {
        Point obj = new Point();
        obj.SetX(14);
        obj.SetY(15);
        obj.displayPoints();
    }
}
