package Stresm流;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张三","李四","王五");
        //count
        long count=list.stream().count();
        System.out.println(count);
        //toArray 收集流中数据到数组中
        String[] strings=list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(strings));
        System.out.println(list);
    }
}
