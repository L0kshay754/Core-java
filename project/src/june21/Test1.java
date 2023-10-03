package june21;

import java.io.IOException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		int num2=sc.nextInt();
		
//		int result=num1/num2;
		try{
			int result=num1/num2;
			System.out.println(result);
		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		
		System.out.println("Hello");
		IOException obj=new IOException("Hello user");
		throw obj;
		
//		int result=0;
//		if(num2>0) {
//			result=num1/num2;;
//		}		
//		System.out.println(result);
		
	}

}
