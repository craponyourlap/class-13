
public class TestGenerics2 {
	
	public static <E> void printArray(E[] elements) {
		for (E element : elements) {
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = {10, 20, 30, 40, 50};
		Character[] charArray = {'J','A','V','A','T','P','O','I','N','T'};
		
		System.out.println("printing integer array: ");
		printArray(intArray);
		
		System.out.println("printing char array: ");
		printArray(charArray);
	}

}
