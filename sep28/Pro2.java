import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Pro2 {
    public static void main(String[] args) {
        ArrayList techList=new ArrayList<String>();
        techList.add("html");
        techList.add("css");
        techList.add("jquery");
        techList.add("html");
        techList.add("css");
        techList.add("jquery");
        techList.add("html");
        techList.add("css");
        techList.add("jquery");
        techList.add("css");
        techList.add("jquery");
        techList.add("html");
        techList.add("css");

        System.out.println(techList);


        Set obj=new HashSet<String>(techList);

        System.out.println(obj);

        ArrayList afterDuplicateRemoval=new ArrayList<String>(obj);
        System.out.println(afterDuplicateRemoval);

        
    }    
}
