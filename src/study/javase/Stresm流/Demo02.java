package Stresm流;

import java.util.HashMap;

public class Demo02 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("zhangsan",1);
        map.put("san",2);
        map.put("zhang",3);
        map.entrySet().stream().forEach(s -> System.out.println(s));

    }
}
