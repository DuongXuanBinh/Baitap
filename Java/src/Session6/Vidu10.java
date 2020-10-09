package Session6;

public class Vidu10 {
    private int width;
    private int height;

    public Vidu10(){
        System.out.println("Constructor invoked");
        width=10;
        height=10;
    }

    public Vidu10(int wid,int heig){
        System.out.println("Parameterized Constructor");
        width=wid;
        height=heig;
    }

    public void displayDimensions(){
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }
}
