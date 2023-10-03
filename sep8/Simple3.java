class Parent3{
    int money=10000000;
    float gold =5;

    public int getMoney(){
        return money;
    }

    public void setMoney(int m){
        this.money=m;
    }

    public void marriage(){
        System.out.println("Do Arrange Marraige!");
    }
}
class Child3 extends Parent3{
    public void assets(){
        System.out.println("2000 sqr. yard.");
    }

    public void marriage(){
        System.out.println("Do Love Marraige!");
    }
}

public class Simple3 {

	public static void main(String[] args) {
        Child3 child=new Child3();
        System.out.println("Child has money : "+child.getMoney());
        child.assets();
        child.marriage();

	}

}