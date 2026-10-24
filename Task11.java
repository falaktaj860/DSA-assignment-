import java.util.Scanner; // Imports the Scanner class so the user can enter values into both sorted arrays.

public class Task11 { // Declares the class Task11 for merging two sorted arrays without using a sorting algorithm.
    public static void main(String[] args) { // Starts the main method, which is the entry point of the program.
        Scanner input = new Scanner(System.in); // Creates a Scanner object to read input from the keyboard.
        int[] firstArray = new int[10]; // Declares the first sorted array with 10 integer values.
        int[] secondArray = new int[10]; // Declares the second sorted array with 10 integer values.

        System.out.println("Enter 10 values for the first sorted array:"); // Prompts the user to enter sorted values into the first array.
        for (int i = 0; i < firstArray.length; i++) { // Fills every element in the first array.
            System.out.print("Element " + i + ": "); // Asks for the value at each index.
            firstArray[i] = input.nextInt(); // Stores the entered value in the first array.
        }

        System.out.println("\nEnter 10 values for the second sorted array:"); // Prompts the user to enter sorted values into the second array.
        for (int i = 0; i < secondArray.length; i++) { // Fills every element in the second array.
            System.out.print("Element " + i + ": "); // Asks for the value at each index.
            secondArray[i] = input.nextInt(); // Stores the entered value in the second array.
        }

        int[] mergedArray = new int[firstArray.length + secondArray.length]; // Creates a new array large enough to hold all items from both arrays.
        int i = 0, j = 0, k = 0; // Initializes indexes for the first array, second array, and merged array.

        while (i < firstArray.length && j < secondArray.length) { // Continues until both arrays are processed.
            if (firstArray[i] <= secondArray[j]) { // Compares the current elements to maintain sorted order.
                mergedArray[k] = firstArray[i]; // Adds the smaller element from the first array to the merged result.
                i++; // Moves to the next value in the first array.
            } else { // Executes when the second array's current value is smaller.
                mergedArray[k] = secondArray[j]; // Adds the smaller element from the second array to the merged result.
                j++; // Moves to the next value in the second array.
            }
            k++; // Advances the position in the merged array.
        }

        while (i < firstArray.length) { // Copies leftover elements from the first array after the merge comparison loop.
            mergedArray[k] = firstArray[i]; // Places the remaining first-array element into the merged result.
            i++; // Moves to the next first-array item.
            k++; // Moves to the next result position.
        }

        while (j < secondArray.length) { // Copies leftover elements from the second array after the merge comparison loop.
            mergedArray[k] = secondArray[j]; // Places the remaining second-array element into the merged result.
            j++; // Moves to the next second-array item.
            k++; // Moves to the next result position.
        }

        System.out.println("\nMerged array in sorted order:"); // Prints a heading before showing the final sorted merged array.
        for (int index = 0; index < mergedArray.length; index++) { // Iterates through the merged array to print all values.
            System.out.print(mergedArray[index] + " "); // Displays each merged value with spacing.
        }

        System.out.println(); // Moves to the next line after printing the final sorted result.
        input.close(); // Closes the Scanner to release system resources.
    }
}
