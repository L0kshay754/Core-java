import java.util.ArrayList;
import java.util.List;

class Pro5 {
    public static void main(String[] args) {
        List<String> obj=new ArrayList<String>();

        obj.add("java");
        obj.add("html");
        obj.add("css");

        List<String> obj1=new ArrayList<String>();

        obj1.add("html");

        System.out.println(obj.retainAll(obj1));
        for (String singleString : obj1) {
            System.out.println(singleString);
        }

        obj.clear();
        System.out.println(obj.isEmpty());

         List<String> obj2=obj;
        //  obj.equals(obj2);
         System.out.println(obj.equals(obj2));

    }
}
