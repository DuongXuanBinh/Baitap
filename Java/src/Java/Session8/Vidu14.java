package Java.Session8;

public class Vidu14 {
    String str="Hello";
    Integer strLength = 5;
    public void displayString(){
        System.out.println("String length is: "+str.length());
        System.out.println("Character at index 2 is:"+str.charAt(2));
        System.out.println("Concatenated string is: "+str.concat("World"));
        System.out.println("String comparison is:"+str.compareTo("World"));
        System.out.println("Index of o is "+str.indexOf("o"));
        System.out.println("Last index of l is:"+str.lastIndexOf("l"));
        System.out.println("Replaced string is:"+str.replace('e','a'));
        System.out.println("Substring is: "+str.substring(2,5));
        System.out.println("Integer to String is:"+strLength.toString());
        String str1=" Hello ";
        System.out.println("Untrimmed string is:"+str1);
        System.out.println("Trimmed string is:"+str1.trim());
    }

    public static void main(String[] args) {
        Vidu14 objString = new Vidu14();
        objString.displayString();
    }
}
