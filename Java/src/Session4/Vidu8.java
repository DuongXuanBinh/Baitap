package Session4;

public class Vidu8 {
    enum Cards{
        Spade, Heart, Diamond, Club
    }

    public static void main(String[] args) {
        Cards card=Cards.Diamond;
        switch (card){
            case Spade:
                System.out.println("SPADE");
                break;
            case Heart:
                System.out.println("HEART");
                break;
            case Diamond:
                System.out.println("Diamond");
                break;
            case Club:
                System.out.println("Club");
                break;
        }
    }
}
