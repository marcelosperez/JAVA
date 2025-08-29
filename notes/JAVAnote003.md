
# Read text without spaces
The code sc.next() is used to read the next word (token) from the user input in Java. 
```JAVA
sc.next()
```
It reads input until it hits a space, tab, or enter.

Remember, if you type multiple words like John Smith, sc.next() only reads the first word (John). 

If you want to read the whole line (all words), you'd use sc.nextLine() instead.
```JAVA
sc.nextLine()
```


# sc.next( ) = reads just first word
```JAVA
import java.util.Scanner;

public class NextExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first name:");

        // Read the next word entered by the user
        String firstName = sc.next();

        // Print the entered name
        System.out.println("Hello, " + firstName + "!");

        // Close the scanner to prevent resource leaks
        sc.close();
    }
}
```

# sc.nextLine( ) = reads the whole line
```JAVA
import java.util.Scanner;

public class NamesExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first name:");
        String firstName = sc.nextLine();

        System.out.println("Please enter your mother's name:");
        String motherName = sc.nextLine();

        System.out.println("Please enter your father's name:");
        String fatherName = sc.nextLine();

        // Print what the user entered
        System.out.println("\nSummary:");
        System.out.println("First Name: " + firstName);
        System.out.println("Mother's Name: " + motherName);
        System.out.println("Father's Name: " + fatherName);

        sc.close();
    }
}
```

