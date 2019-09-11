package edureka_course;

public class ForLoop_TenEvenOdd {

	public static void main(String[] args) {
		// Write a program to print 10 even numbers and 10 odd numbers.
		
		System.out.println("List of 10 Even numbers");
		for(int i = 1; i < 11; i++) {
			System.out.println(i * 2);
		}
		
		System.out.println("List of 10 Odd numbers");
		for(int i = 0; i < 10; i++) {
			System.out.println((2 * i) + 1);
		}
	}

}
