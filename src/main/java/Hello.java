//import java.io.*;

public class Hello {

	public static void main(String[] args) {

		System.out.println(Hello.greetingMessage("GitHub"));

		int[] array = { 5, 4, 3, 2, 1 };

		System.out.println(Hello.arrayToString("Array", array));
		array = Hello.bubbleSort(array);
		System.out.println(Hello.arrayToString("Sorted Array", array));
	}

	public static String greetingMessage(String name) {
		// TODO Return string in this format - "Hello, " + given name.
		return ("Hello, " + name);
	}

	public static int[] bubbleSort(int[] array) {
		// TODO Sort the given array in an ascending order and return the sorted
		// array.
		// int[] ar=array;
		// for (int i = 0; i < array.length; i++) {
		// ar[i] = array[i];
		// }
		int tmp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		// for (int i = 0; i < array.length; i++) {
		// array[i] = ar[i];
		// }
		return array;
	}

	public static String arrayToString(String title, int[] array) {

		String str = title + " : ";
		for (int i = 0; i < array.length; i++) {
			str += array[i] + " ";
		}
		return str;
	}
}
