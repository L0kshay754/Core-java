class Parent{
    String gold="5kg";
    int money=15000000;

    public void dispGold(){
        System.out.println("Gold Biscuit: "+gold);
    }

    public void dispMoney(){
        System.out.println("Money : "+money);
    }

    public void marriage(){
        System.out.println("Arrange");
    }

}
class Child extends Parent{
    String assets="Mustang";

    public void dispAssets(){
        System.out.println("Child Have "+assets);
    }

    public void marriage(){
        System.out.println("#Single");
    }
}
public class Pro2 {
    public static void main(String[] args) {
        Child child=new Child();

        child.dispAssets();
        child.dispGold();
        child.dispMoney();
        child.marriage();
    }
}
