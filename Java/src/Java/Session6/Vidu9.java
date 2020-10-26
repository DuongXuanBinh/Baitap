package Java.Session6;

public class Vidu9 {
    public static void main(String[] args) {
        Vidu8 objRec1=new Vidu8(10,20);
        Vidu8 objRec2;

        objRec2=objRec1;

        System.out.println("\nRectangle1 Details");
        System.out.println("=====================");
        objRec1.displayDimensions();
        System.out.println("\nRectangle2 Details");
        System.out.println("=====================");
        objRec2.displayDimensions();

    }
}
