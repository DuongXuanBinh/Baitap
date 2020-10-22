package Lab9;

public class Rectangle extends Shape {
    private int length,width;
    public Rectangle(String color,int length,int width){
        super(color);
        this.length=length;
        this.width=width;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
