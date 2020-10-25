package Lab10.ex1;

public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle(){
        super();
        width=1.0;
        length=1.0;
    }
    public Rectangle(double width,double length){
        this.length=length;
        this.width=width;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle{"+super.toString() +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
