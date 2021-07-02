package Assignments;

public class assigment1T {
	
	public static void main(String[] args) {
		//part3: Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array.
		int parameter[] = {1,3,1,3};
		System.out.println(min(parameter));
		System.out.println(max(parameter));
		System.out.println(avg(parameter));


		
		
		
		//part1: Write a function that takes a value n returns the sum of numbers 1 to n
//				int n = 2;
//				int sum = 0;
//				for (int i = 0; i <= n; i++) {
//					sum += i;
//				}
//				System.out.println(sum);
		
		//part2:Write a function that computes the factorial value
//		int n = 4;
//		if (n != 0 ) {
//			for (int i = 0;i <= n; i++) {
//			}
//		}
//		System.out.println("The factorial of n: " + n*(n-1));
	
	}
	
	static int min(int[] minNum) {
		int min = minNum[0];
		for(int i = 0; i < minNum.length;i++) {
			if(minNum[i]<min) {
				min = minNum[i];
			}
	}
		return min;
}
	static int max(int[] maxNum) {
		int max = maxNum[0];
		for(int i = 0; i < maxNum.length;i++ ) {
		if(maxNum[i] > max) {
			 max = maxNum[i];
		}
	}
		return max;
}
	static int avg(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int avg = sum / arr.length;
		return avg;
	}
}
