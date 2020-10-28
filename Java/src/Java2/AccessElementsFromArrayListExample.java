package Java2;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();

        System.out.println("Is the top Companies list empty?: "+topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        System.out.println("Here are the top "+topCompanies.size());
        System.out.println(topCompanies);

        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size()-1);

        System.out.println("Best Company: "+bestCompany);
        System.out.println("Second best company: "+secondBestCompany);
        System.out.println("Last Company in the list: "+lastCompany);

        topCompanies.set(4,"Walmart");
        System.out.println("Modified top company list: "+topCompanies);

    }
}
