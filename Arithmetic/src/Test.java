import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        int i = 3;
        System.out.println("before: "+i);
        i = 3 + i * 2;
        System.out.println("after: "+i);

        System.out.println("=================");

        HashMap<String, String> stringMap = new HashMap<>();
        stringMap.put("hello","123");
        stringMap.put("haha","456");
        System.out.println("before：");
        for (Map.Entry<String, String> stringStringEntry : stringMap.entrySet()) {
            System.out.println(stringStringEntry.getKey()+"=="+stringStringEntry.getValue());
        }

        HashMap<String, String> stringMap2 = new HashMap<>();
        stringMap2.put("hello","123456");
        stringMap2.put("haha","456789");
        stringMap = stringMap2;
        System.out.println("after：");
        for (Map.Entry<String, String> stringStringEntry : stringMap.entrySet()) {
            System.out.println(stringStringEntry.getKey()+"=="+stringStringEntry.getValue());
        }
    }
}
