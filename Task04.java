import java.util.Scanner; // Imports the Scanner class so the user can enter values and the target number.

public class Task04 { // Declares the class Task04 for the linear search program.
    public static void main(String[] args) { // Begins the main method where the program execution starts.
        Scanner input = new Scanner(System.in); // Creates a Scanner object for keyboard input.
        int[] numbers = new int[10]; // Declares an array that stores 10 integers entered by the user.

        System.out.println("Enter 10 integer values:"); // Prints a message telling the user to enter 10 array values.
        for (int i = 0; i < numbers.length; i++) { // Iterates through the array positions until all 10 elements are filled.
            System.out.print("Element " + i + ": "); // Prompts the user for the value at the current index.
            numbers[i] = input.nextInt(); // Saves the entered integer in the current array position.
        }

        System.out.print("\nEnter the number to search: "); // Asks the user for the value to locate inside the array.
        int target = input.nextInt(); // Stores the value to search for in the array.
        int[] foundIndexes = new int[10]; // Creates an array to store all matching indices of the target value.
        int foundCount = 0; // Tracks how many times the target value appears in the array.

        for (int i = 0; i < numbers.length; i++) { // Visits every position in the array for linear searching.
            if (numbers[i] == target) { // Checks if the current element matches the requested target value.
                foundIndexes[foundCount] = i; // Stores the index where the target was found.
                foundCount++; // Increases the count because one more match was found.
            }
        }

        if (foundCount == 0) { // Checks whether the target number was not found at all.
            System.out.println("The number " + target + " was not found in the array."); // Displays a message if no match exists.
        } else { // Executes this block when at least one matching value is found.
            System.out.println("The number " + target + " was found at index/indices:"); // Prints a heading before listing the indices.
            for (int i = 0; i < foundCount; i++) { // Prints each matching index once.
                System.out.print(foundIndexes[i] + " "); // Displays the found index number with a space.
            }
            System.out.println(); // Moves to the next line after printing all indexes.
        }

        input.close(); // Closes the Scanner to release system resources after the search is complete.
    }
}
