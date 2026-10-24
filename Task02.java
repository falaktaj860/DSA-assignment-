import java.util.Scanner; // Imports the Scanner class so the program can receive array values from the keyboard.

public class Task02 { // Declares the class Task02 to hold the program logic for finding min and max values.
    public static void main(String[] args) { // Begins the main method, which runs when the program starts.
        Scanner input = new Scanner(System.in); // Initializes a Scanner object for reading user input.
        int[] numbers = new int[10]; // Creates an integer array of size 10 to store the user's values.

        System.out.println("Enter 10 integer values:"); // Displays a prompt asking the user to enter ten integers.
        for (int i = 0; i < numbers.length; i++) { // Loops through each index so all array positions are filled.
            System.out.print("Element " + i + ": "); // Displays the index number for the current input position.
            numbers[i] = input.nextInt(); // Reads and stores the integer value at the current index.
        }

        int largest = numbers[0]; // Assumes the first element is the largest before comparison starts.
        int smallest = numbers[0]; // Assumes the first element is the smallest before comparison starts.
        int secondSmallest = numbers[0]; // Stores the second minimum value discovered while scanning the array.
        int largestIndex = 0; // Stores the index of the largest element.
        int smallestIndex = 0; // Stores the index of the smallest element.
        int secondSmallestIndex = 0; // Stores the index of the second smallest element.
        boolean secondFound = false; // Tracks whether a second smallest value has been found.

        for (int i = 1; i < numbers.length; i++) { // Starts from the second element because index 0 is already used as the initial comparison value.
            if (numbers[i] > largest) { // Checks if the current value is greater than the greatest value seen so far.
                largest = numbers[i]; // Updates the largest value when a bigger number is found.
                largestIndex = i; // Saves the index where the new largest value was found.
            }

            if (numbers[i] < smallest) { // Checks if the current value is smaller than the current minimum.
                secondSmallest = smallest; // Keeps the old minimum as the second minimum before updating the minimum.
                secondSmallestIndex = smallestIndex; // Keeps the old minimum index as the second minimum index.
                smallest = numbers[i]; // Replaces the minimum with the new lower value.
                smallestIndex = i; // Updates the minimum index to the location of the new smallest value.
                secondFound = true; // Marks that a second smallest value now exists.
            } else if (!secondFound || numbers[i] < secondSmallest) { // Checks whether the current value is smaller than the stored second smallest value.
                secondSmallest = numbers[i]; // Saves this value as the new second smallest value.
                secondSmallestIndex = i; // Saves the index of this second smallest value.
                secondFound = true; // Confirms that the second-smallest value has been identified.
            }
        }

        System.out.println("\nLargest value: " + largest + " at index " + largestIndex); // Prints the largest value and its index.
        System.out.println("Smallest value: " + smallest + " at index " + smallestIndex); // Prints the smallest value and its index.
        System.out.println("Second smallest value: " + secondSmallest + " at index " + secondSmallestIndex); // Prints the second smallest value and its index.
        input.close(); // Closes the input stream to avoid resource leaks.
    }
}
