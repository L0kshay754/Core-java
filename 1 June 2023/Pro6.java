import java.util.Scanner;

public class Pro6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter First number : ");
        int num1=scanner.nextInt();

        System.out.println("Enter Second number : ");
        int num2=scanner.nextInt();

        if(num1>num2){
            System.out.println("Num 1 is greater : "+num1);
        }else{
            System.out.println("Num 2 is greater : "+num2);
        }
    }
}
