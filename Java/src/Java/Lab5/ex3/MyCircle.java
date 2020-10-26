package Java.Lab5.ex3;

public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle(){
        center = new MyPoint(0,0);
        this.radius = 1;
    }
    public MyCircle(int x, int y, int radius){
        center = new MyPoint(x,y);
        this.radius=radius;
    }
    public MyCircle(MyPoint center,int radius){
        this.center=center;
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX(){
        return this.center.getX();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public int getCenterY(){
        return this.center.getY();
    }
    public void setCenterY(int y){
        this.center.setY(y);
    }
    public int[] getCenterXY(){
        int[] get = new int[2];
        get[0]=this.center.getX();
        get[1]=this.center.getY();
        return get;
    }
    public void setCenterXY(int x,int y){
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center.toString() +
                ", radius=" + radius +
                '}';
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return radius*2*Math.PI;
    }
    public double distance(MyCircle another){
        int xDiff = this.getCenterX()-another.getCenterX();
        int yDiff=this.getCenterY()-another.getCenterY();
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
}
