import java.util.Scanner; // Imports the Scanner class so the user can enter numbers for duplicate checking.

public class Task09 { // Declares the class Task09 to handle duplicate value detection in an array.
    public static void main(String[] args) { // Begins the main method where the program starts executing.
        Scanner input = new Scanner(System.in); // Creates a Scanner object to read user input.
        int[] numbers = new int[10]; // Declares an integer array with 10 positions to store input values.

        System.out.println("Enter 10 integer values:"); // Tells the user to enter 10 integers.
        for (int i = 0; i < numbers.length; i++) { // Loops through each array index to fill the array.
            System.out.print("Element " + i + ": "); // Prompts the user for the value at the current index.
            numbers[i] = input.nextInt(); // Reads and stores the value entered by the user.
        }

        boolean[] checked = new boolean[10]; // Creates a boolean array to mark positions already processed.
        int[] duplicateValues = new int[10]; // Stores each duplicate value found in the array.
        int[] duplicateCounts = new int[10]; // Stores how many times each duplicate value occurs.
        int duplicateCount = 0; // Counts how many unique duplicate values were found.

        for (int i = 0; i < numbers.length; i++) { // Examines each element as a possible starting point for duplicate detection.
            if (checked[i]) { // Skips an index that has already been counted as part of a duplicate group.
                continue; // Moves to the next element without repeating work.
            }

            int frequency = 1; // Starts counting the current value as appearing at least once.
            for (int j = i + 1; j < numbers.length; j++) { // Compares the current value with all later elements.
                if (numbers[i] == numbers[j]) { // Checks if another element has the same value.
                    frequency++; // Increases the duplicate count when a matching value is found.
                    checked[j] = true; // Marks the matching index as already processed.
                }
            }

            if (frequency > 1) { // Determines whether the current value is duplicated in the array.
                duplicateValues[duplicateCount] = numbers[i]; // Stores the duplicate value in the result array.
                duplicateCounts[duplicateCount] = frequency; // Stores how many times that value occurs.
                duplicateCount++; // Increases the count of unique duplicate values found.
            }

            checked[i] = true; // Marks the current index as processed to avoid duplicate analysis later.
        }

        if (duplicateCount == 0) { // Checks whether the array contains no duplicate elements.
            System.out.println("No duplicate values found."); // Prints a message when there are no repeated values.
        } else { // Executes if at least one duplicated value exists.
            System.out.println("\nDuplicate values and their frequencies:"); // Displays a heading before listing duplicates.
            for (int i = 0; i < duplicateCount; i++) { // Loops through each recorded duplicate value.
                System.out.println(duplicateValues[i] + " appears " + duplicateCounts[i] + " times."); // Prints the duplicate value and its total frequency.
            }
        }

        input.close(); // Closes the Scanner to release system resources after the program ends.
    }
}
