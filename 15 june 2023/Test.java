public class Test {
    public static void main(String[] args) {
        Mobile vivo=new Mobile("Vivo","black","2023",30000);
        Mobile samsung=new Mobile("Samsung","Gold","2023",50000);


        vivo.calling();
        samsung.calling();
    }    
}
class Mobile{
    String brand;
    String color;
    String model;
    float price;

    //parameter constructor
    public Mobile(String brand,String color,String model,float price){
        this.brand=brand;
        this.color=color;
        this.model=model;
        this.price=price;
    }

    public void calling(){
        System.out.println("calling with "+brand);
    }

    public void msg(){
        System.out.println("messaging");
    }

    public void captureImage(){
        System.out.println("Capture");
    }
}
