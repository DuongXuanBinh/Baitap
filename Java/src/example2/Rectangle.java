package example2;

public class Rectangle {
    private float length=1.0f;
    private float width =1.0f;
    public Rectangle(float lengthRectangle,float widthRectangle) {
        length=lengthRectangle;
        width=widthRectangle;
    }
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return (length + width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
