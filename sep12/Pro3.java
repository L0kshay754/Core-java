class Base1{
    public void dispData(){
        System.out.println("Inside base1 class");
    }
}

class Base2{
    public void dispData(){
        System.out.println("Inside base2 class");
    }
}

class Pro3 extends Base2{
    public static void main(String[] args) {
        Pro3 obj=new Pro3();
        obj.dispData();
    }
}
