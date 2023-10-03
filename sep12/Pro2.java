interface Workable{
    public void dips();
}
class Pro2 implements Workable{

    public static void main(String[] args) {
        Pro2 obj=new Pro2();
        obj.dips();
    }
    @Override
    public void dips() {
        System.out.println("I am inside th Pro2 class");
    }
    
}
