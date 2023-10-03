import java.util.Scanner;
class Pro2 {    
    public static void main(String[] args) {

        
        System.out.println("Enter your age : ");

        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if(age>17){
            System.out.println("You can open your account yourself");
        }else{
            System.out.println("Please come with your parent");
        }
    }    
}

// void return type
// access modifier or specifier
// variable age
