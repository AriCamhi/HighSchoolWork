import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class IntHolder {
    private int i;
    public IntHolder(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
       return "" + i;
    }


}

 class KeyHolder {
    private String key;
    public KeyHolder(String key) {
        this.key = key;
    }

    public String toString() {
        return key;
    }




}

public class ClassExample {

    public static void main(String []args) {

        HashMap stringMap = new HashMap();
        stringMap.put(new KeyHolder("1a"), new IntHolder(1));
        stringMap.put(new KeyHolder("2a"), new IntHolder(2));
        stringMap.put(new KeyHolder("3a"), new IntHolder(3));
        stringMap.put(new KeyHolder("4a"), new IntHolder(4));

//System.out.println(stringMap.get("1"));
      //  System.out.println(stringMap.keySet());
     //   System.out.println(stringMap.values());

        System.out.println(stringMap.entrySet());

    //    System.out.println(stringMap.containsKey("5"));
//

    }
}
