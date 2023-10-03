// interface => interface
// inheritance => extends
//abstract keyword class=>abstract class | method => abstract method
abstract class Disp{
    abstract public void disp();

    public void dispData(){
        System.out.println("working ");
    }
}
class Pro1 extends Disp{
    public static void main(String[] args) {
        Pro1 obj=new Pro1();
        obj.disp();
        obj.dispData();
    }

    @Override
    public void disp() {
        System.out.println("this is the unimplement method of base class");
    }
}