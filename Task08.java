import java.util.Scanner; // Imports the Scanner class so the user can enter values to sort.

public class Task08 { // Declares the class Task08 for the bubble sort program.
    public static void main(String[] args) { // Starts the main method, which is where the program runs.
        Scanner input = new Scanner(System.in); // Creates a Scanner object for reading keyboard input.
        int[] numbers = new int[10]; // Declares an array of 10 integers to store user input.

        System.out.println("Enter 10 integer values:"); // Displays a prompt asking the user to enter 10 numbers.
        for (int i = 0; i < numbers.length; i++) { // Repeats to fill every element of the array.
            System.out.print("Element " + i + ": "); // Prompts the user for the value at the current index.
            numbers[i] = input.nextInt(); // Reads and stores the value in the array.
        }

        for (int i = 0; i < numbers.length - 1; i++) { // Runs the outer pass of bubble sort once for each element except the last.
            for (int j = 0; j < numbers.length - 1 - i; j++) { // Compares adjacent pairs in the unsorted portion of the array.
                if (numbers[j] > numbers[j + 1]) { // Checks whether the left value is greater than the right one.
                    int temp = numbers[j]; // Saves the left value temporarily before swapping.
                    numbers[j] = numbers[j + 1]; // Moves the smaller value to the left position.
                    numbers[j + 1] = temp; // Moves the larger value to the right position.
                }
            }
        }

        System.out.println("\nArray sorted in ascending order:"); // Shows a heading before printing the sorted list.
        for (int i = 0; i < numbers.length; i++) { // Prints each element of the ascending array.
            System.out.print(numbers[i] + " "); // Displays each sorted value separated by a space.
        }

        System.out.println("\n\nArray in descending order:"); // Displays a heading before printing the reverse order.
        for (int i = numbers.length - 1; i >= 0; i--) { // Starts from the last element and moves to the first to reverse the sorted array.
            System.out.print(numbers[i] + " "); // Prints each element in descending order.
        }

        System.out.println(); // Moves to the next line after printing the final array.
        input.close(); // Closes the Scanner to release system resources.
    }
}
