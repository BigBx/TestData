package 集合.treeset;

import java.util.Comparator;
import java.util.TreeSet;

//2.比较器排序
public class Demo03TreeSet {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按长度排序
                int i=o1.length()-o2.length();
                //长度一样按首字母排序
                i=i==0 ? o1.compareTo(o2):i;
                return i;
            }
        });
        ts.add("a");
        ts.add("b");
        ts.add("c");

    }
}
