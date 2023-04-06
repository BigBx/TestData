package 集合.Msp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo03Map {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();
        m.put("包旭","好帅");
        m.put("张三","好丑");
        Set<Map.Entry<String,String>> ent=m.entrySet();
        for (Map.Entry<String,String> entry : ent) {
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+" "+value);
        }
    }
}
