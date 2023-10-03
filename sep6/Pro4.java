import java.util.ArrayList;
import java.util.Scanner;

class Pro4 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> marks=new ArrayList<Integer>();

        System.out.println("Enter how many elements you want to add in list : ");
        
        int element=sc.nextInt();

        for(int i=1;i<=element;i++){
            marks.add(sc.nextInt());   
        }

        for(Integer i : marks){
            System.out.println(i);
        }

        
    }    
}
