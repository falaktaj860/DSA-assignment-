import java.util.Scanner; // Imports the Scanner class to read the 10 integers entered by the user.

public class Task03 { // Declares the class Task03, which is used for the sum and average calculations.
    public static void main(String[] args) { // Starts the main method, the program's starting point.
        Scanner input = new Scanner(System.in); // Creates a Scanner to read input from the keyboard.
        int[] numbers = new int[10]; // Creates an array of 10 integers to hold the values entered by the user.

        System.out.println("Enter 10 integer values:"); // Displays the message telling the user to enter 10 numbers.
        for (int i = 0; i < numbers.length; i++) { // Repeats the input process for every array position.
            System.out.print("Element " + i + ": "); // Prompts the user for the value at the current index.
            numbers[i] = input.nextInt(); // Saves the entered integer in the array.
        }

        int sum = 0; // Initializes the sum to zero before adding array values.
        for (int i = 0; i < numbers.length; i++) { // Goes through every element in the array.
            sum += numbers[i]; // Adds the current array value to the running sum.
        }

        double average = sum / (double) numbers.length; // Divides the total sum by the number of elements to find the average.
        int countGreaterThanAverage = 0; // Initializes a counter for elements above the average.

        for (int i = 0; i < numbers.length; i++) { // Checks each element against the calculated average.
            if (numbers[i] > average) { // Determines whether the current element is greater than the average.
                countGreaterThanAverage++; // Increases the count when a value is greater than the average.
            }
        }

        System.out.println("\nSum of all elements: " + sum); // Prints the total sum of the array values.
        System.out.println("Average of the elements: " + average); // Displays the computed average with decimal precision.
        System.out.println("Number of elements greater than average: " + countGreaterThanAverage); // Prints how many values are above the average.
        input.close(); // Closes the Scanner object to free up resources.
    }
}
