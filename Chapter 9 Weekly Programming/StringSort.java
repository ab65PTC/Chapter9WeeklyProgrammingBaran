import java.util.Scanner;
import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strings = new String[15];
        
        // Accept strings from the user
        System.out.print("Enter up to 15 strings, separated by spaces: ");
        String userInput = input.nextLine();
        
        // Split user input into an array of strings
        String[] userInputArray = userInput.split("\\s+");
        int numStrings = Math.min(userInputArray.length, strings.length);
        
        // Copy the first 15 strings from the user input to the strings array
        for (int i = 0; i < numStrings; i++) {
            strings[i] = userInputArray[i];
        }
        
        // Sort the array of strings
        Arrays.sort(strings, 0, numStrings);
        
        // Display the sorted array of strings
        System.out.println("Sorted strings:");
        for (int i = 0; i < numStrings; i++) {
            System.out.println(strings[i]);
        }
    }
}
