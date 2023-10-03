class Test3{
    protected int num1=100;
}

class TestData extends Test3{
    public void dispData(){
        System.out.println(num1);
    }
}
class Pro3 {
    public static void main(String[] args) {
        // TestData obj = new TestData();
        // obj.dispData(); 

        Test3 obj2=new Test3();
        System.out.println(obj2.num1);
    }    
}

// default access modifier
// private
// protected
// public 
