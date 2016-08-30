import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		
		System.out.println(Hello.greetingMessage("GitHub"));
		
		int[] array = {5,4,3,2,1};
		System.out.println(Hello.arrayToString("Array", array));
		array = Hello.bubbleSort(array);
		System.out.println(Hello.arrayToString("Sorted Array", array));
	}

	public static String greetingMessage(String name){
		// TODO Return string in this format - "Hello, " + given name.
		return "Hello, "+name;
	}

	public static int[] bubbleSort(int[] array){
		int j;
		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (j=0; j<array.length-1;j++){
				if (array[j]>array[j+1]) {
					temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					flag = true;
				}
			}
		}
		// TODO Sort the given array in an ascending order and return the sorted array.
		return array;
	}
	
	public static String arrayToString(String title,int[] array){
		
		String str = title + " : ";
		for (int i = 0;i < array.length;i++)
		{
			str += array[i] + " ";
		}
		return str;
	}
}
