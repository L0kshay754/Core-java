import java.util.Scanner;

class Pro1{
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num==1){
            System.out.println("One");
        }else if(num==2){
            System.out.println("Two");
        }else if(num==3){
            System.out.println("Three");
        }else if(num==4){
            System.out.println("Four");
        }else{
            System.out.println("Do not allow to check");
        }
    }
}



// else if ladder
// switch