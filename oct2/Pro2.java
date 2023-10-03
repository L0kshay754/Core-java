// instance variable
// [inside the class bust outside the method]

class Pro2{
    
    int a=100;

    public static void main(String[] args) {      
        Pro2 obj=new Pro2();  
        System.out.println(obj.a);
    }


    public void run(){
        System.out.println(a);
    }

}