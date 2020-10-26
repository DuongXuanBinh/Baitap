package Java.Session3;

import java.util.Scanner;

public class Ifrutgon {
    public static void main(String[] args) {
        double accountBalance = 10000.00;
        double withdraw = 0.00;
        boolean possible = false;

        System.out.println("Enter the Amount to withdraw: $");
        Scanner scan= new Scanner(System.in);
        withdraw = scan.nextDouble();
//        if (withdraw<=accountBalance){
//            accountBalance-=withdraw;
//            System.out.printf("Current account balance: %f\n",accountBalance);
//            possible = true;
//            System.out.println("Transaction Succesful: "+possible);
//        } else {
//            System.out.printf("Current account balance: %f\n",accountBalance);
//            System.out.println("Transaction Succesful: "+possible);
//        }
        possible=(accountBalance>withdraw);
        accountBalance=possible?accountBalance-withdraw:accountBalance;
        System.out.printf("\nCurrent account balance: $%.2f",accountBalance);
        System.out.println("\nTransaction Successful: "+possible);
    }
}
