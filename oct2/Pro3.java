// instance block
// [block that is inside the class bout outside the method]
// {}

class Pro3{
    
    int a=100;

    public static void main(String[] args) {      
        Pro3 obj=new Pro3();        
        System.out.println("I am inside the main method = 1");
    }


    //instance block
    {
        System.out.println("I am inside the instance block = 2");

    }

    public void run(){
        System.out.println("i am inside the run method = 3");
    }

}