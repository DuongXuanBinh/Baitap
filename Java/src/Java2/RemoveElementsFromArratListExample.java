package Java2;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArratListExample {
    public static void main(String[] args) {
        List<String> programmingLanguage = new ArrayList<>();
        programmingLanguage.add("C");
        programmingLanguage.add("C++");
        programmingLanguage.add("Java");
        programmingLanguage.add("Kotlin");
        programmingLanguage.add("Python");
        programmingLanguage.add("Perl");
        programmingLanguage.add("Ruby");

        System.out.println("Initial List: "+programmingLanguage);

        programmingLanguage.remove(5);
        System.out.println("Ater remove(5): "+programmingLanguage);

        boolean isRemoved = programmingLanguage.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"): "+programmingLanguage);

        List<String> scriptingLanguage = new ArrayList<>();
        scriptingLanguage.add("Python");
        scriptingLanguage.add("Ruby");
        scriptingLanguage.add("Perl");

        programmingLanguage.removeAll(scriptingLanguage);
        System.out.println("After removeAll(Scripting Languages): "+programmingLanguage);

        programmingLanguage.removeIf(n->(n.charAt(0)=='C'));
        System.out.println("After removing all elements that start with 'C'"+programmingLanguage);

        programmingLanguage.clear();
        System.out.println("After clear(): "+programmingLanguage);
    }
}
