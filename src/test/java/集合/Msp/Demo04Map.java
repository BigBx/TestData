package 集合.Msp;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Demo04Map {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();
        m.put("包旭","好帅");
        m.put("张三","好丑");
        m.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s+" "+s2);
            }
        });
    }
}
