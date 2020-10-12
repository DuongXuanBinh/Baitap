package Session8;

public class Vidu3 {
    int marks[];

    public void storeMarks(){
        marks = new int[4];
        System.out.println("Storing Marks. Please wait...");
        marks[0]=65;
        marks[1]=47;
        marks[2]=75;
        marks[3]=50;}
    public void displayMarks(){
        System.out.println("Marks are:");
        for(int count = 0; count<marks.length;count++){
            System.out.println(marks[count]);
        }
        }
}
