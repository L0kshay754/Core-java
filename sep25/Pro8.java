import java.util.ArrayList;
import java.util.List;

class Pro8 {
    public static void main(String[] args) {
        List<String> obj=new ArrayList<String>();

        obj.add("css");
        System.out.println(obj.size());
        System.out.println(obj.isEmpty());
        System.out.println(obj.contains(obj));
    }    
}
