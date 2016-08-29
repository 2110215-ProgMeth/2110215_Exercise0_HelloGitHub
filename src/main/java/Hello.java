public class Hello {

	public static void main(String[] args) {
		
		System.out.println(Hello.greetingMessage());
		
		int[] array = {5,4,3,2,1};
		
		System.out.println(Hello.arrayToString("Array", array));
		array = Hello.bubbleSort(array);
		System.out.println(Hello.arrayToString("Sorted Array", array));
	}

	public static String greetingMessage(){
		// TODO Return string in this format - "Hello, " + given name.
		return "Hello, GitHub";
	}

	public static int[] bubbleSort(int[] array){
		// TODO Sort the given array in an ascending order and return the sorted array.
		Boolean isSwap;
		do{
			isSwap=false;
			for(int i=0;i<array.length-1;i++)
			{
				if(array[1]>array[i+1])
				{
					int temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
					isSwap=true;
				}
			}
		}while(isSwap);
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
