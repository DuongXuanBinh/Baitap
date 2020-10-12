package Session8;

public class Vidu16 {
    String[] empID = new String[5];
    public void createArray(){
        System.out.println("Creating Array. Please wait...");
        for(int count = 1;count < empID.length;count++){
            empID[count]="E00"+count;
        }
    }
    public void printArray(){
        System.out.println("The Array is:");
        for(int count = 1; count < empID.length;count++){
            System.out.println("Employee ID is: "+empID[count]);
        }
    }

    public static void main(String[] args) {
        Vidu16 objStrArray = new Vidu16();
        objStrArray.createArray();
        objStrArray.printArray();
    }
}
