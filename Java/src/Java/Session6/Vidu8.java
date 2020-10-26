package Java.Session6;

public class Vidu8 {
    int height;
    int width;

    Vidu8(){
        System.out.println("Constructor invoked");
        height=10;
        width=10;
    }
    Vidu8(int wid, int heig){
        System.out.println("Parameterized Constructor");
        width=wid;
        height=heig;
    }
    void displayDimensions(){
        System.out.println("Width: "+width);
        System.out.println("Height "+height);
    }
}
