class Bike{
    //instance variable
    //inside the class but outside the method
    int model;
    int speed;
    String brand;

    //the main purpose of using constructor is to initialize any object
    public Bike(int model, int speed, String brand){
        this.model=model;
        this.speed=speed;
        this.brand=brand;
    }

    @Override
    public String toString() {
        return "Bike [model=" + model + ", speed=" + speed + ", brand=" + brand + "]";
    }

    
}

class Pro4 {
    public static void main(String[] args) {
        Bike splander=new Bike(2023, 120, "Hero");
        System.out.println(splander);


        Bike bullet=new Bike(2018, 180, "RoyelEnfield");
        System.out.println(bullet);
    }
}
