package 集合.Msp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02Map {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();
        m.put("包旭","好帅");
        m.put("张三","好丑");
        Set<String> set=m.keySet();
        for (String str: set) {
            String v=m.get(str);
            System.out.println(str);
            System.out.println(v);
        }
    }
}
