package 集合.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo04bianli {
    public static void main(String[] args) {
        Collection<String> coll =new ArrayList<>();
        coll.add("abc");
        coll.add("def");
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String str =it.next();
            if ("def".equals(str)) {
                it.remove();

            }

        }
        System.out.println(coll);
    }
}
