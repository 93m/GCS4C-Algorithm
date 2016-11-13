import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		int inputNumber = 0, temp = 0;
		int[] bubbleArray = new int[5];
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("============================");
		for(int i = 0; i < bubbleArray.length; i++) {
			System.out.print("Input Number : ");
			inputNumber = scanner.nextInt();
			bubbleArray[i] = inputNumber;
		}
		
		//Bubble Sorting Function.
		for(int i = 0; i < bubbleArray.length; i++) {
			for(int j = 0; j < bubbleArray.length - 1; j++) {
				if(bubbleArray[i] < bubbleArray[j]) {
					temp = bubbleArray[j];
					bubbleArray[j] = bubbleArray[i];
					bubbleArray[i] = temp;
				} 
			}
		}
		
		System.out.print("Complete Bubble Sorting Result :");
		
		for(int i = 0; i < bubbleArray.length; i++) {
			System.out.print(" " + bubbleArray[i]);
		}
		
		System.out.println();
		System.out.println("============================");
		scanner.close();
		System.exit(0);
	}
}
