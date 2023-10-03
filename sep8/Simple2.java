class Parent{
    int money=10000000;
    float gold =5;

    public int getMoney(){
        return money;
    }

    public void setMoney(int m){
        this.money=m;
    }
}


public class Simple2 {

	public static void main(String[] args) {
        Parent parentObj=new Parent();
        parentObj.setMoney(4380523);
        System.out.println(parentObj.getMoney());



        Parent parentObj1=new Parent();
        parentObj1.setMoney(10000);
        System.out.println(parentObj1.getMoney());
	}

}