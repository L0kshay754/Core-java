public class Pro2 {
    public static void main(String[] args) {
        Pro2 obj = new Pro2();
        obj.life();
        obj.didi(1000, "apple", "Chhina toast", "Silk");
        System.out.println(obj.shopping(obj.nani()));
    }

    // method type
    // no argument and no return value
    public void life() {
        System.out.println("Enjoing Life");
    }

    // no argument and return value
    public int nani() {
        return 100;
    }

    // argument and no return value
    public void didi(int money, String fruits, String sweets, String chocolate) {
        System.out.println("Money : " + money);
        System.out.println("Fruits : " + fruits);
        System.out.println("Sweets : " + sweets);
        System.out.println("Chocolate : " + chocolate);
    }

    // argument and return value
    public String shopping(int money) {
        return "Product";
    }

}
