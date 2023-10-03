import java.util.ArrayList;
import java.util.List;

class Pro4 {
    public static void main(String[] args) {
        List<String> obj=new ArrayList<String>();

        // System.out.println(obj.size());
        obj.add("html");
        obj.add("css");
        obj.add("java");
        // System.out.println(obj.add("java"));
        // System.out.println(obj.remove("css"));
        // for (String singleString : obj) {
        //     System.out.println(singleString);
        // }
        // System.out.println(obj.isEmpty());

        List<String> obj1=new ArrayList<String>();
        obj1.add("JavaScript");
        obj1.add("Php");
        obj1.add("Servlet");
        // System.out.println(obj.contains("javascript"));
        obj.addAll(obj1);
         for (String singleString : obj) {
            System.out.println(singleString);
        }
        obj.removeAll(obj1);
         for (String singleString : obj) {
            System.out.println(singleString);
        }
      
    }   
}
