package Java.Session8;

public class Vidu15 {
    StringBuilder str = new StringBuilder("JAVA");
    public void displayStrings(){
        System.out.println("Append String is "+str.append("7"));
        System.out.println("Inserted String is "+str.insert(5,"SE"));
        System.out.println("Deleted String is "+str.delete(4,7));
        System.out.println("Reverse String is "+str.reverse());
    }
    public static void main(String[] args) {
        Vidu15 objStrBuild = new Vidu15();
        objStrBuild.displayStrings();
    }
}
