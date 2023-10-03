import java.util.Scanner;
public class Pro4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num1=sc.nextInt();

        System.out.println("Enter Second number : ");
        int num2=sc.nextInt();

        int result=num1+num2;
        System.out.println("Sum of two numbers : "+result);
    }
}
