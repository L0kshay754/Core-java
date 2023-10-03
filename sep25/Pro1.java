interface Displayable{
   public static final int num=100;

   public abstract void dips();
}

class Pro1 implements Displayable{

    //instance varible
    // int num=200;

    // static int num=230;


    public static void main(String[] args) {

        // int num=100;

        // num=300;
        System.out.println(num);
        Pro1 obj=new Pro1();
        obj.dips();

    }

    @Override
    public void dips() {
        System.out.println("interface's disp method");
    }
}