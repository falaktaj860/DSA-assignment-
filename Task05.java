import java.util.Scanner; // Imports the Scanner class to read input from the user.

public class Task05 { // Declares the class Task05 for the insertion operation program.
    public static void main(String[] args) { // Begins the main method, the entry point of the program.
        Scanner input = new Scanner(System.in); // Creates a Scanner object to receive user input.
        int[] numbers = new int[10]; // Declares an array with 10 integer elements.

        System.out.println("Enter 10 integer values:"); // Tells the user to enter 10 numbers into the array.
        for (int i = 0; i < numbers.length; i++) { // Repeats until all positions of the original array are filled.
            System.out.print("Element " + i + ": "); // Prompts for the value at each index.
            numbers[i] = input.nextInt(); // Stores the entered integer in the array.
        }

        System.out.print("\nEnter the index to insert at: "); // Asks the user where the new number should be added.
        int insertIndex = input.nextInt(); // Stores the insertion index entered by the user.
        System.out.print("Enter the new value: "); // Prompts for the number to insert into the array.
        int newValue = input.nextInt(); // Stores the new value that will be inserted.

        if (insertIndex < 0 || insertIndex > numbers.length) { // Validates whether the insertion index is within a valid range.
            System.out.println("Invalid index. The index must be between 0 and " + numbers.length + "."); // Prints an error message if the index is invalid.
            return; // Stops the program because the insertion cannot be completed.
        }

        int[] updatedArray = new int[numbers.length + 1]; // Creates a new array one position larger to make room for the inserted element.
        for (int i = 0; i < insertIndex; i++) { // Copies all elements before the insertion point to the new array.
            updatedArray[i] = numbers[i]; // Transfers each earlier element to the same position in the new array.
        }

        updatedArray[insertIndex] = newValue; // Inserts the new value at the chosen index.
        for (int i = insertIndex; i < numbers.length; i++) { // Moves the remaining original elements one position to the right.
            updatedArray[i + 1] = numbers[i]; // Copies each old element into the new slot after the insertion point.
        }

        System.out.println("\nUpdated array after insertion:"); // Displays the heading before showing the inserted result.
        for (int i = 0; i < updatedArray.length; i++) { // Prints every element of the updated array.
            System.out.print(updatedArray[i] + " "); // Displays each value in the updated array separated by a space.
        }
        System.out.println(); // Moves the output to a new line after printing the array.
        input.close(); // Closes the Scanner object to release system resources.
    }
}
