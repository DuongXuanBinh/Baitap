package Java.example2;

public class Circle {

    private double radius;
    private  double Pi =3.14;
    public Circle(double radiusCircle,double PiCircle) {
        radius=radiusCircle;
        Pi=PiCircle;
    }

    public void setRadius(double radiusGiven){
            radius=radiusGiven;
    }
    public double getRadius(){
           return radius;
    }
    public double getArea(){
            return Pi * radius * radius;
    }
        public double getDiameter(){
            return 2 * radius;
        }
    public double getCircumference(){
            return 2 * Pi * radius;
    }
        public Circle(double radiusGiven){
            radius=radiusGiven;
        }

        public Circle(){
            radius=1.0;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    ", Pi=" + Pi +
                    '}';
        }

    }
