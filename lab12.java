import java.util.*;
public class lab12 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Invoke getArray method
		int[] array = getArray();

		// Prompt the user to enter the index of the array
		System.out.print("Enter the index of the array: ");
		try {
			// Display the corresponding element value
			System.out.println("The v2 element value is " + 
				array[input.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bound.");
		}
	}

	/** Returns an array with 100 randomly chosen integers */
	public static int[] getArray() {
		int[] array = new int[300];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 300) + 1;
		}
		return array;
	}
}
