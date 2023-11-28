import java.util.ArrayList;

public class ArrayListAdventure {

    public static void main(String[] args) {

        ArrayList<String> wordsContainer = new ArrayList<>();
        wordsContainer.add("one");
        wordsContainer.add("two");
        wordsContainer.add("three");
        wordsContainer.add("five");
        wordsContainer.add("seven");
        wordsContainer.add(3,"four");
        wordsContainer.add(5,"six");
        for (String counter:
             wordsContainer) {
            System.out.println(counter);
        }

    }

}
