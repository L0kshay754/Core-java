class Pro1{
    public static void main(String[] args) {
        Pro1 obj=new Pro1();
        obj.friend();

        obj.sister(1000);

        int a=obj.mama();
        System.out.println(a);
        
        System.out.println(obj.relative(1000));
        
    }

    public void friend(){
        System.out.println("method with no argument and no return value");
    }

    public void sister(int num){
        System.out.println(num);
        System.out.println("method with argument and no return value");
    }

    public int mama(){
        System.out.println("method with no argument and return value");
        return 10;
    }

    public int relative(int num){
        System.out.println("method with argument adn return vlaue");
        return 100;
    }
}