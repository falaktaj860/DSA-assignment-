import java.util.Scanner; // Imports the Scanner class so the program can read user input from the keyboard.

public class Task01 { // Declares the public class named Task01, matching the Java file name.
    public static void main(String[] args) { // Starts the main method, which is the entry point of the program.
        Scanner input = new Scanner(System.in); // Creates a Scanner object to read integers entered by the user.
        int[] numbers = new int[10]; // Declares an integer array with a fixed size of 10 to store user values.

        System.out.println("Enter 10 integer values:"); // Displays a message telling the user to enter 10 numbers.
        for (int i = 0; i < numbers.length; i++) { // Repeats the input process for each array index from 0 to 9.
            System.out.print("Element " + i + ": "); // Prompts the user for the value at the current index.
            numbers[i] = input.nextInt(); // Stores the entered integer in the array at position i.
        }

        System.out.println("\nArray elements:"); // Prints a label before showing the stored array values.
        for (int i = 0; i < numbers.length; i++) { // Traverses the entire array from start to end.
            System.out.print(numbers[i] + " "); // Prints each element on the same line with a space after it.
        }

        System.out.println("\n\nArray in reverse order:"); // Displays a heading indicating that the array will be printed backward.
        for (int i = numbers.length - 1; i >= 0; i--) { // Starts from the last element and moves backward to the first one.
            System.out.print(numbers[i] + " "); // Prints each value in reverse order.
        }

        System.out.println(); // Moves to a new line after printing the reverse array.
        input.close(); // Closes the Scanner to free system resources after the task is completed.
    }
}
