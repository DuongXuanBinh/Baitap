package Java.Session3;

import java.util.Scanner;

public class VD1 {
    public static void main(String[] args) {
        int ThiMath,ThiScience, ThiEnglish;
        int BillMath, BillScience, BillEnglish;
        int ThiSum = 0, BillSum = 0;
        int ThiPercent=0, BillPercent=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter marks obtained in Maths:");
        ThiMath = scan.nextInt();
        System.out.println("Enter marks obtained in Science: ");
        ThiScience = scan.nextInt();
        System.out.println("Enter marks obtained in English: ");
        ThiEnglish = scan.nextInt();

        System.out.println("Enter marks obtained in Maths:");
        BillMath = scan.nextInt();
        System.out.println("Enter marks obtained in Science: ");
        BillScience = scan.nextInt();
        System.out.println("Enter marks obtained in English: ");
        BillEnglish = scan.nextInt();

        System.out.println("Marks of ThiDK:");
        System.out.println("Math: "+ThiMath);
        System.out.println("Science: "+ThiScience);
        System.out.println("English: "+ThiEnglish);

        System.out.println("Marks of Bill:");
        System.out.println("Math: "+BillMath);
        System.out.println("Science: "+BillScience);
        System.out.println("English: "+BillEnglish);

        ThiSum= ThiMath+ThiEnglish+ThiScience;
        BillSum=BillMath+BillEnglish+BillScience;

        ThiPercent = ThiSum * 100/300;
        BillPercent=BillSum*100/300;

        System.out.println("Total marks scored by ThiDK = "+ThiSum);
        System.out.println("Percentage = "+ThiPercent+"%");

        System.out.println("Total marks scored by ThiDK = "+BillSum);
        System.out.println("Percentage = "+BillPercent+"%");

        System.out.print("\nIs Thi's percentage lesser than Bill? ");
        System.out.println(ThiPercent<BillPercent?"Yes":"No");

        System.out.print("Is Thi's percentage greater than Bill? ");
        System.out.println(ThiPercent>BillPercent?"Yes":"No");

        System.out.print("Is Thi's percentage equal to Bill? ");
        System.out.println(ThiPercent==BillPercent?"Yes":"No");

        System.out.print("\nScholarship Amount for Thi= $");
        System.out.println(ThiPercent>75?20000:(ThiPercent>=60&&ThiPercent<=75)?10000:0);

        System.out.print("\nScholarship Amount for Bill= $");
        System.out.println(BillPercent>75?20000:(BillPercent>=60&&BillPercent<=75)?10000:0);

    }
}
