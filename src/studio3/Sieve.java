package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("What number do you want to go up to? ");
		int n = in.nextInt();
		
		boolean[]array = new boolean [n+1];
		
		for (int i = 2; i<Math.sqrt(n); i++) {
			
			for (int j = i+i; j < n+1; j+=i) {
				
				array [j] = true;
			}
		
		}
		for (int i =2; i<=n; i++) {
			if (array[i] == false) {
			System.out.println(i);
			}
		}

	}

}
