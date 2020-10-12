package Session7;

class Circle {
    public double getPI(){
        return 3.14;
    }
}

public class Vidu4{
    public void calcArea(Circle objPi,double rad){
        double area = objPi.getPI() *rad * rad;
        System.out.println("Area of the circle is "+area);
    }

    public static void main(String[] args) {
        Vidu4 p1=new Vidu4();
        p1.calcArea(new Circle(),2);
    }
}
