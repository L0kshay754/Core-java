class GrandParent {
    private int money = 9000;

    public void dispMoney() {
        System.out.println("Money : " + money);
    }
}

class Parent extends GrandParent {
    String gold = "30kg";

    public void dispGold() {
        System.out.println("Gold : " + gold);
    }

}

class Child extends Parent {
    String car = "Mustang";

    public void dispCar() {
        System.out.println("Car : " + car);
    }

}


class Pro1{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.dispCar();
        obj.dispGold();
        obj.dispMoney();

        System.out.println(obj.money);
    }
}


// has a relatinship
// assoication

// is a relatinship
// inheritance