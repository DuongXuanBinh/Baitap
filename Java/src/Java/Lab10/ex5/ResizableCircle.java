package Java.Lab10.ex5;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void resize(int percent) {
        super.radius = super.radius * percent / 100;
    }
}
