import java.util.List;
import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");       // Add element
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");       // Duplicates allowed

        System.out.println(fruits.get(1)); // "Banana"
        System.out.println(fruits.size()); // 4

        fruits.remove("Apple");    // Removes first "Apple"
        System.out.println(fruits); // [Banana, Cherry, Apple]

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}