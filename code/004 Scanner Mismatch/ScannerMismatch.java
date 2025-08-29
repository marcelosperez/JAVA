/*
Example of the mismatch issue when you use sc.next() 
followed by sc.nextLine()
*/

/* 
sc.next() = reads just first word
sc.next() = reads input until it hits a space, tab, or enter
sc.nextLine() = reads input until it hits newline character \n
*/

/* 
Expected Input & Output:
------------------------
Enter your first name (e.g., 'John'): John
First name read: John
Enter your full name (e.g., 'John Doe'): John Doe
Full name read: John Doe
*/

/* 
Actual Input & Output:
-----------------------
Enter your first name (e.g., 'John'): John
First name read: John
Enter your full name (e.g., 'John Doe'): Full name read:
*/

/*
As you can see, the second prompt "Enter your full name..." is displayed, but the program immediately prints "Full name read:" without waiting for your input. This is because the sc.next() method only consumed the characters "John", leaving the newline character \n in the input buffer. The subsequent sc.nextLine() call reads this leftover newline character, considers it an empty line, and moves on without waiting for you to type anything.
*/

/*
To fix this, you should add an extra sc.nextLine() call after sc.next() to consume the leftover newline character:
sc.nextLine(); "This line will consume the leftover newline character \n
System.out.print("Enter your full name (e.g., 'John Doe'): ");
String fullName = sc.nextLine();
System.out.println("Full name read: " + fullName);
*/


import java.util.Scanner;

public class ScannerMismatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Using sc.next()
        System.out.print("Enter your first name (e.g., 'John'): ");
        String firstName = sc.next(); 
        System.out.println("First name read: " + firstName);

        // 2. Using sc.nextLine()
        // This is where the mismatch happens.
        // The sc.next() call above left the newline character \n in the buffer.
        System.out.print("Enter your full name (e.g., 'John Doe'): ");
        String fullName = sc.nextLine();
        System.out.println("Full name read: " + fullName);

        sc.close();
    }
}