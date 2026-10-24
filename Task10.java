import java.util.Scanner; // Imports the Scanner class so the program can read values from the keyboard.

public class Task10 { // Declares the class Task10 for merging two sorted arrays.
    public static void main(String[] args) { // Begins the main method, the program's starting point.
        Scanner input = new Scanner(System.in); // Creates a Scanner object for reading user input.
        int[] firstArray = new int[10]; // Declares the first array with 10 elements.
        int[] secondArray = new int[10]; // Declares the second array with 10 elements.

        System.out.println("Enter 10 values for the first array in ascending order:"); // Displays a prompt instructing the user to enter sorted values.
        for (int i = 0; i < firstArray.length; i++) { // Enters values into the first array.
            System.out.print("Element " + i + ": "); // Prompts for each value in the first array.
            firstArray[i] = input.nextInt(); // Stores the user's input in the first array.
        }

        System.out.println("\nEnter 10 values for the second array in ascending order:"); // Prompts for the second sorted array.
        for (int i = 0; i < secondArray.length; i++) { // Enters values into the second array.
            System.out.print("Element " + i + ": "); // Asks for each element in the second array.
            secondArray[i] = input.nextInt(); // Saves the value in the second array.
        }

        int[] mergedArray = new int[firstArray.length + secondArray.length]; // Creates a new array large enough to hold all values from both arrays.
        int i = 0, j = 0, k = 0; // Initializes three index variables for the first array, second array, and merged array.

        while (i < firstArray.length && j < secondArray.length) { // Repeats until one array is completely processed.
            if (firstArray[i] <= secondArray[j]) { // Compares the next element from each array to keep the merged result sorted.
                mergedArray[k] = firstArray[i]; // Places the smaller current element from the first array into the merged result.
                i++; // Moves to the next element in the first array.
            } else { // Executes when the next element from the second array is smaller or equal.
                mergedArray[k] = secondArray[j]; // Adds the smaller current element from the second array to the merged result.
                j++; // Advances the index in the second array.
            }
            k++; // Moves to the next empty position in the merged array.
        }

        while (i < firstArray.length) { // Copies any remaining values from the first array after the main merge loop.
            mergedArray[k] = firstArray[i]; // Adds the remaining first-array element to the merged array.
            i++; // Advances the first-array index.
            k++; // Advances the merged-array position.
        }

        while (j < secondArray.length) { // Copies any remaining values from the second array after the main merge loop.
            mergedArray[k] = secondArray[j]; // Adds the remaining second-array element to the merged array.
            j++; // Advances the second-array index.
            k++; // Advances the merged-array position.
        }

        System.out.println("\nMerged array:"); // Prints a heading before showing the merged result.
        for (int index = 0; index < mergedArray.length; index++) { // Iterates through each position in the merged array.
            System.out.print(mergedArray[index] + " "); // Prints each merged value separated by a space.
        }

        int largest = mergedArray[0]; // Assumes the first merged value is the largest before scanning the rest.
        for (int index = 1; index < mergedArray.length; index++) { // Checks every element in the merged array to find the maximum.
            if (mergedArray[index] > largest) { // Compares the current element to the current largest value.
                largest = mergedArray[index]; // Replaces the largest value when a bigger number is found.
            }
        }

        System.out.println("\n\nLargest element in the merged array: " + largest); // Prints the largest value found in the merged array.
        input.close(); // Closes the Scanner to free system resources.
    }
}
