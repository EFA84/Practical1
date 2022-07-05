package javaSeleniumPractical;

import java.util.Random;
import java.util.Scanner;

public class Practical1 {

	public static void main(String[] args) {

		Random rnum = new Random();
		
		int[] numbers = new int[1000];
		
		numbers[0] = rnum.nextInt(1000);
		
		int smallest = numbers[0];
		
		for (int i = 0; i <= 500; i++) { // // generate 500 number
			
			System.out.println(rnum.nextInt(1000)); // proof 500 random numbers were generated
			numbers[i] = rnum.nextInt(1000);
			smallest = Math.min(smallest, numbers[i]);
			
			if (i == 500) {
				
				System.out.println("========================");
				System.out.println("Smallest Nth Number");
				System.out.println(smallest);
				
			}
		}

		System.out.println("What is the smallest Nth number?");
		Scanner userInput = new Scanner(System.in);
		int answer = userInput.nextInt();

	}
}
