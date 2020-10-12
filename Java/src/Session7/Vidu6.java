package Session7;

public class Vidu6 {
    public void addNumber(int...num){
        int sum=0;
        for(int i:num){
            sum = sum + i;
        }
        System.out.println("Sumof numbers is "+sum);
    }

    public static void main(String[] args) {
        Vidu6 obj = new Vidu6();
        obj.addNumber(10,20,30,40);
    }
}
