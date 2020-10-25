package Lab10.ex1;
public class Circle extends Shape {
    protected double radius = 1.0;

    public Circle(){
        super();
        radius=1.0;
    }
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle(" + super.toString()+
                ",radius=" + radius +
                ')';
    }
}
