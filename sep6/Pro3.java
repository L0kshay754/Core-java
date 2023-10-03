import java.util.Scanner;

class Pro3 {
    public static void main(String[] args) {
        int[] marks=new int[5];


        Scanner sc=new Scanner(System.in);

        for(int i=0;i<marks.length;i++){
            System.out.println("Enter a number at index : "+i);
            marks[i]=sc.nextInt();
        }

        for (int i : marks) {
            System.out.println(i);
        }


        
    }    
}
