class Test {
    public void dispInfo() {
        System.out.println("hello user");
    }

     public String toString(){
        return "Hello";
    }

    public void finalize() {
        System.out.println("Hello User");
    }

}

class Pro1 {
    public static void main(String[] args) {
        Test obj = new Test();

        System.out.println(obj);
        // obj=null;

        System.out.println(obj);

        System.gc();
    }

   

   
}