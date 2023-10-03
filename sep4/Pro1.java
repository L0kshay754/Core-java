class Pro1{
    public static void main(String[] args) {

        int count=0;
        for(int i=1;i<=9;i++){
            
            if(i>5){
                count--;
            }else{
                count++;
            }


            for(int j=1;j<=count;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
}

// 1
// 2
// 3
// 4
// 5
// 4
// 3
// 2
// 1