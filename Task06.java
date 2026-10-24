import java.util.Scanner; // Imports the Scanner class used to read input values from the user.

public class Task06 { // Declares the class Task06 for the deletion operation program.
    public static void main(String[] args) { // Begins the main method, which runs when the program starts.
        Scanner input = new Scanner(System.in); // Creates a Scanner object to receive keyboard input.
        int[] numbers = new int[10]; // Declares an integer array of 10 elements for input values.

        System.out.println("Enter 10 integer values:"); // Tells the user to type 10 values into the array.
        for (int i = 0; i < numbers.length; i++) { // Iterates through each index so all 10 values are entered.
            System.out.print("Element " + i + ": "); // Prompts for the value at the current index.
            numbers[i] = input.nextInt(); // Stores the entered integer in the array.
        }

        System.out.print("\nEnter the index to delete: "); // Requests the array index that should be removed.
        int deleteIndex = input.nextInt(); // Stores the index selected by the user.

        if (deleteIndex < 0 || deleteIndex >= numbers.length) { // Checks whether the index is outside the valid array range.
            System.out.println("Invalid index. Please choose an index between 0 and " + (numbers.length - 1) + "."); // Displays an error message for invalid input.
            return; // Stops the program because the deletion cannot be performed.
        }

        int[] updatedArray = new int[numbers.length - 1]; // Creates a new array with one fewer element to hold the result after deletion.
        for (int i = 0; i < deleteIndex; i++) { // Copies values before the deletion index into the new array.
            updatedArray[i] = numbers[i]; // Transfers each old element to the same position in the new array.
        }

        for (int i = deleteIndex + 1; i < numbers.length; i++) { // Starts from the element after the deleted one and shifts values left.
            updatedArray[i - 1] = numbers[i]; // Moves each remaining element one place earlier in the new array.
        }

        System.out.println("\nUpdated array after deletion:"); // Prints a heading before the new array is displayed.
        for (int i = 0; i < updatedArray.length; i++) { // Goes through each element in the updated array.
            System.out.print(updatedArray[i] + " "); // Prints each value separated by a space.
        }
        System.out.println(); // Moves the cursor to the next line after displaying the array.
        input.close(); // Closes the Scanner object to release resources.
    }
}
