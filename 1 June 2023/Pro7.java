import java.util.Scanner;

import javax.lang.model.type.NoType;

public class Pro6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter First number : ");
        int num1=scanner.nextInt();

        System.out.println("Enter Second number : ");
        int num2=scanner.nextInt();

        System.out.println("Enter Third number : ");
        int num3=scanner.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.println("First is greatest : "+num1);
            }else{
                System.out.println("Third is greatest : "+num3);
            }
        }else{
            if(num2>num3){
                System.out.println("Num 2 is greater : "+num2);
            }else{
                System.out.println("Num 3 is greater : "+num3);
            }
        }
    }
}
