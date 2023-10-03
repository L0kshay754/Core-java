interface Displayable{
   public static final  int num=100;

   public abstract void dips();
}

class Pro6 implements Displayable{
    static int num=200;


   public static void main(String[] args) {

    
    System.out.println(num);
    Pro6 obj=new Pro6();
    obj.dips();
   } 


 @Override
    public void dips() {
        System.out.println("interface's disp method");
    }
}