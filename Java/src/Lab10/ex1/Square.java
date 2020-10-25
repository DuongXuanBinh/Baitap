package Lab10.ex1;

public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
        super(side,side);
        super.setColor(color);
        super.setFilled(filled);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square("+super.toString()+")";
    }
}



