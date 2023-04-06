package 集合.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo05zengqiangFOR {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        //for (String s:coll) {
        //   System.out.println(s);
        // }
        //lamda表达式
        coll.forEach((String s)-> {
            System.out.println(s);
        });
    }
}
