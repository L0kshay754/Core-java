package june21;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		int num1=sc.nextInt();
		
		if(num1==1000) {
			throw new ArithmeticException();
		}
		
		
		System.out.println("Hello");
	}

}
