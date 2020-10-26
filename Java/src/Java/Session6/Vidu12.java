package Java.Session6;

public class Vidu12 {
    private int accountID;
    private String holderName;
    private String accountType;

    {
        accountID=100;
        holderName="John Anderson";
        accountType="Savings";
    }
    public void displayAccountDetails(){
        System.out.println("Account Details");
        System.out.println("===============");
        System.out.println("Account ID: "+accountID+"\nAccount Type: "+accountType);
    }
}
