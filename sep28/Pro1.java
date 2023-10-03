import java.util.HashSet;
import java.util.Set;

class Pro1{
    public static void main(String[] args) {
        Set obj=new HashSet<String>();

        obj.add("HTML");
        obj.add("css");
        obj.add("javascript");
        obj.add("java");


        obj.add("HTML");
        obj.add("css");
        obj.add("javascript");
        obj.add("java");

        System.out.println(obj);
    }
}