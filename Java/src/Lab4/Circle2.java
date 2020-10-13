package Lab4;

public class Circle2 {
    private double radius;
    private String color;

    public Circle2(){
        radius=1.0;
        color = "red";
    }

    public Circle2(double r){
        radius = r;
        color = "red";
    }

    public Circle2(double r,String c){
        radius=r;
        color=c;
    }

    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius * radius *Math.PI;
    }
    public String getColor(){
        return color;
    }
    public void setRadius(double newRadius){
        radius=newRadius;
    }
    public void setColor(String newColor){
        color=newColor;
    }
    public String toString(){
        return "Circle[radius="+radius+" color="+color+"]";
    }

}
