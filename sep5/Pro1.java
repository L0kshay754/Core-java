class Pro1{
    public static void main(String[] args) {
        int count=6;

        for(int i=1;i<=9;i++){
            if(i>5){
                count++;
            }else{
                count--;
            }

            for(int j=1;j<=count;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}